package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudwatchEvent extends js.Object {
  
  var description: js.UndefOr[String] = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var event: String = js.native
  
  var input: js.UndefOr[Input] = js.native
  
  var inputPath: js.UndefOr[String] = js.native
  
  var inputTransformer: js.UndefOr[InputTransformer] = js.native
  
  var name: js.UndefOr[String] = js.native
}
object CloudwatchEvent {
  
  @scala.inline
  def apply(event: String): CloudwatchEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudwatchEvent]
  }
  
  @scala.inline
  implicit class CloudwatchEventOps[Self <: CloudwatchEvent] (val x: Self) extends AnyVal {
    
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
    def setEvent(value: String): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setInput(value: Input): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    
    @scala.inline
    def setInputPath(value: String): Self = this.set("inputPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputPath: Self = this.set("inputPath", js.undefined)
    
    @scala.inline
    def setInputTransformer(value: InputTransformer): Self = this.set("inputTransformer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputTransformer: Self = this.set("inputTransformer", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
