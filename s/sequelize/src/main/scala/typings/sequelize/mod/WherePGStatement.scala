package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Nested where Postgre Statement
  */
trait WherePGStatement extends StObject {
  
  @JSName("$all")
  var $all: js.Array[String | Double]
  
  @JSName("$any")
  var $any: js.Array[String | Double]
}
object WherePGStatement {
  
  inline def apply($all: js.Array[String | Double], $any: js.Array[String | Double]): WherePGStatement = {
    val __obj = js.Dynamic.literal($all = $all.asInstanceOf[js.Any], $any = $any.asInstanceOf[js.Any])
    __obj.asInstanceOf[WherePGStatement]
  }
  
  extension [Self <: WherePGStatement](x: Self) {
    
    inline def set$all(value: js.Array[String | Double]): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allVarargs(value: (String | Double)*): Self = StObject.set(x, "$all", js.Array(value :_*))
    
    inline def set$any(value: js.Array[String | Double]): Self = StObject.set(x, "$any", value.asInstanceOf[js.Any])
    
    inline def set$anyVarargs(value: (String | Double)*): Self = StObject.set(x, "$any", js.Array(value :_*))
  }
}
