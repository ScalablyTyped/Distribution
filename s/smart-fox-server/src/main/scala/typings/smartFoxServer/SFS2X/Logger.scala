package typings.smartFoxServer.SFS2X

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Logger extends StObject {
  
  /**
    * Sets the current logging level.
    * @param {number} level The minimum logging level.
    */
  def setLevel(level: Double): Unit
}
object Logger {
  
  inline def apply(setLevel: Double => Unit): Logger = {
    val __obj = js.Dynamic.literal(setLevel = js.Any.fromFunction1(setLevel))
    __obj.asInstanceOf[Logger]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Logger] (val x: Self) extends AnyVal {
    
    inline def setSetLevel(value: Double => Unit): Self = StObject.set(x, "setLevel", js.Any.fromFunction1(value))
  }
}
