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
  
  @scala.inline
  def apply(onWarning: js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit]): PickImplonWarning = {
    val __obj = js.Dynamic.literal(onWarning = onWarning.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonWarning]
  }
  
  @scala.inline
  implicit class PickImplonWarningMutableBuilder[Self <: PickImplonWarning] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnWarning(value: js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit]): Self = StObject.set(x, "onWarning", value.asInstanceOf[js.Any])
  }
}
