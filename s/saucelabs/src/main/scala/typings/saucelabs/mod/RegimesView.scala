package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.saucelabs.anon.Active
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegimesView
  extends /* key */ StringDictionary[js.Any] {
  
  var metric_name: js.UndefOr[js.Array[Active]] = js.native
}
object RegimesView {
  
  @scala.inline
  def apply(): RegimesView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegimesView]
  }
  
  @scala.inline
  implicit class RegimesViewMutableBuilder[Self <: RegimesView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetric_name(value: js.Array[Active]): Self = StObject.set(x, "metric_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetric_nameUndefined: Self = StObject.set(x, "metric_name", js.undefined)
    
    @scala.inline
    def setMetric_nameVarargs(value: Active*): Self = StObject.set(x, "metric_name", js.Array(value :_*))
  }
}
