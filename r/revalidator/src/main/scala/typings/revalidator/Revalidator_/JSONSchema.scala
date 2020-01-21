package typings.revalidator.Revalidator_

import typings.revalidator.revalidatorStrings.`object`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONSchema[T] extends js.Object {
  var patternProperties: js.UndefOr[ISchemas[T]] = js.undefined
  var properties: js.UndefOr[ISchemas[T]] = js.undefined
  var `type`: js.UndefOr[`object`] = js.undefined
}

object JSONSchema {
  @scala.inline
  def apply[T](patternProperties: ISchemas[T] = null, properties: ISchemas[T] = null, `type`: `object` = null): JSONSchema[T] = {
    val __obj = js.Dynamic.literal()
    if (patternProperties != null) __obj.updateDynamic("patternProperties")(patternProperties.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONSchema[T]]
  }
}

