package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestError
  extends /* key */ StringDictionary[js.Any] {
  
  var error: js.UndefOr[String] = js.native
  
  var file: js.UndefOr[String] = js.native
  
  var lineNumber: js.UndefOr[Double] = js.native
}
object TestError {
  
  @scala.inline
  def apply(): TestError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestError]
  }
  
  @scala.inline
  implicit class TestErrorMutableBuilder[Self <: TestError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    @scala.inline
    def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
  }
}
