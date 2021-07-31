package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiscardedView
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var job_ids: js.UndefOr[js.Array[String]] = js.undefined
}
object DiscardedView {
  
  @scala.inline
  def apply(): DiscardedView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiscardedView]
  }
  
  @scala.inline
  implicit class DiscardedViewMutableBuilder[Self <: DiscardedView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJob_ids(value: js.Array[String]): Self = StObject.set(x, "job_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJob_idsUndefined: Self = StObject.set(x, "job_ids", js.undefined)
    
    @scala.inline
    def setJob_idsVarargs(value: String*): Self = StObject.set(x, "job_ids", js.Array(value :_*))
  }
}
