package typings.semanticUiProgress.anon

import typings.semanticUiProgress.semanticUiProgressBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.ProgressSettings._Impl, 'total'> */
@js.native
trait PickImpltotal extends StObject {
  
  var total: `false` | Double = js.native
}
object PickImpltotal {
  
  @scala.inline
  def apply(total: `false` | Double): PickImpltotal = {
    val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpltotal]
  }
  
  @scala.inline
  implicit class PickImpltotalMutableBuilder[Self <: PickImpltotal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTotal(value: `false` | Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
