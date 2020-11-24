package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestView
  extends /* key */ StringDictionary[js.Any] {
  
  var className: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var testId: js.UndefOr[Id] = js.native
}
object TestView {
  
  @scala.inline
  def apply(): TestView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestView]
  }
  
  @scala.inline
  implicit class TestViewOps[Self <: TestView] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTestId(value: Id): Self = this.set("testId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestId: Self = this.set("testId", js.undefined)
  }
}
