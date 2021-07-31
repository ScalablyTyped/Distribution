package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.saucelabs.saucelabsStrings.ABORTED
import typings.saucelabs.saucelabsStrings.CANCELED
import typings.saucelabs.saucelabsStrings.EDGE
import typings.saucelabs.saucelabsStrings.ERROR
import typings.saucelabs.saucelabsStrings.FAILURE
import typings.saucelabs.saucelabsStrings.FULL
import typings.saucelabs.saucelabsStrings.GPRS
import typings.saucelabs.saucelabsStrings.GSM
import typings.saucelabs.saucelabsStrings.HDCSD
import typings.saucelabs.saucelabsStrings.HSDPA
import typings.saucelabs.saucelabsStrings.OK
import typings.saucelabs.saucelabsStrings.SKIPPED
import typings.saucelabs.saucelabsStrings.SUCCESS
import typings.saucelabs.saucelabsStrings.UMTS
import typings.saucelabs.saucelabsStrings.UNDEFINED
import typings.saucelabs.saucelabsStrings.UNKNOWN
import typings.saucelabs.saucelabsStrings.WARNING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XCUITestReport
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var appVersionId: js.UndefOr[Double] = js.undefined
  
  var appVersionName: js.UndefOr[String] = js.undefined
  
  var automationBackend: js.UndefOr[String] = js.undefined
  
  var batchId: js.UndefOr[Id] = js.undefined
  
  var batchName: js.UndefOr[String] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var dataCenterId: js.UndefOr[Id] = js.undefined
  
  var deviceDescriptor: js.UndefOr[DeviceDescriptor] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var errorMessage: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[Id] = js.undefined
  
  var networkSpeed: js.UndefOr[FULL | GSM | HDCSD | GPRS | EDGE | UMTS | HSDPA] = js.undefined
  
  var phoneNumber: js.UndefOr[PhoneNumber] = js.undefined
  
  var projectPath: js.UndefOr[Path] = js.undefined
  
  var remoteAppFileUrl: js.UndefOr[String] = js.undefined
  
  var running: js.UndefOr[Boolean] = js.undefined
  
  var screenshots: js.UndefOr[js.Array[Double]] = js.undefined
  
  var sharedLinkCode: js.UndefOr[String] = js.undefined
  
  var stackTrace: js.UndefOr[String] = js.undefined
  
  var startTime: js.UndefOr[Double] = js.undefined
  
  var status: js.UndefOr[UNKNOWN | SUCCESS | WARNING | FAILURE | SKIPPED | ABORTED | CANCELED] = js.undefined
  
  var systemError: js.UndefOr[String] = js.undefined
  
  var systemErrorType: js.UndefOr[String] = js.undefined
  
  var testCaseGroups: js.UndefOr[js.Array[TestCaseGroup]] = js.undefined
  
  var testId: js.UndefOr[Id] = js.undefined
  
  var testName: js.UndefOr[String] = js.undefined
  
  var testResultStatus: js.UndefOr[UNDEFINED | WARNING | OK | ERROR | FAILURE | SKIPPED | ABORTED | CANCELED] = js.undefined
  
  var tunnelId: js.UndefOr[String] = js.undefined
  
  var tunnelIdentifier: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var uuid: js.UndefOr[Uuid] = js.undefined
  
  var videoId: js.UndefOr[Id] = js.undefined
  
  var withSystemError: js.UndefOr[Boolean] = js.undefined
}
object XCUITestReport {
  
  @scala.inline
  def apply(): XCUITestReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XCUITestReport]
  }
  
  @scala.inline
  implicit class XCUITestReportMutableBuilder[Self <: XCUITestReport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppVersionId(value: Double): Self = StObject.set(x, "appVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppVersionIdUndefined: Self = StObject.set(x, "appVersionId", js.undefined)
    
    @scala.inline
    def setAppVersionName(value: String): Self = StObject.set(x, "appVersionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppVersionNameUndefined: Self = StObject.set(x, "appVersionName", js.undefined)
    
    @scala.inline
    def setAutomationBackend(value: String): Self = StObject.set(x, "automationBackend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomationBackendUndefined: Self = StObject.set(x, "automationBackend", js.undefined)
    
    @scala.inline
    def setBatchId(value: Id): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    @scala.inline
    def setBatchName(value: String): Self = StObject.set(x, "batchName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchNameUndefined: Self = StObject.set(x, "batchName", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setDataCenterId(value: Id): Self = StObject.set(x, "dataCenterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataCenterIdUndefined: Self = StObject.set(x, "dataCenterId", js.undefined)
    
    @scala.inline
    def setDeviceDescriptor(value: DeviceDescriptor): Self = StObject.set(x, "deviceDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceDescriptorUndefined: Self = StObject.set(x, "deviceDescriptor", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    @scala.inline
    def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setNetworkSpeed(value: FULL | GSM | HDCSD | GPRS | EDGE | UMTS | HSDPA): Self = StObject.set(x, "networkSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkSpeedUndefined: Self = StObject.set(x, "networkSpeed", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: PhoneNumber): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    @scala.inline
    def setProjectPath(value: Path): Self = StObject.set(x, "projectPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectPathUndefined: Self = StObject.set(x, "projectPath", js.undefined)
    
    @scala.inline
    def setRemoteAppFileUrl(value: String): Self = StObject.set(x, "remoteAppFileUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteAppFileUrlUndefined: Self = StObject.set(x, "remoteAppFileUrl", js.undefined)
    
    @scala.inline
    def setRunning(value: Boolean): Self = StObject.set(x, "running", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunningUndefined: Self = StObject.set(x, "running", js.undefined)
    
    @scala.inline
    def setScreenshots(value: js.Array[Double]): Self = StObject.set(x, "screenshots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenshotsUndefined: Self = StObject.set(x, "screenshots", js.undefined)
    
    @scala.inline
    def setScreenshotsVarargs(value: Double*): Self = StObject.set(x, "screenshots", js.Array(value :_*))
    
    @scala.inline
    def setSharedLinkCode(value: String): Self = StObject.set(x, "sharedLinkCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedLinkCodeUndefined: Self = StObject.set(x, "sharedLinkCode", js.undefined)
    
    @scala.inline
    def setStackTrace(value: String): Self = StObject.set(x, "stackTrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackTraceUndefined: Self = StObject.set(x, "stackTrace", js.undefined)
    
    @scala.inline
    def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setStatus(value: UNKNOWN | SUCCESS | WARNING | FAILURE | SKIPPED | ABORTED | CANCELED): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setSystemError(value: String): Self = StObject.set(x, "systemError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemErrorType(value: String): Self = StObject.set(x, "systemErrorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemErrorTypeUndefined: Self = StObject.set(x, "systemErrorType", js.undefined)
    
    @scala.inline
    def setSystemErrorUndefined: Self = StObject.set(x, "systemError", js.undefined)
    
    @scala.inline
    def setTestCaseGroups(value: js.Array[TestCaseGroup]): Self = StObject.set(x, "testCaseGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestCaseGroupsUndefined: Self = StObject.set(x, "testCaseGroups", js.undefined)
    
    @scala.inline
    def setTestCaseGroupsVarargs(value: TestCaseGroup*): Self = StObject.set(x, "testCaseGroups", js.Array(value :_*))
    
    @scala.inline
    def setTestId(value: Id): Self = StObject.set(x, "testId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestIdUndefined: Self = StObject.set(x, "testId", js.undefined)
    
    @scala.inline
    def setTestName(value: String): Self = StObject.set(x, "testName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestNameUndefined: Self = StObject.set(x, "testName", js.undefined)
    
    @scala.inline
    def setTestResultStatus(value: UNDEFINED | WARNING | OK | ERROR | FAILURE | SKIPPED | ABORTED | CANCELED): Self = StObject.set(x, "testResultStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestResultStatusUndefined: Self = StObject.set(x, "testResultStatus", js.undefined)
    
    @scala.inline
    def setTunnelId(value: String): Self = StObject.set(x, "tunnelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTunnelIdUndefined: Self = StObject.set(x, "tunnelId", js.undefined)
    
    @scala.inline
    def setTunnelIdentifier(value: String): Self = StObject.set(x, "tunnelIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTunnelIdentifierUndefined: Self = StObject.set(x, "tunnelIdentifier", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUuid(value: Uuid): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
    
    @scala.inline
    def setVideoId(value: Id): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoIdUndefined: Self = StObject.set(x, "videoId", js.undefined)
    
    @scala.inline
    def setWithSystemError(value: Boolean): Self = StObject.set(x, "withSystemError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithSystemErrorUndefined: Self = StObject.set(x, "withSystemError", js.undefined)
  }
}
