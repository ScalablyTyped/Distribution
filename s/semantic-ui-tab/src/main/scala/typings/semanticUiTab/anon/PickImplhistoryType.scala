package typings.semanticUiTab.anon

import typings.semanticUiTab.semanticUiTabStrings.hash
import typings.semanticUiTab.semanticUiTabStrings.state
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.TabSettings._Impl, 'historyType'> */
@js.native
trait PickImplhistoryType extends StObject {
  
  var historyType: hash | state = js.native
}
object PickImplhistoryType {
  
  @scala.inline
  def apply(historyType: hash | state): PickImplhistoryType = {
    val __obj = js.Dynamic.literal(historyType = historyType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplhistoryType]
  }
  
  @scala.inline
  implicit class PickImplhistoryTypeMutableBuilder[Self <: PickImplhistoryType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHistoryType(value: hash | state): Self = StObject.set(x, "historyType", value.asInstanceOf[js.Any])
  }
}
