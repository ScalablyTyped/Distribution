package typings
package atPulumiAwsLib.directconnectLinkAggregationGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkAggregationGroupArgs extends js.Object {
  /**
    * The bandwidth of the individual physical connections bundled by the LAG. Available values: 1Gbps, 10Gbps. Case sensitive.
    */
  val connectionsBandwidth: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * A boolean that indicates all connections associated with the LAG should be deleted so that the LAG can be destroyed without error. These objects are *not* recoverable.
    */
  val forceDestroy: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The AWS Direct Connect location in which the LAG should be allocated. See [DescribeLocations](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_DescribeLocations.html) for the list of AWS Direct Connect locations. Use `locationCode`.
    */
  val location: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The name of the LAG.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The number of physical connections initially provisioned and bundled by the LAG. Use `aws_dx_connection` and `aws_dx_connection_association` resources instead. Default connections will be removed as part of LAG creation automatically in future versions.
    */
  val numberOfConnections: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
}

object LinkAggregationGroupArgs {
  @scala.inline
  def apply(
    connectionsBandwidth: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    location: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    forceDestroy: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    numberOfConnections: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): LinkAggregationGroupArgs = {
    val __obj = js.Dynamic.literal(connectionsBandwidth = connectionsBandwidth.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    if (forceDestroy != null) __obj.updateDynamic("forceDestroy")(forceDestroy.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (numberOfConnections != null) __obj.updateDynamic("numberOfConnections")(numberOfConnections.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkAggregationGroupArgs]
  }
}

