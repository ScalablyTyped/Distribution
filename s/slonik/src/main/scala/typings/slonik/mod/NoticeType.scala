package typings.slonik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NoticeType extends StObject {
  
  var code: String = js.native
  
  var length: Double = js.native
  
  var message: String = js.native
  
  var name: String = js.native
  
  var severity: String = js.native
  
  var where: String = js.native
}
object NoticeType {
  
  @scala.inline
  def apply(code: String, length: Double, message: String, name: String, severity: String, where: String): NoticeType = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], where = where.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoticeType]
  }
  
  @scala.inline
  implicit class NoticeTypeMutableBuilder[Self <: NoticeType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhere(value: String): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
  }
}
