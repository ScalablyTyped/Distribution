package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaselineView
  extends /* key */ StringDictionary[js.Any] {
  
  var metric_name: js.UndefOr[BaselineDetails] = js.native
}
object BaselineView {
  
  @scala.inline
  def apply(): BaselineView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaselineView]
  }
  
  @scala.inline
  implicit class BaselineViewMutableBuilder[Self <: BaselineView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetric_name(value: BaselineDetails): Self = StObject.set(x, "metric_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetric_nameUndefined: Self = StObject.set(x, "metric_name", js.undefined)
  }
}
