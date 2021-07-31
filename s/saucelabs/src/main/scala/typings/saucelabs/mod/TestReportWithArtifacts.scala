package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestReportWithArtifacts
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var deviceContextId: js.UndefOr[String] = js.undefined
  
  var deviceLog: js.UndefOr[String] = js.undefined
  
  var frameworkLog: js.UndefOr[String] = js.undefined
  
  var report: js.UndefOr[TestReport] = js.undefined
  
  var screenshots: js.UndefOr[js.Array[Entity]] = js.undefined
  
  var testResult: js.UndefOr[String] = js.undefined
  
  var video: js.UndefOr[Entity] = js.undefined
  
  var vitalsLog: js.UndefOr[String] = js.undefined
}
object TestReportWithArtifacts {
  
  @scala.inline
  def apply(): TestReportWithArtifacts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestReportWithArtifacts]
  }
  
  @scala.inline
  implicit class TestReportWithArtifactsMutableBuilder[Self <: TestReportWithArtifacts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceContextId(value: String): Self = StObject.set(x, "deviceContextId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceContextIdUndefined: Self = StObject.set(x, "deviceContextId", js.undefined)
    
    @scala.inline
    def setDeviceLog(value: String): Self = StObject.set(x, "deviceLog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceLogUndefined: Self = StObject.set(x, "deviceLog", js.undefined)
    
    @scala.inline
    def setFrameworkLog(value: String): Self = StObject.set(x, "frameworkLog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameworkLogUndefined: Self = StObject.set(x, "frameworkLog", js.undefined)
    
    @scala.inline
    def setReport(value: TestReport): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportUndefined: Self = StObject.set(x, "report", js.undefined)
    
    @scala.inline
    def setScreenshots(value: js.Array[Entity]): Self = StObject.set(x, "screenshots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenshotsUndefined: Self = StObject.set(x, "screenshots", js.undefined)
    
    @scala.inline
    def setScreenshotsVarargs(value: Entity*): Self = StObject.set(x, "screenshots", js.Array(value :_*))
    
    @scala.inline
    def setTestResult(value: String): Self = StObject.set(x, "testResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestResultUndefined: Self = StObject.set(x, "testResult", js.undefined)
    
    @scala.inline
    def setVideo(value: Entity): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
    
    @scala.inline
    def setVitalsLog(value: String): Self = StObject.set(x, "vitalsLog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVitalsLogUndefined: Self = StObject.set(x, "vitalsLog", js.undefined)
  }
}
