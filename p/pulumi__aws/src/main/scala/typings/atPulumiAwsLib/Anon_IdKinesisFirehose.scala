package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdKinesisFirehose extends js.Object {
  var id: java.lang.String
  var kinesisFirehose: js.UndefOr[Anon_ResourceArn] = js.undefined
  var kinesisStream: js.UndefOr[Anon_ResourceArn] = js.undefined
  var namePrefix: java.lang.String
  var parallelism: js.UndefOr[Anon_Count] = js.undefined
  var processingConfiguration: js.UndefOr[Anon_LambdaAnonResourceArn] = js.undefined
  var schema: Anon_RecordColumns
  var startingPositionConfigurations: js.Array[Anon_StartingPosition]
  var streamNames: js.Array[java.lang.String]
}

