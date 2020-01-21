package typings.reactNativeGoogleAnalyticsBridge.nativeBridgesMod

import typings.reactNativeGoogleAnalyticsBridge.analyticsMod.HitPayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGoogleAnalyticsBridge extends js.Object {
  def allowIDFA(trackerId: String, enabled: Boolean): Unit
  def dispatch(): js.Promise[Boolean]
  def getClientId(trackerId: String): js.Promise[String]
  def setAnonymizeIp(trackerId: String, enabled: Boolean): Unit
  def setAppName(trackerId: String, appName: String): Unit
  def setAppVersion(trackerId: String, appVersion: String): Unit
  def setClient(trackerId: String, clientId: String): Unit
  def setCurrency(trackerId: String, currencyCode: String): Unit
  def setSamplingRate(trackerId: String, sampleRate: Double): Unit
  def setTrackUncaughtExceptions(trackerId: String, enabled: Boolean): Unit
  def setUser(trackerId: String, userId: String): Unit
  def trackEvent(
    trackerId: String,
    category: String,
    action: String,
    label: String,
    value: String,
    payload: HitPayload
  ): Unit
  def trackException(trackerId: String, error: String, fatal: Boolean, payload: HitPayload): Unit
  def trackScreenView(trackerId: String, screenName: String, payload: HitPayload): Unit
  def trackSocialInteraction(trackerId: String, network: String, action: String, targetUrl: String, payload: HitPayload): Unit
  def trackTiming(
    trackerId: String,
    category: String,
    interval: Double,
    name: String,
    label: String,
    payload: HitPayload
  ): Unit
}

object IGoogleAnalyticsBridge {
  @scala.inline
  def apply(
    allowIDFA: (String, Boolean) => Unit,
    dispatch: () => js.Promise[Boolean],
    getClientId: String => js.Promise[String],
    setAnonymizeIp: (String, Boolean) => Unit,
    setAppName: (String, String) => Unit,
    setAppVersion: (String, String) => Unit,
    setClient: (String, String) => Unit,
    setCurrency: (String, String) => Unit,
    setSamplingRate: (String, Double) => Unit,
    setTrackUncaughtExceptions: (String, Boolean) => Unit,
    setUser: (String, String) => Unit,
    trackEvent: (String, String, String, String, String, HitPayload) => Unit,
    trackException: (String, String, Boolean, HitPayload) => Unit,
    trackScreenView: (String, String, HitPayload) => Unit,
    trackSocialInteraction: (String, String, String, String, HitPayload) => Unit,
    trackTiming: (String, String, Double, String, String, HitPayload) => Unit
  ): IGoogleAnalyticsBridge = {
    val __obj = js.Dynamic.literal(allowIDFA = js.Any.fromFunction2(allowIDFA), dispatch = js.Any.fromFunction0(dispatch), getClientId = js.Any.fromFunction1(getClientId), setAnonymizeIp = js.Any.fromFunction2(setAnonymizeIp), setAppName = js.Any.fromFunction2(setAppName), setAppVersion = js.Any.fromFunction2(setAppVersion), setClient = js.Any.fromFunction2(setClient), setCurrency = js.Any.fromFunction2(setCurrency), setSamplingRate = js.Any.fromFunction2(setSamplingRate), setTrackUncaughtExceptions = js.Any.fromFunction2(setTrackUncaughtExceptions), setUser = js.Any.fromFunction2(setUser), trackEvent = js.Any.fromFunction6(trackEvent), trackException = js.Any.fromFunction4(trackException), trackScreenView = js.Any.fromFunction3(trackScreenView), trackSocialInteraction = js.Any.fromFunction5(trackSocialInteraction), trackTiming = js.Any.fromFunction6(trackTiming))
  
    __obj.asInstanceOf[IGoogleAnalyticsBridge]
  }
}

