package typings.rollup.mod

import typings.rollup.rollupStrings.asset
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreRenderedAsset extends js.Object {
  var name: js.UndefOr[String] = js.native
  var source: String | Uint8Array = js.native
  var `type`: asset = js.native
}

object PreRenderedAsset {
  @scala.inline
  def apply(source: String | Uint8Array, `type`: asset): PreRenderedAsset = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreRenderedAsset]
  }
  @scala.inline
  implicit class PreRenderedAssetOps[Self <: PreRenderedAsset] (val x: Self) extends AnyVal {
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
    def setSource(value: String | Uint8Array): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: asset): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

