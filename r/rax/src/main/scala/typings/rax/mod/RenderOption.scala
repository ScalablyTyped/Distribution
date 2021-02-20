package typings.rax.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderOption extends StObject {
  
  var driver: js.Any = js.native
}
object RenderOption {
  
  @scala.inline
  def apply(driver: js.Any): RenderOption = {
    val __obj = js.Dynamic.literal(driver = driver.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderOption]
  }
  
  @scala.inline
  implicit class RenderOptionMutableBuilder[Self <: RenderOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDriver(value: js.Any): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
  }
}
