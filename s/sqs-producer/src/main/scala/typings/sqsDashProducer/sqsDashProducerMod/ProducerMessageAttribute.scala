package typings.sqsDashProducer.sqsDashProducerMod

import typings.node.Buffer
import typings.sqsDashProducer.sqsDashProducerStrings.Binary
import typings.sqsDashProducer.sqsDashProducerStrings.String
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProducerMessageAttribute extends js.Object {
  var BinaryValue: js.UndefOr[Buffer] = js.undefined
  var DataType: String | Binary
  var StringValue: js.UndefOr[java.lang.String] = js.undefined
}

object ProducerMessageAttribute {
  @scala.inline
  def apply(DataType: String | Binary, BinaryValue: Buffer = null, StringValue: java.lang.String = null): ProducerMessageAttribute = {
    val __obj = js.Dynamic.literal(DataType = DataType.asInstanceOf[js.Any])
    if (BinaryValue != null) __obj.updateDynamic("BinaryValue")(BinaryValue)
    if (StringValue != null) __obj.updateDynamic("StringValue")(StringValue)
    __obj.asInstanceOf[ProducerMessageAttribute]
  }
}

