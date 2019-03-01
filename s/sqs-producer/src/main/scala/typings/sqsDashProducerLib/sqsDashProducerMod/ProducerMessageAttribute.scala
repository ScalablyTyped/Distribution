package typings
package sqsDashProducerLib.sqsDashProducerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProducerMessageAttribute extends js.Object {
  var BinaryValue: js.UndefOr[nodeLib.Buffer] = js.undefined
  var DataType: sqsDashProducerLib.sqsDashProducerLibStrings.String | sqsDashProducerLib.sqsDashProducerLibStrings.Binary
  var StringValue: js.UndefOr[java.lang.String] = js.undefined
}

object ProducerMessageAttribute {
  @scala.inline
  def apply(
    DataType: sqsDashProducerLib.sqsDashProducerLibStrings.String | sqsDashProducerLib.sqsDashProducerLibStrings.Binary,
    BinaryValue: nodeLib.Buffer = null,
    StringValue: java.lang.String = null
  ): ProducerMessageAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DataType")(DataType.asInstanceOf[js.Any])
    if (BinaryValue != null) __obj.updateDynamic("BinaryValue")(BinaryValue)
    if (StringValue != null) __obj.updateDynamic("StringValue")(StringValue)
    __obj.asInstanceOf[ProducerMessageAttribute]
  }
}

