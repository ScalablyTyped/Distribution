package typings
package simplemdeLib.simplemdeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderingOptions extends js.Object {
  var codeSyntaxHighlighting: scala.Boolean
  var singleLineBreaks: js.UndefOr[scala.Boolean] = js.undefined
}

object RenderingOptions {
  @scala.inline
  def apply(codeSyntaxHighlighting: scala.Boolean, singleLineBreaks: js.UndefOr[scala.Boolean] = js.undefined): RenderingOptions = {
    val __obj = js.Dynamic.literal(codeSyntaxHighlighting = codeSyntaxHighlighting)
    if (!js.isUndefined(singleLineBreaks)) __obj.updateDynamic("singleLineBreaks")(singleLineBreaks)
    __obj.asInstanceOf[RenderingOptions]
  }
}

