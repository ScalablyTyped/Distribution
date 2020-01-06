package typings.atPulumiAws.kinesisKinesisMixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamEvent extends js.Object {
  var Records: js.Array[StreamEventRecord] = js.native
}

object StreamEvent {
  @scala.inline
  def apply(Records: js.Array[StreamEventRecord]): StreamEvent = {
    val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StreamEvent]
  }
}

