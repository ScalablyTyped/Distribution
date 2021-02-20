package typings.semanticUiProgress.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.ProgressSettings._Impl, 'performance'> */
@js.native
trait PickImplperformance extends StObject {
  
  var performance: Boolean = js.native
}
object PickImplperformance {
  
  @scala.inline
  def apply(performance: Boolean): PickImplperformance = {
    val __obj = js.Dynamic.literal(performance = performance.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplperformance]
  }
  
  @scala.inline
  implicit class PickImplperformanceMutableBuilder[Self <: PickImplperformance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
  }
}
