package typings
package sqsDashProducerLib.sqsDashProducerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProducerMessage extends js.Object {
  var body: java.lang.String
  var delaySeconds: js.UndefOr[scala.Double] = js.undefined
  var id: java.lang.String
  var messageAttributes: js.UndefOr[org.scalablytyped.runtime.StringDictionary[ProducerMessageAttribute]] = js.undefined
}

object ProducerMessage {
  @scala.inline
  def apply(
    body: java.lang.String,
    id: java.lang.String,
    delaySeconds: scala.Int | scala.Double = null,
    messageAttributes: org.scalablytyped.runtime.StringDictionary[ProducerMessageAttribute] = null
  ): ProducerMessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("id")(id)
    if (delaySeconds != null) __obj.updateDynamic("delaySeconds")(delaySeconds.asInstanceOf[js.Any])
    if (messageAttributes != null) __obj.updateDynamic("messageAttributes")(messageAttributes)
    __obj.asInstanceOf[ProducerMessage]
  }
}

