package typings.rockset.distCodegenApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqlExpression extends StObject {
  
  /**
    * The name of a sql function
    * @type {string}
    * @memberof SqlExpression
    */
  var sql: js.UndefOr[String] = js.undefined
}
object SqlExpression {
  
  inline def apply(): SqlExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlExpression]
  }
  
  extension [Self <: SqlExpression](x: Self) {
    
    inline def setSql(value: String): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
    
    inline def setSqlUndefined: Self = StObject.set(x, "sql", js.undefined)
  }
}
