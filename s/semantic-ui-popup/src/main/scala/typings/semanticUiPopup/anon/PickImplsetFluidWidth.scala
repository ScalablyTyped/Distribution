package typings.semanticUiPopup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, 'setFluidWidth'> */
trait PickImplsetFluidWidth extends StObject {
  
  var setFluidWidth: Boolean
}
object PickImplsetFluidWidth {
  
  inline def apply(setFluidWidth: Boolean): PickImplsetFluidWidth = {
    val __obj = js.Dynamic.literal(setFluidWidth = setFluidWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsetFluidWidth]
  }
  
  extension [Self <: PickImplsetFluidWidth](x: Self) {
    
    inline def setSetFluidWidth(value: Boolean): Self = StObject.set(x, "setFluidWidth", value.asInstanceOf[js.Any])
  }
}
