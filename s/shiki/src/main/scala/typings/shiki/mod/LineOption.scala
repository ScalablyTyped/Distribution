package typings.shiki.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineOption extends StObject {
  
  var classes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * 1-based line number.
    */
  var line: Double
}
object LineOption {
  
  inline def apply(line: Double): LineOption = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineOption] (val x: Self) extends AnyVal {
    
    inline def setClasses(value: js.Array[String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setClassesVarargs(value: String*): Self = StObject.set(x, "classes", js.Array(value*))
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
  }
}
