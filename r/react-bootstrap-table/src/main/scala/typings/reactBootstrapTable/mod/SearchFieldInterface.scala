package typings.reactBootstrapTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchFieldInterface extends StObject {
  
  /**
    * getValue should return the current search text.
    */
  def getValue(): String
  
  /**
    * setValue should update the current search text to the given value.
    */
  def setValue(search: String): Unit
}
object SearchFieldInterface {
  
  inline def apply(getValue: () => String, setValue: String => Unit): SearchFieldInterface = {
    val __obj = js.Dynamic.literal(getValue = js.Any.fromFunction0(getValue), setValue = js.Any.fromFunction1(setValue))
    __obj.asInstanceOf[SearchFieldInterface]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchFieldInterface] (val x: Self) extends AnyVal {
    
    inline def setGetValue(value: () => String): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    
    inline def setSetValue(value: String => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
  }
}
