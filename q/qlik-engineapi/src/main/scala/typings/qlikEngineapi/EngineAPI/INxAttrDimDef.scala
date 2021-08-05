package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxAttrDimDef...
  */
trait INxAttrDimDef extends StObject {
  
  /**
    * Expression or field name.
    */
  var qDef: String
  
  /**
    * LibraryId for dimension.
    */
  var qLibraryId: String
  
  /**
    * Sorting
    */
  var qSortBy: ISortCriteria
}
object INxAttrDimDef {
  
  inline def apply(qDef: String, qLibraryId: String, qSortBy: ISortCriteria): INxAttrDimDef = {
    val __obj = js.Dynamic.literal(qDef = qDef.asInstanceOf[js.Any], qLibraryId = qLibraryId.asInstanceOf[js.Any], qSortBy = qSortBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxAttrDimDef]
  }
  
  extension [Self <: INxAttrDimDef](x: Self) {
    
    inline def setQDef(value: String): Self = StObject.set(x, "qDef", value.asInstanceOf[js.Any])
    
    inline def setQLibraryId(value: String): Self = StObject.set(x, "qLibraryId", value.asInstanceOf[js.Any])
    
    inline def setQSortBy(value: ISortCriteria): Self = StObject.set(x, "qSortBy", value.asInstanceOf[js.Any])
  }
}
