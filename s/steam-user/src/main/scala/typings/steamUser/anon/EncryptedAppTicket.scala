package typings.steamUser.anon

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptedAppTicket extends StObject {
  
  var encryptedAppTicket: Buffer
}
object EncryptedAppTicket {
  
  inline def apply(encryptedAppTicket: Buffer): EncryptedAppTicket = {
    val __obj = js.Dynamic.literal(encryptedAppTicket = encryptedAppTicket.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptedAppTicket]
  }
  
  extension [Self <: EncryptedAppTicket](x: Self) {
    
    inline def setEncryptedAppTicket(value: Buffer): Self = StObject.set(x, "encryptedAppTicket", value.asInstanceOf[js.Any])
  }
}
