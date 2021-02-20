package typings.reactNavigationCore.anon

import typings.std.Extract
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetTypeEventName[EventName /* <: Extract[/* keyof T */ String, String] */, T /* <: Record[String, _] */] extends StObject {
  
  var target: js.UndefOr[String] = js.native
  
  var `type`: EventName = js.native
}
object TargetTypeEventName {
  
  @scala.inline
  def apply[EventName /* <: Extract[/* keyof T */ String, String] */, T /* <: Record[String, _] */](`type`: EventName): TargetTypeEventName[EventName, T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetTypeEventName[EventName, T]]
  }
  
  @scala.inline
  implicit class TargetTypeEventNameMutableBuilder[Self <: TargetTypeEventName[_, _], EventName /* <: Extract[/* keyof T */ String, String] */, T /* <: Record[String, _] */] (val x: Self with (TargetTypeEventName[EventName, T])) extends AnyVal {
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setType(value: EventName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
