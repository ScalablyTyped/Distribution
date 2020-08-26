package typings.rocksdb.mod.RocksDB

import typings.abstractLeveldown.mod.AbstractGetOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOptions extends AbstractGetOptions {
  var fillCache: js.UndefOr[Boolean] = js.native
}

object GetOptions {
  @scala.inline
  def apply(): GetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOptions]
  }
  @scala.inline
  implicit class GetOptionsOps[Self <: GetOptions] (val x: Self) extends AnyVal {
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
    def setFillCache(value: Boolean): Self = this.set("fillCache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillCache: Self = this.set("fillCache", js.undefined)
  }
  
}

