package typings.semanticUiNag.anon

import typings.semanticUiNag.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-nag.SemanticUI.NagSettings._Impl, 'onHide'> */
trait PickImplonHide extends StObject {
  
  def onHide(): Unit
  @JSName("onHide")
  var onHide_Original: js.ThisFunction0[/* this */ JQuery, Unit]
}
object PickImplonHide {
  
  inline def apply(onHide: js.ThisFunction0[/* this */ JQuery, Unit]): PickImplonHide = {
    val __obj = js.Dynamic.literal(onHide = onHide.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonHide]
  }
  
  extension [Self <: PickImplonHide](x: Self) {
    
    inline def setOnHide(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onHide", value.asInstanceOf[js.Any])
  }
}
