package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssertView
  extends /* key */ StringDictionary[js.Any] {
  
  var metric_name: js.UndefOr[AssertDetails] = js.native
}
object AssertView {
  
  @scala.inline
  def apply(): AssertView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssertView]
  }
  
  @scala.inline
  implicit class AssertViewMutableBuilder[Self <: AssertView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetric_name(value: AssertDetails): Self = StObject.set(x, "metric_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetric_nameUndefined: Self = StObject.set(x, "metric_name", js.undefined)
  }
}
