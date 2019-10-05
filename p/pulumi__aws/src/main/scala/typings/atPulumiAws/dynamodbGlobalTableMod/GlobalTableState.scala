package typings.atPulumiAws.dynamodbGlobalTableMod

import typings.atPulumiAws.typesInputMod.dynamodb.GlobalTableReplica
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalTableState extends js.Object {
  /**
    * The ARN of the DynamoDB Global Table
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the global table. Must match underlying DynamoDB Table names in all regions.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Underlying DynamoDB Table. At least 1 replica must be defined. See below.
    */
  val replicas: js.UndefOr[Input[js.Array[Input[GlobalTableReplica]]]] = js.undefined
}

object GlobalTableState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    name: Input[String] = null,
    replicas: Input[js.Array[Input[GlobalTableReplica]]] = null
  ): GlobalTableState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (replicas != null) __obj.updateDynamic("replicas")(replicas.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalTableState]
  }
}

