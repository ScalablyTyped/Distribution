package typings.stringDashStripDashHtml.stringDashStripDashHtmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DumpLinkHrefsNearby extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var putOnNewLine: js.UndefOr[Boolean] = js.undefined
  var wrapHeads: js.UndefOr[String] = js.undefined
  var wrapTails: js.UndefOr[String] = js.undefined
}

object DumpLinkHrefsNearby {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    putOnNewLine: js.UndefOr[Boolean] = js.undefined,
    wrapHeads: String = null,
    wrapTails: String = null
  ): DumpLinkHrefsNearby = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (!js.isUndefined(putOnNewLine)) __obj.updateDynamic("putOnNewLine")(putOnNewLine)
    if (wrapHeads != null) __obj.updateDynamic("wrapHeads")(wrapHeads)
    if (wrapTails != null) __obj.updateDynamic("wrapTails")(wrapTails)
    __obj.asInstanceOf[DumpLinkHrefsNearby]
  }
}

