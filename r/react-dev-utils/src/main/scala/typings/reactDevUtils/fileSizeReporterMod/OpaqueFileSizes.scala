package typings.reactDevUtils.fileSizeReporterMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpaqueFileSizes extends js.Object {
  var root: String = js.native
  var sizes: Record[String, Double] = js.native
}

object OpaqueFileSizes {
  @scala.inline
  def apply(root: String, sizes: Record[String, Double]): OpaqueFileSizes = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpaqueFileSizes]
  }
  @scala.inline
  implicit class OpaqueFileSizesOps[Self <: OpaqueFileSizes] (val x: Self) extends AnyVal {
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
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def setSizes(value: Record[String, Double]): Self = this.set("sizes", value.asInstanceOf[js.Any])
  }
  
}

