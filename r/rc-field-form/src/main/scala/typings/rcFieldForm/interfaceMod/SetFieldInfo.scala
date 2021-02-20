package typings.rcFieldForm.interfaceMod

import typings.rcFieldForm.rcFieldFormStrings.setField
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetFieldInfo extends NotifyInfo {
  
  var data: FieldData = js.native
  
  var `type`: setField = js.native
}
object SetFieldInfo {
  
  @scala.inline
  def apply(data: FieldData, `type`: setField): SetFieldInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetFieldInfo]
  }
  
  @scala.inline
  implicit class SetFieldInfoMutableBuilder[Self <: SetFieldInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: FieldData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: setField): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
