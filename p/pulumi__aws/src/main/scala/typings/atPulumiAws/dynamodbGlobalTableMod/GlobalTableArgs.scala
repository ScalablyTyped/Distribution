package typings.atPulumiAws.dynamodbGlobalTableMod

import typings.atPulumiAws.Anon_RegionNameInput
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalTableArgs extends js.Object {
  /**
    * The name of the global table. Must match underlying DynamoDB Table names in all regions.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Underlying DynamoDB Table. At least 1 replica must be defined. See below.
    */
  val replicas: Input[js.Array[Input[Anon_RegionNameInput]]]
}

object GlobalTableArgs {
  @scala.inline
  def apply(replicas: Input[js.Array[Input[Anon_RegionNameInput]]], name: Input[String] = null): GlobalTableArgs = {
    val __obj = js.Dynamic.literal(replicas = replicas.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalTableArgs]
  }
}

