package typings.storybookComponents.argJsDocMod

import typings.storybookComponents.typesMod.JsDocTags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArgJsDocArgs extends js.Object {
  
  var tags: JsDocTags = js.native
}
object ArgJsDocArgs {
  
  @scala.inline
  def apply(tags: JsDocTags): ArgJsDocArgs = {
    val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgJsDocArgs]
  }
  
  @scala.inline
  implicit class ArgJsDocArgsOps[Self <: ArgJsDocArgs] (val x: Self) extends AnyVal {
    
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
    def setTags(value: JsDocTags): Self = this.set("tags", value.asInstanceOf[js.Any])
  }
}
