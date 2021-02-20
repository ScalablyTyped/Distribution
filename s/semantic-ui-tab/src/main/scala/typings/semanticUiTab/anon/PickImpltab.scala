package typings.semanticUiTab.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.Tab.MetadataSettings._Impl, 'tab'> */
@js.native
trait PickImpltab extends StObject {
  
  var tab: String = js.native
}
object PickImpltab {
  
  @scala.inline
  def apply(tab: String): PickImpltab = {
    val __obj = js.Dynamic.literal(tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpltab]
  }
  
  @scala.inline
  implicit class PickImpltabMutableBuilder[Self <: PickImpltab] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTab(value: String): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
  }
}
