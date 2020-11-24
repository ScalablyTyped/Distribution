package typings.reachRouter.mod

import typings.react.mod.Ref
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkProps[TState] extends AnchorProps {
  
  var getProps: js.UndefOr[js.Function1[/* props */ LinkGetProps, js.Object]] = js.native
  
  /** @deprecated If using React >= 16.4, use ref instead. */
  var innerRef: js.UndefOr[Ref[HTMLAnchorElement]] = js.native
  
  var replace: js.UndefOr[Boolean] = js.native
  
  var state: js.UndefOr[TState] = js.native
  
  var to: String = js.native
}
object LinkProps {
  
  @scala.inline
  def apply[TState](to: String): LinkProps[TState] = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkProps[TState]]
  }
  
  @scala.inline
  implicit class LinkPropsOps[Self <: LinkProps[_], TState] (val x: Self with LinkProps[TState]) extends AnyVal {
    
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
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetProps(value: /* props */ LinkGetProps => js.Object): Self = this.set("getProps", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetProps: Self = this.set("getProps", js.undefined)
    
    @scala.inline
    def setInnerRefFunction1(value: /* instance */ HTMLAnchorElement | Null => Unit): Self = this.set("innerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInnerRef(value: Ref[HTMLAnchorElement]): Self = this.set("innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerRef: Self = this.set("innerRef", js.undefined)
    
    @scala.inline
    def setInnerRefNull: Self = this.set("innerRef", null)
    
    @scala.inline
    def setReplace(value: Boolean): Self = this.set("replace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplace: Self = this.set("replace", js.undefined)
    
    @scala.inline
    def setState(value: TState): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
