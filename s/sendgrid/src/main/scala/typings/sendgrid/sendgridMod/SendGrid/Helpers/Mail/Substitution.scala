package typings.sendgrid.sendgridMod.SendGrid.Helpers.Mail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Substitution extends js.Object {
  var key: String
  var value: String
}

object Substitution {
  @scala.inline
  def apply(key: String, value: String): Substitution = {
    val __obj = js.Dynamic.literal(key = key, value = value)
  
    __obj.asInstanceOf[Substitution]
  }
}

