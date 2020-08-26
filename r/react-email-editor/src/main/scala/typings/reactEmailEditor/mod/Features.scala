package typings.reactEmailEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Features extends js.Object {
  val imageEditor: js.UndefOr[Boolean] = js.native
  val preview: js.UndefOr[Boolean] = js.native
  val undoRedo: js.UndefOr[Boolean] = js.native
}

object Features {
  @scala.inline
  def apply(): Features = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Features]
  }
  @scala.inline
  implicit class FeaturesOps[Self <: Features] (val x: Self) extends AnyVal {
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
    def setImageEditor(value: Boolean): Self = this.set("imageEditor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageEditor: Self = this.set("imageEditor", js.undefined)
    @scala.inline
    def setPreview(value: Boolean): Self = this.set("preview", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreview: Self = this.set("preview", js.undefined)
    @scala.inline
    def setUndoRedo(value: Boolean): Self = this.set("undoRedo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUndoRedo: Self = this.set("undoRedo", js.undefined)
  }
  
}

