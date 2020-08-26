package typings.redboxReact.mod

import typings.react.mod.CSSProperties
import typings.react.mod.Props
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedBoxProps extends Props[RedBoxError] {
  var className: js.UndefOr[String] = js.native
  var editorScheme: js.UndefOr[String] = js.native
  var error: Error = js.native
  var filename: js.UndefOr[String] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var useColumns: js.UndefOr[Boolean] = js.native
  var useLines: js.UndefOr[Boolean] = js.native
}

object RedBoxProps {
  @scala.inline
  def apply(error: Error): RedBoxProps = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedBoxProps]
  }
  @scala.inline
  implicit class RedBoxPropsOps[Self <: RedBoxProps] (val x: Self) extends AnyVal {
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
    def setError(value: Error): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setEditorScheme(value: String): Self = this.set("editorScheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditorScheme: Self = this.set("editorScheme", js.undefined)
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setUseColumns(value: Boolean): Self = this.set("useColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseColumns: Self = this.set("useColumns", js.undefined)
    @scala.inline
    def setUseLines(value: Boolean): Self = this.set("useLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseLines: Self = this.set("useLines", js.undefined)
  }
  
}

