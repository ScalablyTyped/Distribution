package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestSuite
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var name: js.UndefOr[String] = js.undefined
  
  var runCount: js.UndefOr[Double] = js.undefined
  
  var testDuration: js.UndefOr[Duration] = js.undefined
  
  var testsuiteFinishedAt: js.UndefOr[Instant] = js.undefined
  
  var testsuiteStartedAt: js.UndefOr[Instant] = js.undefined
  
  var totalDuration: js.UndefOr[Duration] = js.undefined
  
  var unexpected: js.UndefOr[Double] = js.undefined
  
  var withFailures: js.UndefOr[Double] = js.undefined
}
object TestSuite {
  
  inline def apply(): TestSuite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestSuite]
  }
  
  extension [Self <: TestSuite](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRunCount(value: Double): Self = StObject.set(x, "runCount", value.asInstanceOf[js.Any])
    
    inline def setRunCountUndefined: Self = StObject.set(x, "runCount", js.undefined)
    
    inline def setTestDuration(value: Duration): Self = StObject.set(x, "testDuration", value.asInstanceOf[js.Any])
    
    inline def setTestDurationUndefined: Self = StObject.set(x, "testDuration", js.undefined)
    
    inline def setTestsuiteFinishedAt(value: Instant): Self = StObject.set(x, "testsuiteFinishedAt", value.asInstanceOf[js.Any])
    
    inline def setTestsuiteFinishedAtUndefined: Self = StObject.set(x, "testsuiteFinishedAt", js.undefined)
    
    inline def setTestsuiteStartedAt(value: Instant): Self = StObject.set(x, "testsuiteStartedAt", value.asInstanceOf[js.Any])
    
    inline def setTestsuiteStartedAtUndefined: Self = StObject.set(x, "testsuiteStartedAt", js.undefined)
    
    inline def setTotalDuration(value: Duration): Self = StObject.set(x, "totalDuration", value.asInstanceOf[js.Any])
    
    inline def setTotalDurationUndefined: Self = StObject.set(x, "totalDuration", js.undefined)
    
    inline def setUnexpected(value: Double): Self = StObject.set(x, "unexpected", value.asInstanceOf[js.Any])
    
    inline def setUnexpectedUndefined: Self = StObject.set(x, "unexpected", js.undefined)
    
    inline def setWithFailures(value: Double): Self = StObject.set(x, "withFailures", value.asInstanceOf[js.Any])
    
    inline def setWithFailuresUndefined: Self = StObject.set(x, "withFailures", js.undefined)
  }
}
