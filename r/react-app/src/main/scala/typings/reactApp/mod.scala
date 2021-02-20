package typings.reactApp

import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-app", "Header")
  @js.native
  class Header protected ()
    extends Component[js.Object, js.Object, js.Any] {
    def this(props: js.Object) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: js.Object, context: js.Any) = this()
  }
  
  @JSImport("react-app", "Layout")
  @js.native
  class Layout protected ()
    extends Component[LayoutProps, js.Object, js.Any] {
    def this(props: LayoutProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: LayoutProps, context: js.Any) = this()
  }
  
  @JSImport("react-app", "Link")
  @js.native
  class Link protected ()
    extends Component[LinkProps, js.Object, js.Any] {
    def this(props: LinkProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: LinkProps, context: js.Any) = this()
  }
  
  @JSImport("react-app", "Navigation")
  @js.native
  class Navigation protected ()
    extends Component[js.Object, js.Object, js.Any] {
    def this(props: js.Object) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: js.Object, context: js.Any) = this()
  }
  
  @JSImport("react-app", "createApp")
  @js.native
  def createApp(createAppObject: CreateAppObject): Element = js.native
  
  @js.native
  trait ChildProps extends StObject {
    
    def action(params: js.Any): js.Any = js.native
    
    var path: String = js.native
  }
  object ChildProps {
    
    @scala.inline
    def apply(action: js.Any => js.Any, path: String): ChildProps = {
      val __obj = js.Dynamic.literal(action = js.Any.fromFunction1(action), path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChildProps]
    }
    
    @scala.inline
    implicit class ChildPropsMutableBuilder[Self <: ChildProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: js.Any => js.Any): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CreateAppObject extends StObject {
    
    var container: typings.std.Element | Null = js.native
    
    var routes: RouteProps = js.native
  }
  object CreateAppObject {
    
    @scala.inline
    def apply(routes: RouteProps): CreateAppObject = {
      val __obj = js.Dynamic.literal(routes = routes.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateAppObject]
    }
    
    @scala.inline
    implicit class CreateAppObjectMutableBuilder[Self <: CreateAppObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainer(value: typings.std.Element): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerNull: Self = StObject.set(x, "container", null)
      
      @scala.inline
      def setRoutes(value: RouteProps): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LayoutProps extends StObject {
    
    var className: String = js.native
  }
  object LayoutProps {
    
    @scala.inline
    def apply(className: String): LayoutProps = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
      __obj.asInstanceOf[LayoutProps]
    }
    
    @scala.inline
    implicit class LayoutPropsMutableBuilder[Self <: LayoutProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LinkProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var onClick: js.UndefOr[js.Function0[Unit]] = js.native
    
    var to: String = js.native
  }
  object LinkProps {
    
    @scala.inline
    def apply(to: String): LinkProps = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkProps]
    }
    
    @scala.inline
    implicit class LinkPropsMutableBuilder[Self <: LinkProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RouteProps extends StObject {
    
    var children: js.Array[ChildProps] = js.native
    
    // takes the form of universal-router routes
    var path: String = js.native
  }
  object RouteProps {
    
    @scala.inline
    def apply(children: js.Array[ChildProps], path: String): RouteProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteProps]
    }
    
    @scala.inline
    implicit class RoutePropsMutableBuilder[Self <: RouteProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[ChildProps]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: ChildProps*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
