package typings.sqsDashProducer.sqsDashProducerMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProducerMessage extends js.Object {
  var body: String
  var delaySeconds: js.UndefOr[Double] = js.undefined
  var id: String
  var messageAttributes: js.UndefOr[StringDictionary[ProducerMessageAttribute]] = js.undefined
}

object ProducerMessage {
  @scala.inline
  def apply(
    body: String,
    id: String,
    delaySeconds: Int | Double = null,
    messageAttributes: StringDictionary[ProducerMessageAttribute] = null
  ): ProducerMessage = {
    val __obj = js.Dynamic.literal(body = body, id = id)
    if (delaySeconds != null) __obj.updateDynamic("delaySeconds")(delaySeconds.asInstanceOf[js.Any])
    if (messageAttributes != null) __obj.updateDynamic("messageAttributes")(messageAttributes)
    __obj.asInstanceOf[ProducerMessage]
  }
}

