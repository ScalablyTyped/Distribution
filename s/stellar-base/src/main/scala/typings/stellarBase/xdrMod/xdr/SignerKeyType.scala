package typings.stellarBase.xdrMod.xdr

import typings.stellarBase.stellarBaseNumbers.`0`
import typings.stellarBase.stellarBaseNumbers.`1`
import typings.stellarBase.stellarBaseNumbers.`2`
import typings.stellarBase.stellarBaseStrings.signerKeyTypeEd25519
import typings.stellarBase.stellarBaseStrings.signerKeyTypeHashX
import typings.stellarBase.stellarBaseStrings.signerKeyTypePreAuthTx
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignerKeyType extends StObject {
  
  val name: signerKeyTypeEd25519 | signerKeyTypePreAuthTx | signerKeyTypeHashX = js.native
  
  val value: `0` | `1` | `2` = js.native
}
object SignerKeyType {
  
  @scala.inline
  def apply(name: signerKeyTypeEd25519 | signerKeyTypePreAuthTx | signerKeyTypeHashX, value: `0` | `1` | `2`): SignerKeyType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignerKeyType]
  }
  
  @scala.inline
  implicit class SignerKeyTypeMutableBuilder[Self <: SignerKeyType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: signerKeyTypeEd25519 | signerKeyTypePreAuthTx | signerKeyTypeHashX): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `1` | `2`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
