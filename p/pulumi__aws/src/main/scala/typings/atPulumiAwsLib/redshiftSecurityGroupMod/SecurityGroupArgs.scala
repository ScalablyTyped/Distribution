package typings
package atPulumiAwsLib.redshiftSecurityGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityGroupArgs extends js.Object {
  /**
    * The description of the Redshift security group. Defaults to "Managed by Terraform".
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A list of ingress rules.
    */
  val ingress: atPulumiPulumiLib.outputMod.Input[
    js.Array[
      atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_CidrSecurityGroupNameSecurityGroupOwnerId]
    ]
  ]
  /**
    * The name of the Redshift security group.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

