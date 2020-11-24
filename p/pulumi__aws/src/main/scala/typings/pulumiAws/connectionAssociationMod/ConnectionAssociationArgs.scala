package typings.pulumiAws.connectionAssociationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionAssociationArgs extends js.Object {
  
  /**
    * The ID of the connection.
    */
  val connectionId: Input[String] = js.native
  
  /**
    * The ID of the LAG with which to associate the connection.
    */
  val lagId: Input[String] = js.native
}
object ConnectionAssociationArgs {
  
  @scala.inline
  def apply(connectionId: Input[String], lagId: Input[String]): ConnectionAssociationArgs = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], lagId = lagId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionAssociationArgs]
  }
  
  @scala.inline
  implicit class ConnectionAssociationArgsOps[Self <: ConnectionAssociationArgs] (val x: Self) extends AnyVal {
    
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
    def setLagId(value: Input[String]): Self = this.set("lagId", value.asInstanceOf[js.Any])
  }
}
