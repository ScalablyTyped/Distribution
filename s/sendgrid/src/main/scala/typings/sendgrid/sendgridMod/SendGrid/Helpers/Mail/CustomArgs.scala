package typings.sendgrid.sendgridMod.SendGrid.Helpers.Mail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomArgs extends js.Object {
  var key: String
  var value: String
}

object CustomArgs {
  @scala.inline
  def apply(key: String, value: String): CustomArgs = {
    val __obj = js.Dynamic.literal(key = key, value = value)
  
    __obj.asInstanceOf[CustomArgs]
  }
}

