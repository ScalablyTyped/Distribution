package typings
package atPulumiAwsLib.ec2DefaultNetworkAclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultNetworkAclArgs extends js.Object {
  /**
    * The Network ACL ID to manage. This
    * attribute is exported from `aws_vpc`, or manually found via the AWS Console.
    */
  val defaultNetworkAclId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Specifies an egress rule. Parameters defined below.
    */
  val egress: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ActionCidrBlockFromPort]]
    ]
  ] = js.undefined
  /**
    * Specifies an ingress rule. Parameters defined below.
    */
  val ingress: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ActionCidrBlockFromPort]]
    ]
  ] = js.undefined
  /**
    * A list of Subnet IDs to apply the ACL to. See the
    * notes below on managing Subnets in the Default Network ACL
    */
  val subnetIds: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
}

