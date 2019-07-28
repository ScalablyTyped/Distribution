package typings.roarr.roarrMod.RoarrNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageContextType
  extends /* name */ StringDictionary[js.Any] {
  var logLevel: js.UndefOr[Double] = js.undefined
}

object MessageContextType {
  @scala.inline
  def apply(StringDictionary: /* name */ StringDictionary[js.Any] = null, logLevel: Int | Double = null): MessageContextType = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageContextType]
  }
}

