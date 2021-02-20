package typings.reactNativeNavigation.optionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewAnimationOptions extends ScreenAnimationOptions {
  
  /**
    * ID of the Top Bar we want to animate
    */
  var id: js.UndefOr[String] = js.native
}
object ViewAnimationOptions {
  
  @scala.inline
  def apply(): ViewAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewAnimationOptions]
  }
  
  @scala.inline
  implicit class ViewAnimationOptionsMutableBuilder[Self <: ViewAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
