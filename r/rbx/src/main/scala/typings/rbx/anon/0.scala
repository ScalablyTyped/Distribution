package typings.rbx.anon

import typings.react.mod.ReactType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0`[TDefaultComponent /* <: ReactType[js.Any] */] extends StObject {
  
  var as: TDefaultComponent
}
object `0` {
  
  @scala.inline
  def apply[TDefaultComponent /* <: ReactType[js.Any] */](as: TDefaultComponent): `0`[TDefaultComponent] = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`[TDefaultComponent]]
  }
  
  @scala.inline
  implicit class `0MutableBuilder`[Self <: `0`[?], TDefaultComponent /* <: ReactType[js.Any] */] (val x: Self & `0`[TDefaultComponent]) extends AnyVal {
    
    @scala.inline
    def setAs(value: TDefaultComponent): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
  }
}
