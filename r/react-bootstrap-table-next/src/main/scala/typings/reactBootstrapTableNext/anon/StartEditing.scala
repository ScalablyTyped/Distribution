package typings.reactBootstrapTableNext.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartEditing extends StObject {
  
  def startEditing(rowIndex: Double, columnIndex: Double): Unit
}
object StartEditing {
  
  inline def apply(startEditing: (Double, Double) => Unit): StartEditing = {
    val __obj = js.Dynamic.literal(startEditing = js.Any.fromFunction2(startEditing))
    __obj.asInstanceOf[StartEditing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartEditing] (val x: Self) extends AnyVal {
    
    inline def setStartEditing(value: (Double, Double) => Unit): Self = StObject.set(x, "startEditing", js.Any.fromFunction2(value))
  }
}
