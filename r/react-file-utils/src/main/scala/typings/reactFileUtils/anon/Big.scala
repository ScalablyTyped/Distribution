package typings.reactFileUtils.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Big extends js.Object {
  var big: js.UndefOr[Boolean] = js.native
  var filename: js.UndefOr[String] = js.native
  var mimeType: js.UndefOr[String] = js.native
  // Size used for big icon
  var size: js.UndefOr[Double] = js.native
}

object Big {
  @scala.inline
  def apply(): Big = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Big]
  }
  @scala.inline
  implicit class BigOps[Self <: Big] (val x: Self) extends AnyVal {
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
    def setBig(value: Boolean): Self = this.set("big", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBig: Self = this.set("big", js.undefined)
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

