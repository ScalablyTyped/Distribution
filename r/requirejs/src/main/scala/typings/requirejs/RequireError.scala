package typings.requirejs

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequireError extends Error {
  
  /**
    * The original error, if there is one (might be null).
    **/
  var originalError: Error = js.native
  
  /**
    * Required modules.
    **/
  var requireModules: js.Array[String] | Null = js.native
  
  /**
    * The error ID that maps to an ID on a web page.
    **/
  var requireType: String = js.native
}
object RequireError {
  
  @scala.inline
  def apply(message: String, name: String, originalError: Error, requireType: String): RequireError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], originalError = originalError.asInstanceOf[js.Any], requireType = requireType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequireError]
  }
  
  @scala.inline
  implicit class RequireErrorOps[Self <: RequireError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOriginalError(value: Error): Self = this.set("originalError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireType(value: String): Self = this.set("requireType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireModulesVarargs(value: String*): Self = this.set("requireModules", js.Array(value :_*))
    
    @scala.inline
    def setRequireModules(value: js.Array[String]): Self = this.set("requireModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireModulesNull: Self = this.set("requireModules", null)
  }
}
