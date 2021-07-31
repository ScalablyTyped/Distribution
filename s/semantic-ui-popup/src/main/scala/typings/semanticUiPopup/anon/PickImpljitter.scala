package typings.semanticUiPopup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, 'jitter'> */
trait PickImpljitter extends StObject {
  
  var jitter: Double
}
object PickImpljitter {
  
  @scala.inline
  def apply(jitter: Double): PickImpljitter = {
    val __obj = js.Dynamic.literal(jitter = jitter.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpljitter]
  }
  
  @scala.inline
  implicit class PickImpljitterMutableBuilder[Self <: PickImpljitter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJitter(value: Double): Self = StObject.set(x, "jitter", value.asInstanceOf[js.Any])
  }
}
