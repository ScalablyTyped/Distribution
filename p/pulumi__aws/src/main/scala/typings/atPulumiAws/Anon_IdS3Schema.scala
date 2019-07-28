package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdS3Schema extends js.Object {
  var id: js.UndefOr[Input[String]] = js.undefined
  var s3: Input[Anon_BucketArnFileKey]
  var schema: Input[Anon_RecordColumnsRecordEncoding]
  var tableName: Input[String]
}

object Anon_IdS3Schema {
  @scala.inline
  def apply(
    s3: Input[Anon_BucketArnFileKey],
    schema: Input[Anon_RecordColumnsRecordEncoding],
    tableName: Input[String],
    id: Input[String] = null
  ): Anon_IdS3Schema = {
    val __obj = js.Dynamic.literal(s3 = s3.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IdS3Schema]
  }
}

