package typings.semanticUiTab.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.Tab.SelectorSettings._Impl, 'tabs'> */
@js.native
trait PickImpltabs extends StObject {
  
  var tabs: String = js.native
}
object PickImpltabs {
  
  @scala.inline
  def apply(tabs: String): PickImpltabs = {
    val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpltabs]
  }
  
  @scala.inline
  implicit class PickImpltabsMutableBuilder[Self <: PickImpltabs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTabs(value: String): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
  }
}
