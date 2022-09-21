package typings.ssh2.mod

import typings.ssh2.anon.Comment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicKeyEntry extends StObject {
  
  var pubKey: ParsedKey | Comment
}
object PublicKeyEntry {
  
  inline def apply(pubKey: ParsedKey | Comment): PublicKeyEntry = {
    val __obj = js.Dynamic.literal(pubKey = pubKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyEntry]
  }
  
  extension [Self <: PublicKeyEntry](x: Self) {
    
    inline def setPubKey(value: ParsedKey | Comment): Self = StObject.set(x, "pubKey", value.asInstanceOf[js.Any])
  }
}
