package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.saucelabs.saucelabsStrings.ANDROID_INSTRUMENTATION
import typings.saucelabs.saucelabsStrings.APPIUM
import typings.saucelabs.saucelabsStrings.BATCH
import typings.saucelabs.saucelabsStrings.MANUAL
import typings.saucelabs.saucelabsStrings.PIRANHA
import typings.saucelabs.saucelabsStrings.XCUITEST
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionReport
  extends /* key */ StringDictionary[js.Any] {
  
  var appId: js.UndefOr[Id] = js.native
  
  var batchId: js.UndefOr[Double] = js.native
  
  var deviceDescriptorId: js.UndefOr[Id] = js.native
  
  var durationInSeconds: js.UndefOr[Double] = js.native
  
  var endDateTime: js.UndefOr[String] = js.native
  
  var frameworkAppId: js.UndefOr[Id] = js.native
  
  var id: js.UndefOr[Id] = js.native
  
  var projectId: js.UndefOr[Id] = js.native
  
  var startDateTime: js.UndefOr[String] = js.native
  
  var testFrameworkType: js.UndefOr[String] = js.native
  
  var testFrameworkVersion: js.UndefOr[String] = js.native
  
  var testIds: js.UndefOr[js.Array[Id]] = js.native
  
  var testReportIds: js.UndefOr[js.Array[Id]] = js.native
  
  var usage: js.UndefOr[MANUAL | BATCH | APPIUM | PIRANHA | XCUITEST | ANDROID_INSTRUMENTATION] = js.native
  
  var userId: js.UndefOr[Id] = js.native
}
object SessionReport {
  
  @scala.inline
  def apply(): SessionReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionReport]
  }
  
  @scala.inline
  implicit class SessionReportMutableBuilder[Self <: SessionReport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: Id): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    @scala.inline
    def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    @scala.inline
    def setDeviceDescriptorId(value: Id): Self = StObject.set(x, "deviceDescriptorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceDescriptorIdUndefined: Self = StObject.set(x, "deviceDescriptorId", js.undefined)
    
    @scala.inline
    def setDurationInSeconds(value: Double): Self = StObject.set(x, "durationInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationInSecondsUndefined: Self = StObject.set(x, "durationInSeconds", js.undefined)
    
    @scala.inline
    def setEndDateTime(value: String): Self = StObject.set(x, "endDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateTimeUndefined: Self = StObject.set(x, "endDateTime", js.undefined)
    
    @scala.inline
    def setFrameworkAppId(value: Id): Self = StObject.set(x, "frameworkAppId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameworkAppIdUndefined: Self = StObject.set(x, "frameworkAppId", js.undefined)
    
    @scala.inline
    def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setProjectId(value: Id): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setStartDateTime(value: String): Self = StObject.set(x, "startDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateTimeUndefined: Self = StObject.set(x, "startDateTime", js.undefined)
    
    @scala.inline
    def setTestFrameworkType(value: String): Self = StObject.set(x, "testFrameworkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestFrameworkTypeUndefined: Self = StObject.set(x, "testFrameworkType", js.undefined)
    
    @scala.inline
    def setTestFrameworkVersion(value: String): Self = StObject.set(x, "testFrameworkVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestFrameworkVersionUndefined: Self = StObject.set(x, "testFrameworkVersion", js.undefined)
    
    @scala.inline
    def setTestIds(value: js.Array[Id]): Self = StObject.set(x, "testIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestIdsUndefined: Self = StObject.set(x, "testIds", js.undefined)
    
    @scala.inline
    def setTestIdsVarargs(value: Id*): Self = StObject.set(x, "testIds", js.Array(value :_*))
    
    @scala.inline
    def setTestReportIds(value: js.Array[Id]): Self = StObject.set(x, "testReportIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestReportIdsUndefined: Self = StObject.set(x, "testReportIds", js.undefined)
    
    @scala.inline
    def setTestReportIdsVarargs(value: Id*): Self = StObject.set(x, "testReportIds", js.Array(value :_*))
    
    @scala.inline
    def setUsage(value: MANUAL | BATCH | APPIUM | PIRANHA | XCUITEST | ANDROID_INSTRUMENTATION): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
    
    @scala.inline
    def setUserId(value: Id): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
