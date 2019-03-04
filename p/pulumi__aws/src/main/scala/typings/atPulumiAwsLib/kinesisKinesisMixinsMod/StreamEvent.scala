package typings
package atPulumiAwsLib.kinesisKinesisMixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamEvent extends js.Object {
  var Records: js.Array[StreamEventRecord]
}

object StreamEvent {
  @scala.inline
  def apply(Records: js.Array[StreamEventRecord]): StreamEvent = {
    val __obj = js.Dynamic.literal(Records = Records)
  
    __obj.asInstanceOf[StreamEvent]
  }
}

