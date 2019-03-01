package typings
package rcloaderLib.rcloaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends /* property */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var lookup: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    StringDictionary: /* property */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    lookup: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(lookup)) __obj.updateDynamic("lookup")(lookup)
    __obj.asInstanceOf[Options]
  }
}

