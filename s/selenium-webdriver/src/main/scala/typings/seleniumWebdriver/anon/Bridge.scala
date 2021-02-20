package typings.seleniumWebdriver.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bridge extends StObject {
  
  var bridge: Boolean = js.native
}
object Bridge {
  
  @scala.inline
  def apply(bridge: Boolean): Bridge = {
    val __obj = js.Dynamic.literal(bridge = bridge.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bridge]
  }
  
  @scala.inline
  implicit class BridgeMutableBuilder[Self <: Bridge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBridge(value: Boolean): Self = StObject.set(x, "bridge", value.asInstanceOf[js.Any])
  }
}
