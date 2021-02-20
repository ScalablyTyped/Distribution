package typings.stellarBase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ed25519PublicKey extends StObject {
  
  var ed25519PublicKey: js.Any = js.native
}
object Ed25519PublicKey {
  
  @scala.inline
  def apply(ed25519PublicKey: js.Any): Ed25519PublicKey = {
    val __obj = js.Dynamic.literal(ed25519PublicKey = ed25519PublicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ed25519PublicKey]
  }
  
  @scala.inline
  implicit class Ed25519PublicKeyMutableBuilder[Self <: Ed25519PublicKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEd25519PublicKey(value: js.Any): Self = StObject.set(x, "ed25519PublicKey", value.asInstanceOf[js.Any])
  }
}
