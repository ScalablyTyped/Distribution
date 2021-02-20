package typings.rbx.anon

import typings.react.mod.ReactType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsTDefaultComponent[TDefaultComponent /* <: ReactType[_] */] extends StObject {
  
  var as: TDefaultComponent = js.native
}
object AsTDefaultComponent {
  
  @scala.inline
  def apply[TDefaultComponent /* <: ReactType[_] */](as: TDefaultComponent): AsTDefaultComponent[TDefaultComponent] = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsTDefaultComponent[TDefaultComponent]]
  }
  
  @scala.inline
  implicit class AsTDefaultComponentMutableBuilder[Self <: AsTDefaultComponent[_], TDefaultComponent /* <: ReactType[_] */] (val x: Self with AsTDefaultComponent[TDefaultComponent]) extends AnyVal {
    
    @scala.inline
    def setAs(value: TDefaultComponent): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
  }
}
