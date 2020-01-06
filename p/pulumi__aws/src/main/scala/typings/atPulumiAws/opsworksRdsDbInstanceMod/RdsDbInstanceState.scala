package typings.atPulumiAws.opsworksRdsDbInstanceMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RdsDbInstanceState extends js.Object {
  /**
    * A db password
    */
  val dbPassword: js.UndefOr[Input[String]] = js.native
  /**
    * A db username
    */
  val dbUser: js.UndefOr[Input[String]] = js.native
  /**
    * The db instance to register for this stack. Changing this will force a new resource.
    */
  val rdsDbInstanceArn: js.UndefOr[Input[String]] = js.native
  /**
    * The stack to register a db instance for. Changing this will force a new resource.
    */
  val stackId: js.UndefOr[Input[String]] = js.native
}

object RdsDbInstanceState {
  @scala.inline
  def apply(
    dbPassword: Input[String] = null,
    dbUser: Input[String] = null,
    rdsDbInstanceArn: Input[String] = null,
    stackId: Input[String] = null
  ): RdsDbInstanceState = {
    val __obj = js.Dynamic.literal()
    if (dbPassword != null) __obj.updateDynamic("dbPassword")(dbPassword.asInstanceOf[js.Any])
    if (dbUser != null) __obj.updateDynamic("dbUser")(dbUser.asInstanceOf[js.Any])
    if (rdsDbInstanceArn != null) __obj.updateDynamic("rdsDbInstanceArn")(rdsDbInstanceArn.asInstanceOf[js.Any])
    if (stackId != null) __obj.updateDynamic("stackId")(stackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RdsDbInstanceState]
  }
}

