package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderlessButtonProperties
  extends StObject
     with BaseButtonProperties {
  
  var activeOpacity: js.UndefOr[Double] = js.undefined
  
  var borderless: js.UndefOr[Boolean] = js.undefined
}
object BorderlessButtonProperties {
  
  @scala.inline
  def apply(): BorderlessButtonProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderlessButtonProperties]
  }
  
  @scala.inline
  implicit class BorderlessButtonPropertiesMutableBuilder[Self <: BorderlessButtonProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveOpacity(value: Double): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveOpacityUndefined: Self = StObject.set(x, "activeOpacity", js.undefined)
    
    @scala.inline
    def setBorderless(value: Boolean): Self = StObject.set(x, "borderless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderlessUndefined: Self = StObject.set(x, "borderless", js.undefined)
  }
}
