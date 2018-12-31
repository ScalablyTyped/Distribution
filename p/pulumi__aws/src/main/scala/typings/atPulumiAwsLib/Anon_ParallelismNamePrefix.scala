package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ParallelismNamePrefix extends js.Object {
  var id: java.lang.String
  var kinesisFirehose: js.UndefOr[Anon_RoleArnResourceArnString] = js.undefined
  var kinesisStream: js.UndefOr[Anon_RoleArnResourceArnString] = js.undefined
  var namePrefix: java.lang.String
  var parallelism: js.UndefOr[Anon_CountNumber] = js.undefined
  var processingConfiguration: js.UndefOr[Anon_LambdaAnonRoleArnResourceArnString] = js.undefined
  var schema: Anon_RecordFormatRecordColumns
  var startingPositionConfigurations: js.Array[Anon_StartingPositionString]
  var streamNames: js.Array[java.lang.String]
}

