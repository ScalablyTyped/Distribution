package typings.reduxLocalstorageDebounce.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebounceOptions
  extends /* key */ StringDictionary[js.Any] {
  var maxWait: js.UndefOr[Double] = js.undefined
}

object DebounceOptions {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    maxWait: js.UndefOr[Double] = js.undefined
  ): DebounceOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(maxWait)) __obj.updateDynamic("maxWait")(maxWait.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebounceOptions]
  }
}

