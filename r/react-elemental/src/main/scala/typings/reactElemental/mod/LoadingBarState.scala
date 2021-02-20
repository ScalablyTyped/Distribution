package typings.reactElemental.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadingBarState extends StObject {
  
  val position: Double = js.native
}
object LoadingBarState {
  
  @scala.inline
  def apply(position: Double): LoadingBarState = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadingBarState]
  }
  
  @scala.inline
  implicit class LoadingBarStateMutableBuilder[Self <: LoadingBarState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
