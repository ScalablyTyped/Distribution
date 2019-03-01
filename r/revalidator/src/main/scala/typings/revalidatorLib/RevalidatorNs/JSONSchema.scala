package typings
package revalidatorLib.RevalidatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONSchema[T] extends js.Object {
  var properties: js.UndefOr[ISchemas[T]] = js.undefined
}

object JSONSchema {
  @scala.inline
  def apply[T](properties: ISchemas[T] = null): JSONSchema[T] = {
    val __obj = js.Dynamic.literal()
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[JSONSchema[T]]
  }
}

