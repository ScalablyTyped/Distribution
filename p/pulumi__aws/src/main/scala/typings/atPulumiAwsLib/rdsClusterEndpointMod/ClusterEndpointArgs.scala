package typings
package atPulumiAwsLib.rdsClusterEndpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterEndpointArgs extends js.Object {
  /**
    * The identifier to use for the new endpoint. This parameter is stored as a lowercase string.
    */
  val clusterEndpointIdentifier: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The cluster identifier.
    */
  val clusterIdentifier: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The type of the endpoint. One of: READER , ANY .
    */
  val customEndpointType: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible instances are reachable through the custom endpoint. Only relevant if the list of static members is empty. Conflicts with `static_members`.
    */
  val excludedMembers: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * List of DB instance identifiers that are part of the custom endpoint group. Conflicts with `excluded_members`.
    */
  val staticMembers: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
}

