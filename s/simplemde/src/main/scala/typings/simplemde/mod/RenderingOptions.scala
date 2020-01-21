package typings.simplemde.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderingOptions extends js.Object {
  var codeSyntaxHighlighting: Boolean
  var singleLineBreaks: js.UndefOr[Boolean] = js.undefined
}

object RenderingOptions {
  @scala.inline
  def apply(codeSyntaxHighlighting: Boolean, singleLineBreaks: js.UndefOr[Boolean] = js.undefined): RenderingOptions = {
    val __obj = js.Dynamic.literal(codeSyntaxHighlighting = codeSyntaxHighlighting.asInstanceOf[js.Any])
    if (!js.isUndefined(singleLineBreaks)) __obj.updateDynamic("singleLineBreaks")(singleLineBreaks.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderingOptions]
  }
}

