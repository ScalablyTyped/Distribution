package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NxGroupTail extends StObject {
  
  var qDown: Double = js.native
  
  var qUp: Double = js.native
}
object NxGroupTail {
  
  @scala.inline
  def apply(qDown: Double, qUp: Double): NxGroupTail = {
    val __obj = js.Dynamic.literal(qDown = qDown.asInstanceOf[js.Any], qUp = qUp.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxGroupTail]
  }
  
  @scala.inline
  implicit class NxGroupTailMutableBuilder[Self <: NxGroupTail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQDown(value: Double): Self = StObject.set(x, "qDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQUp(value: Double): Self = StObject.set(x, "qUp", value.asInstanceOf[js.Any])
  }
}
