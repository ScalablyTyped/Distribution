package typings.reactBootstrapTableNext.anon

import typings.reactBootstrapTableNext.mod.ColumnDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnClick[T /* <: js.Object */, E] extends StObject {
  
  def onClick(e: js.Any, column: ColumnDescription[T, E], columnIndex: Double): Unit = js.native
}
object OnClick {
  
  @scala.inline
  def apply[T /* <: js.Object */, E](onClick: (js.Any, ColumnDescription[T, E], Double) => Unit): OnClick[T, E] = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction3(onClick))
    __obj.asInstanceOf[OnClick[T, E]]
  }
  
  @scala.inline
  implicit class OnClickMutableBuilder[Self <: OnClick[_, _], T /* <: js.Object */, E] (val x: Self with (OnClick[T, E])) extends AnyVal {
    
    @scala.inline
    def setOnClick(value: (js.Any, ColumnDescription[T, E], Double) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction3(value))
  }
}
