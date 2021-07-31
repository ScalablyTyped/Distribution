package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynamicColorIOSTuple extends StObject {
  
  var dark: ColorValue
  
  var light: ColorValue
}
object DynamicColorIOSTuple {
  
  @scala.inline
  def apply(dark: ColorValue, light: ColorValue): DynamicColorIOSTuple = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicColorIOSTuple]
  }
  
  @scala.inline
  implicit class DynamicColorIOSTupleMutableBuilder[Self <: DynamicColorIOSTuple] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDark(value: ColorValue): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLight(value: ColorValue): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
  }
}
