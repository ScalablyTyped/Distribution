package typings.semanticUiProgress.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.Progress.MetadataSettings._Impl, 'total'> */
trait PickImpltotalTotal extends StObject {
  
  var total: String
}
object PickImpltotalTotal {
  
  @scala.inline
  def apply(total: String): PickImpltotalTotal = {
    val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpltotalTotal]
  }
  
  @scala.inline
  implicit class PickImpltotalTotalMutableBuilder[Self <: PickImpltotalTotal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTotal(value: String): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
