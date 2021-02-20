package typings.seleniumWebdriver.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Async extends StObject {
  
  var async: Boolean = js.native
  
  var bridge: Boolean = js.native
}
object Async {
  
  @scala.inline
  def apply(async: Boolean, bridge: Boolean): Async = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], bridge = bridge.asInstanceOf[js.Any])
    __obj.asInstanceOf[Async]
  }
  
  @scala.inline
  implicit class AsyncMutableBuilder[Self <: Async] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBridge(value: Boolean): Self = StObject.set(x, "bridge", value.asInstanceOf[js.Any])
  }
}
