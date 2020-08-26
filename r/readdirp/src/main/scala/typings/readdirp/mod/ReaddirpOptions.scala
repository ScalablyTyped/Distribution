package typings.readdirp.mod

import typings.readdirp.readdirpStrings.all
import typings.readdirp.readdirpStrings.directories
import typings.readdirp.readdirpStrings.files
import typings.readdirp.readdirpStrings.files_directories
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReaddirpOptions extends js.Object {
  var alwaysStat: js.UndefOr[Boolean] = js.native
  var depth: js.UndefOr[Double] = js.native
  var directoryFilter: js.UndefOr[String | js.Array[String] | (js.Function1[/* entry */ EntryInfo, Boolean])] = js.native
  var fileFilter: js.UndefOr[String | js.Array[String] | (js.Function1[/* entry */ EntryInfo, Boolean])] = js.native
  var lstat: js.UndefOr[Boolean] = js.native
  var root: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[files | directories | files_directories | all] = js.native
}

object ReaddirpOptions {
  @scala.inline
  def apply(): ReaddirpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReaddirpOptions]
  }
  @scala.inline
  implicit class ReaddirpOptionsOps[Self <: ReaddirpOptions] (val x: Self) extends AnyVal {
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
    def setAlwaysStat(value: Boolean): Self = this.set("alwaysStat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlwaysStat: Self = this.set("alwaysStat", js.undefined)
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    @scala.inline
    def setDirectoryFilterVarargs(value: String*): Self = this.set("directoryFilter", js.Array(value :_*))
    @scala.inline
    def setDirectoryFilterFunction1(value: /* entry */ EntryInfo => Boolean): Self = this.set("directoryFilter", js.Any.fromFunction1(value))
    @scala.inline
    def setDirectoryFilter(value: String | js.Array[String] | (js.Function1[/* entry */ EntryInfo, Boolean])): Self = this.set("directoryFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectoryFilter: Self = this.set("directoryFilter", js.undefined)
    @scala.inline
    def setFileFilterVarargs(value: String*): Self = this.set("fileFilter", js.Array(value :_*))
    @scala.inline
    def setFileFilterFunction1(value: /* entry */ EntryInfo => Boolean): Self = this.set("fileFilter", js.Any.fromFunction1(value))
    @scala.inline
    def setFileFilter(value: String | js.Array[String] | (js.Function1[/* entry */ EntryInfo, Boolean])): Self = this.set("fileFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileFilter: Self = this.set("fileFilter", js.undefined)
    @scala.inline
    def setLstat(value: Boolean): Self = this.set("lstat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLstat: Self = this.set("lstat", js.undefined)
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setType(value: files | directories | files_directories | all): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

