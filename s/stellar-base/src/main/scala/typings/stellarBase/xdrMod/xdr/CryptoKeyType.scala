package typings.stellarBase.xdrMod.xdr

import typings.stellarBase.stellarBaseNumbers.`0`
import typings.stellarBase.stellarBaseNumbers.`1`
import typings.stellarBase.stellarBaseNumbers.`256`
import typings.stellarBase.stellarBaseNumbers.`2`
import typings.stellarBase.stellarBaseStrings.keyTypeEd25519
import typings.stellarBase.stellarBaseStrings.keyTypeHashX
import typings.stellarBase.stellarBaseStrings.keyTypeMuxedEd25519
import typings.stellarBase.stellarBaseStrings.keyTypePreAuthTx
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CryptoKeyType extends StObject {
  
  val name: keyTypeEd25519 | keyTypePreAuthTx | keyTypeHashX | keyTypeMuxedEd25519 = js.native
  
  val value: `0` | `1` | `2` | `256` = js.native
}
object CryptoKeyType {
  
  @scala.inline
  def apply(
    name: keyTypeEd25519 | keyTypePreAuthTx | keyTypeHashX | keyTypeMuxedEd25519,
    value: `0` | `1` | `2` | `256`
  ): CryptoKeyType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoKeyType]
  }
  
  @scala.inline
  implicit class CryptoKeyTypeMutableBuilder[Self <: CryptoKeyType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: keyTypeEd25519 | keyTypePreAuthTx | keyTypeHashX | keyTypeMuxedEd25519): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `1` | `2` | `256`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
