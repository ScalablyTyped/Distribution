package typings.reactMdLink.linkMod

import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.ElementType
import typings.reactMdLink.reactMdLinkStrings._blank
import typings.reactMdLink.reactMdLinkStrings._parent
import typings.reactMdLink.reactMdLinkStrings._self
import typings.reactMdLink.reactMdLinkStrings._top
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkProps extends AnchorHTMLAttributes[HTMLAnchorElement] {
  
  /**
    * An optional component to render as. This should really only be used if you
    * are using a router library like
    * [react-router](https://github.com/ReactTraining/react-router) or
    * [@reach/router](https://github.com/reach/router). This will call
    * `createElement` with this value and provide all props and class name.
    */
  var component: js.UndefOr[ElementType[_]] = js.native
  
  /**
    * Boolean if the Link should be positioned with a flexbox and align the items
    * centered. This is disabled by default but can be useful when rendering
    * icons within the link.
    */
  var flexCentered: js.UndefOr[Boolean] = js.native
  
  /**
    * Boolean if the link should automatically be updated to apply `rel=noopener
    * noreferrer` when the `target` prop is set to `"_blank"`. This is
    * recommended to have enabled by default, but can be disabled by setting this
    * prop to `false` or specificying a `rel` prop yourself. You can read more
    * about the reason for this
    * [here](https://mathiasbynens.github.io/rel-noopener/).
    */
  var preventMaliciousTarget: js.UndefOr[Boolean] = js.native
  
  /**
    * An optional target for the link to be opened in. It is recommended to keep
    * this undefined in most cases. If this is not `_blank`, `_parent`, `_self`,
    * or `_top`, it should be the frame name that the link should be rendered in
    * if using frames.
    */
  @JSName("target")
  var target_LinkProps: js.UndefOr[_blank | _parent | _self | _top | String] = js.native
}
object LinkProps {
  
  @scala.inline
  def apply(): LinkProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkProps]
  }
  
  @scala.inline
  implicit class LinkPropsOps[Self <: LinkProps] (val x: Self) extends AnyVal {
    
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
    def setComponent(value: ElementType[_]): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setFlexCentered(value: Boolean): Self = this.set("flexCentered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlexCentered: Self = this.set("flexCentered", js.undefined)
    
    @scala.inline
    def setPreventMaliciousTarget(value: Boolean): Self = this.set("preventMaliciousTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventMaliciousTarget: Self = this.set("preventMaliciousTarget", js.undefined)
    
    @scala.inline
    def setTarget(value: _blank | _parent | _self | _top | String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}
