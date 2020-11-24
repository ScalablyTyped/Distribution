package typings.storybookAddons.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Object
import typings.std.PropertyKey
import typings.storybookAddons.anon.Base
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsParameter
  extends Object
     with /* key */ StringDictionary[js.Any] {
  
  var storySort: js.UndefOr[StorySortParameter] = js.native
  
  var theme: js.UndefOr[Base] = js.native
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
  implicit class OptionsParameterOps[Self <: OptionsParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setStorySortFunction2(
      value: (js.Tuple4[StoryId, js.Any, Parameters, Parameters], js.Tuple4[StoryId, js.Any, Parameters, Parameters]) => Boolean | Double
    ): Self = this.set("storySort", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStorySort(value: StorySortParameter): Self = this.set("storySort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorySort: Self = this.set("storySort", js.undefined)
    
    @scala.inline
    def setTheme(value: Base): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}
