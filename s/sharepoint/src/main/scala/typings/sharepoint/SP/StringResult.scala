package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StringResult extends StObject {
  
  def get_value(): String = js.native
}
object StringResult {
  
  @scala.inline
  def apply(get_value: () => String): StringResult = {
    val __obj = js.Dynamic.literal(get_value = js.Any.fromFunction0(get_value))
    __obj.asInstanceOf[StringResult]
  }
  
  @scala.inline
  implicit class StringResultMutableBuilder[Self <: StringResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet_value(value: () => String): Self = StObject.set(x, "get_value", js.Any.fromFunction0(value))
  }
}
