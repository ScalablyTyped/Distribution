package typings.reactEmailEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorConfig extends js.Object {
  val maxRows: js.UndefOr[Double] = js.native
  val minRows: js.UndefOr[Double] = js.native
}

object EditorConfig {
  @scala.inline
  def apply(): EditorConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorConfig]
  }
  @scala.inline
  implicit class EditorConfigOps[Self <: EditorConfig] (val x: Self) extends AnyVal {
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
    def setMaxRows(value: Double): Self = this.set("maxRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRows: Self = this.set("maxRows", js.undefined)
    @scala.inline
    def setMinRows(value: Double): Self = this.set("minRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinRows: Self = this.set("minRows", js.undefined)
  }
  
}

