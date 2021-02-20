package typings.reactNavigationCore.anon

import typings.reactNavigationRouters.typesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait A[ParamList /* <: ParamListBase */] extends StObject {
  
  var a: ParamList = js.native
  
  var b: /* keyof ParamList */ String = js.native
}
object A {
  
  @scala.inline
  def apply[ParamList /* <: ParamListBase */](a: ParamList, b: /* keyof ParamList */ String): A[ParamList] = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any])
    __obj.asInstanceOf[A[ParamList]]
  }
  
  @scala.inline
  implicit class AMutableBuilder[Self <: A[_], ParamList /* <: ParamListBase */] (val x: Self with A[ParamList]) extends AnyVal {
    
    @scala.inline
    def setA(value: ParamList): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setB(value: /* keyof ParamList */ String): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
  }
}
