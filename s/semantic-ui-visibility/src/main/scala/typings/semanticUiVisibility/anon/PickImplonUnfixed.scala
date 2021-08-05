package typings.semanticUiVisibility.anon

import typings.semanticUiVisibility.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, 'onUnfixed'> */
trait PickImplonUnfixed extends StObject {
  
  def onUnfixed(): Unit
  @JSName("onUnfixed")
  var onUnfixed_Original: js.ThisFunction0[/* this */ JQuery, Unit]
}
object PickImplonUnfixed {
  
  inline def apply(onUnfixed: js.ThisFunction0[/* this */ JQuery, Unit]): PickImplonUnfixed = {
    val __obj = js.Dynamic.literal(onUnfixed = onUnfixed.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonUnfixed]
  }
  
  extension [Self <: PickImplonUnfixed](x: Self) {
    
    inline def setOnUnfixed(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onUnfixed", value.asInstanceOf[js.Any])
  }
}
