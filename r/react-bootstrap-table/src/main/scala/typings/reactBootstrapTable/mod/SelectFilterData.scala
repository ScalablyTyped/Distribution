package typings.reactBootstrapTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectFilterData
  extends StObject
     with FilterValue {
  
  var `type`: typings.reactBootstrapTable.reactBootstrapTableStrings.SelectFilter
  
  var value: String
}
object SelectFilterData {
  
  @scala.inline
  def apply(value: String): SelectFilterData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SelectFilter")
    __obj.asInstanceOf[SelectFilterData]
  }
  
  @scala.inline
  implicit class SelectFilterDataMutableBuilder[Self <: SelectFilterData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.reactBootstrapTable.reactBootstrapTableStrings.SelectFilter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
