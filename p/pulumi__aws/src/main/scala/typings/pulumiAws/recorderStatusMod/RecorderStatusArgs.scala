package typings.pulumiAws.recorderStatusMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecorderStatusArgs extends js.Object {
  
  /**
    * Whether the configuration recorder should be enabled or disabled.
    */
  val isEnabled: Input[Boolean] = js.native
  
  /**
    * The name of the recorder
    */
  val name: js.UndefOr[Input[String]] = js.native
}
object RecorderStatusArgs {
  
  @scala.inline
  def apply(isEnabled: Input[Boolean]): RecorderStatusArgs = {
    val __obj = js.Dynamic.literal(isEnabled = isEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecorderStatusArgs]
  }
  
  @scala.inline
  implicit class RecorderStatusArgsOps[Self <: RecorderStatusArgs] (val x: Self) extends AnyVal {
    
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
    def setIsEnabled(value: Input[Boolean]): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
