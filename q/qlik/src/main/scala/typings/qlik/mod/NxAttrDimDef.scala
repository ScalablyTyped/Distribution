package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NxAttrDimDef extends StObject {
  
  var qDef: String
  
  var qLibraryId: String
  
  var qSortBy: SortCriteria
}
object NxAttrDimDef {
  
  @scala.inline
  def apply(qDef: String, qLibraryId: String, qSortBy: SortCriteria): NxAttrDimDef = {
    val __obj = js.Dynamic.literal(qDef = qDef.asInstanceOf[js.Any], qLibraryId = qLibraryId.asInstanceOf[js.Any], qSortBy = qSortBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxAttrDimDef]
  }
  
  @scala.inline
  implicit class NxAttrDimDefMutableBuilder[Self <: NxAttrDimDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQDef(value: String): Self = StObject.set(x, "qDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQLibraryId(value: String): Self = StObject.set(x, "qLibraryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSortBy(value: SortCriteria): Self = StObject.set(x, "qSortBy", value.asInstanceOf[js.Any])
  }
}
