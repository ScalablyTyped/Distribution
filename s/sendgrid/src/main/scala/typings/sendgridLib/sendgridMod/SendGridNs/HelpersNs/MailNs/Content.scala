package typings
package sendgridLib.sendgridMod.SendGridNs.HelpersNs.MailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Content extends js.Object {
  var `type`: java.lang.String
  var value: java.lang.String
}

object Content {
  @scala.inline
  def apply(`type`: java.lang.String, value: java.lang.String): Content = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Content]
  }
}

