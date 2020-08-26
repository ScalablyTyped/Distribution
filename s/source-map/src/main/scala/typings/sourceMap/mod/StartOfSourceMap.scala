package typings.sourceMap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartOfSourceMap extends js.Object {
  var file: js.UndefOr[String] = js.native
  var skipValidation: js.UndefOr[Boolean] = js.native
  var sourceRoot: js.UndefOr[String] = js.native
}

object StartOfSourceMap {
  @scala.inline
  def apply(): StartOfSourceMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartOfSourceMap]
  }
  @scala.inline
  implicit class StartOfSourceMapOps[Self <: StartOfSourceMap] (val x: Self) extends AnyVal {
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
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    @scala.inline
    def setSkipValidation(value: Boolean): Self = this.set("skipValidation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipValidation: Self = this.set("skipValidation", js.undefined)
    @scala.inline
    def setSourceRoot(value: String): Self = this.set("sourceRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceRoot: Self = this.set("sourceRoot", js.undefined)
  }
  
}

