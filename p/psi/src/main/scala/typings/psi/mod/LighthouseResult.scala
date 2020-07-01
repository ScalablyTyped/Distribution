package typings.psi.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LighthouseResult extends js.Object {
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
}

