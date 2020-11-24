package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.saucelabs.saucelabsStrings.ANDROID_INSTRUMENTATION
import typings.saucelabs.saucelabsStrings.APPIUM
import typings.saucelabs.saucelabsStrings.BATCH
import typings.saucelabs.saucelabsStrings.MANUAL
import typings.saucelabs.saucelabsStrings.PIRANHA
import typings.saucelabs.saucelabsStrings.XCUITEST
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
  implicit class SessionReportOps[Self <: SessionReport] (val x: Self) extends AnyVal {
    
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
    def setAppId(value: Id): Self = this.set("appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppId: Self = this.set("appId", js.undefined)
    
    @scala.inline
    def setBatchId(value: Double): Self = this.set("batchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchId: Self = this.set("batchId", js.undefined)
    
    @scala.inline
    def setDeviceDescriptorId(value: Id): Self = this.set("deviceDescriptorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceDescriptorId: Self = this.set("deviceDescriptorId", js.undefined)
    
    @scala.inline
    def setDurationInSeconds(value: Double): Self = this.set("durationInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDurationInSeconds: Self = this.set("durationInSeconds", js.undefined)
    
    @scala.inline
    def setEndDateTime(value: String): Self = this.set("endDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDateTime: Self = this.set("endDateTime", js.undefined)
    
    @scala.inline
    def setFrameworkAppId(value: Id): Self = this.set("frameworkAppId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameworkAppId: Self = this.set("frameworkAppId", js.undefined)
    
    @scala.inline
    def setId(value: Id): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setProjectId(value: Id): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    
    @scala.inline
    def setStartDateTime(value: String): Self = this.set("startDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDateTime: Self = this.set("startDateTime", js.undefined)
    
    @scala.inline
    def setTestFrameworkType(value: String): Self = this.set("testFrameworkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestFrameworkType: Self = this.set("testFrameworkType", js.undefined)
    
    @scala.inline
    def setTestFrameworkVersion(value: String): Self = this.set("testFrameworkVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestFrameworkVersion: Self = this.set("testFrameworkVersion", js.undefined)
    
    @scala.inline
    def setTestIdsVarargs(value: Id*): Self = this.set("testIds", js.Array(value :_*))
    
    @scala.inline
    def setTestIds(value: js.Array[Id]): Self = this.set("testIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestIds: Self = this.set("testIds", js.undefined)
    
    @scala.inline
    def setTestReportIdsVarargs(value: Id*): Self = this.set("testReportIds", js.Array(value :_*))
    
    @scala.inline
    def setTestReportIds(value: js.Array[Id]): Self = this.set("testReportIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestReportIds: Self = this.set("testReportIds", js.undefined)
    
    @scala.inline
    def setUsage(value: MANUAL | BATCH | APPIUM | PIRANHA | XCUITEST | ANDROID_INSTRUMENTATION): Self = this.set("usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsage: Self = this.set("usage", js.undefined)
    
    @scala.inline
    def setUserId(value: Id): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
}
