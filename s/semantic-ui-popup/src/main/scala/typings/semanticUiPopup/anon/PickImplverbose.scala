package typings.semanticUiPopup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, 'verbose'> */
trait PickImplverbose extends StObject {
  
  var verbose: Boolean
}
object PickImplverbose {
  
  inline def apply(verbose: Boolean): PickImplverbose = {
    val __obj = js.Dynamic.literal(verbose = verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplverbose]
  }
  
  extension [Self <: PickImplverbose](x: Self) {
    
    inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
  }
}
