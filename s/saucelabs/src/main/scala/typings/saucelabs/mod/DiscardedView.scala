package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiscardedView
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var job_ids: js.UndefOr[js.Array[String]] = js.undefined
}
object DiscardedView {
  
  inline def apply(): DiscardedView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiscardedView]
  }
  
  extension [Self <: DiscardedView](x: Self) {
    
    inline def setJob_ids(value: js.Array[String]): Self = StObject.set(x, "job_ids", value.asInstanceOf[js.Any])
    
    inline def setJob_idsUndefined: Self = StObject.set(x, "job_ids", js.undefined)
    
    inline def setJob_idsVarargs(value: String*): Self = StObject.set(x, "job_ids", js.Array(value*))
  }
}
