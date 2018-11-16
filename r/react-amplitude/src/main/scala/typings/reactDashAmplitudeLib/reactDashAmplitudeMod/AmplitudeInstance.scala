package typings
package reactDashAmplitudeLib.reactDashAmplitudeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmplitudeInstance extends js.Object {
  def amplitude(): scala.Unit = js.native
  def clearUserProperties(): scala.Unit = js.native
  def getSessionId(): scala.Unit = js.native
  def identify(idObj: js.Any, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def init(apiKey: java.lang.String): scala.Unit = js.native
  def init(apiKey: java.lang.String, userId: java.lang.String): scala.Unit = js.native
  def init(apiKey: java.lang.String, userId: java.lang.String, config: js.Any): scala.Unit = js.native
  def init(apiKey: java.lang.String, userId: java.lang.String, config: js.Any, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def isNewSession(): scala.Unit = js.native
  def logEvent(eventType: java.lang.String, eventProperties: js.Object, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def logEventWithTimestamp(
    eventType: java.lang.String,
    eventProperties: js.Object,
    timestamp: scala.Double,
    cb: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def resetUserId(): scala.Unit = js.native
  def setUserId(userId: java.lang.String): scala.Unit = js.native
  def setUserProperties(userProps: js.Any): scala.Unit = js.native
}

