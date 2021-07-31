package typings.semanticUiSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.SearchSettings._Impl, 'hideDelay'> */
trait PickImplhideDelay extends StObject {
  
  var hideDelay: Double
}
object PickImplhideDelay {
  
  @scala.inline
  def apply(hideDelay: Double): PickImplhideDelay = {
    val __obj = js.Dynamic.literal(hideDelay = hideDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplhideDelay]
  }
  
  @scala.inline
  implicit class PickImplhideDelayMutableBuilder[Self <: PickImplhideDelay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHideDelay(value: Double): Self = StObject.set(x, "hideDelay", value.asInstanceOf[js.Any])
  }
}
