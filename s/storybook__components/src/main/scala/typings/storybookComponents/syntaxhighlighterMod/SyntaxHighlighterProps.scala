package typings.storybookComponents.syntaxhighlighterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyntaxHighlighterProps extends js.Object {
  var bordered: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var copyable: js.UndefOr[Boolean] = js.native
  var format: js.UndefOr[Boolean] = js.native
  var language: String = js.native
  var padded: js.UndefOr[Boolean] = js.native
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
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
    if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(copyable)) __obj.updateDynamic("copyable")(copyable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(format)) __obj.updateDynamic("format")(format.get.asInstanceOf[js.Any])
    if (!js.isUndefined(padded)) __obj.updateDynamic("padded")(padded.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyntaxHighlighterProps]
  }
}

