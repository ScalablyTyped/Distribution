package typings.atPulumiAws.directconnectConnectionAssociationMod

import typings.atPulumiPulumi.outputMod.Input
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
  def apply(connectionId: Input[String] = null, lagId: Input[String] = null): ConnectionAssociationState = {
    val __obj = js.Dynamic.literal()
    if (connectionId != null) __obj.updateDynamic("connectionId")(connectionId.asInstanceOf[js.Any])
    if (lagId != null) __obj.updateDynamic("lagId")(lagId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionAssociationState]
  }
}

