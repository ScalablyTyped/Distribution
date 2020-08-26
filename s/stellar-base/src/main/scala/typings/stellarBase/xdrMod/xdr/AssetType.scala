package typings.stellarBase.xdrMod.xdr

import typings.stellarBase.stellarBaseNumbers.`0`
import typings.stellarBase.stellarBaseNumbers.`1`
import typings.stellarBase.stellarBaseNumbers.`2`
import typings.stellarBase.stellarBaseStrings.assetTypeCreditAlphanum12
import typings.stellarBase.stellarBaseStrings.assetTypeCreditAlphanum4
import typings.stellarBase.stellarBaseStrings.assetTypeNative
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssetType extends js.Object {
  val name: assetTypeNative | assetTypeCreditAlphanum4 | assetTypeCreditAlphanum12 = js.native
  val value: `0` | `1` | `2` = js.native
}

object AssetType {
  @scala.inline
  def apply(
    name: assetTypeNative | assetTypeCreditAlphanum4 | assetTypeCreditAlphanum12,
    value: `0` | `1` | `2`
  ): AssetType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetType]
  }
  @scala.inline
  implicit class AssetTypeOps[Self <: AssetType] (val x: Self) extends AnyVal {
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
    def setName(value: assetTypeNative | assetTypeCreditAlphanum4 | assetTypeCreditAlphanum12): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: `0` | `1` | `2`): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

