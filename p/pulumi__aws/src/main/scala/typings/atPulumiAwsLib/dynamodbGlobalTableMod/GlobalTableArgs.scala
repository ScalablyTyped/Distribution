package typings
package atPulumiAwsLib.dynamodbGlobalTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalTableArgs extends js.Object {
  /**
    * The name of the global table. Must match underlying DynamoDB Table names in all regions.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Underlying DynamoDB Table. At least 1 replica must be defined. See below.
    */
  val replicas: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_RegionNameInput]]]
}

