package typings.smartFoxServer.SFS2X

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPING_PONG extends StObject {
  
  var lagValue: Double = js.native
}
object IPING_PONG {
  
  @scala.inline
  def apply(lagValue: Double): IPING_PONG = {
    val __obj = js.Dynamic.literal(lagValue = lagValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPING_PONG]
  }
  
  @scala.inline
  implicit class IPING_PONGMutableBuilder[Self <: IPING_PONG] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLagValue(value: Double): Self = StObject.set(x, "lagValue", value.asInstanceOf[js.Any])
  }
}
