package typings
package atPulumiAwsLib.ec2GetVpcPeeringConnectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVpcPeeringConnectionResult extends js.Object {
  /**
    * A configuration block that describes [VPC Peering Connection]
    * (http://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide) options set for the accepter VPC.
    */
  val accepter: org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  val cidrBlock: java.lang.String
  val id: java.lang.String
  val ownerId: java.lang.String
  val peerCidrBlock: java.lang.String
  val peerOwnerId: java.lang.String
  val peerRegion: java.lang.String
  val peerVpcId: java.lang.String
  val region: java.lang.String
  /**
    * A configuration block that describes [VPC Peering Connection]
    * (http://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide) options set for the requester VPC.
    */
  val requester: org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  val status: java.lang.String
  val tags: org.scalablytyped.runtime.StringDictionary[js.Any]
  val vpcId: java.lang.String
}

