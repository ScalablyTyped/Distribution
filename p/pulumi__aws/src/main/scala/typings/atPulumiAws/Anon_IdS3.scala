package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdS3 extends js.Object {
  var id: String
  var s3: Anon_BucketArn
  var schema: Anon_RecordColumns
  var tableName: String
}

object Anon_IdS3 {
  @scala.inline
  def apply(id: String, s3: Anon_BucketArn, schema: Anon_RecordColumns, tableName: String): Anon_IdS3 = {
    val __obj = js.Dynamic.literal(id = id, s3 = s3, schema = schema, tableName = tableName)
  
    __obj.asInstanceOf[Anon_IdS3]
  }
}

