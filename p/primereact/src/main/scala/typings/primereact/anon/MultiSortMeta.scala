package typings.primereact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiSortMeta extends StObject {
  
  var multiSortMeta: js.Any
  
  var sortField: String
  
  var sortOrder: Double
}
object MultiSortMeta {
  
  inline def apply(multiSortMeta: js.Any, sortField: String, sortOrder: Double): MultiSortMeta = {
    val __obj = js.Dynamic.literal(multiSortMeta = multiSortMeta.asInstanceOf[js.Any], sortField = sortField.asInstanceOf[js.Any], sortOrder = sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiSortMeta]
  }
  
  extension [Self <: MultiSortMeta](x: Self) {
    
    inline def setMultiSortMeta(value: js.Any): Self = StObject.set(x, "multiSortMeta", value.asInstanceOf[js.Any])
    
    inline def setSortField(value: String): Self = StObject.set(x, "sortField", value.asInstanceOf[js.Any])
    
    inline def setSortOrder(value: Double): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
  }
}
