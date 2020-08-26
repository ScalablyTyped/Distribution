package typings.sharp.mod

import typings.sharp.anon.Current
import typings.sharp.anon.Max
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheResult extends js.Object {
  var files: Max = js.native
  var items: Max = js.native
  var memory: Current = js.native
}

object CacheResult {
  @scala.inline
  def apply(files: Max, items: Max, memory: Current): CacheResult = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheResult]
  }
  @scala.inline
  implicit class CacheResultOps[Self <: CacheResult] (val x: Self) extends AnyVal {
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
    def setFiles(value: Max): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def setItems(value: Max): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setMemory(value: Current): Self = this.set("memory", value.asInstanceOf[js.Any])
  }
  
}

