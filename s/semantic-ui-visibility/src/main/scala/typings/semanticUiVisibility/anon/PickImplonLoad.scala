package typings.semanticUiVisibility.anon

import typings.semanticUiVisibility.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, 'onLoad'> */
trait PickImplonLoad extends StObject {
  
  def onLoad(): Unit
  @JSName("onLoad")
  var onLoad_Original: js.ThisFunction0[/* this */ JQuery, Unit]
}
object PickImplonLoad {
  
  inline def apply(onLoad: js.ThisFunction0[/* this */ JQuery, Unit]): PickImplonLoad = {
    val __obj = js.Dynamic.literal(onLoad = onLoad.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonLoad]
  }
  
  extension [Self <: PickImplonLoad](x: Self) {
    
    inline def setOnLoad(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onLoad", value.asInstanceOf[js.Any])
  }
}
