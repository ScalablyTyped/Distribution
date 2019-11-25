package typings.sqsDashProducer.sqsDashProducerMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProducerMessage extends js.Object {
  var body: String
  var deduplicationId: js.UndefOr[String] = js.undefined
  var delaySeconds: js.UndefOr[Double] = js.undefined
  var groupId: js.UndefOr[String] = js.undefined
  var id: String
  var messageAttributes: js.UndefOr[StringDictionary[ProducerMessageAttribute]] = js.undefined
}

object ProducerMessage {
  @scala.inline
  def apply(
    body: String,
    id: String,
    deduplicationId: String = null,
    delaySeconds: Int | Double = null,
    groupId: String = null,
    messageAttributes: StringDictionary[ProducerMessageAttribute] = null
  ): ProducerMessage = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (deduplicationId != null) __obj.updateDynamic("deduplicationId")(deduplicationId.asInstanceOf[js.Any])
    if (delaySeconds != null) __obj.updateDynamic("delaySeconds")(delaySeconds.asInstanceOf[js.Any])
    if (groupId != null) __obj.updateDynamic("groupId")(groupId.asInstanceOf[js.Any])
    if (messageAttributes != null) __obj.updateDynamic("messageAttributes")(messageAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProducerMessage]
  }
}

