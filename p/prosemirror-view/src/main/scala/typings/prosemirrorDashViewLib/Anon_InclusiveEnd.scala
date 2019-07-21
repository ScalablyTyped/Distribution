package typings
package prosemirrorDashViewLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InclusiveEnd extends js.Object {
  /**
    * Determines how the right side of the decoration is mapped.
    */
  var inclusiveEnd: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  /**
    * Determines how the left side of the decoration is
    * [mapped](#transform.Position_Mapping) when content is
    * inserted directly at that position. By default, the decoration
    * won't include the new content, but you can set this to `true`
    * to make it inclusive.
    */
  var inclusiveStart: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
}

object Anon_InclusiveEnd {
  @scala.inline
  def apply(
    inclusiveEnd: js.UndefOr[scala.Boolean] = js.undefined,
    inclusiveStart: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_InclusiveEnd = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inclusiveEnd)) __obj.updateDynamic("inclusiveEnd")(inclusiveEnd)
    if (!js.isUndefined(inclusiveStart)) __obj.updateDynamic("inclusiveStart")(inclusiveStart)
    __obj.asInstanceOf[Anon_InclusiveEnd]
  }
}

