package typings.scrivito.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Menu extends StObject {
  
  def insert(params: MenuInsertParameters): Unit
  
  def modify(params: MenuModifyParameters): Unit
  
  def remove(id: String): Unit
}
object Menu {
  
  inline def apply(insert: MenuInsertParameters => Unit, modify: MenuModifyParameters => Unit, remove: String => Unit): Menu = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert), modify = js.Any.fromFunction1(modify), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[Menu]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Menu] (val x: Self) extends AnyVal {
    
    inline def setInsert(value: MenuInsertParameters => Unit): Self = StObject.set(x, "insert", js.Any.fromFunction1(value))
    
    inline def setModify(value: MenuModifyParameters => Unit): Self = StObject.set(x, "modify", js.Any.fromFunction1(value))
    
    inline def setRemove(value: String => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
  }
}
