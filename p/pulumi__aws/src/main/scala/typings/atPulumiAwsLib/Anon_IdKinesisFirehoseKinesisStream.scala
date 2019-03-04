package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdKinesisFirehoseKinesisStream extends js.Object {
  var id: java.lang.String
  var kinesisFirehose: js.UndefOr[Anon_ResourceArn] = js.undefined
  var kinesisStream: js.UndefOr[Anon_ResourceArn] = js.undefined
  var lambda: js.UndefOr[Anon_ResourceArn] = js.undefined
  var name: java.lang.String
  var schema: Anon_RecordFormatType
}

object Anon_IdKinesisFirehoseKinesisStream {
  @scala.inline
  def apply(
    id: java.lang.String,
    name: java.lang.String,
    schema: Anon_RecordFormatType,
    kinesisFirehose: Anon_ResourceArn = null,
    kinesisStream: Anon_ResourceArn = null,
    lambda: Anon_ResourceArn = null
  ): Anon_IdKinesisFirehoseKinesisStream = {
    val __obj = js.Dynamic.literal(id = id, name = name, schema = schema)
    if (kinesisFirehose != null) __obj.updateDynamic("kinesisFirehose")(kinesisFirehose)
    if (kinesisStream != null) __obj.updateDynamic("kinesisStream")(kinesisStream)
    if (lambda != null) __obj.updateDynamic("lambda")(lambda)
    __obj.asInstanceOf[Anon_IdKinesisFirehoseKinesisStream]
  }
}

