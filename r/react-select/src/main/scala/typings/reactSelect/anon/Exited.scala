package typings.reactSelect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Exited extends StObject {
  
  var exited: js.Any
  
  var exiting: js.Any
}
object Exited {
  
  @scala.inline
  def apply(exited: js.Any, exiting: js.Any): Exited = {
    val __obj = js.Dynamic.literal(exited = exited.asInstanceOf[js.Any], exiting = exiting.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exited]
  }
  
  @scala.inline
  implicit class ExitedMutableBuilder[Self <: Exited] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExited(value: js.Any): Self = StObject.set(x, "exited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExiting(value: js.Any): Self = StObject.set(x, "exiting", value.asInstanceOf[js.Any])
  }
}
