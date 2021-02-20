package typings.semanticUiProgress.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.Progress.SelectorSettings._Impl, 'bar'> */
@js.native
trait PickImplbar extends StObject {
  
  var bar: String = js.native
}
object PickImplbar {
  
  @scala.inline
  def apply(bar: String): PickImplbar = {
    val __obj = js.Dynamic.literal(bar = bar.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplbar]
  }
  
  @scala.inline
  implicit class PickImplbarMutableBuilder[Self <: PickImplbar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBar(value: String): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
  }
}
