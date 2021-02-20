package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleSheetProperties extends StObject {
  
  def flatten[T /* <: String */](style: T): T = js.native
  
  var hairlineWidth: Double = js.native
}
object StyleSheetProperties {
  
  @scala.inline
  def apply(flatten: js.Any => js.Any, hairlineWidth: Double): StyleSheetProperties = {
    val __obj = js.Dynamic.literal(flatten = js.Any.fromFunction1(flatten), hairlineWidth = hairlineWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleSheetProperties]
  }
  
  @scala.inline
  implicit class StyleSheetPropertiesMutableBuilder[Self <: StyleSheetProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlatten(value: js.Any => js.Any): Self = StObject.set(x, "flatten", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHairlineWidth(value: Double): Self = StObject.set(x, "hairlineWidth", value.asInstanceOf[js.Any])
  }
}
