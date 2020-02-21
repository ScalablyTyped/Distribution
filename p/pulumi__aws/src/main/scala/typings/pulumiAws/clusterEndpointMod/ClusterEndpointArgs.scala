package typings.pulumiAws.clusterEndpointMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterEndpointArgs extends js.Object {
  /**
    * The identifier to use for the new endpoint. This parameter is stored as a lowercase string.
    */
  val clusterEndpointIdentifier: Input[String] = js.native
  /**
    * The cluster identifier.
    */
  val clusterIdentifier: Input[String] = js.native
  /**
    * The type of the endpoint. One of: READER , ANY .
    */
  val customEndpointType: Input[String] = js.native
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

object ClusterEndpointArgs {
  @scala.inline
  def apply(
    clusterEndpointIdentifier: Input[String],
    clusterIdentifier: Input[String],
    customEndpointType: Input[String],
    excludedMembers: Input[js.Array[Input[String]]] = null,
    staticMembers: Input[js.Array[Input[String]]] = null,
    tags: Input[StringDictionary[_]] = null
  ): ClusterEndpointArgs = {
    val __obj = js.Dynamic.literal(clusterEndpointIdentifier = clusterEndpointIdentifier.asInstanceOf[js.Any], clusterIdentifier = clusterIdentifier.asInstanceOf[js.Any], customEndpointType = customEndpointType.asInstanceOf[js.Any])
    if (excludedMembers != null) __obj.updateDynamic("excludedMembers")(excludedMembers.asInstanceOf[js.Any])
    if (staticMembers != null) __obj.updateDynamic("staticMembers")(staticMembers.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterEndpointArgs]
  }
}

