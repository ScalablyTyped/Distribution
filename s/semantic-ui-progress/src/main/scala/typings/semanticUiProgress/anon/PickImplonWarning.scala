package typings.semanticUiProgress.anon

import typings.semanticUiProgress.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.ProgressSettings._Impl, 'onWarning'> */
trait PickImplonWarning extends StObject {
  
  def onWarning(value: Double, total: Double): Unit
  @JSName("onWarning")
  var onWarning_Original: js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit]
}
object PickImplonWarning {
  
  inline def apply(onWarning: js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit]): PickImplonWarning = {
    val __obj = js.Dynamic.literal(onWarning = onWarning.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonWarning]
  }
  
  extension [Self <: PickImplonWarning](x: Self) {
    
    inline def setOnWarning(value: js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit]): Self = StObject.set(x, "onWarning", value.asInstanceOf[js.Any])
  }
}
