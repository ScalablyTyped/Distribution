package typings
package quillLib.quillMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuillOptionsStatic extends js.Object {
  var bounds: js.UndefOr[stdLib.HTMLElement | java.lang.String] = js.undefined
  var debug: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var formats: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var modules: js.UndefOr[StringMap] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  var scrollingContainer: js.UndefOr[stdLib.HTMLElement | java.lang.String] = js.undefined
  var strict: js.UndefOr[scala.Boolean] = js.undefined
  var theme: js.UndefOr[java.lang.String] = js.undefined
}

object QuillOptionsStatic {
  @scala.inline
  def apply(
    bounds: stdLib.HTMLElement | java.lang.String = null,
    debug: java.lang.String | scala.Boolean = null,
    formats: js.Array[java.lang.String] = null,
    modules: StringMap = null,
    placeholder: java.lang.String = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    scrollingContainer: stdLib.HTMLElement | java.lang.String = null,
    strict: js.UndefOr[scala.Boolean] = js.undefined,
    theme: java.lang.String = null
  ): QuillOptionsStatic = {
    val __obj = js.Dynamic.literal()
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (debug != null) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (formats != null) __obj.updateDynamic("formats")(formats)
    if (modules != null) __obj.updateDynamic("modules")(modules)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (scrollingContainer != null) __obj.updateDynamic("scrollingContainer")(scrollingContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[QuillOptionsStatic]
  }
}

