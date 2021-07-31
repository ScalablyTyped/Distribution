package typings.semanticUiTab.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.Tab.ErrorSettings._Impl, 'missingTab'> */
trait PickImplmissingTab extends StObject {
  
  var missingTab: String
}
object PickImplmissingTab {
  
  @scala.inline
  def apply(missingTab: String): PickImplmissingTab = {
    val __obj = js.Dynamic.literal(missingTab = missingTab.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmissingTab]
  }
  
  @scala.inline
  implicit class PickImplmissingTabMutableBuilder[Self <: PickImplmissingTab] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMissingTab(value: String): Self = StObject.set(x, "missingTab", value.asInstanceOf[js.Any])
  }
}
