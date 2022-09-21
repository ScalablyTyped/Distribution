package typings.steamUser.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthSecret extends StObject {
  
  var key: Buffer
  
  var secretID: Double
}
object AuthSecret {
  
  inline def apply(key: Buffer, secretID: Double): AuthSecret = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], secretID = secretID.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthSecret]
  }
  
  extension [Self <: AuthSecret](x: Self) {
    
    inline def setKey(value: Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setSecretID(value: Double): Self = StObject.set(x, "secretID", value.asInstanceOf[js.Any])
  }
}
