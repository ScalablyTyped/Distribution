package typings.stellarBase.mod.Operation

import typings.node.Buffer
import typings.stellarBase.mod.OperationType.ManageData
import typings.stellarBase.mod._Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManageData_
  extends BaseOperation[ManageData]
     with _Operation {
  
  var name: String = js.native
  
  var value: js.UndefOr[Buffer] = js.native
}
object ManageData_ {
  
  @scala.inline
  def apply(name: String, `type`: ManageData): ManageData_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManageData_]
  }
  
  @scala.inline
  implicit class ManageData_MutableBuilder[Self <: ManageData_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Buffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
