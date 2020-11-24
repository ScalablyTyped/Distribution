package typings.schemaRegistry.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AvroSchemaResponseInterface extends js.Object {
  
  var id: Double = js.native
  
  var schema: js.Any = js.native
  
  var subject: String = js.native
  
  var version: Double = js.native
}
object AvroSchemaResponseInterface {
  
  @scala.inline
  def apply(id: Double, schema: js.Any, subject: String, version: Double): AvroSchemaResponseInterface = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvroSchemaResponseInterface]
  }
  
  @scala.inline
  implicit class AvroSchemaResponseInterfaceOps[Self <: AvroSchemaResponseInterface] (val x: Self) extends AnyVal {
    
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
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: js.Any): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
