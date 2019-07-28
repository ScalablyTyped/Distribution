package typings.reactDashInlinesvg.reactDashInlinesvgMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineSVGError extends Error {
  var isConfigurationError: Boolean
  var isSupportedBrowser: Boolean
  var isUnsupportedBrowserError: Boolean
  @JSName("name")
  var name_InlineSVGError: typings.reactDashInlinesvg.reactDashInlinesvgStrings.InlineSVGError
}

object InlineSVGError {
  @scala.inline
  def apply(
    isConfigurationError: Boolean,
    isSupportedBrowser: Boolean,
    isUnsupportedBrowserError: Boolean,
    message: String,
    name: typings.reactDashInlinesvg.reactDashInlinesvgStrings.InlineSVGError,
    stack: String = null
  ): InlineSVGError = {
    val __obj = js.Dynamic.literal(isConfigurationError = isConfigurationError, isSupportedBrowser = isSupportedBrowser, isUnsupportedBrowserError = isUnsupportedBrowserError, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[InlineSVGError]
  }
}

