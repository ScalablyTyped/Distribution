package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.saucelabs.saucelabsStrings.ABORTED
import typings.saucelabs.saucelabsStrings.CANCELED
import typings.saucelabs.saucelabsStrings.FAILURE
import typings.saucelabs.saucelabsStrings.INSTALL_LAUNCH
import typings.saucelabs.saucelabsStrings.NONE
import typings.saucelabs.saucelabsStrings.SCREENSHOTS
import typings.saucelabs.saucelabsStrings.SKIPPED
import typings.saucelabs.saucelabsStrings.STRESS_TEST
import typings.saucelabs.saucelabsStrings.SUCCESS
import typings.saucelabs.saucelabsStrings.UNKNOWN
import typings.saucelabs.saucelabsStrings.WARNING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QualityReportBatchReport
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var batchId: js.UndefOr[Id] = js.undefined
  
  var checkupType: js.UndefOr[STRESS_TEST | INSTALL_LAUNCH | SCREENSHOTS | NONE] = js.undefined
  
  var devices: js.UndefOr[js.Array[DeviceView]] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var id: js.UndefOr[Id] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var notificationEmails: js.UndefOr[js.Array[String]] = js.undefined
  
  var notificationEnabled: js.UndefOr[Boolean] = js.undefined
  
  var projectPath: js.UndefOr[Path] = js.undefined
  
  var reports: js.UndefOr[js.Array[ReportEntry]] = js.undefined
  
  var running: js.UndefOr[Boolean] = js.undefined
  
  var secretLinkCode: js.UndefOr[String] = js.undefined
  
  var startTime: js.UndefOr[Double] = js.undefined
  
  var status: js.UndefOr[UNKNOWN | SUCCESS | WARNING | FAILURE | SKIPPED | ABORTED | CANCELED] = js.undefined
  
  var tests: js.UndefOr[js.Array[TestView]] = js.undefined
}
object QualityReportBatchReport {
  
  inline def apply(): QualityReportBatchReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QualityReportBatchReport]
  }
  
  extension [Self <: QualityReportBatchReport](x: Self) {
    
    inline def setBatchId(value: Id): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    inline def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    inline def setCheckupType(value: STRESS_TEST | INSTALL_LAUNCH | SCREENSHOTS | NONE): Self = StObject.set(x, "checkupType", value.asInstanceOf[js.Any])
    
    inline def setCheckupTypeUndefined: Self = StObject.set(x, "checkupType", js.undefined)
    
    inline def setDevices(value: js.Array[DeviceView]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesUndefined: Self = StObject.set(x, "devices", js.undefined)
    
    inline def setDevicesVarargs(value: DeviceView*): Self = StObject.set(x, "devices", js.Array(value :_*))
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotificationEmails(value: js.Array[String]): Self = StObject.set(x, "notificationEmails", value.asInstanceOf[js.Any])
    
    inline def setNotificationEmailsUndefined: Self = StObject.set(x, "notificationEmails", js.undefined)
    
    inline def setNotificationEmailsVarargs(value: String*): Self = StObject.set(x, "notificationEmails", js.Array(value :_*))
    
    inline def setNotificationEnabled(value: Boolean): Self = StObject.set(x, "notificationEnabled", value.asInstanceOf[js.Any])
    
    inline def setNotificationEnabledUndefined: Self = StObject.set(x, "notificationEnabled", js.undefined)
    
    inline def setProjectPath(value: Path): Self = StObject.set(x, "projectPath", value.asInstanceOf[js.Any])
    
    inline def setProjectPathUndefined: Self = StObject.set(x, "projectPath", js.undefined)
    
    inline def setReports(value: js.Array[ReportEntry]): Self = StObject.set(x, "reports", value.asInstanceOf[js.Any])
    
    inline def setReportsUndefined: Self = StObject.set(x, "reports", js.undefined)
    
    inline def setReportsVarargs(value: ReportEntry*): Self = StObject.set(x, "reports", js.Array(value :_*))
    
    inline def setRunning(value: Boolean): Self = StObject.set(x, "running", value.asInstanceOf[js.Any])
    
    inline def setRunningUndefined: Self = StObject.set(x, "running", js.undefined)
    
    inline def setSecretLinkCode(value: String): Self = StObject.set(x, "secretLinkCode", value.asInstanceOf[js.Any])
    
    inline def setSecretLinkCodeUndefined: Self = StObject.set(x, "secretLinkCode", js.undefined)
    
    inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStatus(value: UNKNOWN | SUCCESS | WARNING | FAILURE | SKIPPED | ABORTED | CANCELED): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTests(value: js.Array[TestView]): Self = StObject.set(x, "tests", value.asInstanceOf[js.Any])
    
    inline def setTestsUndefined: Self = StObject.set(x, "tests", js.undefined)
    
    inline def setTestsVarargs(value: TestView*): Self = StObject.set(x, "tests", js.Array(value :_*))
  }
}
