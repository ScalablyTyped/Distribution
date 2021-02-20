package typings.reduxFirstRouterLink

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.HTMLAttributes
import typings.reduxFirstRouter.mod.Location
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-first-router-link", JSImport.Default)
  @js.native
  class default ()
    extends Component[LinkProps, js.Object, js.Any]
  
  @JSImport("redux-first-router-link", "NavLink")
  @js.native
  class NavLink protected ()
    extends Component[NavLinkProps, js.Object, js.Any] {
    def this(props: NavLinkProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: NavLinkProps, context: js.Any) = this()
  }
  
  type Link = Component[LinkProps, js.Object, js.Any]
  
  @js.native
  trait LinkProps extends HTMLAttributes[HTMLElement] {
    
    var down: js.UndefOr[Boolean] = js.native
    
    var redirect: js.UndefOr[Boolean] = js.native
    
    var replace: js.UndefOr[Boolean] = js.native
    
    var shouldDispatch: js.UndefOr[Boolean] = js.native
    
    var tagName: js.UndefOr[String] = js.native
    
    var target: js.UndefOr[String] = js.native
    
    var to: To = js.native
  }
  object LinkProps {
    
    @scala.inline
    def apply(to: To): LinkProps = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkProps]
    }
    
    @scala.inline
    implicit class LinkPropsMutableBuilder[Self <: LinkProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDown(value: Boolean): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
      
      @scala.inline
      def setRedirect(value: Boolean): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      @scala.inline
      def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      @scala.inline
      def setShouldDispatch(value: Boolean): Self = StObject.set(x, "shouldDispatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldDispatchUndefined: Self = StObject.set(x, "shouldDispatch", js.undefined)
      
      @scala.inline
      def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTo(value: To): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToVarargs(value: String*): Self = StObject.set(x, "to", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Match[P] extends StObject {
    
    var isExact: Boolean = js.native
    
    var params: P = js.native
    
    var path: String = js.native
    
    var url: String = js.native
  }
  object Match {
    
    @scala.inline
    def apply[P](isExact: Boolean, params: P, path: String, url: String): Match[P] = {
      val __obj = js.Dynamic.literal(isExact = isExact.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Match[P]]
    }
    
    @scala.inline
    implicit class MatchMutableBuilder[Self <: Match[_], P] (val x: Self with Match[P]) extends AnyVal {
      
      @scala.inline
      def setIsExact(value: Boolean): Self = StObject.set(x, "isExact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParams(value: P): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NavLinkProps extends LinkProps {
    
    var activeClassName: js.UndefOr[String] = js.native
    
    var activeStyle: js.UndefOr[CSSProperties] = js.native
    
    var ariaCurrent: js.UndefOr[String] = js.native
    
    var exact: js.UndefOr[Boolean] = js.native
    
    var isActive: js.UndefOr[js.Function2[/* match */ Match[js.Object], /* location */ Location, Boolean]] = js.native
    
    var strict: js.UndefOr[Boolean] = js.native
  }
  object NavLinkProps {
    
    @scala.inline
    def apply(to: To): NavLinkProps = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavLinkProps]
    }
    
    @scala.inline
    implicit class NavLinkPropsMutableBuilder[Self <: NavLinkProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveClassName(value: String): Self = StObject.set(x, "activeClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveClassNameUndefined: Self = StObject.set(x, "activeClassName", js.undefined)
      
      @scala.inline
      def setActiveStyle(value: CSSProperties): Self = StObject.set(x, "activeStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveStyleUndefined: Self = StObject.set(x, "activeStyle", js.undefined)
      
      @scala.inline
      def setAriaCurrent(value: String): Self = StObject.set(x, "ariaCurrent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaCurrentUndefined: Self = StObject.set(x, "ariaCurrent", js.undefined)
      
      @scala.inline
      def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
      
      @scala.inline
      def setIsActive(value: (/* match */ Match[js.Object], /* location */ Location) => Boolean): Self = StObject.set(x, "isActive", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  type To = String | js.Array[String] | js.Object
}
