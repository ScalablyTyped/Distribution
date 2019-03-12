package typings
package soundmanager2Lib.soundmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MovieStarOptions extends js.Object {
  var bufferTime: js.UndefOr[scala.Double] = js.undefined
  var duration: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var onconnect: js.UndefOr[js.Function0[scala.Unit] | scala.Null] = js.undefined
  var serverURL: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object MovieStarOptions {
  @scala.inline
  def apply(
    bufferTime: scala.Int | scala.Double = null,
    duration: scala.Int | scala.Double = null,
    onconnect: () => scala.Unit = null,
    serverURL: java.lang.String = null
  ): MovieStarOptions = {
    val __obj = js.Dynamic.literal()
    if (bufferTime != null) __obj.updateDynamic("bufferTime")(bufferTime.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (onconnect != null) __obj.updateDynamic("onconnect")(js.Any.fromFunction0(onconnect))
    if (serverURL != null) __obj.updateDynamic("serverURL")(serverURL)
    __obj.asInstanceOf[MovieStarOptions]
  }
}

