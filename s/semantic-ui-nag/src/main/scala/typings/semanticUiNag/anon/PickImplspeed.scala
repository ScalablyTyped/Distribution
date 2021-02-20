package typings.semanticUiNag.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-nag.SemanticUI.NagSettings._Impl, 'speed'> */
@js.native
trait PickImplspeed extends StObject {
  
  var speed: Double = js.native
}
object PickImplspeed {
  
  @scala.inline
  def apply(speed: Double): PickImplspeed = {
    val __obj = js.Dynamic.literal(speed = speed.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplspeed]
  }
  
  @scala.inline
  implicit class PickImplspeedMutableBuilder[Self <: PickImplspeed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
  }
}
