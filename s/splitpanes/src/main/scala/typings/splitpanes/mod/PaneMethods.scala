package typings.splitpanes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaneMethods extends StObject {
  
  def update(style: Any): Unit
}
object PaneMethods {
  
  inline def apply(update: Any => Unit): PaneMethods = {
    val __obj = js.Dynamic.literal(update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[PaneMethods]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaneMethods] (val x: Self) extends AnyVal {
    
    inline def setUpdate(value: Any => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
  }
}
