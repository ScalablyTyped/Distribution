package typings.storybookAddons.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Object
import typings.std.PropertyKey
import typings.storybookAddons.anon.Base
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsParameter
  extends StObject
     with Object
     with /* key */ StringDictionary[js.Any] {
  
  var storySort: js.UndefOr[StorySortParameter] = js.undefined
  
  var theme: js.UndefOr[Base] = js.undefined
}
object OptionsParameter {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): OptionsParameter = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[OptionsParameter]
  }
  
  @scala.inline
  implicit class OptionsParameterMutableBuilder[Self <: OptionsParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStorySort(value: StorySortParameter): Self = StObject.set(x, "storySort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorySortFunction2(
      value: (js.Tuple4[StoryId, js.Any, Parameters, Parameters], js.Tuple4[StoryId, js.Any, Parameters, Parameters]) => Boolean | Double
    ): Self = StObject.set(x, "storySort", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStorySortUndefined: Self = StObject.set(x, "storySort", js.undefined)
    
    @scala.inline
    def setTheme(value: Base): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
