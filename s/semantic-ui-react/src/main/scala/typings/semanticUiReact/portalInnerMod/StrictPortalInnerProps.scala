package typings.semanticUiReact.portalInnerMod

import typings.react.mod.ReactNode
import typings.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrictPortalInnerProps extends js.Object {
  
  /** Primary content. */
  var children: ReactNode = js.native
  
  /** Called with a ref to the inner node. */
  var innerRef: js.UndefOr[Ref[_]] = js.native
  
  /** The node where the portal should mount. */
  var mountNode: js.UndefOr[js.Any] = js.native
  
  /**
    * Called when the PortalInner is mounted on the DOM.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onMount: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ PortalInnerProps, Unit]] = js.native
  
  /**
    * Called when the PortalInner is unmounted from the DOM.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onUnmount: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ PortalInnerProps, Unit]] = js.native
}
object StrictPortalInnerProps {
  
  @scala.inline
  def apply(): StrictPortalInnerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictPortalInnerProps]
  }
  
  @scala.inline
  implicit class StrictPortalInnerPropsOps[Self <: StrictPortalInnerProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setInnerRefFunction1(value: /* instance */ _ | Null => Unit): Self = this.set("innerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInnerRef(value: Ref[_]): Self = this.set("innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerRef: Self = this.set("innerRef", js.undefined)
    
    @scala.inline
    def setInnerRefNull: Self = this.set("innerRef", null)
    
    @scala.inline
    def setMountNode(value: js.Any): Self = this.set("mountNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMountNode: Self = this.set("mountNode", js.undefined)
    
    @scala.inline
    def setOnMount(value: (/* nothing */ Null, /* data */ PortalInnerProps) => Unit): Self = this.set("onMount", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnMount: Self = this.set("onMount", js.undefined)
    
    @scala.inline
    def setOnUnmount(value: (/* nothing */ Null, /* data */ PortalInnerProps) => Unit): Self = this.set("onUnmount", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnUnmount: Self = this.set("onUnmount", js.undefined)
  }
}
