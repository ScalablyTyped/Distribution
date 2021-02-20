package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.saucelabs.saucelabsStrings.ABORTED
import typings.saucelabs.saucelabsStrings.CANCELED
import typings.saucelabs.saucelabsStrings.ESPRESSO
import typings.saucelabs.saucelabsStrings.FAILURE
import typings.saucelabs.saucelabsStrings.INSTALL_LAUNCH
import typings.saucelabs.saucelabsStrings.NONE
import typings.saucelabs.saucelabsStrings.ROBOTIUM
import typings.saucelabs.saucelabsStrings.SCREENSHOTS
import typings.saucelabs.saucelabsStrings.SKIPPED
import typings.saucelabs.saucelabsStrings.STRESS_TEST
import typings.saucelabs.saucelabsStrings.SUCCESS
import typings.saucelabs.saucelabsStrings.UNKNOWN
import typings.saucelabs.saucelabsStrings.WARNING
import typings.saucelabs.saucelabsStrings.XCUITEST
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstrumentationBatchReport
  extends /* key */ StringDictionary[js.Any] {
  
  var appUnderTestId: js.UndefOr[Id] = js.native
  
  var automationFramework: js.UndefOr[ROBOTIUM | ESPRESSO | XCUITEST] = js.native
  
  var batchId: js.UndefOr[Id] = js.native
  
  var checkupType: js.UndefOr[STRESS_TEST | INSTALL_LAUNCH | SCREENSHOTS | NONE] = js.native
  
  var devices: js.UndefOr[js.Array[DeviceView]] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var id: js.UndefOr[Id] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var notificationEmails: js.UndefOr[js.Array[String]] = js.native
  
  var notificationEnabled: js.UndefOr[Boolean] = js.native
  
  var projectPath: js.UndefOr[Path] = js.native
  
  var reports: js.UndefOr[js.Array[ReportEntry]] = js.native
  
  var running: js.UndefOr[Boolean] = js.native
  
  var secretLinkCode: js.UndefOr[String] = js.native
  
  var startTime: js.UndefOr[Double] = js.native
  
  var status: js.UndefOr[UNKNOWN | SUCCESS | WARNING | FAILURE | SKIPPED | ABORTED | CANCELED] = js.native
  
  var testSpecAppId: js.UndefOr[Id] = js.native
  
  var tests: js.UndefOr[js.Array[TestView]] = js.native
  
  var tunnelIdentifier: js.UndefOr[String] = js.native
}
object InstrumentationBatchReport {
  
  @scala.inline
  def apply(): InstrumentationBatchReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstrumentationBatchReport]
  }
  
  @scala.inline
  implicit class InstrumentationBatchReportMutableBuilder[Self <: InstrumentationBatchReport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppUnderTestId(value: Id): Self = StObject.set(x, "appUnderTestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppUnderTestIdUndefined: Self = StObject.set(x, "appUnderTestId", js.undefined)
    
    @scala.inline
    def setAutomationFramework(value: ROBOTIUM | ESPRESSO | XCUITEST): Self = StObject.set(x, "automationFramework", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomationFrameworkUndefined: Self = StObject.set(x, "automationFramework", js.undefined)
    
    @scala.inline
    def setBatchId(value: Id): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    @scala.inline
    def setCheckupType(value: STRESS_TEST | INSTALL_LAUNCH | SCREENSHOTS | NONE): Self = StObject.set(x, "checkupType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckupTypeUndefined: Self = StObject.set(x, "checkupType", js.undefined)
    
    @scala.inline
    def setDevices(value: js.Array[DeviceView]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevicesUndefined: Self = StObject.set(x, "devices", js.undefined)
    
    @scala.inline
    def setDevicesVarargs(value: DeviceView*): Self = StObject.set(x, "devices", js.Array(value :_*))
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNotificationEmails(value: js.Array[String]): Self = StObject.set(x, "notificationEmails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationEmailsUndefined: Self = StObject.set(x, "notificationEmails", js.undefined)
    
    @scala.inline
    def setNotificationEmailsVarargs(value: String*): Self = StObject.set(x, "notificationEmails", js.Array(value :_*))
    
    @scala.inline
    def setNotificationEnabled(value: Boolean): Self = StObject.set(x, "notificationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationEnabledUndefined: Self = StObject.set(x, "notificationEnabled", js.undefined)
    
    @scala.inline
    def setProjectPath(value: Path): Self = StObject.set(x, "projectPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectPathUndefined: Self = StObject.set(x, "projectPath", js.undefined)
    
    @scala.inline
    def setReports(value: js.Array[ReportEntry]): Self = StObject.set(x, "reports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportsUndefined: Self = StObject.set(x, "reports", js.undefined)
    
    @scala.inline
    def setReportsVarargs(value: ReportEntry*): Self = StObject.set(x, "reports", js.Array(value :_*))
    
    @scala.inline
    def setRunning(value: Boolean): Self = StObject.set(x, "running", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunningUndefined: Self = StObject.set(x, "running", js.undefined)
    
    @scala.inline
    def setSecretLinkCode(value: String): Self = StObject.set(x, "secretLinkCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretLinkCodeUndefined: Self = StObject.set(x, "secretLinkCode", js.undefined)
    
    @scala.inline
    def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setStatus(value: UNKNOWN | SUCCESS | WARNING | FAILURE | SKIPPED | ABORTED | CANCELED): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTestSpecAppId(value: Id): Self = StObject.set(x, "testSpecAppId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestSpecAppIdUndefined: Self = StObject.set(x, "testSpecAppId", js.undefined)
    
    @scala.inline
    def setTests(value: js.Array[TestView]): Self = StObject.set(x, "tests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestsUndefined: Self = StObject.set(x, "tests", js.undefined)
    
    @scala.inline
    def setTestsVarargs(value: TestView*): Self = StObject.set(x, "tests", js.Array(value :_*))
    
    @scala.inline
    def setTunnelIdentifier(value: String): Self = StObject.set(x, "tunnelIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTunnelIdentifierUndefined: Self = StObject.set(x, "tunnelIdentifier", js.undefined)
  }
}
