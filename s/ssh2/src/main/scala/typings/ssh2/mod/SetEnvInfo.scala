package typings.ssh2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetEnvInfo extends StObject {
  
  /** The environment variable's name. */
  var key: String
  
  /** The environment variable's value. */
  var value: String
}
object SetEnvInfo {
  
  inline def apply(key: String, value: String): SetEnvInfo = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetEnvInfo]
  }
  
  extension [Self <: SetEnvInfo](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
