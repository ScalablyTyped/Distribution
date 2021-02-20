package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An error object that contains an error name. */
@js.native
trait DOMError extends StObject {
  
  val name: java.lang.String = js.native
}
object DOMError {
  
  @scala.inline
  def apply(name: java.lang.String): DOMError = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMError]
  }
  
  @scala.inline
  implicit class DOMErrorMutableBuilder[Self <: DOMError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
