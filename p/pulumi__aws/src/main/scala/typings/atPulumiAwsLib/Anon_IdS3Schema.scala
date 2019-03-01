package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdS3Schema extends js.Object {
  var id: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var s3: atPulumiPulumiLib.outputMod.Input[Anon_BucketArnFileKey]
  var schema: atPulumiPulumiLib.outputMod.Input[Anon_RecordColumnsRecordEncoding]
  var tableName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_IdS3Schema {
  @scala.inline
  def apply(
    s3: atPulumiPulumiLib.outputMod.Input[Anon_BucketArnFileKey],
    schema: atPulumiPulumiLib.outputMod.Input[Anon_RecordColumnsRecordEncoding],
    tableName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    id: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_IdS3Schema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("s3")(s3.asInstanceOf[js.Any])
    __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    __obj.updateDynamic("tableName")(tableName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IdS3Schema]
  }
}

