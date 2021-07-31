package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestView
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var className: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var testId: js.UndefOr[Id] = js.undefined
}
object TestView {
  
  @scala.inline
  def apply(): TestView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestView]
  }
  
  @scala.inline
  implicit class TestViewMutableBuilder[Self <: TestView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setTestId(value: Id): Self = StObject.set(x, "testId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestIdUndefined: Self = StObject.set(x, "testId", js.undefined)
  }
}
