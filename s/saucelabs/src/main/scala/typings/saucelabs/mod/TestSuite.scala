package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestSuite
  extends /* key */ StringDictionary[js.Any] {
  
  var name: js.UndefOr[String] = js.native
  
  var runCount: js.UndefOr[Double] = js.native
  
  var testDuration: js.UndefOr[Duration] = js.native
  
  var testsuiteFinishedAt: js.UndefOr[Instant] = js.native
  
  var testsuiteStartedAt: js.UndefOr[Instant] = js.native
  
  var totalDuration: js.UndefOr[Duration] = js.native
  
  var unexpected: js.UndefOr[Double] = js.native
  
  var withFailures: js.UndefOr[Double] = js.native
}
object TestSuite {
  
  @scala.inline
  def apply(): TestSuite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestSuite]
  }
  
  @scala.inline
  implicit class TestSuiteOps[Self <: TestSuite] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRunCount(value: Double): Self = this.set("runCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunCount: Self = this.set("runCount", js.undefined)
    
    @scala.inline
    def setTestDuration(value: Duration): Self = this.set("testDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestDuration: Self = this.set("testDuration", js.undefined)
    
    @scala.inline
    def setTestsuiteFinishedAt(value: Instant): Self = this.set("testsuiteFinishedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestsuiteFinishedAt: Self = this.set("testsuiteFinishedAt", js.undefined)
    
    @scala.inline
    def setTestsuiteStartedAt(value: Instant): Self = this.set("testsuiteStartedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestsuiteStartedAt: Self = this.set("testsuiteStartedAt", js.undefined)
    
    @scala.inline
    def setTotalDuration(value: Duration): Self = this.set("totalDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalDuration: Self = this.set("totalDuration", js.undefined)
    
    @scala.inline
    def setUnexpected(value: Double): Self = this.set("unexpected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnexpected: Self = this.set("unexpected", js.undefined)
    
    @scala.inline
    def setWithFailures(value: Double): Self = this.set("withFailures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithFailures: Self = this.set("withFailures", js.undefined)
  }
}
