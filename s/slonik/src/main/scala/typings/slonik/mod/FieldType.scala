package typings.slonik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldType extends StObject {
  
  var dataTypeId: Double = js.native
  
  var name: String = js.native
}
object FieldType {
  
  @scala.inline
  def apply(dataTypeId: Double, name: String): FieldType = {
    val __obj = js.Dynamic.literal(dataTypeId = dataTypeId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldType]
  }
  
  @scala.inline
  implicit class FieldTypeMutableBuilder[Self <: FieldType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataTypeId(value: Double): Self = StObject.set(x, "dataTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
