package typings.pulumiAws.clusterEndpointMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterEndpointState extends js.Object {
  /**
    * Amazon Resource Name (ARN) of cluster
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The identifier to use for the new endpoint. This parameter is stored as a lowercase string.
    */
  val clusterEndpointIdentifier: js.UndefOr[Input[String]] = js.native
  /**
    * The cluster identifier.
    */
  val clusterIdentifier: js.UndefOr[Input[String]] = js.native
  /**
    * The type of the endpoint. One of: READER , ANY .
    */
  val customEndpointType: js.UndefOr[Input[String]] = js.native
  /**
    * A custom endpoint for the Aurora cluster
    */
  val endpoint: js.UndefOr[Input[String]] = js.native
  /**
    * List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible instances are reachable through the custom endpoint. Only relevant if the list of static members is empty. Conflicts with `staticMembers`.
    */
  val excludedMembers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * List of DB instance identifiers that are part of the custom endpoint group. Conflicts with `excludedMembers`.
    */
  val staticMembers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
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
    staticMembers: Input[js.Array[Input[String]]] = null,
    tags: Input[StringDictionary[_]] = null
  ): ClusterEndpointState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (clusterEndpointIdentifier != null) __obj.updateDynamic("clusterEndpointIdentifier")(clusterEndpointIdentifier.asInstanceOf[js.Any])
    if (clusterIdentifier != null) __obj.updateDynamic("clusterIdentifier")(clusterIdentifier.asInstanceOf[js.Any])
    if (customEndpointType != null) __obj.updateDynamic("customEndpointType")(customEndpointType.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (excludedMembers != null) __obj.updateDynamic("excludedMembers")(excludedMembers.asInstanceOf[js.Any])
    if (staticMembers != null) __obj.updateDynamic("staticMembers")(staticMembers.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterEndpointState]
  }
}

