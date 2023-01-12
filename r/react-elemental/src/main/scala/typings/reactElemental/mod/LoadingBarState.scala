package typings.reactElemental.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadingBarState extends StObject {
  
  val position: Double
}
object LoadingBarState {
  
  inline def apply(position: Double): LoadingBarState = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadingBarState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoadingBarState] (val x: Self) extends AnyVal {
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
