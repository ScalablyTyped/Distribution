package typings.pulumiAws.connectionAssociationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionAssociationState extends js.Object {
  /**
    * The ID of the connection.
    */
  val connectionId: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the LAG with which to associate the connection.
    */
  val lagId: js.UndefOr[Input[String]] = js.native
}

object ConnectionAssociationState {
  @scala.inline
  def apply(): ConnectionAssociationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionAssociationState]
  }
  @scala.inline
  implicit class ConnectionAssociationStateOps[Self <: ConnectionAssociationState] (val x: Self) extends AnyVal {
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
    def setConnectionId(value: Input[String]): Self = this.set("connectionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionId: Self = this.set("connectionId", js.undefined)
    @scala.inline
    def setLagId(value: Input[String]): Self = this.set("lagId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLagId: Self = this.set("lagId", js.undefined)
  }
  
}

