package typings.semanticUiProgress.anon

import typings.semanticUiProgress.semanticUiProgressBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.Progress.TextSettings._Impl, 'warning'> */
trait PickImplwarning extends StObject {
  
  var warning: `false` | String
}
object PickImplwarning {
  
  @scala.inline
  def apply(warning: `false` | String): PickImplwarning = {
    val __obj = js.Dynamic.literal(warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplwarning]
  }
  
  @scala.inline
  implicit class PickImplwarningMutableBuilder[Self <: PickImplwarning] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWarning(value: `false` | String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
  }
}
