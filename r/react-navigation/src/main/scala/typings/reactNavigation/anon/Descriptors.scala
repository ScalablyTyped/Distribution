package typings.reactNavigation.anon

import org.scalablytyped.runtime.StringDictionary
import typings.reactNavigation.mod.NavigationDescriptor
import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationRoute
import typings.reactNavigation.mod.NavigationScreenProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Descriptors[Options, ScreenProps] extends StObject {
  
  var descriptors: StringDictionary[
    NavigationDescriptor[
      NavigationParams, 
      js.Object, 
      NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]
    ]
  ]
  
  var navigationConfig: Options
  
  var screenProps: js.UndefOr[ScreenProps] = js.undefined
}
object Descriptors {
  
  @scala.inline
  def apply[Options, ScreenProps](
    descriptors: StringDictionary[
      NavigationDescriptor[
        NavigationParams, 
        js.Object, 
        NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]
      ]
    ],
    navigationConfig: Options
  ): Descriptors[Options, ScreenProps] = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], navigationConfig = navigationConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Descriptors[Options, ScreenProps]]
  }
  
  @scala.inline
  implicit class DescriptorsMutableBuilder[Self <: Descriptors[?, ?], Options, ScreenProps] (val x: Self & (Descriptors[Options, ScreenProps])) extends AnyVal {
    
    @scala.inline
    def setDescriptors(
      value: StringDictionary[
          NavigationDescriptor[
            NavigationParams, 
            js.Object, 
            NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]
          ]
        ]
    ): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationConfig(value: Options): Self = StObject.set(x, "navigationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenProps(value: ScreenProps): Self = StObject.set(x, "screenProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenPropsUndefined: Self = StObject.set(x, "screenProps", js.undefined)
  }
}
