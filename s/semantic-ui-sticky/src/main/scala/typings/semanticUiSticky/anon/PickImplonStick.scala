package typings.semanticUiSticky.anon

import typings.semanticUiSticky.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sticky.SemanticUI.StickySettings._Impl, 'onStick'> */
trait PickImplonStick extends StObject {
  
  def onStick(): Unit
  @JSName("onStick")
  var onStick_Original: js.ThisFunction0[/* this */ JQuery, Unit]
}
object PickImplonStick {
  
  inline def apply(onStick: js.ThisFunction0[/* this */ JQuery, Unit]): PickImplonStick = {
    val __obj = js.Dynamic.literal(onStick = onStick.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonStick]
  }
  
  extension [Self <: PickImplonStick](x: Self) {
    
    inline def setOnStick(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onStick", value.asInstanceOf[js.Any])
  }
}
