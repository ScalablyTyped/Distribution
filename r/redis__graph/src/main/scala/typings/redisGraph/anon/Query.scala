package typings.redisGraph.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query extends StObject {
  
  var query: TypeofimportedQUERY
  
  var roQuery: TypeofimportedROQUERY
}
object Query {
  
  inline def apply(query: TypeofimportedQUERY, roQuery: TypeofimportedROQUERY): Query = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], roQuery = roQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Query] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: TypeofimportedQUERY): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setRoQuery(value: TypeofimportedROQUERY): Self = StObject.set(x, "roQuery", value.asInstanceOf[js.Any])
  }
}
