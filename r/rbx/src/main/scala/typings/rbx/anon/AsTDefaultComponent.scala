package typings.rbx.anon

import typings.react.mod.ReactType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsTDefaultComponent[TDefaultComponent /* <: ReactType[js.Any] */] extends StObject {
  
  var as: TDefaultComponent
}
object AsTDefaultComponent {
  
  @scala.inline
  def apply[TDefaultComponent /* <: ReactType[js.Any] */](as: TDefaultComponent): AsTDefaultComponent[TDefaultComponent] = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsTDefaultComponent[TDefaultComponent]]
  }
  
  @scala.inline
  implicit class AsTDefaultComponentMutableBuilder[Self <: AsTDefaultComponent[?], TDefaultComponent /* <: ReactType[js.Any] */] (val x: Self & AsTDefaultComponent[TDefaultComponent]) extends AnyVal {
    
    @scala.inline
    def setAs(value: TDefaultComponent): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
  }
}
