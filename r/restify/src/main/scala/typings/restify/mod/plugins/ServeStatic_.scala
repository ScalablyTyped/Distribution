package typings.restify.mod.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServeStatic_ extends js.Object {
  var appendRequestPath: js.UndefOr[Boolean] = js.native
  var charSet: js.UndefOr[String] = js.native
  var default: js.UndefOr[js.Any] = js.native
  var directory: js.UndefOr[String] = js.native
  var etag: js.UndefOr[String] = js.native
  var file: js.UndefOr[String] = js.native
  var gzip: js.UndefOr[Boolean] = js.native
  var `match`: js.UndefOr[js.Any] = js.native
  var maxAge: js.UndefOr[Double] = js.native
}

object ServeStatic_ {
  @scala.inline
  def apply(): ServeStatic_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServeStatic_]
  }
  @scala.inline
  implicit class ServeStatic_Ops[Self <: ServeStatic_] (val x: Self) extends AnyVal {
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
    def setAppendRequestPath(value: Boolean): Self = this.set("appendRequestPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppendRequestPath: Self = this.set("appendRequestPath", js.undefined)
    @scala.inline
    def setCharSet(value: String): Self = this.set("charSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCharSet: Self = this.set("charSet", js.undefined)
    @scala.inline
    def setDefault(value: js.Any): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setDirectory(value: String): Self = this.set("directory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectory: Self = this.set("directory", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    @scala.inline
    def setGzip(value: Boolean): Self = this.set("gzip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGzip: Self = this.set("gzip", js.undefined)
    @scala.inline
    def setMatch(value: js.Any): Self = this.set("match", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatch: Self = this.set("match", js.undefined)
    @scala.inline
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
  }
  
}

