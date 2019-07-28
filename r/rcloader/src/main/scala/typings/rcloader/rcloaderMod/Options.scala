package typings.rcloader.rcloaderMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends /* property */ StringDictionary[js.Any] {
  var lookup: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    StringDictionary: /* property */ StringDictionary[js.Any] = null,
    lookup: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(lookup)) __obj.updateDynamic("lookup")(lookup)
    __obj.asInstanceOf[Options]
  }
}

