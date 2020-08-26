package typings.stellarBase.xdrMod.xdr

import typings.stellarBase.stellarBaseNumbers.`0`
import typings.stellarBase.stellarBaseStrings.publicKeyTypeEd25519
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublicKeyType extends js.Object {
  val name: publicKeyTypeEd25519 = js.native
  val value: `0` = js.native
}

object PublicKeyType {
  @scala.inline
  def apply(name: publicKeyTypeEd25519, value: `0`): PublicKeyType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyType]
  }
  @scala.inline
  implicit class PublicKeyTypeOps[Self <: PublicKeyType] (val x: Self) extends AnyVal {
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
    def setName(value: publicKeyTypeEd25519): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: `0`): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

