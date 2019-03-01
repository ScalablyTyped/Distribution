package typings
package atPulumiAwsLib.directconnectConnectionAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionAssociationState extends js.Object {
  /**
    * The ID of the connection.
    */
  val connectionId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the LAG with which to associate the connection.
    */
  val lagId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object ConnectionAssociationState {
  @scala.inline
  def apply(
    connectionId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    lagId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): ConnectionAssociationState = {
    val __obj = js.Dynamic.literal()
    if (connectionId != null) __obj.updateDynamic("connectionId")(connectionId.asInstanceOf[js.Any])
    if (lagId != null) __obj.updateDynamic("lagId")(lagId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionAssociationState]
  }
}

