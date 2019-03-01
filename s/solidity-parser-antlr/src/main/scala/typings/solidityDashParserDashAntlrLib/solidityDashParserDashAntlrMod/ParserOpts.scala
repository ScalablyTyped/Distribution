package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserOpts extends js.Object {
  var loc: js.UndefOr[scala.Boolean] = js.undefined
  var range: js.UndefOr[scala.Boolean] = js.undefined
  var tolerant: js.UndefOr[scala.Boolean] = js.undefined
}

object ParserOpts {
  @scala.inline
  def apply(
    loc: js.UndefOr[scala.Boolean] = js.undefined,
    range: js.UndefOr[scala.Boolean] = js.undefined,
    tolerant: js.UndefOr[scala.Boolean] = js.undefined
  ): ParserOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(loc)) __obj.updateDynamic("loc")(loc)
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range)
    if (!js.isUndefined(tolerant)) __obj.updateDynamic("tolerant")(tolerant)
    __obj.asInstanceOf[ParserOpts]
  }
}

