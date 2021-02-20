package typings.reactBootstrapTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegexFilterData extends FilterValue {
  
  var `type`: typings.reactBootstrapTable.reactBootstrapTableStrings.RegexFilter = js.native
  
  var value: String = js.native
}
object RegexFilterData {
  
  @scala.inline
  def apply(`type`: typings.reactBootstrapTable.reactBootstrapTableStrings.RegexFilter, value: String): RegexFilterData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
