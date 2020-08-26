package typings.reactNativeGoogleAnalyticsBridge.nativeBridgesMod

import typings.reactNativeGoogleAnalyticsBridge.analyticsMod.HitPayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGoogleAnalyticsBridge extends js.Object {
  def allowIDFA(trackerId: String, enabled: Boolean): Unit = js.native
  def dispatch(): js.Promise[Boolean] = js.native
  def getClientId(trackerId: String): js.Promise[String] = js.native
  def setAnonymizeIp(trackerId: String, enabled: Boolean): Unit = js.native
  def setAppName(trackerId: String, appName: String): Unit = js.native
  def setAppVersion(trackerId: String, appVersion: String): Unit = js.native
  def setClient(trackerId: String, clientId: String): Unit = js.native
  def setCurrency(trackerId: String, currencyCode: String): Unit = js.native
  def setSamplingRate(trackerId: String, sampleRate: Double): Unit = js.native
  def setTrackUncaughtExceptions(trackerId: String, enabled: Boolean): Unit = js.native
  def setUser(trackerId: String, userId: String): Unit = js.native
  def trackEvent(
    trackerId: String,
    category: String,
    action: String,
    label: String,
    value: String,
    payload: HitPayload
  ): Unit = js.native
  def trackException(trackerId: String, error: String, fatal: Boolean, payload: HitPayload): Unit = js.native
  def trackScreenView(trackerId: String, screenName: String, payload: HitPayload): Unit = js.native
  def trackSocialInteraction(trackerId: String, network: String, action: String, targetUrl: String, payload: HitPayload): Unit = js.native
  def trackTiming(
    trackerId: String,
    category: String,
    interval: Double,
    name: String,
    label: String,
    payload: HitPayload
  ): Unit = js.native
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
  @scala.inline
  implicit class IGoogleAnalyticsBridgeOps[Self <: IGoogleAnalyticsBridge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowIDFA(value: (String, Boolean) => Unit): Self = this.set("allowIDFA", js.Any.fromFunction2(value))
    @scala.inline
    def setDispatch(value: () => js.Promise[Boolean]): Self = this.set("dispatch", js.Any.fromFunction0(value))
    @scala.inline
    def setGetClientId(value: String => js.Promise[String]): Self = this.set("getClientId", js.Any.fromFunction1(value))
    @scala.inline
    def setSetAnonymizeIp(value: (String, Boolean) => Unit): Self = this.set("setAnonymizeIp", js.Any.fromFunction2(value))
    @scala.inline
    def setSetAppName(value: (String, String) => Unit): Self = this.set("setAppName", js.Any.fromFunction2(value))
    @scala.inline
    def setSetAppVersion(value: (String, String) => Unit): Self = this.set("setAppVersion", js.Any.fromFunction2(value))
    @scala.inline
    def setSetClient(value: (String, String) => Unit): Self = this.set("setClient", js.Any.fromFunction2(value))
    @scala.inline
    def setSetCurrency(value: (String, String) => Unit): Self = this.set("setCurrency", js.Any.fromFunction2(value))
    @scala.inline
    def setSetSamplingRate(value: (String, Double) => Unit): Self = this.set("setSamplingRate", js.Any.fromFunction2(value))
    @scala.inline
    def setSetTrackUncaughtExceptions(value: (String, Boolean) => Unit): Self = this.set("setTrackUncaughtExceptions", js.Any.fromFunction2(value))
    @scala.inline
    def setSetUser(value: (String, String) => Unit): Self = this.set("setUser", js.Any.fromFunction2(value))
    @scala.inline
    def setTrackEvent(value: (String, String, String, String, String, HitPayload) => Unit): Self = this.set("trackEvent", js.Any.fromFunction6(value))
    @scala.inline
    def setTrackException(value: (String, String, Boolean, HitPayload) => Unit): Self = this.set("trackException", js.Any.fromFunction4(value))
    @scala.inline
    def setTrackScreenView(value: (String, String, HitPayload) => Unit): Self = this.set("trackScreenView", js.Any.fromFunction3(value))
    @scala.inline
    def setTrackSocialInteraction(value: (String, String, String, String, HitPayload) => Unit): Self = this.set("trackSocialInteraction", js.Any.fromFunction5(value))
    @scala.inline
    def setTrackTiming(value: (String, String, Double, String, String, HitPayload) => Unit): Self = this.set("trackTiming", js.Any.fromFunction6(value))
  }
  
}

