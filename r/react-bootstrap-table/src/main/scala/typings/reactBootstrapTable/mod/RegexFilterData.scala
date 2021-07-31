package typings.reactBootstrapTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegexFilterData
  extends StObject
     with FilterValue {
  
  var `type`: typings.reactBootstrapTable.reactBootstrapTableStrings.RegexFilter
  
  var value: String
}
object RegexFilterData {
  
  @scala.inline
  def apply(value: String): RegexFilterData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RegexFilter")
    __obj.asInstanceOf[RegexFilterData]
  }
  
  @scala.inline
  implicit class RegexFilterDataMutableBuilder[Self <: RegexFilterData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.reactBootstrapTable.reactBootstrapTableStrings.RegexFilter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
