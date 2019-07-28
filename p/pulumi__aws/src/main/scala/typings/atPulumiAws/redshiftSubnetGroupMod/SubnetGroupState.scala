package typings.atPulumiAws.redshiftSubnetGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubnetGroupState extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the Redshift Subnet group name
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the Redshift Subnet group.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * An array of VPC subnet IDs.
    */
  val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
}

object SubnetGroupState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    description: Input[String] = null,
    name: Input[String] = null,
    subnetIds: Input[js.Array[Input[String]]] = null,
    tags: Input[StringDictionary[_]] = null
  ): SubnetGroupState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (subnetIds != null) __obj.updateDynamic("subnetIds")(subnetIds.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubnetGroupState]
  }
}

