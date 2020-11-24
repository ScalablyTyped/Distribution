package typings.reactRouterDom.mod

import typings.history.mod.Location
import typings.history.mod.LocationDescriptor
import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.ComponentType
import typings.react.mod.Ref
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkProps[S] extends AnchorHTMLAttributes[HTMLAnchorElement] {
  
  var component: js.UndefOr[ComponentType[_]] = js.native
  
  var innerRef: js.UndefOr[Ref[HTMLAnchorElement]] = js.native
  
  var replace: js.UndefOr[Boolean] = js.native
  
  var to: LocationDescriptor[S] | (js.Function1[/* location */ Location[S], LocationDescriptor[S]]) = js.native
}
object LinkProps {
  
  @scala.inline
  def apply[S](to: LocationDescriptor[S] | (js.Function1[/* location */ Location[S], LocationDescriptor[S]])): LinkProps[S] = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkProps[S]]
  }
  
  @scala.inline
  implicit class LinkPropsOps[Self <: LinkProps[_], S] (val x: Self with LinkProps[S]) extends AnyVal {
    
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
    def setToFunction1(value: /* location */ Location[S] => LocationDescriptor[S]): Self = this.set("to", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTo(value: LocationDescriptor[S] | (js.Function1[/* location */ Location[S], LocationDescriptor[S]])): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponent(value: ComponentType[_]): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
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
  }
}
