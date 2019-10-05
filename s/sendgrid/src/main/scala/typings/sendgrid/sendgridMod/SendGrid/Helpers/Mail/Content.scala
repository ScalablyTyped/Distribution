package typings.sendgrid.sendgridMod.SendGrid.Helpers.Mail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Content extends js.Object {
  var `type`: String
  var value: String
}

object Content {
  @scala.inline
  def apply(`type`: String, value: String): Content = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Content]
  }
}

