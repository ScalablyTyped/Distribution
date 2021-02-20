package typings.semanticUiProgress.anon

import typings.semanticUiProgress.semanticUiProgressBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.Progress.TextSettings._Impl, 'ratio'> */
@js.native
trait PickImplratio extends StObject {
  
  var ratio: `false` | String = js.native
}
object PickImplratio {
  
  @scala.inline
  def apply(ratio: `false` | String): PickImplratio = {
    val __obj = js.Dynamic.literal(ratio = ratio.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplratio]
  }
  
  @scala.inline
  implicit class PickImplratioMutableBuilder[Self <: PickImplratio] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRatio(value: `false` | String): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
  }
}
