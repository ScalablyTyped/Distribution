package typings.atPulumiAws.rdsClusterEndpointMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterEndpointArgs extends js.Object {
  /**
    * The identifier to use for the new endpoint. This parameter is stored as a lowercase string.
    */
  val clusterEndpointIdentifier: Input[String]
  /**
    * The cluster identifier.
    */
  val clusterIdentifier: Input[String]
  /**
    * The type of the endpoint. One of: READER , ANY .
    */
  val customEndpointType: Input[String]
  /**
    * List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible instances are reachable through the custom endpoint. Only relevant if the list of static members is empty. Conflicts with `static_members`.
    */
  val excludedMembers: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * List of DB instance identifiers that are part of the custom endpoint group. Conflicts with `excluded_members`.
    */
  val staticMembers: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}

object ClusterEndpointArgs {
  @scala.inline
  def apply(
    clusterEndpointIdentifier: Input[String],
    clusterIdentifier: Input[String],
    customEndpointType: Input[String],
    excludedMembers: Input[js.Array[Input[String]]] = null,
    staticMembers: Input[js.Array[Input[String]]] = null
  ): ClusterEndpointArgs = {
    val __obj = js.Dynamic.literal(clusterEndpointIdentifier = clusterEndpointIdentifier.asInstanceOf[js.Any], clusterIdentifier = clusterIdentifier.asInstanceOf[js.Any], customEndpointType = customEndpointType.asInstanceOf[js.Any])
    if (excludedMembers != null) __obj.updateDynamic("excludedMembers")(excludedMembers.asInstanceOf[js.Any])
    if (staticMembers != null) __obj.updateDynamic("staticMembers")(staticMembers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterEndpointArgs]
  }
}

