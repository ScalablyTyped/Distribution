package typings
package atPulumiAwsLib.opsworksRdsDbInstanceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RdsDbInstanceState extends js.Object {
  /**
    * A db password
    */
  val dbPassword: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A db username
    */
  val dbUser: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The db instance to register for this stack. Changing this will force a new resource.
    */
  val rdsDbInstanceArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The stack to register a db instance for. Changing this will force a new resource.
    */
  val stackId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object RdsDbInstanceState {
  @scala.inline
  def apply(
    dbPassword: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    dbUser: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    rdsDbInstanceArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    stackId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): RdsDbInstanceState = {
    val __obj = js.Dynamic.literal()
    if (dbPassword != null) __obj.updateDynamic("dbPassword")(dbPassword.asInstanceOf[js.Any])
    if (dbUser != null) __obj.updateDynamic("dbUser")(dbUser.asInstanceOf[js.Any])
    if (rdsDbInstanceArn != null) __obj.updateDynamic("rdsDbInstanceArn")(rdsDbInstanceArn.asInstanceOf[js.Any])
    if (stackId != null) __obj.updateDynamic("stackId")(stackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RdsDbInstanceState]
  }
}

