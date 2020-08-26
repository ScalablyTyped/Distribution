package typings.pulumiAws.principalAssociationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrincipalAssociationState extends js.Object {
  /**
    * The principal to associate with the resource share. Possible values are an AWS account ID, an AWS Organizations Organization ARN, or an AWS Organizations Organization Unit ARN.
    */
  val principal: js.UndefOr[Input[String]] = js.native
  /**
    * The Amazon Resource Name (ARN) of the resource share.
    */
  val resourceShareArn: js.UndefOr[Input[String]] = js.native
}

object PrincipalAssociationState {
  @scala.inline
  def apply(): PrincipalAssociationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrincipalAssociationState]
  }
  @scala.inline
  implicit class PrincipalAssociationStateOps[Self <: PrincipalAssociationState] (val x: Self) extends AnyVal {
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
    def setPrincipal(value: Input[String]): Self = this.set("principal", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrincipal: Self = this.set("principal", js.undefined)
    @scala.inline
    def setResourceShareArn(value: Input[String]): Self = this.set("resourceShareArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceShareArn: Self = this.set("resourceShareArn", js.undefined)
  }
  
}

