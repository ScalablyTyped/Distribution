package typings.reactAmplitude

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-amplitude", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait AmplitudeInstance extends js.Object {
    def amplitude(): Unit = js.native
    def clearUserProperties(): Unit = js.native
    def getSessionId(): Unit = js.native
    def identify(idObj: js.Any, cb: js.Function0[Unit]): Unit = js.native
    def init(apiKey: String): Unit = js.native
    def init(
      apiKey: String,
      userId: js.UndefOr[scala.Nothing],
      config: js.UndefOr[scala.Nothing],
      cb: js.Function0[Unit]
    ): Unit = js.native
    def init(apiKey: String, userId: js.UndefOr[scala.Nothing], config: js.Any): Unit = js.native
    def init(apiKey: String, userId: js.UndefOr[scala.Nothing], config: js.Any, cb: js.Function0[Unit]): Unit = js.native
    def init(apiKey: String, userId: String): Unit = js.native
    def init(apiKey: String, userId: String, config: js.UndefOr[scala.Nothing], cb: js.Function0[Unit]): Unit = js.native
    def init(apiKey: String, userId: String, config: js.Any): Unit = js.native
    def init(apiKey: String, userId: String, config: js.Any, cb: js.Function0[Unit]): Unit = js.native
    def isNewSession(): Unit = js.native
    def logEvent(eventType: String, eventProperties: js.Object, cb: js.Function0[Unit]): Unit = js.native
    def logEventWithTimestamp(eventType: String, eventProperties: js.Object, timestamp: Double, cb: js.Function0[Unit]): Unit = js.native
    def resetUserId(): Unit = js.native
    def setUserId(userId: String): Unit = js.native
    def setUserProperties(userProps: js.Any): Unit = js.native
  }
  
  val default: AmplitudeInstance = js.native
}

