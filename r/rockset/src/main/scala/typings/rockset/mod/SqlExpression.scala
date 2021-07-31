package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqlExpression extends StObject {
  
  // The name of a sql function
  var sql: js.UndefOr[String] = js.undefined
}
object SqlExpression {
  
  @scala.inline
  def apply(): SqlExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlExpression]
  }
  
  @scala.inline
  implicit class SqlExpressionMutableBuilder[Self <: SqlExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSql(value: String): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlUndefined: Self = StObject.set(x, "sql", js.undefined)
  }
}
