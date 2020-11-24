package typings.reactPortal.mod

import typings.react.mod.Props
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortalWithStateProps
  extends Props[js.Any] {
  
  @JSName("children")
  def children_MPortalWithStateProps(params: PortalFunctionParams): ReactNode = js.native
  
  var closeOnEsc: js.UndefOr[Boolean] = js.native
  
  var closeOnOutsideClick: js.UndefOr[Boolean] = js.native
  
  var defaultOpen: js.UndefOr[Boolean] = js.native
  
  var node: js.UndefOr[Element | Null] = js.native
  
  var onClose: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onOpen: js.UndefOr[js.Function0[Unit]] = js.native
  
  var openByClickOn: js.UndefOr[ReactElement] = js.native
}
object PortalWithStateProps {
  
  @scala.inline
  def apply(children: PortalFunctionParams => ReactNode): PortalWithStateProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[PortalWithStateProps]
  }
  
  @scala.inline
  implicit class PortalWithStatePropsOps[Self <: PortalWithStateProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: PortalFunctionParams => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCloseOnEsc(value: Boolean): Self = this.set("closeOnEsc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnEsc: Self = this.set("closeOnEsc", js.undefined)
    
    @scala.inline
    def setCloseOnOutsideClick(value: Boolean): Self = this.set("closeOnOutsideClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnOutsideClick: Self = this.set("closeOnOutsideClick", js.undefined)
    
    @scala.inline
    def setDefaultOpen(value: Boolean): Self = this.set("defaultOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultOpen: Self = this.set("defaultOpen", js.undefined)
    
    @scala.inline
    def setNode(value: Element): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNode: Self = this.set("node", js.undefined)
    
    @scala.inline
    def setNodeNull: Self = this.set("node", null)
    
    @scala.inline
    def setOnClose(value: () => Unit): Self = this.set("onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setOnOpen(value: () => Unit): Self = this.set("onOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnOpen: Self = this.set("onOpen", js.undefined)
    
    @scala.inline
    def setOpenByClickOn(value: ReactElement): Self = this.set("openByClickOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenByClickOn: Self = this.set("openByClickOn", js.undefined)
  }
}
