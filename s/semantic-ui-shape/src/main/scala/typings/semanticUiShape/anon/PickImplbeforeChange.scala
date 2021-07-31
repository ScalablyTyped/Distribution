package typings.semanticUiShape.anon

import typings.semanticUiShape.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-shape.SemanticUI.ShapeSettings._Impl, 'beforeChange'> */
trait PickImplbeforeChange extends StObject {
  
  def beforeChange(): Unit
  @JSName("beforeChange")
  var beforeChange_Original: js.ThisFunction0[/* this */ JQuery, Unit]
}
object PickImplbeforeChange {
  
  @scala.inline
  def apply(beforeChange: js.ThisFunction0[/* this */ JQuery, Unit]): PickImplbeforeChange = {
    val __obj = js.Dynamic.literal(beforeChange = beforeChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplbeforeChange]
  }
  
  @scala.inline
  implicit class PickImplbeforeChangeMutableBuilder[Self <: PickImplbeforeChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeforeChange(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "beforeChange", value.asInstanceOf[js.Any])
  }
}
