package typings.pulumiAws.rdsDbInstanceMod

import typings.pulumiPulumi.outputMod.Input
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
  def apply(): RdsDbInstanceState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RdsDbInstanceState]
  }
  @scala.inline
  implicit class RdsDbInstanceStateOps[Self <: RdsDbInstanceState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDbPassword(value: Input[String]): Self = this.set("dbPassword", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDbPassword: Self = this.set("dbPassword", js.undefined)
    @scala.inline
    def setDbUser(value: Input[String]): Self = this.set("dbUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDbUser: Self = this.set("dbUser", js.undefined)
    @scala.inline
    def setRdsDbInstanceArn(value: Input[String]): Self = this.set("rdsDbInstanceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRdsDbInstanceArn: Self = this.set("rdsDbInstanceArn", js.undefined)
    @scala.inline
    def setStackId(value: Input[String]): Self = this.set("stackId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackId: Self = this.set("stackId", js.undefined)
  }
  
}

