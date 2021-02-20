package typings.reactNative.mod.Animated

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndResult extends StObject {
  
  var finished: Boolean = js.native
}
object EndResult {
  
  @scala.inline
  def apply(finished: Boolean): EndResult = {
    val __obj = js.Dynamic.literal(finished = finished.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndResult]
  }
  
  @scala.inline
  implicit class EndResultMutableBuilder[Self <: EndResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFinished(value: Boolean): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
  }
}
