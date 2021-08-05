package typings.rbx.anon

import typings.react.mod.ReactType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsTDefaultComponent[TDefaultComponent /* <: ReactType[js.Any] */] extends StObject {
  
  var as: TDefaultComponent
}
object AsTDefaultComponent {
  
  inline def apply[TDefaultComponent /* <: ReactType[js.Any] */](as: TDefaultComponent): AsTDefaultComponent[TDefaultComponent] = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsTDefaultComponent[TDefaultComponent]]
  }
  
  extension [Self <: AsTDefaultComponent[?], TDefaultComponent /* <: ReactType[js.Any] */](x: Self & AsTDefaultComponent[TDefaultComponent]) {
    
    inline def setAs(value: TDefaultComponent): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
  }
}
