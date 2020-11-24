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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchReport
  extends /* key */ StringDictionary[js.Any] {
  
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
  
  var tests: js.UndefOr[js.Array[TestView]] = js.native
}
object BatchReport {
  
  @scala.inline
  def apply(): BatchReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchReport]
  }
  
  @scala.inline
  implicit class BatchReportOps[Self <: BatchReport] (val x: Self) extends AnyVal {
    
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
    def setBatchId(value: Id): Self = this.set("batchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchId: Self = this.set("batchId", js.undefined)
    
    @scala.inline
    def setCheckupType(value: STRESS_TEST | INSTALL_LAUNCH | SCREENSHOTS | NONE): Self = this.set("checkupType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckupType: Self = this.set("checkupType", js.undefined)
    
    @scala.inline
    def setDevicesVarargs(value: DeviceView*): Self = this.set("devices", js.Array(value :_*))
    
    @scala.inline
    def setDevices(value: js.Array[DeviceView]): Self = this.set("devices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevices: Self = this.set("devices", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setId(value: Id): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNotificationEmailsVarargs(value: String*): Self = this.set("notificationEmails", js.Array(value :_*))
    
    @scala.inline
    def setNotificationEmails(value: js.Array[String]): Self = this.set("notificationEmails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationEmails: Self = this.set("notificationEmails", js.undefined)
    
    @scala.inline
    def setNotificationEnabled(value: Boolean): Self = this.set("notificationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationEnabled: Self = this.set("notificationEnabled", js.undefined)
    
    @scala.inline
    def setProjectPath(value: Path): Self = this.set("projectPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectPath: Self = this.set("projectPath", js.undefined)
    
    @scala.inline
    def setReportsVarargs(value: ReportEntry*): Self = this.set("reports", js.Array(value :_*))
    
    @scala.inline
    def setReports(value: js.Array[ReportEntry]): Self = this.set("reports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReports: Self = this.set("reports", js.undefined)
    
    @scala.inline
    def setRunning(value: Boolean): Self = this.set("running", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunning: Self = this.set("running", js.undefined)
    
    @scala.inline
    def setSecretLinkCode(value: String): Self = this.set("secretLinkCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretLinkCode: Self = this.set("secretLinkCode", js.undefined)
    
    @scala.inline
    def setStartTime(value: Double): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setStatus(value: UNKNOWN | SUCCESS | WARNING | FAILURE | SKIPPED | ABORTED | CANCELED): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTestsVarargs(value: TestView*): Self = this.set("tests", js.Array(value :_*))
    
    @scala.inline
    def setTests(value: js.Array[TestView]): Self = this.set("tests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTests: Self = this.set("tests", js.undefined)
  }
}
