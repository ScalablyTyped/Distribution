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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncryptedAppTicket] (val x: Self) extends AnyVal {
    
    inline def setEncryptedAppTicket(value: Buffer): Self = StObject.set(x, "encryptedAppTicket", value.asInstanceOf[js.Any])
  }
}
