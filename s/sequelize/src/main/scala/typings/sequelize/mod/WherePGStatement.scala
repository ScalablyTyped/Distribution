package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Nested where Postgre Statement
  */
@js.native
trait WherePGStatement extends StObject {
  
  @JSName("$all")
  var $all: js.Array[String | Double] = js.native
  
  @JSName("$any")
  var $any: js.Array[String | Double] = js.native
}
object WherePGStatement {
  
  @scala.inline
  def apply($all: js.Array[String | Double], $any: js.Array[String | Double]): WherePGStatement = {
    val __obj = js.Dynamic.literal($all = $all.asInstanceOf[js.Any], $any = $any.asInstanceOf[js.Any])
    __obj.asInstanceOf[WherePGStatement]
  }
  
  @scala.inline
  implicit class WherePGStatementMutableBuilder[Self <: WherePGStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: js.Array[String | Double]): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allVarargs(value: (String | Double)*): Self = StObject.set(x, "$all", js.Array(value :_*))
    
    @scala.inline
    def set$any(value: js.Array[String | Double]): Self = StObject.set(x, "$any", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$anyVarargs(value: (String | Double)*): Self = StObject.set(x, "$any", js.Array(value :_*))
  }
}
