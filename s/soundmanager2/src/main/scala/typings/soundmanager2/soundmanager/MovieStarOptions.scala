package typings.soundmanager2.soundmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MovieStarOptions extends js.Object {
  var bufferTime: js.UndefOr[Double] = js.undefined
  var duration: js.UndefOr[Double | Null] = js.undefined
  var onconnect: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
  var serverURL: js.UndefOr[String | Null] = js.undefined
}

object MovieStarOptions {
  @scala.inline
  def apply(
    bufferTime: Int | Double = null,
    duration: Int | Double = null,
    onconnect: () => Unit = null,
    serverURL: String = null
  ): MovieStarOptions = {
    val __obj = js.Dynamic.literal()
    if (bufferTime != null) __obj.updateDynamic("bufferTime")(bufferTime.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (onconnect != null) __obj.updateDynamic("onconnect")(js.Any.fromFunction0(onconnect))
    if (serverURL != null) __obj.updateDynamic("serverURL")(serverURL)
    __obj.asInstanceOf[MovieStarOptions]
  }
}

