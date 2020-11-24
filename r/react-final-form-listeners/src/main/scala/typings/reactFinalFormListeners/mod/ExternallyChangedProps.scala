package typings.reactFinalFormListeners.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExternallyChangedProps extends js.Object {
  
  def children(externallyChanged: Boolean): ReactNode = js.native
  
  var name: String = js.native
}
object ExternallyChangedProps {
  
  @scala.inline
  def apply(children: Boolean => ReactNode, name: String): ExternallyChangedProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternallyChangedProps]
  }
  
  @scala.inline
  implicit class ExternallyChangedPropsOps[Self <: ExternallyChangedProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: Boolean => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
