package typings.segmentAnalytics.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictintegration
  extends /* integration */ StringDictionary[js.UndefOr[Boolean]] {
  var All: js.UndefOr[Boolean] = js.undefined
}

object Dictintegration {
  @scala.inline
  def apply(
    All: js.UndefOr[Boolean] = js.undefined,
    StringDictionary: /* integration */ StringDictionary[js.UndefOr[Boolean]] = null
  ): Dictintegration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(All)) __obj.updateDynamic("All")(All.get.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Dictintegration]
  }
}

