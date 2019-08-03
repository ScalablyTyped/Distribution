package typings.segmentDashAnalytics

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_All
  extends /* integration */ StringDictionary[js.UndefOr[Boolean]] {
  var All: js.UndefOr[Boolean] = js.undefined
}

object Anon_All {
  @scala.inline
  def apply(
    All: js.UndefOr[Boolean] = js.undefined,
    StringDictionary: /* integration */ StringDictionary[js.UndefOr[Boolean]] = null
  ): Anon_All = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(All)) __obj.updateDynamic("All")(All)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_All]
  }
}

