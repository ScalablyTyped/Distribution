package typings.prosemirrorView.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineDecorationSpec extends js.Object {
  /**
    * Determines how the right side of the decoration is mapped.
    */
  var inclusiveEnd: js.UndefOr[Boolean | Null] = js.undefined
  /**
    * Determines how the left side of the decoration is
    * [mapped](#transform.Position_Mapping) when content is
    * inserted directly at that position. By default, the decoration
    * won't include the new content, but you can set this to `true`
    * to make it inclusive.
    */
  var inclusiveStart: js.UndefOr[Boolean | Null] = js.undefined
}

object InlineDecorationSpec {
  @scala.inline
  def apply(
    inclusiveEnd: js.UndefOr[Boolean] = js.undefined,
    inclusiveStart: js.UndefOr[Boolean] = js.undefined
  ): InlineDecorationSpec = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inclusiveEnd)) __obj.updateDynamic("inclusiveEnd")(inclusiveEnd.asInstanceOf[js.Any])
    if (!js.isUndefined(inclusiveStart)) __obj.updateDynamic("inclusiveStart")(inclusiveStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineDecorationSpec]
  }
}

