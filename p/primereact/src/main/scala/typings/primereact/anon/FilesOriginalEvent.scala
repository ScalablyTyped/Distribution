package typings.primereact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilesOriginalEvent extends StObject {
  
  var files: js.Any = js.native
  
  var originalEvent: typings.std.Event = js.native
}
object FilesOriginalEvent {
  
  @scala.inline
  def apply(files: js.Any, originalEvent: typings.std.Event): FilesOriginalEvent = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilesOriginalEvent]
  }
  
  @scala.inline
  implicit class FilesOriginalEventMutableBuilder[Self <: FilesOriginalEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFiles(value: js.Any): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalEvent(value: typings.std.Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
  }
}
