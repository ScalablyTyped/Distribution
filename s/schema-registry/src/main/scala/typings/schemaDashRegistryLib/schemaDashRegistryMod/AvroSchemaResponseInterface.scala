package typings
package schemaDashRegistryLib.schemaDashRegistryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvroSchemaResponseInterface extends js.Object {
  var id: scala.Double
  var schema: js.Any
  var subject: java.lang.String
  var version: scala.Double
}

object AvroSchemaResponseInterface {
  @scala.inline
  def apply(id: scala.Double, schema: js.Any, subject: java.lang.String, version: scala.Double): AvroSchemaResponseInterface = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("schema")(schema)
    __obj.updateDynamic("subject")(subject)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[AvroSchemaResponseInterface]
  }
}

