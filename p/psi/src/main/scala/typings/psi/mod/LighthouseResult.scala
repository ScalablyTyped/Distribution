package typings.psi.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LighthouseResult extends StObject {
  
  var audits: StringDictionary[Audit]
  
  var categories: StringDictionary[Category]
  
  var categoryGroups: StringDictionary[CategoryGroup]
  
  var configSettings: ConfigSettings
  
  var environment: Environment
  
  var fetchTime: String
  
  var finalUrl: String
  
  var i18n: I18N
  
  var lighthouseVersion: String
  
  var requestedUrl: String
  
  var runWarnings: js.Array[String]
  
  var runtimeError: RuntimeError
  
  var timing: Timing
  
  var userAgent: String
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
  implicit class LighthouseResultMutableBuilder[Self <: LighthouseResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudits(value: StringDictionary[Audit]): Self = StObject.set(x, "audits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategories(value: StringDictionary[Category]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryGroups(value: StringDictionary[CategoryGroup]): Self = StObject.set(x, "categoryGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigSettings(value: ConfigSettings): Self = StObject.set(x, "configSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironment(value: Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchTime(value: String): Self = StObject.set(x, "fetchTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalUrl(value: String): Self = StObject.set(x, "finalUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setI18n(value: I18N): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLighthouseVersion(value: String): Self = StObject.set(x, "lighthouseVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedUrl(value: String): Self = StObject.set(x, "requestedUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunWarnings(value: js.Array[String]): Self = StObject.set(x, "runWarnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunWarningsVarargs(value: String*): Self = StObject.set(x, "runWarnings", js.Array(value :_*))
    
    @scala.inline
    def setRuntimeError(value: RuntimeError): Self = StObject.set(x, "runtimeError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTiming(value: Timing): Self = StObject.set(x, "timing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
  }
}
