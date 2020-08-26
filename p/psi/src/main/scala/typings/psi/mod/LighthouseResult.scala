package typings.psi.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LighthouseResult extends js.Object {
  var audits: StringDictionary[Audit] = js.native
  var categories: StringDictionary[Category] = js.native
  var categoryGroups: StringDictionary[CategoryGroup] = js.native
  var configSettings: ConfigSettings = js.native
  var environment: Environment = js.native
  var fetchTime: String = js.native
  var finalUrl: String = js.native
  var i18n: I18N = js.native
  var lighthouseVersion: String = js.native
  var requestedUrl: String = js.native
  var runWarnings: js.Array[String] = js.native
  var runtimeError: RuntimeError = js.native
  var timing: Timing = js.native
  var userAgent: String = js.native
}

object LighthouseResult {
  @scala.inline
  def apply(
    audits: StringDictionary[Audit],
    categories: StringDictionary[Category],
    categoryGroups: StringDictionary[CategoryGroup],
    configSettings: ConfigSettings,
    environment: Environment,
    fetchTime: String,
    finalUrl: String,
    i18n: I18N,
    lighthouseVersion: String,
    requestedUrl: String,
    runWarnings: js.Array[String],
    runtimeError: RuntimeError,
    timing: Timing,
    userAgent: String
  ): LighthouseResult = {
    val __obj = js.Dynamic.literal(audits = audits.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], categoryGroups = categoryGroups.asInstanceOf[js.Any], configSettings = configSettings.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], fetchTime = fetchTime.asInstanceOf[js.Any], finalUrl = finalUrl.asInstanceOf[js.Any], i18n = i18n.asInstanceOf[js.Any], lighthouseVersion = lighthouseVersion.asInstanceOf[js.Any], requestedUrl = requestedUrl.asInstanceOf[js.Any], runWarnings = runWarnings.asInstanceOf[js.Any], runtimeError = runtimeError.asInstanceOf[js.Any], timing = timing.asInstanceOf[js.Any], userAgent = userAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[LighthouseResult]
  }
  @scala.inline
  implicit class LighthouseResultOps[Self <: LighthouseResult] (val x: Self) extends AnyVal {
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
    def setAudits(value: StringDictionary[Audit]): Self = this.set("audits", value.asInstanceOf[js.Any])
    @scala.inline
    def setCategories(value: StringDictionary[Category]): Self = this.set("categories", value.asInstanceOf[js.Any])
    @scala.inline
    def setCategoryGroups(value: StringDictionary[CategoryGroup]): Self = this.set("categoryGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfigSettings(value: ConfigSettings): Self = this.set("configSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnvironment(value: Environment): Self = this.set("environment", value.asInstanceOf[js.Any])
    @scala.inline
    def setFetchTime(value: String): Self = this.set("fetchTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setFinalUrl(value: String): Self = this.set("finalUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setI18n(value: I18N): Self = this.set("i18n", value.asInstanceOf[js.Any])
    @scala.inline
    def setLighthouseVersion(value: String): Self = this.set("lighthouseVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestedUrl(value: String): Self = this.set("requestedUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setRunWarningsVarargs(value: String*): Self = this.set("runWarnings", js.Array(value :_*))
    @scala.inline
    def setRunWarnings(value: js.Array[String]): Self = this.set("runWarnings", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuntimeError(value: RuntimeError): Self = this.set("runtimeError", value.asInstanceOf[js.Any])
    @scala.inline
    def setTiming(value: Timing): Self = this.set("timing", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserAgent(value: String): Self = this.set("userAgent", value.asInstanceOf[js.Any])
  }
  
}

