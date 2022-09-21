package typings.reactMdLink

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.ElementType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdLink.anon.PickLinkWithComponentProp
import typings.reactMdLink.reactMdLinkStrings._blank
import typings.reactMdLink.reactMdLinkStrings._parent
import typings.reactMdLink.reactMdLinkStrings._self
import typings.reactMdLink.reactMdLinkStrings._top
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkMod {
  
  @JSImport("@react-md/link/types/Link", "Link")
  @js.native
  val Link: ForwardRefExoticComponent[
    (LinkProps & (RefAttributes[HTMLAnchorElement | ElementType[Any]])) | PickLinkWithComponentProp
  ] = js.native
  
  trait LinkProps
    extends StObject
       with AnchorHTMLAttributes[HTMLAnchorElement] {
    
    /**
      * An optional component to render as. This should really only be used if you
      * are using a router library like
      * {@link https://github.com/ReactTraining/react-router|react-router} or
      * {@link https://github.com/reach/router|@reach/router}. This will call
      * `createElement` with this value and provide all props and class name.
      */
    var component: js.UndefOr[ElementType[Any]] = js.undefined
    
    /**
      * Boolean if the Link should be positioned with a flexbox and align the items
      * centered. This is disabled by default but can be useful when rendering
      * icons within the link.
      */
    var flexCentered: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the link should automatically be updated to apply
      * `rel=noopener noreferrer` when the `target` prop is set to `"_blank"`. This
      * is recommended to have enabled by default, but can be disabled by setting
      * this prop to `false` or specifying a `rel` prop yourself. You can read
      * more about the reason for this
      * {@link https://mathiasbynens.github.io/rel-noopener/|here}.
      */
    var preventMaliciousTarget: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An optional target for the link to be opened in. It is recommended to keep
      * this undefined in most cases. If this is not `_blank`, `_parent`, `_self`,
      * or `_top`, it should be the frame name that the link should be rendered in
      * if using frames.
      */
    @JSName("target")
    var target_LinkProps: js.UndefOr[_blank | _parent | _self | _top | String] = js.undefined
  }
  object LinkProps {
    
    inline def apply(): LinkProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinkProps]
    }
    
    extension [Self <: LinkProps](x: Self) {
      
      inline def setComponent(value: ElementType[Any]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setFlexCentered(value: Boolean): Self = StObject.set(x, "flexCentered", value.asInstanceOf[js.Any])
      
      inline def setFlexCenteredUndefined: Self = StObject.set(x, "flexCentered", js.undefined)
      
      inline def setPreventMaliciousTarget(value: Boolean): Self = StObject.set(x, "preventMaliciousTarget", value.asInstanceOf[js.Any])
      
      inline def setPreventMaliciousTargetUndefined: Self = StObject.set(x, "preventMaliciousTarget", js.undefined)
      
      inline def setTarget(value: _blank | _parent | _self | _top | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait LinkWithComponentProps
    extends StObject
       with LinkProps
       with /**
    * I'm not really sure of a good way to implement this, but when the
    * `component` prop is provided, all valid props from that component should
    * also be allowed.
    */
  /* key */ StringDictionary[Any] {
    
    @JSName("component")
    var component_LinkWithComponentProps: ElementType[Any]
  }
  object LinkWithComponentProps {
    
    inline def apply(component: ElementType[Any]): LinkWithComponentProps = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkWithComponentProps]
    }
    
    extension [Self <: LinkWithComponentProps](x: Self) {
      
      inline def setComponent(value: ElementType[Any]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    }
  }
}
