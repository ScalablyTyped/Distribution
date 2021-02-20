package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RectButtonProperties extends BaseButtonProperties {
  
  var activeOpacity: js.UndefOr[Double] = js.native
  
  var underlayColor: js.UndefOr[String] = js.native
}
object RectButtonProperties {
  
  @scala.inline
  def apply(): RectButtonProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RectButtonProperties]
  }
  
  @scala.inline
  implicit class RectButtonPropertiesMutableBuilder[Self <: RectButtonProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveOpacity(value: Double): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveOpacityUndefined: Self = StObject.set(x, "activeOpacity", js.undefined)
    
    @scala.inline
    def setUnderlayColor(value: String): Self = StObject.set(x, "underlayColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlayColorUndefined: Self = StObject.set(x, "underlayColor", js.undefined)
  }
}
