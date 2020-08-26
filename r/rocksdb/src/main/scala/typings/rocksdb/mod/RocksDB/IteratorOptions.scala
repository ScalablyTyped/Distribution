package typings.rocksdb.mod.RocksDB

import typings.abstractLeveldown.mod.AbstractIteratorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IteratorOptions extends AbstractIteratorOptions[Bytes] {
  var fillCache: js.UndefOr[Boolean] = js.native
}

object IteratorOptions {
  @scala.inline
  def apply(): IteratorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IteratorOptions]
  }
  @scala.inline
  implicit class IteratorOptionsOps[Self <: IteratorOptions] (val x: Self) extends AnyVal {
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

