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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionReport
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var appId: js.UndefOr[Id] = js.undefined
  
  var batchId: js.UndefOr[Double] = js.undefined
  
  var deviceDescriptorId: js.UndefOr[Id] = js.undefined
  
  var durationInSeconds: js.UndefOr[Double] = js.undefined
  
  var endDateTime: js.UndefOr[String] = js.undefined
  
  var frameworkAppId: js.UndefOr[Id] = js.undefined
  
  var id: js.UndefOr[Id] = js.undefined
  
  var projectId: js.UndefOr[Id] = js.undefined
  
  var startDateTime: js.UndefOr[String] = js.undefined
  
  var testFrameworkType: js.UndefOr[String] = js.undefined
  
  var testFrameworkVersion: js.UndefOr[String] = js.undefined
  
  var testIds: js.UndefOr[js.Array[Id]] = js.undefined
  
  var testReportIds: js.UndefOr[js.Array[Id]] = js.undefined
  
  var usage: js.UndefOr[MANUAL | BATCH | APPIUM | PIRANHA | XCUITEST | ANDROID_INSTRUMENTATION] = js.undefined
  
  var userId: js.UndefOr[Id] = js.undefined
}
object SessionReport {
  
  inline def apply(): SessionReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionReport]
  }
  
  extension [Self <: SessionReport](x: Self) {
    
    inline def setAppId(value: Id): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    inline def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    inline def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    inline def setDeviceDescriptorId(value: Id): Self = StObject.set(x, "deviceDescriptorId", value.asInstanceOf[js.Any])
    
    inline def setDeviceDescriptorIdUndefined: Self = StObject.set(x, "deviceDescriptorId", js.undefined)
    
    inline def setDurationInSeconds(value: Double): Self = StObject.set(x, "durationInSeconds", value.asInstanceOf[js.Any])
    
    inline def setDurationInSecondsUndefined: Self = StObject.set(x, "durationInSeconds", js.undefined)
    
    inline def setEndDateTime(value: String): Self = StObject.set(x, "endDateTime", value.asInstanceOf[js.Any])
    
    inline def setEndDateTimeUndefined: Self = StObject.set(x, "endDateTime", js.undefined)
    
    inline def setFrameworkAppId(value: Id): Self = StObject.set(x, "frameworkAppId", value.asInstanceOf[js.Any])
    
    inline def setFrameworkAppIdUndefined: Self = StObject.set(x, "frameworkAppId", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setProjectId(value: Id): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setStartDateTime(value: String): Self = StObject.set(x, "startDateTime", value.asInstanceOf[js.Any])
    
    inline def setStartDateTimeUndefined: Self = StObject.set(x, "startDateTime", js.undefined)
    
    inline def setTestFrameworkType(value: String): Self = StObject.set(x, "testFrameworkType", value.asInstanceOf[js.Any])
    
    inline def setTestFrameworkTypeUndefined: Self = StObject.set(x, "testFrameworkType", js.undefined)
    
    inline def setTestFrameworkVersion(value: String): Self = StObject.set(x, "testFrameworkVersion", value.asInstanceOf[js.Any])
    
    inline def setTestFrameworkVersionUndefined: Self = StObject.set(x, "testFrameworkVersion", js.undefined)
    
    inline def setTestIds(value: js.Array[Id]): Self = StObject.set(x, "testIds", value.asInstanceOf[js.Any])
    
    inline def setTestIdsUndefined: Self = StObject.set(x, "testIds", js.undefined)
    
    inline def setTestIdsVarargs(value: Id*): Self = StObject.set(x, "testIds", js.Array(value :_*))
    
    inline def setTestReportIds(value: js.Array[Id]): Self = StObject.set(x, "testReportIds", value.asInstanceOf[js.Any])
    
    inline def setTestReportIdsUndefined: Self = StObject.set(x, "testReportIds", js.undefined)
    
    inline def setTestReportIdsVarargs(value: Id*): Self = StObject.set(x, "testReportIds", js.Array(value :_*))
    
    inline def setUsage(value: MANUAL | BATCH | APPIUM | PIRANHA | XCUITEST | ANDROID_INSTRUMENTATION): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    inline def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
    
    inline def setUserId(value: Id): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
