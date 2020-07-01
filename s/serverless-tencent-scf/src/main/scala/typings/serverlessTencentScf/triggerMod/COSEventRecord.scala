package typings.serverlessTencentScf.triggerMod

import typings.serverlessTencentScf.anon.CosBucket
import typings.serverlessTencentScf.anon.EventName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait COSEventRecord extends js.Object {
  var cos: CosBucket
  var event: EventName
}

object COSEventRecord {
  @scala.inline
  def apply(cos: CosBucket, event: EventName): COSEventRecord = {
    val __obj = js.Dynamic.literal(cos = cos.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[COSEventRecord]
  }
}

