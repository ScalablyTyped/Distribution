package typings.pulumiAws.resourceShareAccepterMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceShareAccepterArgs extends js.Object {
  
  /**
    * The ARN of the resource share.
    */
  val shareArn: Input[String] = js.native
}
object ResourceShareAccepterArgs {
  
  @scala.inline
  def apply(shareArn: Input[String]): ResourceShareAccepterArgs = {
    val __obj = js.Dynamic.literal(shareArn = shareArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceShareAccepterArgs]
  }
  
  @scala.inline
  implicit class ResourceShareAccepterArgsOps[Self <: ResourceShareAccepterArgs] (val x: Self) extends AnyVal {
    
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
    def setShareArn(value: Input[String]): Self = this.set("shareArn", value.asInstanceOf[js.Any])
  }
}
