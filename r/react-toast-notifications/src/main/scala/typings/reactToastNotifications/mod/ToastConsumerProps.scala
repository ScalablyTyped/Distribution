package typings.reactToastNotifications.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToastConsumerProps extends js.Object {
  
  def children(context: ToastConsumerContext): ReactNode = js.native
}
object ToastConsumerProps {
  
  @scala.inline
  def apply(children: ToastConsumerContext => ReactNode): ToastConsumerProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[ToastConsumerProps]
  }
  
  @scala.inline
  implicit class ToastConsumerPropsOps[Self <: ToastConsumerProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: ToastConsumerContext => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
  }
}
