package typings.sentryTypes.eventMod

import org.scalablytyped.runtime.StringDictionary
import typings.sentryTypes.anon.Values
import typings.sentryTypes.breadcrumbMod.Breadcrumb
import typings.sentryTypes.contextMod.Contexts
import typings.sentryTypes.extraMod.Extras
import typings.sentryTypes.requestMod.Request
import typings.sentryTypes.sdkinfoMod.SdkInfo
import typings.sentryTypes.severityMod.Severity
import typings.sentryTypes.spanMod.Span
import typings.sentryTypes.stacktraceMod.Stacktrace
import typings.sentryTypes.transactionMod.Measurements
import typings.sentryTypes.userMod.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Event extends js.Object {
  
  var breadcrumbs: js.UndefOr[js.Array[Breadcrumb]] = js.native
  
  var contexts: js.UndefOr[Contexts] = js.native
  
  var dist: js.UndefOr[String] = js.native
  
  var environment: js.UndefOr[String] = js.native
  
  var event_id: js.UndefOr[String] = js.native
  
  var exception: js.UndefOr[Values] = js.native
  
  var extra: js.UndefOr[Extras] = js.native
  
  var fingerprint: js.UndefOr[js.Array[String]] = js.native
  
  var level: js.UndefOr[Severity] = js.native
  
  var logger: js.UndefOr[String] = js.native
  
  var measurements: js.UndefOr[Measurements] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var modules: js.UndefOr[StringDictionary[String]] = js.native
  
  var platform: js.UndefOr[String] = js.native
  
  var release: js.UndefOr[String] = js.native
  
  var request: js.UndefOr[Request] = js.native
  
  var sdk: js.UndefOr[SdkInfo] = js.native
  
  var server_name: js.UndefOr[String] = js.native
  
  var spans: js.UndefOr[js.Array[Span]] = js.native
  
  var stacktrace: js.UndefOr[Stacktrace] = js.native
  
  var start_timestamp: js.UndefOr[Double] = js.native
  
  var tags: js.UndefOr[StringDictionary[String]] = js.native
  
  var timestamp: js.UndefOr[Double] = js.native
  
  var transaction: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[EventType] = js.native
  
  var user: js.UndefOr[User] = js.native
}
object Event {
  
  @scala.inline
  def apply(): Event = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  implicit class EventOps[Self <: Event] (val x: Self) extends AnyVal {
    
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
    def setBreadcrumbsVarargs(value: Breadcrumb*): Self = this.set("breadcrumbs", js.Array(value :_*))
    
    @scala.inline
    def setBreadcrumbs(value: js.Array[Breadcrumb]): Self = this.set("breadcrumbs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBreadcrumbs: Self = this.set("breadcrumbs", js.undefined)
    
    @scala.inline
    def setContexts(value: Contexts): Self = this.set("contexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContexts: Self = this.set("contexts", js.undefined)
    
    @scala.inline
    def setDist(value: String): Self = this.set("dist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDist: Self = this.set("dist", js.undefined)
    
    @scala.inline
    def setEnvironment(value: String): Self = this.set("environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
    
    @scala.inline
    def setEvent_id(value: String): Self = this.set("event_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent_id: Self = this.set("event_id", js.undefined)
    
    @scala.inline
    def setException(value: Values): Self = this.set("exception", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteException: Self = this.set("exception", js.undefined)
    
    @scala.inline
    def setExtra(value: Extras): Self = this.set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtra: Self = this.set("extra", js.undefined)
    
    @scala.inline
    def setFingerprintVarargs(value: String*): Self = this.set("fingerprint", js.Array(value :_*))
    
    @scala.inline
    def setFingerprint(value: js.Array[String]): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFingerprint: Self = this.set("fingerprint", js.undefined)
    
    @scala.inline
    def setLevel(value: Severity): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setLogger(value: String): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    
    @scala.inline
    def setMeasurements(value: Measurements): Self = this.set("measurements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeasurements: Self = this.set("measurements", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setModules(value: StringDictionary[String]): Self = this.set("modules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModules: Self = this.set("modules", js.undefined)
    
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    
    @scala.inline
    def setRelease(value: String): Self = this.set("release", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelease: Self = this.set("release", js.undefined)
    
    @scala.inline
    def setRequest(value: Request): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    
    @scala.inline
    def setSdk(value: SdkInfo): Self = this.set("sdk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSdk: Self = this.set("sdk", js.undefined)
    
    @scala.inline
    def setServer_name(value: String): Self = this.set("server_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServer_name: Self = this.set("server_name", js.undefined)
    
    @scala.inline
    def setSpansVarargs(value: Span*): Self = this.set("spans", js.Array(value :_*))
    
    @scala.inline
    def setSpans(value: js.Array[Span]): Self = this.set("spans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpans: Self = this.set("spans", js.undefined)
    
    @scala.inline
    def setStacktrace(value: Stacktrace): Self = this.set("stacktrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStacktrace: Self = this.set("stacktrace", js.undefined)
    
    @scala.inline
    def setStart_timestamp(value: Double): Self = this.set("start_timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart_timestamp: Self = this.set("start_timestamp", js.undefined)
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
    
    @scala.inline
    def setTransaction(value: String): Self = this.set("transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransaction: Self = this.set("transaction", js.undefined)
    
    @scala.inline
    def setType(value: EventType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUser(value: User): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
}
