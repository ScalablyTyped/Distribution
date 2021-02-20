package typings.stellarBase.anon

import typings.node.Buffer
import typings.stellarBase.xdrMod.xdr.ScpStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Signature extends StObject {
  
  var signature: Buffer = js.native
  
  var statement: ScpStatement = js.native
}
object Signature {
  
  @scala.inline
  def apply(signature: Buffer, statement: ScpStatement): Signature = {
    val __obj = js.Dynamic.literal(signature = signature.asInstanceOf[js.Any], statement = statement.asInstanceOf[js.Any])
    __obj.asInstanceOf[Signature]
  }
  
  @scala.inline
  implicit class SignatureMutableBuilder[Self <: Signature] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSignature(value: Buffer): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatement(value: ScpStatement): Self = StObject.set(x, "statement", value.asInstanceOf[js.Any])
  }
}
