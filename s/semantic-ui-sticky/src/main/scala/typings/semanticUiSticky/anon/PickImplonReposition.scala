package typings.semanticUiSticky.anon

import typings.semanticUiSticky.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sticky.SemanticUI.StickySettings._Impl, 'onReposition'> */
trait PickImplonReposition extends StObject {
  
  def onReposition(): Unit
  @JSName("onReposition")
  var onReposition_Original: js.ThisFunction0[/* this */ JQuery, Unit]
}
object PickImplonReposition {
  
  @scala.inline
  def apply(onReposition: js.ThisFunction0[/* this */ JQuery, Unit]): PickImplonReposition = {
    val __obj = js.Dynamic.literal(onReposition = onReposition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonReposition]
  }
  
  @scala.inline
  implicit class PickImplonRepositionMutableBuilder[Self <: PickImplonReposition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnReposition(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onReposition", value.asInstanceOf[js.Any])
  }
}
