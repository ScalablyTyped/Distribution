package typings.sharp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheOptions extends js.Object {
  /** Is the maximum number of files to hold open (optional, default 20) */
  var files: js.UndefOr[Double] = js.native
  /** Is the maximum number of operations to cache (optional, default 100) */
  var items: js.UndefOr[Double] = js.native
  /** Is the maximum memory in MB to use for this cache (optional, default 50) */
  var memory: js.UndefOr[Double] = js.native
}

object CacheOptions {
  @scala.inline
  def apply(): CacheOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheOptions]
  }
  @scala.inline
  implicit class CacheOptionsOps[Self <: CacheOptions] (val x: Self) extends AnyVal {
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
    def setFiles(value: Double): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    @scala.inline
    def setItems(value: Double): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setMemory(value: Double): Self = this.set("memory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemory: Self = this.set("memory", js.undefined)
  }
  
}

