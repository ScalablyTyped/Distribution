package typings.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortingRule[D] extends StObject {
  
  var desc: js.UndefOr[Boolean] = js.native
  
  var id: IdType[D] = js.native
}
object SortingRule {
  
  @scala.inline
  def apply[D](id: IdType[D]): SortingRule[D] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortingRule[D]]
  }
  
  @scala.inline
  implicit class SortingRuleMutableBuilder[Self <: SortingRule[_], D] (val x: Self with SortingRule[D]) extends AnyVal {
    
    @scala.inline
    def setDesc(value: Boolean): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
    
    @scala.inline
    def setId(value: IdType[D]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
