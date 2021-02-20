package typings.semanticUiPopup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, 'maxSearchDepth'> */
@js.native
trait PickImplmaxSearchDepth extends StObject {
  
  var maxSearchDepth: Double = js.native
}
object PickImplmaxSearchDepth {
  
  @scala.inline
  def apply(maxSearchDepth: Double): PickImplmaxSearchDepth = {
    val __obj = js.Dynamic.literal(maxSearchDepth = maxSearchDepth.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmaxSearchDepth]
  }
  
  @scala.inline
  implicit class PickImplmaxSearchDepthMutableBuilder[Self <: PickImplmaxSearchDepth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxSearchDepth(value: Double): Self = StObject.set(x, "maxSearchDepth", value.asInstanceOf[js.Any])
  }
}
