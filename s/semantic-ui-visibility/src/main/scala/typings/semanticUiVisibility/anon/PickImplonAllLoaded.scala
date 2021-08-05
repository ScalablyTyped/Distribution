package typings.semanticUiVisibility.anon

import typings.semanticUiVisibility.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, 'onAllLoaded'> */
trait PickImplonAllLoaded extends StObject {
  
  def onAllLoaded(): Unit
  @JSName("onAllLoaded")
  var onAllLoaded_Original: js.ThisFunction0[/* this */ JQuery, Unit]
}
object PickImplonAllLoaded {
  
  inline def apply(onAllLoaded: js.ThisFunction0[/* this */ JQuery, Unit]): PickImplonAllLoaded = {
    val __obj = js.Dynamic.literal(onAllLoaded = onAllLoaded.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonAllLoaded]
  }
  
  extension [Self <: PickImplonAllLoaded](x: Self) {
    
    inline def setOnAllLoaded(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onAllLoaded", value.asInstanceOf[js.Any])
  }
}
