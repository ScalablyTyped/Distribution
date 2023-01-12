package typings.sharedb.libSharedbMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Types extends StObject {
  
  var map: StringDictionary[Type]
  
  def register(`type`: Type): Unit
}
object Types {
  
  inline def apply(map: StringDictionary[Type], register: Type => Unit): Types = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], register = js.Any.fromFunction1(register))
    __obj.asInstanceOf[Types]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Types] (val x: Self) extends AnyVal {
    
    inline def setMap(value: StringDictionary[Type]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setRegister(value: Type => Unit): Self = StObject.set(x, "register", js.Any.fromFunction1(value))
  }
}
