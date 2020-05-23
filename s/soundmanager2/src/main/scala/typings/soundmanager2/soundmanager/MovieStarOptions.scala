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
    bufferTime: js.UndefOr[Double] = js.undefined,
    duration: js.UndefOr[Null | Double] = js.undefined,
    onconnect: js.UndefOr[Null | (() => Unit)] = js.undefined,
    serverURL: js.UndefOr[Null | String] = js.undefined
  ): MovieStarOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bufferTime)) __obj.updateDynamic("bufferTime")(bufferTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(onconnect)) __obj.updateDynamic("onconnect")(if (onconnect != null) js.Any.fromFunction0(onconnect.asInstanceOf[() => Unit]) else null)
    if (!js.isUndefined(serverURL)) __obj.updateDynamic("serverURL")(serverURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[MovieStarOptions]
  }
}

