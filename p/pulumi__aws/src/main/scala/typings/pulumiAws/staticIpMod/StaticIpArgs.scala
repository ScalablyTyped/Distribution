package typings.pulumiAws.staticIpMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StaticIpArgs extends js.Object {
  
  /**
    * The name for the allocated static IP
    */
  val name: js.UndefOr[Input[String]] = js.native
}
object StaticIpArgs {
  
  @scala.inline
  def apply(): StaticIpArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaticIpArgs]
  }
  
  @scala.inline
  implicit class StaticIpArgsOps[Self <: StaticIpArgs] (val x: Self) extends AnyVal {
    
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
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
