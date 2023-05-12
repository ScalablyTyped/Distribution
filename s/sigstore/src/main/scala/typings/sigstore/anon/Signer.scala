package typings.sigstore.anon

import typings.node.bufferMod.global.Buffer
import typings.sigstore.distTypesSignatureMod.SignatureMaterial
import typings.sigstore.distTypesSignatureMod.SignerFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Signer extends StObject {
  
  def signer(payload: Buffer): js.Promise[SignatureMaterial]
  @JSName("signer")
  var signer_Original: SignerFunc
}
object Signer {
  
  inline def apply(signer: /* payload */ Buffer => js.Promise[SignatureMaterial]): Signer = {
    val __obj = js.Dynamic.literal(signer = js.Any.fromFunction1(signer))
    __obj.asInstanceOf[Signer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Signer] (val x: Self) extends AnyVal {
    
    inline def setSigner(value: /* payload */ Buffer => js.Promise[SignatureMaterial]): Self = StObject.set(x, "signer", js.Any.fromFunction1(value))
  }
}
