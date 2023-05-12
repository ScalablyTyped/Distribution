package typings.sigstore.anon

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Signature extends StObject {
  
  var signature: Buffer
}
object Signature {
  
  inline def apply(signature: Buffer): Signature = {
    val __obj = js.Dynamic.literal(signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[Signature]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Signature] (val x: Self) extends AnyVal {
    
    inline def setSignature(value: Buffer): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
  }
}
