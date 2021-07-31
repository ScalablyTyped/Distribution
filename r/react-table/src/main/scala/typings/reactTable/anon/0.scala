package typings.reactTable.anon

import typings.reactTable.mod.IdType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0`[D /* <: js.Object */] extends StObject {
  
  var accessor: IdType[D]
}
object `0` {
  
  @scala.inline
  def apply[D /* <: js.Object */](accessor: IdType[D]): `0`[D] = {
    val __obj = js.Dynamic.literal(accessor = accessor.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`[D]]
  }
  
  @scala.inline
  implicit class `0MutableBuilder`[Self <: `0`[?], D /* <: js.Object */] (val x: Self & `0`[D]) extends AnyVal {
    
    @scala.inline
    def setAccessor(value: IdType[D]): Self = StObject.set(x, "accessor", value.asInstanceOf[js.Any])
  }
}
