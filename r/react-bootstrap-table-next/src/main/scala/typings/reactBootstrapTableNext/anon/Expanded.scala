package typings.reactBootstrapTableNext.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expanded extends StObject {
  
  var expanded: js.UndefOr[js.Array[js.Any]] = js.undefined
}
object Expanded {
  
  @scala.inline
  def apply(): Expanded = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Expanded]
  }
  
  @scala.inline
  implicit class ExpandedMutableBuilder[Self <: Expanded] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpanded(value: js.Array[js.Any]): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    
    @scala.inline
    def setExpandedVarargs(value: js.Any*): Self = StObject.set(x, "expanded", js.Array(value :_*))
  }
}
