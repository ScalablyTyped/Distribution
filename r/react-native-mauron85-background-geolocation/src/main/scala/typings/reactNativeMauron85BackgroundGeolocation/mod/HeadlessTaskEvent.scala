package typings.reactNativeMauron85BackgroundGeolocation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeadlessTaskEvent extends StObject {
  
  /** Name of the event [ "location", "stationary", "activity" ] */
  var name: HeadlessTaskEventName = js.native
  
  /** Event parameters. */
  var params: js.Any = js.native
}
object HeadlessTaskEvent {
  
  @scala.inline
  def apply(name: HeadlessTaskEventName, params: js.Any): HeadlessTaskEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadlessTaskEvent]
  }
  
  @scala.inline
  implicit class HeadlessTaskEventMutableBuilder[Self <: HeadlessTaskEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: HeadlessTaskEventName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
