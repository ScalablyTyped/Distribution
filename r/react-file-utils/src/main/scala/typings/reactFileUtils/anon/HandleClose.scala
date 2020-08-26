package typings.reactFileUtils.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HandleClose extends js.Object {
  var handleClose: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], Unit]] = js.native
  var id: js.UndefOr[String] = js.native
  var image: js.UndefOr[String] = js.native
  var imgSrc: js.UndefOr[js.Any] = js.native
  var size: js.UndefOr[Double] = js.native
}

object HandleClose {
  @scala.inline
  def apply(): HandleClose = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HandleClose]
  }
  @scala.inline
  implicit class HandleCloseOps[Self <: HandleClose] (val x: Self) extends AnyVal {
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
    def setHandleClose(value: /* id */ js.UndefOr[String] => Unit): Self = this.set("handleClose", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHandleClose: Self = this.set("handleClose", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setImgSrc(value: js.Any): Self = this.set("imgSrc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImgSrc: Self = this.set("imgSrc", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

