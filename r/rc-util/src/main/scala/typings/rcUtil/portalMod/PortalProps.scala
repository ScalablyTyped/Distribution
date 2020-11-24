package typings.rcUtil.portalMod

import typings.react.mod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortalProps extends js.Object {
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var didUpdate: js.UndefOr[js.Function1[/* prevProps */ this.type, Unit]] = js.native
  
  def getContainer(): HTMLElement = js.native
}
object PortalProps {
  
  @scala.inline
  def apply(getContainer: () => HTMLElement): PortalProps = {
    val __obj = js.Dynamic.literal(getContainer = js.Any.fromFunction0(getContainer))
    __obj.asInstanceOf[PortalProps]
  }
  
  @scala.inline
  implicit class PortalPropsOps[Self <: PortalProps] (val x: Self) extends AnyVal {
    
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
    def setGetContainer(value: () => HTMLElement): Self = this.set("getContainer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setDidUpdate(value: PortalProps => Unit): Self = this.set("didUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDidUpdate: Self = this.set("didUpdate", js.undefined)
  }
}
