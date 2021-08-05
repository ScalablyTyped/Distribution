package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Where Complex nested query
  */
trait WhereNested extends StObject {
  
  @JSName("$and")
  var $and: js.Array[AnyWhereOptions | WhereLogic]
  
  @JSName("$or")
  var $or: js.Array[AnyWhereOptions | WhereLogic]
}
object WhereNested {
  
  inline def apply($and: js.Array[AnyWhereOptions | WhereLogic], $or: js.Array[AnyWhereOptions | WhereLogic]): WhereNested = {
    val __obj = js.Dynamic.literal($and = $and.asInstanceOf[js.Any], $or = $or.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhereNested]
  }
  
  extension [Self <: WhereNested](x: Self) {
    
    inline def set$and(value: js.Array[AnyWhereOptions | WhereLogic]): Self = StObject.set(x, "$and", value.asInstanceOf[js.Any])
    
    inline def set$andVarargs(value: (AnyWhereOptions | WhereLogic)*): Self = StObject.set(x, "$and", js.Array(value :_*))
    
    inline def set$or(value: js.Array[AnyWhereOptions | WhereLogic]): Self = StObject.set(x, "$or", value.asInstanceOf[js.Any])
    
    inline def set$orVarargs(value: (AnyWhereOptions | WhereLogic)*): Self = StObject.set(x, "$or", js.Array(value :_*))
  }
}
