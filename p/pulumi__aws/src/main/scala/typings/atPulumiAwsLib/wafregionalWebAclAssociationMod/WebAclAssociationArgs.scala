package typings
package atPulumiAwsLib.wafregionalWebAclAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebAclAssociationArgs extends js.Object {
  /**
    * Application Load Balancer ARN to associate with.
    */
  val resourceArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The ID of the WAF Regional WebACL to create an association.
    */
  val webAclId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

