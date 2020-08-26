package typings.stellarBase.xdrMod.xdr

import typings.stellarBase.stellarBaseNumbers.`0`
import typings.stellarBase.stellarBaseNumbers.`1`
import typings.stellarBase.stellarBaseNumbers.`256`
import typings.stellarBase.stellarBaseNumbers.`2`
import typings.stellarBase.stellarBaseStrings.keyTypeEd25519
import typings.stellarBase.stellarBaseStrings.keyTypeHashX
import typings.stellarBase.stellarBaseStrings.keyTypeMuxedEd25519
import typings.stellarBase.stellarBaseStrings.keyTypePreAuthTx
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CryptoKeyType extends js.Object {
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
  implicit class CryptoKeyTypeOps[Self <: CryptoKeyType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: keyTypeEd25519 | keyTypePreAuthTx | keyTypeHashX | keyTypeMuxedEd25519): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: `0` | `1` | `2` | `256`): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

