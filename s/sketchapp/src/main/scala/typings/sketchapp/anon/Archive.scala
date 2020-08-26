package typings.sketchapp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Archive extends js.Object {
  var _archive: String = js.native
}

object Archive {
  @scala.inline
  def apply(_archive: String): Archive = {
    val __obj = js.Dynamic.literal(_archive = _archive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Archive]
  }
  @scala.inline
  implicit class ArchiveOps[Self <: Archive] (val x: Self) extends AnyVal {
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
    def set_archive(value: String): Self = this.set("_archive", value.asInstanceOf[js.Any])
  }
  
}

