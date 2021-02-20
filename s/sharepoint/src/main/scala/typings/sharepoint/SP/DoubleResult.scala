package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DoubleResult extends StObject {
  
  def get_value(): Double = js.native
}
object DoubleResult {
  
  @scala.inline
  def apply(get_value: () => Double): DoubleResult = {
    val __obj = js.Dynamic.literal(get_value = js.Any.fromFunction0(get_value))
    __obj.asInstanceOf[DoubleResult]
  }
  
  @scala.inline
  implicit class DoubleResultMutableBuilder[Self <: DoubleResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet_value(value: () => Double): Self = StObject.set(x, "get_value", js.Any.fromFunction0(value))
  }
}
