package typings.reactApp

import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-app", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-app", "Header")
  @js.native
  open class Header protected ()
    extends Component[js.Object, js.Object, Any] {
    def this(props: js.Object) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: js.Object, context: Any) = this()
  }
  
  @JSImport("react-app", "Layout")
  @js.native
  open class Layout protected ()
    extends Component[LayoutProps, js.Object, Any] {
    def this(props: LayoutProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: LayoutProps, context: Any) = this()
  }
  
  @JSImport("react-app", "Link")
  @js.native
  open class Link protected ()
    extends Component[LinkProps, js.Object, Any] {
    def this(props: LinkProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: LinkProps, context: Any) = this()
  }
  
  @JSImport("react-app", "Navigation")
  @js.native
  open class Navigation protected ()
    extends Component[js.Object, js.Object, Any] {
    def this(props: js.Object) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: js.Object, context: Any) = this()
  }
  
  inline def createApp(createAppObject: CreateAppObject): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("createApp")(createAppObject.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ChildProps extends StObject {
    
    def action(params: Any): Any
    
    var path: String
  }
  object ChildProps {
    
    inline def apply(action: Any => Any, path: String): ChildProps = {
      val __obj = js.Dynamic.literal(action = js.Any.fromFunction1(action), path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChildProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChildProps] (val x: Self) extends AnyVal {
      
      inline def setAction(value: Any => Any): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait CreateAppObject extends StObject {
    
    var container: typings.std.Element | Null
    
    var routes: RouteProps
  }
  object CreateAppObject {
    
    inline def apply(routes: RouteProps): CreateAppObject = {
      val __obj = js.Dynamic.literal(routes = routes.asInstanceOf[js.Any], container = null)
      __obj.asInstanceOf[CreateAppObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateAppObject] (val x: Self) extends AnyVal {
      
      inline def setContainer(value: typings.std.Element): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerNull: Self = StObject.set(x, "container", null)
      
      inline def setRoutes(value: RouteProps): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    }
  }
  
  trait LayoutProps extends StObject {
    
    var className: String
  }
  object LayoutProps {
    
    inline def apply(className: String): LayoutProps = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
      __obj.asInstanceOf[LayoutProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LayoutProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    }
  }
  
  trait LinkProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var to: String
  }
  object LinkProps {
    
    inline def apply(to: String): LinkProps = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LinkProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  trait RouteProps extends StObject {
    
    var children: js.Array[ChildProps]
    
    // takes the form of universal-router routes
    var path: String
  }
  object RouteProps {
    
    inline def apply(children: js.Array[ChildProps], path: String): RouteProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RouteProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: js.Array[ChildProps]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: ChildProps*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
