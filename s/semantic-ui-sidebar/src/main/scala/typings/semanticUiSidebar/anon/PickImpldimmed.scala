package typings.semanticUiSidebar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.ClassNameSettings._Impl, 'dimmed'> */
@js.native
trait PickImpldimmed extends StObject {
  
  var dimmed: String = js.native
}
object PickImpldimmed {
  
  @scala.inline
  def apply(dimmed: String): PickImpldimmed = {
    val __obj = js.Dynamic.literal(dimmed = dimmed.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldimmed]
  }
  
  @scala.inline
  implicit class PickImpldimmedMutableBuilder[Self <: PickImpldimmed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimmed(value: String): Self = StObject.set(x, "dimmed", value.asInstanceOf[js.Any])
  }
}
