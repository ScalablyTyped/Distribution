package typings.semanticUiProgress.anon

import typings.semanticUiProgress.semanticUiProgressBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.Progress.TextSettings._Impl, 'percent'> */
@js.native
trait PickImplpercent extends StObject {
  
  var percent: `false` | String = js.native
}
object PickImplpercent {
  
  @scala.inline
  def apply(percent: `false` | String): PickImplpercent = {
    val __obj = js.Dynamic.literal(percent = percent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpercent]
  }
  
  @scala.inline
  implicit class PickImplpercentMutableBuilder[Self <: PickImplpercent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPercent(value: `false` | String): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
  }
}
