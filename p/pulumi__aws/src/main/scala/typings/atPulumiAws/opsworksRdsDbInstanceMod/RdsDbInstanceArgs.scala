package typings.atPulumiAws.opsworksRdsDbInstanceMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RdsDbInstanceArgs extends js.Object {
  /**
    * A db password
    */
  val dbPassword: Input[String] = js.native
  /**
    * A db username
    */
  val dbUser: Input[String] = js.native
  /**
    * The db instance to register for this stack. Changing this will force a new resource.
    */
  val rdsDbInstanceArn: Input[String] = js.native
  /**
    * The stack to register a db instance for. Changing this will force a new resource.
    */
  val stackId: Input[String] = js.native
}

object RdsDbInstanceArgs {
  @scala.inline
  def apply(
    dbPassword: Input[String],
    dbUser: Input[String],
    rdsDbInstanceArn: Input[String],
    stackId: Input[String]
  ): RdsDbInstanceArgs = {
    val __obj = js.Dynamic.literal(dbPassword = dbPassword.asInstanceOf[js.Any], dbUser = dbUser.asInstanceOf[js.Any], rdsDbInstanceArn = rdsDbInstanceArn.asInstanceOf[js.Any], stackId = stackId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RdsDbInstanceArgs]
  }
}

