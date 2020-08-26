package typings.raven.mod

import org.scalablytyped.runtime.StringDictionary
import typings.raven.mod.transports.Transport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConstructorOptions extends js.Object {
  var autoBreadcrumbs: js.UndefOr[Boolean | StringDictionary[Boolean]] = js.native
  var captureUnhandledRejections: js.UndefOr[Boolean] = js.native
  var dataCallback: js.UndefOr[DataCallback] = js.native
  var environment: js.UndefOr[String] = js.native
  var extra: js.UndefOr[StringDictionary[js.Any]] = js.native
  var logger: js.UndefOr[String] = js.native
  var maxBreadcrumbs: js.UndefOr[Double] = js.native
  var maxReqQueueCount: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var parseUser: js.UndefOr[Boolean | js.Array[String] | parseUserCallback] = js.native
  var release: js.UndefOr[String] = js.native
  var sampleRate: js.UndefOr[Double] = js.native
  var sendTimeout: js.UndefOr[Double] = js.native
  var shouldSendCallback: js.UndefOr[ShouldSendCallback] = js.native
  var tags: js.UndefOr[StringDictionary[String]] = js.native
  var transport: js.UndefOr[Transport] = js.native
}

object ConstructorOptions {
  @scala.inline
  def apply(): ConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstructorOptions]
  }
  @scala.inline
  implicit class ConstructorOptionsOps[Self <: ConstructorOptions] (val x: Self) extends AnyVal {
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
    def setAutoBreadcrumbs(value: Boolean | StringDictionary[Boolean]): Self = this.set("autoBreadcrumbs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoBreadcrumbs: Self = this.set("autoBreadcrumbs", js.undefined)
    @scala.inline
    def setCaptureUnhandledRejections(value: Boolean): Self = this.set("captureUnhandledRejections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaptureUnhandledRejections: Self = this.set("captureUnhandledRejections", js.undefined)
    @scala.inline
    def setDataCallback(value: /* data */ StringDictionary[js.Any] => js.Any): Self = this.set("dataCallback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDataCallback: Self = this.set("dataCallback", js.undefined)
    @scala.inline
    def setEnvironment(value: String): Self = this.set("environment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
    @scala.inline
    def setExtra(value: StringDictionary[js.Any]): Self = this.set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtra: Self = this.set("extra", js.undefined)
    @scala.inline
    def setLogger(value: String): Self = this.set("logger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    @scala.inline
    def setMaxBreadcrumbs(value: Double): Self = this.set("maxBreadcrumbs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxBreadcrumbs: Self = this.set("maxBreadcrumbs", js.undefined)
    @scala.inline
    def setMaxReqQueueCount(value: Double): Self = this.set("maxReqQueueCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxReqQueueCount: Self = this.set("maxReqQueueCount", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setParseUserVarargs(value: String*): Self = this.set("parseUser", js.Array(value :_*))
    @scala.inline
    def setParseUserFunction1(value: /* req */ js.Any => js.Any): Self = this.set("parseUser", js.Any.fromFunction1(value))
    @scala.inline
    def setParseUser(value: Boolean | js.Array[String] | parseUserCallback): Self = this.set("parseUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParseUser: Self = this.set("parseUser", js.undefined)
    @scala.inline
    def setRelease(value: String): Self = this.set("release", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelease: Self = this.set("release", js.undefined)
    @scala.inline
    def setSampleRate(value: Double): Self = this.set("sampleRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSampleRate: Self = this.set("sampleRate", js.undefined)
    @scala.inline
    def setSendTimeout(value: Double): Self = this.set("sendTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendTimeout: Self = this.set("sendTimeout", js.undefined)
    @scala.inline
    def setShouldSendCallback(value: /* data */ StringDictionary[js.Any] => Boolean): Self = this.set("shouldSendCallback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteShouldSendCallback: Self = this.set("shouldSendCallback", js.undefined)
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setTransport(value: Transport): Self = this.set("transport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransport: Self = this.set("transport", js.undefined)
  }
  
}

