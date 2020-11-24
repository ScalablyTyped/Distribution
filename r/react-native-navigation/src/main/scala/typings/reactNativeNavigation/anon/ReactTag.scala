package typings.reactNativeNavigation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactTag extends js.Object {
  
  var reactTag: Double | Null = js.native
}
object ReactTag {
  
  @scala.inline
  def apply(): ReactTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactTag]
  }
  
  @scala.inline
  implicit class ReactTagOps[Self <: ReactTag] (val x: Self) extends AnyVal {
    
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
    def setReactTag(value: Double): Self = this.set("reactTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReactTagNull: Self = this.set("reactTag", null)
  }
}
