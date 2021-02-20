package typings.reactNavigationCore.anon

import typings.reactNavigationCore.typesMod.EventMapBase
import typings.reactNavigationRouters.typesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait B[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */, EventMap /* <: EventMapBase */] extends StObject {
  
  var a: ParamList = js.native
  
  var b: RouteName = js.native
  
  var c: EventMap = js.native
}
object B {
  
  @scala.inline
  def apply[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */, EventMap /* <: EventMapBase */](a: ParamList, b: RouteName, c: EventMap): B[ParamList, RouteName, EventMap] = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any])
    __obj.asInstanceOf[B[ParamList, RouteName, EventMap]]
  }
  
  @scala.inline
  implicit class BMutableBuilder[Self <: B[_, _, _], ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */, EventMap /* <: EventMapBase */] (val x: Self with (B[ParamList, RouteName, EventMap])) extends AnyVal {
    
    @scala.inline
    def setA(value: ParamList): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setB(value: RouteName): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setC(value: EventMap): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
  }
}
