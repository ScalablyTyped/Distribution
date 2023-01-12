package typings.reactBreadcrumbs

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.FunctionComponent
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactNode
import typings.reactBreadcrumbs.anon.Title
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-breadcrumbs", "Breadcrumb")
  @js.native
  open class Breadcrumb protected ()
    extends Component[PropsWithChildren[BreadcrumbProps], js.Object, Any] {
    def this(props: PropsWithChildren[BreadcrumbProps]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PropsWithChildren[BreadcrumbProps], context: Any) = this()
  }
  
  @JSImport("react-breadcrumbs", "Breadcrumbs")
  @js.native
  open class Breadcrumbs protected ()
    extends Component[PropsWithChildren[BreadcrumbsProps], js.Object, Any] {
    def this(props: PropsWithChildren[BreadcrumbsProps]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PropsWithChildren[BreadcrumbsProps], context: Any) = this()
  }
  
  trait BreadcrumbProps extends StObject {
    
    var data: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocationDescriptor */ Any) & Title
    
    var hidden: js.UndefOr[Boolean] = js.undefined
  }
  object BreadcrumbProps {
    
    inline def apply(
      data: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocationDescriptor */ Any) & Title
    ): BreadcrumbProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[BreadcrumbProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BreadcrumbProps] (val x: Self) extends AnyVal {
      
      inline def setData(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocationDescriptor */ Any) & Title
      ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    }
  }
  
  trait BreadcrumbsProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var separator: js.UndefOr[ReactNode] = js.undefined
    
    var setCrumbs: js.UndefOr[js.Function1[/* crumbs */ Crumbs, ReactNode]] = js.undefined
    
    var wrapper: js.UndefOr[FunctionComponent[js.Object] | (ComponentClass[js.Object, ComponentState])] = js.undefined
  }
  object BreadcrumbsProps {
    
    inline def apply(): BreadcrumbsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreadcrumbsProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BreadcrumbsProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setSeparator(value: ReactNode): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setSetCrumbs(value: /* crumbs */ Crumbs => ReactNode): Self = StObject.set(x, "setCrumbs", js.Any.fromFunction1(value))
      
      inline def setSetCrumbsUndefined: Self = StObject.set(x, "setCrumbs", js.undefined)
      
      inline def setWrapper(value: FunctionComponent[js.Object] | (ComponentClass[js.Object, ComponentState])): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    }
  }
  
  trait Crumbs extends StObject
}
