package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaStreamError extends StObject {
  
  val constraintName: java.lang.String | Null = js.native
  
  val message: java.lang.String | Null = js.native
  
  val name: java.lang.String = js.native
}
object MediaStreamError {
  
  @scala.inline
  def apply(name: java.lang.String): MediaStreamError = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamError]
  }
  
  @scala.inline
  implicit class MediaStreamErrorMutableBuilder[Self <: MediaStreamError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConstraintName(value: java.lang.String): Self = StObject.set(x, "constraintName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstraintNameNull: Self = StObject.set(x, "constraintName", null)
    
    @scala.inline
    def setMessage(value: java.lang.String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageNull: Self = StObject.set(x, "message", null)
    
    @scala.inline
    def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
