package typings.atStorybookComponents.distBlocksSourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceCodeProps extends js.Object {
  var code: js.UndefOr[String] = js.undefined
  var dark: js.UndefOr[Boolean] = js.undefined
  var format: js.UndefOr[Boolean] = js.undefined
  var language: js.UndefOr[String] = js.undefined
}

object SourceCodeProps {
  @scala.inline
  def apply(
    code: String = null,
    dark: js.UndefOr[Boolean] = js.undefined,
    format: js.UndefOr[Boolean] = js.undefined,
    language: String = null
  ): SourceCodeProps = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (!js.isUndefined(dark)) __obj.updateDynamic("dark")(dark.asInstanceOf[js.Any])
    if (!js.isUndefined(format)) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceCodeProps]
  }
}

