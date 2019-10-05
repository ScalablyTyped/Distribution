package typings.segmentDashAnalytics.SegmentAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Generic options object with integrations
trait SegmentOpts extends js.Object {
  var anonymousId: js.UndefOr[String] = js.undefined
  var context: js.UndefOr[js.Object] = js.undefined
  var integrations: js.UndefOr[js.Any] = js.undefined
}

object SegmentOpts {
  @scala.inline
  def apply(anonymousId: String = null, context: js.Object = null, integrations: js.Any = null): SegmentOpts = {
    val __obj = js.Dynamic.literal()
    if (anonymousId != null) __obj.updateDynamic("anonymousId")(anonymousId)
    if (context != null) __obj.updateDynamic("context")(context)
    if (integrations != null) __obj.updateDynamic("integrations")(integrations)
    __obj.asInstanceOf[SegmentOpts]
  }
}

