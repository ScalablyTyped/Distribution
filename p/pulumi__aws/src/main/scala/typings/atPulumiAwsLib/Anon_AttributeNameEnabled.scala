package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttributeNameEnabled extends js.Object {
  var attributeName: java.lang.String
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_AttributeNameEnabled {
  @scala.inline
  def apply(attributeName: java.lang.String, enabled: js.UndefOr[scala.Boolean] = js.undefined): Anon_AttributeNameEnabled = {
    val __obj = js.Dynamic.literal(attributeName = attributeName)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    __obj.asInstanceOf[Anon_AttributeNameEnabled]
  }
}

