package typings.reactBootstrapTableNext.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Selected extends StObject {
  
  var selected: js.UndefOr[js.Array[js.Any]] = js.undefined
}
object Selected {
  
  @scala.inline
  def apply(): Selected = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Selected]
  }
  
  @scala.inline
  implicit class SelectedMutableBuilder[Self <: Selected] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelected(value: js.Array[js.Any]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setSelectedVarargs(value: js.Any*): Self = StObject.set(x, "selected", js.Array(value :_*))
  }
}
