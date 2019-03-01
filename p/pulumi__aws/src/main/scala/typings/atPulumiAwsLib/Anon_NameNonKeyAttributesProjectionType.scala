package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameNonKeyAttributesProjectionType extends js.Object {
  var name: java.lang.String
  var nonKeyAttributes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var projectionType: java.lang.String
  var rangeKey: java.lang.String
}

object Anon_NameNonKeyAttributesProjectionType {
  @scala.inline
  def apply(
    name: java.lang.String,
    projectionType: java.lang.String,
    rangeKey: java.lang.String,
    nonKeyAttributes: js.Array[java.lang.String] = null
  ): Anon_NameNonKeyAttributesProjectionType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("projectionType")(projectionType)
    __obj.updateDynamic("rangeKey")(rangeKey)
    if (nonKeyAttributes != null) __obj.updateDynamic("nonKeyAttributes")(nonKeyAttributes)
    __obj.asInstanceOf[Anon_NameNonKeyAttributesProjectionType]
  }
}

