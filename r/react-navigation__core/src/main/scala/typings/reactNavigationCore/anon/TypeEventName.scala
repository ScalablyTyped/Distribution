package typings.reactNavigationCore.anon

import typings.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeEventName[EventName /* <: Extract[/* keyof {} */ String, String] */] extends StObject {
  
  var target: js.UndefOr[String] = js.undefined
  
  var `type`: EventName
}
object TypeEventName {
  
  @scala.inline
  def apply[EventName /* <: Extract[/* keyof {} */ String, String] */](`type`: EventName): TypeEventName[EventName] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeEventName[EventName]]
  }
  
  @scala.inline
  implicit class TypeEventNameMutableBuilder[Self <: TypeEventName[?], EventName /* <: Extract[/* keyof {} */ String, String] */] (val x: Self & TypeEventName[EventName]) extends AnyVal {
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setType(value: EventName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
