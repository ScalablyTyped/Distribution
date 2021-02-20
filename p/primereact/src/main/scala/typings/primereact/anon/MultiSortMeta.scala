package typings.primereact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiSortMeta extends StObject {
  
  var multiSortMeta: js.Any = js.native
  
  var sortField: String = js.native
  
  var sortOrder: Double = js.native
}
object MultiSortMeta {
  
  @scala.inline
  def apply(multiSortMeta: js.Any, sortField: String, sortOrder: Double): MultiSortMeta = {
    val __obj = js.Dynamic.literal(multiSortMeta = multiSortMeta.asInstanceOf[js.Any], sortField = sortField.asInstanceOf[js.Any], sortOrder = sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiSortMeta]
  }
  
  @scala.inline
  implicit class MultiSortMetaMutableBuilder[Self <: MultiSortMeta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMultiSortMeta(value: js.Any): Self = StObject.set(x, "multiSortMeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortField(value: String): Self = StObject.set(x, "sortField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrder(value: Double): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
  }
}
