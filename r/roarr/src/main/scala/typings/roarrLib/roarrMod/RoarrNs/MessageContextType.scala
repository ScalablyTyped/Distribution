package typings
package roarrLib.roarrMod.RoarrNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageContextType
  extends /* name */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var logLevel: js.UndefOr[scala.Double] = js.undefined
}

object MessageContextType {
  @scala.inline
  def apply(
    StringDictionary: /* name */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    logLevel: scala.Int | scala.Double = null
  ): MessageContextType = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageContextType]
  }
}

