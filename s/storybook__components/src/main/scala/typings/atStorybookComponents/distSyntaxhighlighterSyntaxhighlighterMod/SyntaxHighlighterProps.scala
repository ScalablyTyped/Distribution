package typings.atStorybookComponents.distSyntaxhighlighterSyntaxhighlighterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyntaxHighlighterProps extends js.Object {
  var bordered: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var copyable: js.UndefOr[Boolean] = js.undefined
  var format: js.UndefOr[Boolean] = js.undefined
  var language: String
  var padded: js.UndefOr[Boolean] = js.undefined
}

object SyntaxHighlighterProps {
  @scala.inline
  def apply(
    language: String,
    bordered: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    copyable: js.UndefOr[Boolean] = js.undefined,
    format: js.UndefOr[Boolean] = js.undefined,
    padded: js.UndefOr[Boolean] = js.undefined
  ): SyntaxHighlighterProps = {
    val __obj = js.Dynamic.literal(language = language)
    if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(copyable)) __obj.updateDynamic("copyable")(copyable)
    if (!js.isUndefined(format)) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(padded)) __obj.updateDynamic("padded")(padded)
    __obj.asInstanceOf[SyntaxHighlighterProps]
  }
}

