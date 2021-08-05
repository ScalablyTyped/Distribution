package typings.semanticUiShape.anon

import typings.semanticUiShape.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-shape.SemanticUI.ShapeSettings._Impl, 'onChange'> */
trait PickImplonChange extends StObject {
  
  def onChange(): Unit
  @JSName("onChange")
  var onChange_Original: js.ThisFunction0[/* this */ JQuery, Unit]
}
object PickImplonChange {
  
  inline def apply(onChange: js.ThisFunction0[/* this */ JQuery, Unit]): PickImplonChange = {
    val __obj = js.Dynamic.literal(onChange = onChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonChange]
  }
  
  extension [Self <: PickImplonChange](x: Self) {
    
    inline def setOnChange(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
  }
}
