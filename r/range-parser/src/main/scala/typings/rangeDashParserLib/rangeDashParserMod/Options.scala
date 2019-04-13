package typings
package rangeDashParserLib.rangeDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * The "combine" option can be set to `true` and overlapping & adjacent ranges
    * will be combined into a single range.
    */
  var combine: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(combine: js.UndefOr[scala.Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(combine)) __obj.updateDynamic("combine")(combine)
    __obj.asInstanceOf[Options]
  }
}

