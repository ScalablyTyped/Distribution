package typings.reactNavigationCore

import org.scalablytyped.runtime.StringDictionary
import typings.reactNavigationCore.typesMod.Descriptor
import typings.reactNavigationCore.typesMod.NavigationHelpers
import typings.reactNavigationRouters.typesMod.NavigationState
import typings.reactNavigationRouters.typesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useCurrentRenderMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/useCurrentRender", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasStateNavigationDescriptors: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasStateNavigationDescriptors.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Options extends StObject {
    
    var descriptors: StringDictionary[
        Descriptor[ParamListBase, String, NavigationState[ParamListBase], js.Object, js.Object]
      ]
    
    var navigation: NavigationHelpers[ParamListBase, js.Object]
    
    var state: NavigationState[ParamListBase]
  }
  object Options {
    
    inline def apply(
      descriptors: StringDictionary[
          Descriptor[ParamListBase, String, NavigationState[ParamListBase], js.Object, js.Object]
        ],
      navigation: NavigationHelpers[ParamListBase, js.Object],
      state: NavigationState[ParamListBase]
    ): Options = {
      val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDescriptors(
        value: StringDictionary[
              Descriptor[ParamListBase, String, NavigationState[ParamListBase], js.Object, js.Object]
            ]
      ): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
      
      inline def setNavigation(value: NavigationHelpers[ParamListBase, js.Object]): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
      
      inline def setState(value: NavigationState[ParamListBase]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
