package typings.reactEmailEditor.mod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailEditorProps extends js.Object {
  val appearance: js.UndefOr[AppearanceConfig] = js.undefined
  val minHeight: js.UndefOr[Double] = js.undefined
  var onLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  val options: js.UndefOr[UnlayerOptions] = js.undefined
  val projectId: js.UndefOr[Double] = js.undefined
  val style: js.UndefOr[CSSProperties] = js.undefined
  val tools: js.UndefOr[ToolsConfig] = js.undefined
}

object EmailEditorProps {
  @scala.inline
  def apply(
    appearance: AppearanceConfig = null,
    minHeight: js.UndefOr[Double] = js.undefined,
    onLoad: () => Unit = null,
    options: UnlayerOptions = null,
    projectId: js.UndefOr[Double] = js.undefined,
    style: CSSProperties = null,
    tools: ToolsConfig = null
  ): EmailEditorProps = {
    val __obj = js.Dynamic.literal()
    if (appearance != null) __obj.updateDynamic("appearance")(appearance.asInstanceOf[js.Any])
    if (!js.isUndefined(minHeight)) __obj.updateDynamic("minHeight")(minHeight.get.asInstanceOf[js.Any])
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction0(onLoad))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (!js.isUndefined(projectId)) __obj.updateDynamic("projectId")(projectId.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tools != null) __obj.updateDynamic("tools")(tools.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailEditorProps]
  }
}

