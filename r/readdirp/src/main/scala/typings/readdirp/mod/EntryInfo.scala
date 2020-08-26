package typings.readdirp.mod

import typings.node.fsMod.Dirent
import typings.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntryInfo extends js.Object {
  var basename: String = js.native
  var dirent: js.UndefOr[Dirent] = js.native
  var fullPath: String = js.native
  var path: String = js.native
  var stats: js.UndefOr[Stats] = js.native
}

object EntryInfo {
  @scala.inline
  def apply(basename: String, fullPath: String, path: String): EntryInfo = {
    val __obj = js.Dynamic.literal(basename = basename.asInstanceOf[js.Any], fullPath = fullPath.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryInfo]
  }
  @scala.inline
  implicit class EntryInfoOps[Self <: EntryInfo] (val x: Self) extends AnyVal {
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
    def setBasename(value: String): Self = this.set("basename", value.asInstanceOf[js.Any])
    @scala.inline
    def setFullPath(value: String): Self = this.set("fullPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirent(value: Dirent): Self = this.set("dirent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirent: Self = this.set("dirent", js.undefined)
    @scala.inline
    def setStats(value: Stats): Self = this.set("stats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStats: Self = this.set("stats", js.undefined)
  }
  
}

