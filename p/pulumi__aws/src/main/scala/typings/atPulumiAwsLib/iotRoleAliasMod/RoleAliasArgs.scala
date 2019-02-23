package typings
package atPulumiAwsLib.iotRoleAliasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoleAliasArgs extends js.Object {
  /**
    * The name of the role alias.
    */
  val alias: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The duration of the credential, in seconds. If you do not specify a value for this setting, the default maximum of one hour is applied. This setting can have a value from 900 seconds (15 minutes) to 3600 seconds (60 minutes).
    */
  val credentialDuration: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * The identity of the role to which the alias refers.
    */
  val roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

