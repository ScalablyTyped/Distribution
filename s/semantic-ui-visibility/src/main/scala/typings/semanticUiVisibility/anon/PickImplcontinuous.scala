package typings.semanticUiVisibility.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, 'continuous'> */
@js.native
trait PickImplcontinuous extends StObject {
  
  var continuous: Boolean = js.native
}
object PickImplcontinuous {
  
  @scala.inline
  def apply(continuous: Boolean): PickImplcontinuous = {
    val __obj = js.Dynamic.literal(continuous = continuous.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcontinuous]
  }
  
  @scala.inline
  implicit class PickImplcontinuousMutableBuilder[Self <: PickImplcontinuous] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContinuous(value: Boolean): Self = StObject.set(x, "continuous", value.asInstanceOf[js.Any])
  }
}
