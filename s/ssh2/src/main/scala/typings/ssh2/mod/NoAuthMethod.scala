package typings.ssh2.mod

import typings.ssh2.ssh2Strings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NoAuthMethod
  extends StObject
     with AuthMethod
     with AnyAuthMethod {
  
  @JSName("type")
  var type_NoAuthMethod: none
}
object NoAuthMethod {
  
  inline def apply(username: String): NoAuthMethod = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("none")
    __obj.asInstanceOf[NoAuthMethod]
  }
  
  extension [Self <: NoAuthMethod](x: Self) {
    
    inline def setType(value: none): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
