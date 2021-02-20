package typings.ssh2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetEnvInfo extends StObject {
  
  /** The environment variable's name. */
  var key: String = js.native
  
  /** The environment variable's value. */
  var value: String = js.native
}
object SetEnvInfo {
  
  @scala.inline
  def apply(key: String, value: String): SetEnvInfo = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetEnvInfo]
  }
  
  @scala.inline
  implicit class SetEnvInfoMutableBuilder[Self <: SetEnvInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
