package typings.storybookAddonActions.actionDisplayMod

import typings.storybookAddonActions.actionOptionsMod.ActionOptions
import typings.storybookAddonActions.anon.Args
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionDisplay extends js.Object {
  
  var count: Double = js.native
  
  var data: Args = js.native
  
  var id: String = js.native
  
  var options: ActionOptions = js.native
}
object ActionDisplay {
  
  @scala.inline
  def apply(count: Double, data: Args, id: String, options: ActionOptions): ActionDisplay = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionDisplay]
  }
  
  @scala.inline
  implicit class ActionDisplayOps[Self <: ActionDisplay] (val x: Self) extends AnyVal {
    
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: Args): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: ActionOptions): Self = this.set("options", value.asInstanceOf[js.Any])
  }
}
