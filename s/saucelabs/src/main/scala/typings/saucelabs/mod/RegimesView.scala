package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.saucelabs.anon.Active
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegimesView
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var metric_name: js.UndefOr[js.Array[Active]] = js.undefined
}
object RegimesView {
  
  inline def apply(): RegimesView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegimesView]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegimesView] (val x: Self) extends AnyVal {
    
    inline def setMetric_name(value: js.Array[Active]): Self = StObject.set(x, "metric_name", value.asInstanceOf[js.Any])
    
    inline def setMetric_nameUndefined: Self = StObject.set(x, "metric_name", js.undefined)
    
    inline def setMetric_nameVarargs(value: Active*): Self = StObject.set(x, "metric_name", js.Array(value*))
  }
}
