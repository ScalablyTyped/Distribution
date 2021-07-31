package typings.semanticUiTab.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.TabSettings._Impl, 'history'> */
trait PickImplhistory extends StObject {
  
  var history: Boolean
}
object PickImplhistory {
  
  @scala.inline
  def apply(history: Boolean): PickImplhistory = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplhistory]
  }
  
  @scala.inline
  implicit class PickImplhistoryMutableBuilder[Self <: PickImplhistory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHistory(value: Boolean): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
  }
}
