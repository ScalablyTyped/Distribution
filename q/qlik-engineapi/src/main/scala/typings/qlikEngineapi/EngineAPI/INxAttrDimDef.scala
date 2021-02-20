package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxAttrDimDef...
  */
@js.native
trait INxAttrDimDef extends StObject {
  
  /**
    * Expression or field name.
    */
  var qDef: String = js.native
  
  /**
    * LibraryId for dimension.
    */
  var qLibraryId: String = js.native
  
  /**
    * Sorting
    */
  var qSortBy: ISortCriteria = js.native
}
object INxAttrDimDef {
  
  @scala.inline
  def apply(qDef: String, qLibraryId: String, qSortBy: ISortCriteria): INxAttrDimDef = {
    val __obj = js.Dynamic.literal(qDef = qDef.asInstanceOf[js.Any], qLibraryId = qLibraryId.asInstanceOf[js.Any], qSortBy = qSortBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxAttrDimDef]
  }
  
  @scala.inline
  implicit class INxAttrDimDefMutableBuilder[Self <: INxAttrDimDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQDef(value: String): Self = StObject.set(x, "qDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQLibraryId(value: String): Self = StObject.set(x, "qLibraryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSortBy(value: ISortCriteria): Self = StObject.set(x, "qSortBy", value.asInstanceOf[js.Any])
  }
}
