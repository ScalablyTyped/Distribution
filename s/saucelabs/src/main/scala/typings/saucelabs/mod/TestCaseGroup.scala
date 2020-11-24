package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestCaseGroup
  extends /* key */ StringDictionary[js.Any] {
  
  var className: js.UndefOr[String] = js.native
  
  var testCases: js.UndefOr[js.Array[TestCase]] = js.native
}
object TestCaseGroup {
  
  @scala.inline
  def apply(): TestCaseGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestCaseGroup]
  }
  
  @scala.inline
  implicit class TestCaseGroupOps[Self <: TestCaseGroup] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setTestCasesVarargs(value: TestCase*): Self = this.set("testCases", js.Array(value :_*))
    
    @scala.inline
    def setTestCases(value: js.Array[TestCase]): Self = this.set("testCases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestCases: Self = this.set("testCases", js.undefined)
  }
}
