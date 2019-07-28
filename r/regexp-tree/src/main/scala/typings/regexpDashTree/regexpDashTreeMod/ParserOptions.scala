package typings.regexpDashTree.regexpDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserOptions extends js.Object {
  var captureLocations: js.UndefOr[Boolean] = js.undefined
}

object ParserOptions {
  @scala.inline
  def apply(captureLocations: js.UndefOr[Boolean] = js.undefined): ParserOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(captureLocations)) __obj.updateDynamic("captureLocations")(captureLocations)
    __obj.asInstanceOf[ParserOptions]
  }
}

