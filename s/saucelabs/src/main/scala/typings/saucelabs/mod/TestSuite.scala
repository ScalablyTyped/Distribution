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
  
  @scala.inline
  def apply(): TestSuite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestSuite]
  }
  
  @scala.inline
  implicit class TestSuiteMutableBuilder[Self <: TestSuite] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRunCount(value: Double): Self = StObject.set(x, "runCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunCountUndefined: Self = StObject.set(x, "runCount", js.undefined)
    
    @scala.inline
    def setTestDuration(value: Duration): Self = StObject.set(x, "testDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestDurationUndefined: Self = StObject.set(x, "testDuration", js.undefined)
    
    @scala.inline
    def setTestsuiteFinishedAt(value: Instant): Self = StObject.set(x, "testsuiteFinishedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestsuiteFinishedAtUndefined: Self = StObject.set(x, "testsuiteFinishedAt", js.undefined)
    
    @scala.inline
    def setTestsuiteStartedAt(value: Instant): Self = StObject.set(x, "testsuiteStartedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestsuiteStartedAtUndefined: Self = StObject.set(x, "testsuiteStartedAt", js.undefined)
    
    @scala.inline
    def setTotalDuration(value: Duration): Self = StObject.set(x, "totalDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalDurationUndefined: Self = StObject.set(x, "totalDuration", js.undefined)
    
    @scala.inline
    def setUnexpected(value: Double): Self = StObject.set(x, "unexpected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnexpectedUndefined: Self = StObject.set(x, "unexpected", js.undefined)
    
    @scala.inline
    def setWithFailures(value: Double): Self = StObject.set(x, "withFailures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithFailuresUndefined: Self = StObject.set(x, "withFailures", js.undefined)
  }
}
