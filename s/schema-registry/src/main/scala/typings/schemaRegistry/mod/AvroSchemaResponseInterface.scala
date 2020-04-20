package typings.schemaRegistry.mod

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
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvroSchemaResponseInterface]
  }
}

