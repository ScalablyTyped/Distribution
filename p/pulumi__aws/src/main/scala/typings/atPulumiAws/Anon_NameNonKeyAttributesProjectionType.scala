package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameNonKeyAttributesProjectionType extends js.Object {
  var name: String
  var nonKeyAttributes: js.UndefOr[js.Array[String]] = js.undefined
  var projectionType: String
  var rangeKey: String
}

object Anon_NameNonKeyAttributesProjectionType {
  @scala.inline
  def apply(name: String, projectionType: String, rangeKey: String, nonKeyAttributes: js.Array[String] = null): Anon_NameNonKeyAttributesProjectionType = {
    val __obj = js.Dynamic.literal(name = name, projectionType = projectionType, rangeKey = rangeKey)
    if (nonKeyAttributes != null) __obj.updateDynamic("nonKeyAttributes")(nonKeyAttributes)
    __obj.asInstanceOf[Anon_NameNonKeyAttributesProjectionType]
  }
}

