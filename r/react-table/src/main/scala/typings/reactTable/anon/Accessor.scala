package typings.reactTable.anon

import typings.reactTable.mod.CellValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Accessor[D /* <: js.Object */] extends StObject {
  
  var accessor: js.UndefOr[typings.reactTable.mod.Accessor[D]] = js.native
}
object Accessor {
  
  @scala.inline
  def apply[D /* <: js.Object */](): Accessor[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Accessor[D]]
  }
  
  @scala.inline
  implicit class AccessorMutableBuilder[Self <: Accessor[_], D /* <: js.Object */] (val x: Self with Accessor[D]) extends AnyVal {
    
    @scala.inline
    def setAccessor(value: (D, /* index */ Double, /* sub */ Data[D]) => CellValue[js.Any]): Self = StObject.set(x, "accessor", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAccessorUndefined: Self = StObject.set(x, "accessor", js.undefined)
  }
}
