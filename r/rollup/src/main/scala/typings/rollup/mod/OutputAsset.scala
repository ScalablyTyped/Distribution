package typings.rollup.mod

import typings.rollup.rollupBooleans.`true`
import typings.rollup.rollupStrings.asset
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputAsset extends PreRenderedAsset {
  var fileName: String = js.native
  /** @deprecated Accessing "isAsset" on files in the bundle is deprecated, please use "type === \'asset\'" instead */
  var isAsset: `true` = js.native
}

object OutputAsset {
  @scala.inline
  def apply(fileName: String, isAsset: `true`, source: String | Uint8Array, `type`: asset): OutputAsset = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], isAsset = isAsset.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputAsset]
  }
  @scala.inline
  implicit class OutputAssetOps[Self <: OutputAsset] (val x: Self) extends AnyVal {
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
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsAsset(value: `true`): Self = this.set("isAsset", value.asInstanceOf[js.Any])
  }
  
}

