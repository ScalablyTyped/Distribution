package typings.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserOpts extends js.Object {
  var loc: js.UndefOr[Boolean] = js.undefined
  var range: js.UndefOr[Boolean] = js.undefined
  var tolerant: js.UndefOr[Boolean] = js.undefined
}

object ParserOpts {
  @scala.inline
  def apply(
    loc: js.UndefOr[Boolean] = js.undefined,
    range: js.UndefOr[Boolean] = js.undefined,
    tolerant: js.UndefOr[Boolean] = js.undefined
  ): ParserOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(loc)) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (!js.isUndefined(tolerant)) __obj.updateDynamic("tolerant")(tolerant.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParserOpts]
  }
}

