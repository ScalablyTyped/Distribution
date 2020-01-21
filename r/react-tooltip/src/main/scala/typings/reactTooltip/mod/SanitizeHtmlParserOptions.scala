package typings.reactTooltip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SanitizeHtmlParserOptions extends js.Object {
  var decodeEntities: js.UndefOr[Boolean] = js.undefined
}

object SanitizeHtmlParserOptions {
  @scala.inline
  def apply(decodeEntities: js.UndefOr[Boolean] = js.undefined): SanitizeHtmlParserOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(decodeEntities)) __obj.updateDynamic("decodeEntities")(decodeEntities.asInstanceOf[js.Any])
    __obj.asInstanceOf[SanitizeHtmlParserOptions]
  }
}

