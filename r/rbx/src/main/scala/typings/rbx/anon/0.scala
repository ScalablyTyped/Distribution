package typings.rbx.anon

import typings.react.mod.ReactType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0`[TDefaultComponent /* <: ReactType[js.Any] */] extends StObject {
  
  var as: TDefaultComponent
}
object `0` {
  
  inline def apply[TDefaultComponent /* <: ReactType[js.Any] */](as: TDefaultComponent): `0`[TDefaultComponent] = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`[TDefaultComponent]]
  }
  
  extension [Self <: `0`[?], TDefaultComponent /* <: ReactType[js.Any] */](x: Self & `0`[TDefaultComponent]) {
    
    inline def setAs(value: TDefaultComponent): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
  }
}
