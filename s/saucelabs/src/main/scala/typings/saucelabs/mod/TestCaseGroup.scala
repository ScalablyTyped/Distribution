package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestCaseGroup
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var className: js.UndefOr[String] = js.undefined
  
  var testCases: js.UndefOr[js.Array[TestCase]] = js.undefined
}
object TestCaseGroup {
  
  inline def apply(): TestCaseGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestCaseGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestCaseGroup] (val x: Self) extends AnyVal {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setTestCases(value: js.Array[TestCase]): Self = StObject.set(x, "testCases", value.asInstanceOf[js.Any])
    
    inline def setTestCasesUndefined: Self = StObject.set(x, "testCases", js.undefined)
    
    inline def setTestCasesVarargs(value: TestCase*): Self = StObject.set(x, "testCases", js.Array(value*))
  }
}
