package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttributeName extends js.Object {
  var attributeName: java.lang.String
  var enabled: scala.Boolean
}

object Anon_AttributeName {
  @scala.inline
  def apply(attributeName: java.lang.String, enabled: scala.Boolean): Anon_AttributeName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attributeName")(attributeName)
    __obj.updateDynamic("enabled")(enabled)
    __obj.asInstanceOf[Anon_AttributeName]
  }
}

