package typings.semanticUiProgress.anon

import typings.semanticUiProgress.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.ProgressSettings._Impl, 'onActive'> */
trait PickImplonActive extends StObject {
  
  def onActive(value: Double, total: Double): Unit
  @JSName("onActive")
  var onActive_Original: js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit]
}
object PickImplonActive {
  
  inline def apply(onActive: js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit]): PickImplonActive = {
    val __obj = js.Dynamic.literal(onActive = onActive.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonActive]
  }
  
  extension [Self <: PickImplonActive](x: Self) {
    
    inline def setOnActive(value: js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit]): Self = StObject.set(x, "onActive", value.asInstanceOf[js.Any])
  }
}
