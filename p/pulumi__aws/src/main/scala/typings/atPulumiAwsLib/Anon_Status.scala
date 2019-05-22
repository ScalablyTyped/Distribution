package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Status extends js.Object {
  var status: java.lang.String
  var `type`: java.lang.String
}

object Anon_Status {
  @scala.inline
  def apply(status: java.lang.String, `type`: java.lang.String): Anon_Status = {
    val __obj = js.Dynamic.literal(status = status)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Status]
  }
}

