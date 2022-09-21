package typings.reactWidgets.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contains extends StObject {
  
  def contains(a: String, b: String): Boolean
  
  def eq(a: Any, b: Any): Boolean
  
  def startsWith(a: String, b: String): Boolean
}
object Contains {
  
  inline def apply(
    contains: (String, String) => Boolean,
    eq_ : (Any, Any) => Boolean,
    startsWith: (String, String) => Boolean
  ): Contains = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction2(contains), startsWith = js.Any.fromFunction2(startsWith))
    __obj.updateDynamic("eq")(js.Any.fromFunction2(eq_))
    __obj.asInstanceOf[Contains]
  }
  
  extension [Self <: Contains](x: Self) {
    
    inline def setContains(value: (String, String) => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction2(value))
    
    inline def setEq_(value: (Any, Any) => Boolean): Self = StObject.set(x, "eq", js.Any.fromFunction2(value))
    
    inline def setStartsWith(value: (String, String) => Boolean): Self = StObject.set(x, "startsWith", js.Any.fromFunction2(value))
  }
}
