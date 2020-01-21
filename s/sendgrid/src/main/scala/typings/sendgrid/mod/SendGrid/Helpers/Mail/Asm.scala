package typings.sendgrid.mod.SendGrid.Helpers.Mail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Asm extends js.Object {
  var group_id: Double
  var groups_to_display: js.Array[Double]
}

object Asm {
  @scala.inline
  def apply(group_id: Double, groups_to_display: js.Array[Double]): Asm = {
    val __obj = js.Dynamic.literal(group_id = group_id.asInstanceOf[js.Any], groups_to_display = groups_to_display.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Asm]
  }
}

