package typings.segmentAnalytics

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictintegration
  extends /* integration */ StringDictionary[js.UndefOr[Boolean]] {
  var All: js.UndefOr[Boolean] = js.undefined
}

object AnonDictintegration {
  @scala.inline
  def apply(
    All: js.UndefOr[Boolean] = js.undefined,
    StringDictionary: /* integration */ StringDictionary[js.UndefOr[Boolean]] = null
  ): AnonDictintegration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(All)) __obj.updateDynamic("All")(All.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonDictintegration]
  }
}

