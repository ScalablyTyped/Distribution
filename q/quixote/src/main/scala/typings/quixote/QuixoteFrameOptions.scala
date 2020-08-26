package typings.quixote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuixoteFrameOptions extends js.Object {
  // Height of the iframe. Defaults to a large value (see stability note below)
  var height: js.UndefOr[Double] = js.native
  // URL of an HTML document to load into the frame. Must be served from same domain as the enclosing test document, or you could get same-origin policy errors. Defaults to an empty document with <!DOCTYPE html> (to enable standards-mode rendering)
  var src: js.UndefOr[String] = js.native
  // URL of a CSS stylesheet to load into the frame. Defaults to loading nothing
  var stylesheet: js.UndefOr[String] = js.native
  // Width of the iframe. Defaults to a large value (see stability note below)
  var width: js.UndefOr[Double] = js.native
}

object QuixoteFrameOptions {
  @scala.inline
  def apply(): QuixoteFrameOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuixoteFrameOptions]
  }
  @scala.inline
  implicit class QuixoteFrameOptionsOps[Self <: QuixoteFrameOptions] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    @scala.inline
    def setStylesheet(value: String): Self = this.set("stylesheet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStylesheet: Self = this.set("stylesheet", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

