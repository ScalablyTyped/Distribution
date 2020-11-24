package typings.relayRuntime.relayDeclarativeMutationConfigMod

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.anon.Filters
import typings.relayRuntime.relayRuntimeStrings.RANGE_ADD
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangeAddConfig extends DeclarativeMutationConfig {
  
  var connectionInfo: js.UndefOr[js.Array[Filters]] = js.native
  
  var connectionName: js.UndefOr[String] = js.native
  
  var edgeName: String = js.native
  
  var parentID: js.UndefOr[String] = js.native
  
  var parentName: js.UndefOr[String] = js.native
  
  var rangeBehaviors: js.UndefOr[RangeBehaviors] = js.native
  
  var `type`: RANGE_ADD = js.native
}
object RangeAddConfig {
  
  @scala.inline
  def apply(edgeName: String, `type`: RANGE_ADD): RangeAddConfig = {
    val __obj = js.Dynamic.literal(edgeName = edgeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeAddConfig]
  }
  
  @scala.inline
  implicit class RangeAddConfigOps[Self <: RangeAddConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEdgeName(value: String): Self = this.set("edgeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: RANGE_ADD): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionInfoVarargs(value: Filters*): Self = this.set("connectionInfo", js.Array(value :_*))
    
    @scala.inline
    def setConnectionInfo(value: js.Array[Filters]): Self = this.set("connectionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionInfo: Self = this.set("connectionInfo", js.undefined)
    
    @scala.inline
    def setConnectionName(value: String): Self = this.set("connectionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionName: Self = this.set("connectionName", js.undefined)
    
    @scala.inline
    def setParentID(value: String): Self = this.set("parentID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentID: Self = this.set("parentID", js.undefined)
    
    @scala.inline
    def setParentName(value: String): Self = this.set("parentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentName: Self = this.set("parentName", js.undefined)
    
    @scala.inline
    def setRangeBehaviorsFunction1(value: /* connectionArgs */ StringDictionary[js.Any] => RangeOperations): Self = this.set("rangeBehaviors", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRangeBehaviors(value: RangeBehaviors): Self = this.set("rangeBehaviors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeBehaviors: Self = this.set("rangeBehaviors", js.undefined)
  }
}
