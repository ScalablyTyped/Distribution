package typings.reactNativeMaterialKit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpinnerStyle extends StObject {
  
  var strokeColor: js.UndefOr[js.Array[String]] = js.native
}
object SpinnerStyle {
  
  @scala.inline
  def apply(): SpinnerStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpinnerStyle]
  }
  
  @scala.inline
  implicit class SpinnerStyleMutableBuilder[Self <: SpinnerStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStrokeColor(value: js.Array[String]): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    
    @scala.inline
    def setStrokeColorVarargs(value: String*): Self = StObject.set(x, "strokeColor", js.Array(value :_*))
  }
}
