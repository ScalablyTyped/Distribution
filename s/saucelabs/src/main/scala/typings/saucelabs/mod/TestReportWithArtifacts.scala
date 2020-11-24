package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestReportWithArtifacts
  extends /* key */ StringDictionary[js.Any] {
  
  var deviceContextId: js.UndefOr[String] = js.native
  
  var deviceLog: js.UndefOr[String] = js.native
  
  var frameworkLog: js.UndefOr[String] = js.native
  
  var report: js.UndefOr[TestReport] = js.native
  
  var screenshots: js.UndefOr[js.Array[Entity]] = js.native
  
  var testResult: js.UndefOr[String] = js.native
  
  var video: js.UndefOr[Entity] = js.native
  
  var vitalsLog: js.UndefOr[String] = js.native
}
object TestReportWithArtifacts {
  
  @scala.inline
  def apply(): TestReportWithArtifacts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestReportWithArtifacts]
  }
  
  @scala.inline
  implicit class TestReportWithArtifactsOps[Self <: TestReportWithArtifacts] (val x: Self) extends AnyVal {
    
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
    def setDeviceContextId(value: String): Self = this.set("deviceContextId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceContextId: Self = this.set("deviceContextId", js.undefined)
    
    @scala.inline
    def setDeviceLog(value: String): Self = this.set("deviceLog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceLog: Self = this.set("deviceLog", js.undefined)
    
    @scala.inline
    def setFrameworkLog(value: String): Self = this.set("frameworkLog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameworkLog: Self = this.set("frameworkLog", js.undefined)
    
    @scala.inline
    def setReport(value: TestReport): Self = this.set("report", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReport: Self = this.set("report", js.undefined)
    
    @scala.inline
    def setScreenshotsVarargs(value: Entity*): Self = this.set("screenshots", js.Array(value :_*))
    
    @scala.inline
    def setScreenshots(value: js.Array[Entity]): Self = this.set("screenshots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenshots: Self = this.set("screenshots", js.undefined)
    
    @scala.inline
    def setTestResult(value: String): Self = this.set("testResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestResult: Self = this.set("testResult", js.undefined)
    
    @scala.inline
    def setVideo(value: Entity): Self = this.set("video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideo: Self = this.set("video", js.undefined)
    
    @scala.inline
    def setVitalsLog(value: String): Self = this.set("vitalsLog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVitalsLog: Self = this.set("vitalsLog", js.undefined)
  }
}
