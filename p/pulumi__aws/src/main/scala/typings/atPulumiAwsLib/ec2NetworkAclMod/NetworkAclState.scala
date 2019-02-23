package typings
package atPulumiAwsLib.ec2NetworkAclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkAclState extends js.Object {
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
    * The ID of the AWS account that owns the network ACL.
    */
  val ownerId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the associated Subnet. This
    * attribute is deprecated, please use the `subnet_ids` attribute instead
    */
  val subnetId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A list of Subnet IDs to apply the ACL to
    */
  val subnetIds: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * The ID of the associated VPC.
    */
  val vpcId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

