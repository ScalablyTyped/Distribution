package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Status extends js.Object {
  var status: String
  var `type`: String
}

object Anon_Status {
  @scala.inline
  def apply(status: String, `type`: String): Anon_Status = {
    val __obj = js.Dynamic.literal(status = status)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Status]
  }
}

