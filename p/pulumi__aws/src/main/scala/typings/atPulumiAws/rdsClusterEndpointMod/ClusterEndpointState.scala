package typings.atPulumiAws.rdsClusterEndpointMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterEndpointState extends js.Object {
  /**
    * Amazon Resource Name (ARN) of cluster
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The identifier to use for the new endpoint. This parameter is stored as a lowercase string.
    */
  val clusterEndpointIdentifier: js.UndefOr[Input[String]] = js.undefined
  /**
    * The cluster identifier.
    */
  val clusterIdentifier: js.UndefOr[Input[String]] = js.undefined
  /**
    * The type of the endpoint. One of: READER , ANY .
    */
  val customEndpointType: js.UndefOr[Input[String]] = js.undefined
  /**
    * A custom endpoint for the Aurora cluster
    */
  val endpoint: js.UndefOr[Input[String]] = js.undefined
  /**
    * List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible instances are reachable through the custom endpoint. Only relevant if the list of static members is empty. Conflicts with `staticMembers`.
    */
  val excludedMembers: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * List of DB instance identifiers that are part of the custom endpoint group. Conflicts with `excludedMembers`.
    */
  val staticMembers: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}

object ClusterEndpointState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    clusterEndpointIdentifier: Input[String] = null,
    clusterIdentifier: Input[String] = null,
    customEndpointType: Input[String] = null,
    endpoint: Input[String] = null,
    excludedMembers: Input[js.Array[Input[String]]] = null,
    staticMembers: Input[js.Array[Input[String]]] = null
  ): ClusterEndpointState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (clusterEndpointIdentifier != null) __obj.updateDynamic("clusterEndpointIdentifier")(clusterEndpointIdentifier.asInstanceOf[js.Any])
    if (clusterIdentifier != null) __obj.updateDynamic("clusterIdentifier")(clusterIdentifier.asInstanceOf[js.Any])
    if (customEndpointType != null) __obj.updateDynamic("customEndpointType")(customEndpointType.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (excludedMembers != null) __obj.updateDynamic("excludedMembers")(excludedMembers.asInstanceOf[js.Any])
    if (staticMembers != null) __obj.updateDynamic("staticMembers")(staticMembers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterEndpointState]
  }
}

