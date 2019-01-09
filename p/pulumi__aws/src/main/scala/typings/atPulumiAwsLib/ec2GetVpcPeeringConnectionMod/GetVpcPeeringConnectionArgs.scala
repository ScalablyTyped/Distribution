package typings
package atPulumiAwsLib.ec2GetVpcPeeringConnectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVpcPeeringConnectionArgs extends js.Object {
  /**
    * The CIDR block of the requester VPC of the specific VPC Peering Connection to retrieve.
    */
  val cidrBlock: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Custom filter block as described below.
    */
  val filters: js.UndefOr[js.Array[atPulumiAwsLib.Anon_NameValues]] = js.undefined
  /**
    * The ID of the specific VPC Peering Connection to retrieve.
    */
  val id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The AWS account ID of the owner of the requester VPC of the specific VPC Peering Connection to retrieve.
    */
  val ownerId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The CIDR block of the accepter VPC of the specific VPC Peering Connection to retrieve.
    */
  val peerCidrBlock: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The AWS account ID of the owner of the accepter VPC of the specific VPC Peering Connection to retrieve.
    */
  val peerOwnerId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The region of the accepter VPC of the specific VPC Peering Connection to retrieve.
    */
  val peerRegion: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The ID of the accepter VPC of the specific VPC Peering Connection to retrieve.
    */
  val peerVpcId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The region of the requester VPC of the specific VPC Peering Connection to retrieve.
    */
  val region: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The status of the specific VPC Peering Connection to retrieve.
    */
  val status: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A mapping of tags, each pair of which must exactly match
    * a pair on the desired VPC Peering Connection.
    */
  val tags: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /**
    * The ID of the requester VPC of the specific VPC Peering Connection to retrieve.
    */
  val vpcId: js.UndefOr[java.lang.String] = js.undefined
}

