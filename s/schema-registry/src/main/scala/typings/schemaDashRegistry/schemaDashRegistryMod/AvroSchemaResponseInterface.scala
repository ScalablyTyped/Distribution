package typings.schemaDashRegistry.schemaDashRegistryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvroSchemaResponseInterface extends js.Object {
  var id: Double
  var schema: js.Any
  var subject: String
  var version: Double
}

object AvroSchemaResponseInterface {
  @scala.inline
  def apply(id: Double, schema: js.Any, subject: String, version: Double): AvroSchemaResponseInterface = {
    val __obj = js.Dynamic.literal(id = id, schema = schema, subject = subject, version = version)
  
    __obj.asInstanceOf[AvroSchemaResponseInterface]
  }
}

