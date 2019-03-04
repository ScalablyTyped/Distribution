package typings
package atPulumiAwsLib.opsworksRdsDbInstanceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RdsDbInstanceArgs extends js.Object {
  /**
    * A db password
    */
  val dbPassword: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * A db username
    */
  val dbUser: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The db instance to register for this stack. Changing this will force a new resource.
    */
  val rdsDbInstanceArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The stack to register a db instance for. Changing this will force a new resource.
    */
  val stackId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object RdsDbInstanceArgs {
  @scala.inline
  def apply(
    dbPassword: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    dbUser: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    rdsDbInstanceArn: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    stackId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): RdsDbInstanceArgs = {
    val __obj = js.Dynamic.literal(dbPassword = dbPassword.asInstanceOf[js.Any], dbUser = dbUser.asInstanceOf[js.Any], rdsDbInstanceArn = rdsDbInstanceArn.asInstanceOf[js.Any], stackId = stackId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RdsDbInstanceArgs]
  }
}

