package typings.semanticUiVisibility.anon

import typings.semanticUiVisibility.JQuery
import typings.semanticUiVisibility.SemanticUI.Visibility.ElementCalculations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, 'onUpdate'> */
trait PickImplonUpdate extends StObject {
  
  def onUpdate(calculations: ElementCalculations): Unit
  @JSName("onUpdate")
  var onUpdate_Original: js.ThisFunction1[/* this */ JQuery, /* calculations */ ElementCalculations, Unit]
}
object PickImplonUpdate {
  
  inline def apply(onUpdate: js.ThisFunction1[/* this */ JQuery, /* calculations */ ElementCalculations, Unit]): PickImplonUpdate = {
    val __obj = js.Dynamic.literal(onUpdate = onUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonUpdate]
  }
  
  extension [Self <: PickImplonUpdate](x: Self) {
    
    inline def setOnUpdate(value: js.ThisFunction1[/* this */ JQuery, /* calculations */ ElementCalculations, Unit]): Self = StObject.set(x, "onUpdate", value.asInstanceOf[js.Any])
  }
}
