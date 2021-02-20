package typings.stellarBase.anon

import typings.node.Buffer
import typings.stellarBase.xdrMod.xdr.Uint64
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ed25519 extends StObject {
  
  var ed25519: Buffer = js.native
  
  var id: Uint64 = js.native
}
object Ed25519 {
  
  @scala.inline
  def apply(ed25519: Buffer, id: Uint64): Ed25519 = {
    val __obj = js.Dynamic.literal(ed25519 = ed25519.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ed25519]
  }
  
  @scala.inline
  implicit class Ed25519MutableBuilder[Self <: Ed25519] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEd25519(value: Buffer): Self = StObject.set(x, "ed25519", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Uint64): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
