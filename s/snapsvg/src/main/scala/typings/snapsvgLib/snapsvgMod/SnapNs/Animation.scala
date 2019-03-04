package typings
package snapsvgLib.snapsvgMod.SnapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animation extends js.Object {
  var attr: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | js.Any]
  var callback: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var duration: scala.Double
  var easing: js.UndefOr[js.Function1[/* num */ scala.Double, scala.Double]] = js.undefined
}

object Animation {
  @scala.inline
  def apply(
    attr: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | js.Any],
    duration: scala.Double,
    callback: js.Function0[scala.Unit] = null,
    easing: js.Function1[/* num */ scala.Double, scala.Double] = null
  ): Animation = {
    val __obj = js.Dynamic.literal(attr = attr, duration = duration)
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (easing != null) __obj.updateDynamic("easing")(easing)
    __obj.asInstanceOf[Animation]
  }
}

