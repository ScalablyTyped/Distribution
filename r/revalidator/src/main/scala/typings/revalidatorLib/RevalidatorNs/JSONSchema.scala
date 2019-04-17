package typings
package revalidatorLib.RevalidatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONSchema[T] extends js.Object {
  var patternProperties: js.UndefOr[ISchemas[T]] = js.undefined
  var properties: js.UndefOr[ISchemas[T]] = js.undefined
  var `type`: js.UndefOr[revalidatorLib.revalidatorLibStrings.`object`] = js.undefined
}

object JSONSchema {
  @scala.inline
  def apply[T](
    patternProperties: ISchemas[T] = null,
    properties: ISchemas[T] = null,
    `type`: revalidatorLib.revalidatorLibStrings.`object` = null
  ): JSONSchema[T] = {
    val __obj = js.Dynamic.literal()
    if (patternProperties != null) __obj.updateDynamic("patternProperties")(patternProperties)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[JSONSchema[T]]
  }
}

