package typings.quill.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuillOptionsStatic extends js.Object {
  var bounds: js.UndefOr[HTMLElement | String] = js.undefined
  var debug: js.UndefOr[String | Boolean] = js.undefined
  var formats: js.UndefOr[js.Array[String]] = js.undefined
  var modules: js.UndefOr[StringMap] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var scrollingContainer: js.UndefOr[HTMLElement | String] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
}

object QuillOptionsStatic {
  @scala.inline
  def apply(
    bounds: HTMLElement | String = null,
    debug: String | Boolean = null,
    formats: js.Array[String] = null,
    modules: StringMap = null,
    placeholder: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    scrollingContainer: HTMLElement | String = null,
    strict: js.UndefOr[Boolean] = js.undefined,
    theme: String = null
  ): QuillOptionsStatic = {
    val __obj = js.Dynamic.literal()
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (debug != null) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (formats != null) __obj.updateDynamic("formats")(formats.asInstanceOf[js.Any])
    if (modules != null) __obj.updateDynamic("modules")(modules.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (scrollingContainer != null) __obj.updateDynamic("scrollingContainer")(scrollingContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuillOptionsStatic]
  }
}

