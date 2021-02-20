package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbortSignalEventMap extends StObject {
  
  var abort: Event = js.native
}
object AbortSignalEventMap {
  
  @scala.inline
  def apply(abort: Event): AbortSignalEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbortSignalEventMap]
  }
  
  @scala.inline
  implicit class AbortSignalEventMapMutableBuilder[Self <: AbortSignalEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbort(value: Event): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
  }
}
