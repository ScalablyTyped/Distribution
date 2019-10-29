package typings.reactDashTether.reactDashTetherMod.ReactTether

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateEventData extends js.Object {
  var attachment: TetherAttachment
  var targetAttachment: TetherAttachment
}

object UpdateEventData {
  @scala.inline
  def apply(attachment: TetherAttachment, targetAttachment: TetherAttachment): UpdateEventData = {
    val __obj = js.Dynamic.literal(attachment = attachment, targetAttachment = targetAttachment)
  
    __obj.asInstanceOf[UpdateEventData]
  }
}

