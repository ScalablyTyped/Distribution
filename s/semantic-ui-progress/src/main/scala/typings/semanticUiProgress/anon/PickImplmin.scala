package typings.semanticUiProgress.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.Progress.RandomSettings._Impl, 'min'> */
@js.native
trait PickImplmin extends StObject {
  
  var min: Double = js.native
}
object PickImplmin {
  
  @scala.inline
  def apply(min: Double): PickImplmin = {
    val __obj = js.Dynamic.literal(min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmin]
  }
  
  @scala.inline
  implicit class PickImplminMutableBuilder[Self <: PickImplmin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}
