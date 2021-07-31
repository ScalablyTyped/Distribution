package typings.reactNavigationCore.anon

import typings.reactNavigationCore.typesMod.EventMapBase
import typings.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type[EventName /* <: Extract[/* keyof EventMap */ String, String] */, EventMap /* <: EventMapBase */] extends StObject {
  
  var target: js.UndefOr[String] = js.undefined
  
  var `type`: EventName
}
object Type {
  
  @scala.inline
  def apply[EventName /* <: Extract[/* keyof EventMap */ String, String] */, EventMap /* <: EventMapBase */](`type`: EventName): Type[EventName, EventMap] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type[EventName, EventMap]]
  }
  
  @scala.inline
  implicit class TypeMutableBuilder[Self <: Type[?, ?], EventName /* <: Extract[/* keyof EventMap */ String, String] */, EventMap /* <: EventMapBase */] (val x: Self & (Type[EventName, EventMap])) extends AnyVal {
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setType(value: EventName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
