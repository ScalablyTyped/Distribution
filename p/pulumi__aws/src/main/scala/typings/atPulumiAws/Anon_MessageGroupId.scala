package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MessageGroupId extends js.Object {
  var messageGroupId: js.UndefOr[String] = js.undefined
}

object Anon_MessageGroupId {
  @scala.inline
  def apply(messageGroupId: String = null): Anon_MessageGroupId = {
    val __obj = js.Dynamic.literal()
    if (messageGroupId != null) __obj.updateDynamic("messageGroupId")(messageGroupId)
    __obj.asInstanceOf[Anon_MessageGroupId]
  }
}

