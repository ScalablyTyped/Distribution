package typings.storybookUi.panelMod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SafeTabProps extends js.Object {
  
  var children: ReactElement = js.native
  
  var id: String = js.native
  
  var title: js.Function0[String] | String = js.native
}
object SafeTabProps {
  
  @scala.inline
  def apply(children: ReactElement, id: String, title: js.Function0[String] | String): SafeTabProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SafeTabProps]
  }
  
  @scala.inline
  implicit class SafeTabPropsOps[Self <: SafeTabProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleFunction0(value: () => String): Self = this.set("title", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTitle(value: js.Function0[String] | String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
