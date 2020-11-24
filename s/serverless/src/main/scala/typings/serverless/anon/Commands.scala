package typings.serverless.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Commands extends js.Object {
  
  var commands: js.UndefOr[StringDictionary[js.Object]] = js.native
  
  var lifecycleEvents: js.UndefOr[js.Array[String]] = js.native
  
  var options: js.UndefOr[StringDictionary[Required]] = js.native
  
  var usage: js.UndefOr[String] = js.native
}
object Commands {
  
  @scala.inline
  def apply(): Commands = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Commands]
  }
  
  @scala.inline
  implicit class CommandsOps[Self <: Commands] (val x: Self) extends AnyVal {
    
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
    def setCommands(value: StringDictionary[js.Object]): Self = this.set("commands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommands: Self = this.set("commands", js.undefined)
    
    @scala.inline
    def setLifecycleEventsVarargs(value: String*): Self = this.set("lifecycleEvents", js.Array(value :_*))
    
    @scala.inline
    def setLifecycleEvents(value: js.Array[String]): Self = this.set("lifecycleEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLifecycleEvents: Self = this.set("lifecycleEvents", js.undefined)
    
    @scala.inline
    def setOptions(value: StringDictionary[Required]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setUsage(value: String): Self = this.set("usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsage: Self = this.set("usage", js.undefined)
  }
}
