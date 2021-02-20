package typings.rbx.anon

import typings.react.mod.ReactType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `0`[TDefaultComponent /* <: ReactType[_] */] extends StObject {
  
  var as: TDefaultComponent = js.native
}
object `0` {
  
  @scala.inline
  def apply[TDefaultComponent /* <: ReactType[_] */](as: TDefaultComponent): `0`[TDefaultComponent] = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`[TDefaultComponent]]
  }
  
  @scala.inline
  implicit class `0MutableBuilder`[Self <: `0`[_], TDefaultComponent /* <: ReactType[_] */] (val x: Self with `0`[TDefaultComponent]) extends AnyVal {
    
    @scala.inline
    def setAs(value: TDefaultComponent): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
  }
}
