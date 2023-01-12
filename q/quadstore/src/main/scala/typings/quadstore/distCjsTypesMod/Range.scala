package typings.quadstore.distCjsTypesMod

import typings.rdfjsTypes.dataModelMod.Literal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Range extends StObject {
  
  var gt: js.UndefOr[Literal] = js.undefined
  
  var gte: js.UndefOr[Literal] = js.undefined
  
  var lt: js.UndefOr[Literal] = js.undefined
  
  var lte: js.UndefOr[Literal] = js.undefined
  
  var termType: typings.quadstore.quadstoreStrings.Range
}
object Range {
  
  inline def apply(): Range = {
    val __obj = js.Dynamic.literal(termType = "Range")
    __obj.asInstanceOf[Range]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Range] (val x: Self) extends AnyVal {
    
    inline def setGt(value: Literal): Self = StObject.set(x, "gt", value.asInstanceOf[js.Any])
    
    inline def setGtUndefined: Self = StObject.set(x, "gt", js.undefined)
    
    inline def setGte(value: Literal): Self = StObject.set(x, "gte", value.asInstanceOf[js.Any])
    
    inline def setGteUndefined: Self = StObject.set(x, "gte", js.undefined)
    
    inline def setLt(value: Literal): Self = StObject.set(x, "lt", value.asInstanceOf[js.Any])
    
    inline def setLtUndefined: Self = StObject.set(x, "lt", js.undefined)
    
    inline def setLte(value: Literal): Self = StObject.set(x, "lte", value.asInstanceOf[js.Any])
    
    inline def setLteUndefined: Self = StObject.set(x, "lte", js.undefined)
    
    inline def setTermType(value: typings.quadstore.quadstoreStrings.Range): Self = StObject.set(x, "termType", value.asInstanceOf[js.Any])
  }
}
