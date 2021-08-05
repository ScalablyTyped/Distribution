package typings.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortingRule[D] extends StObject {
  
  var desc: js.UndefOr[Boolean] = js.undefined
  
  var id: IdType[D]
}
object SortingRule {
  
  inline def apply[D](id: IdType[D]): SortingRule[D] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortingRule[D]]
  }
  
  extension [Self <: SortingRule[?], D](x: Self & SortingRule[D]) {
    
    inline def setDesc(value: Boolean): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    inline def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
    
    inline def setId(value: IdType[D]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
