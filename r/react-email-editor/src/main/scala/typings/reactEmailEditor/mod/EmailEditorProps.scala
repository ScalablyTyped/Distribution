package typings.reactEmailEditor.mod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailEditorProps extends js.Object {
  val appearance: js.UndefOr[AppearanceConfig] = js.native
  val minHeight: js.UndefOr[Double] = js.native
  var onLoad: js.UndefOr[js.Function0[Unit]] = js.native
  val options: js.UndefOr[UnlayerOptions] = js.native
  val projectId: js.UndefOr[Double] = js.native
  val style: js.UndefOr[CSSProperties] = js.native
  val tools: js.UndefOr[ToolsConfig] = js.native
}

object EmailEditorProps {
  @scala.inline
  def apply(): EmailEditorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailEditorProps]
  }
  @scala.inline
  implicit class EmailEditorPropsOps[Self <: EmailEditorProps] (val x: Self) extends AnyVal {
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
    def setAppearance(value: AppearanceConfig): Self = this.set("appearance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppearance: Self = this.set("appearance", js.undefined)
    @scala.inline
    def setMinHeight(value: Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    @scala.inline
    def setOnLoad(value: () => Unit): Self = this.set("onLoad", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    @scala.inline
    def setOptions(value: UnlayerOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setProjectId(value: Double): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTools(value: ToolsConfig): Self = this.set("tools", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTools: Self = this.set("tools", js.undefined)
  }
  
}

