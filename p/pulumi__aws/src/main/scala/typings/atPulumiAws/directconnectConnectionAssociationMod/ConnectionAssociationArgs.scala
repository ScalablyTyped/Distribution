package typings.atPulumiAws.directconnectConnectionAssociationMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionAssociationArgs extends js.Object {
  /**
    * The ID of the connection.
    */
  val connectionId: Input[String]
  /**
    * The ID of the LAG with which to associate the connection.
    */
  val lagId: Input[String]
}

object ConnectionAssociationArgs {
  @scala.inline
  def apply(connectionId: Input[String], lagId: Input[String]): ConnectionAssociationArgs = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], lagId = lagId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConnectionAssociationArgs]
  }
}

