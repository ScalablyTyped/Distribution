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
  
  inline def apply(): TestReportWithArtifacts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestReportWithArtifacts]
  }
  
  extension [Self <: TestReportWithArtifacts](x: Self) {
    
    inline def setDeviceContextId(value: String): Self = StObject.set(x, "deviceContextId", value.asInstanceOf[js.Any])
    
    inline def setDeviceContextIdUndefined: Self = StObject.set(x, "deviceContextId", js.undefined)
    
    inline def setDeviceLog(value: String): Self = StObject.set(x, "deviceLog", value.asInstanceOf[js.Any])
    
    inline def setDeviceLogUndefined: Self = StObject.set(x, "deviceLog", js.undefined)
    
    inline def setFrameworkLog(value: String): Self = StObject.set(x, "frameworkLog", value.asInstanceOf[js.Any])
    
    inline def setFrameworkLogUndefined: Self = StObject.set(x, "frameworkLog", js.undefined)
    
    inline def setReport(value: TestReport): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
    
    inline def setReportUndefined: Self = StObject.set(x, "report", js.undefined)
    
    inline def setScreenshots(value: js.Array[Entity]): Self = StObject.set(x, "screenshots", value.asInstanceOf[js.Any])
    
    inline def setScreenshotsUndefined: Self = StObject.set(x, "screenshots", js.undefined)
    
    inline def setScreenshotsVarargs(value: Entity*): Self = StObject.set(x, "screenshots", js.Array(value :_*))
    
    inline def setTestResult(value: String): Self = StObject.set(x, "testResult", value.asInstanceOf[js.Any])
    
    inline def setTestResultUndefined: Self = StObject.set(x, "testResult", js.undefined)
    
    inline def setVideo(value: Entity): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
    
    inline def setVitalsLog(value: String): Self = StObject.set(x, "vitalsLog", value.asInstanceOf[js.Any])
    
    inline def setVitalsLogUndefined: Self = StObject.set(x, "vitalsLog", js.undefined)
  }
}
