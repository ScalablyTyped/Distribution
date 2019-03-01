package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdS3 extends js.Object {
  var id: java.lang.String
  var s3: Anon_BucketArn
  var schema: Anon_RecordColumns
  var tableName: java.lang.String
}

object Anon_IdS3 {
  @scala.inline
  def apply(id: java.lang.String, s3: Anon_BucketArn, schema: Anon_RecordColumns, tableName: java.lang.String): Anon_IdS3 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("s3")(s3)
    __obj.updateDynamic("schema")(schema)
    __obj.updateDynamic("tableName")(tableName)
    __obj.asInstanceOf[Anon_IdS3]
  }
}

