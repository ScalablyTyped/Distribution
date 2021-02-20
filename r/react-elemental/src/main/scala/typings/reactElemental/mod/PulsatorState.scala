package typings.reactElemental.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PulsatorState extends StObject {
  
  val color: js.Any = js.native
}
object PulsatorState {
  
  @scala.inline
  def apply(color: js.Any): PulsatorState = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[PulsatorState]
  }
  
  @scala.inline
  implicit class PulsatorStateMutableBuilder[Self <: PulsatorState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: js.Any): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
  }
}
