package typings.reactMonacoEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonacoEditorBaseProps extends js.Object {
  /**
    * Optional, allow to pass a different context then the global window onto which the monaco instance will be loaded. Useful if you want to load the editor in an iframe.
    */
  var context: js.UndefOr[js.Any] = js.undefined
  /**
    * The initial value of the auto created model in the editor.
    */
  var defaultValue: js.UndefOr[String] = js.undefined
  /**
    * Height of editor. Defaults to 500.
    */
  var height: js.UndefOr[String | Double] = js.undefined
  /**
    * The initial language of the auto created model in the editor. Defaults to 'javascript'.
    */
  var language: js.UndefOr[String] = js.undefined
  /**
    * Theme to be used for rendering.
    * The current out-of-the-box available themes are: 'vs' (default), 'vs-dark', 'hc-black'.
    * You can create custom themes via `monaco.editor.defineTheme`.
    */
  var theme: js.UndefOr[String | Null] = js.undefined
  /**
    * Width of editor. Defaults to 100%.
    */
  var width: js.UndefOr[String | Double] = js.undefined
}

object MonacoEditorBaseProps {
  @scala.inline
  def apply(
    context: js.Any = null,
    defaultValue: String = null,
    height: String | Double = null,
    language: String = null,
    theme: js.UndefOr[Null | String] = js.undefined,
    width: String | Double = null
  ): MonacoEditorBaseProps = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (!js.isUndefined(theme)) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonacoEditorBaseProps]
  }
}

