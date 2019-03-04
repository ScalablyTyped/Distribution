package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Identifiers extends js.Object {
  var identifiers: js.Array[java.lang.String]
  var `type`: java.lang.String
}

object Anon_Identifiers {
  @scala.inline
  def apply(identifiers: js.Array[java.lang.String], `type`: java.lang.String): Anon_Identifiers = {
    val __obj = js.Dynamic.literal(identifiers = identifiers)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Identifiers]
  }
}

