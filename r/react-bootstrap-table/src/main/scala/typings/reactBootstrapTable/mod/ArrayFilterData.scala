package typings.reactBootstrapTable.mod

import typings.reactBootstrapTable.reactBootstrapTableStrings.ArrayFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayFilterData extends FilterValue {
  
  var `type`: ArrayFilter = js.native
  
  var value: js.Array[Double | String] = js.native
}
object ArrayFilterData {
  
  @scala.inline
  def apply(`type`: ArrayFilter, value: js.Array[Double | String]): ArrayFilterData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayFilterData]
  }
  
  @scala.inline
  implicit class ArrayFilterDataMutableBuilder[Self <: ArrayFilterData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ArrayFilter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Array[Double | String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: (Double | String)*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
