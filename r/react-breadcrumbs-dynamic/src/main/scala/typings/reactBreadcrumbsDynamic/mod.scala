package typings.reactBreadcrumbsDynamic

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-breadcrumbs-dynamic", "Breadcrumbs")
  @js.native
  open class Breadcrumbs protected ()
    extends Component[BreadcrumbsProps, js.Object, Any] {
    def this(props: BreadcrumbsProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: BreadcrumbsProps, context: Any) = this()
  }
  
  @JSImport("react-breadcrumbs-dynamic", "BreadcrumbsItem")
  @js.native
  open class BreadcrumbsItem protected ()
    extends Component[BreadcrumbsItemProps, js.Object, Any] {
    def this(props: BreadcrumbsItemProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: BreadcrumbsItemProps, context: Any) = this()
  }
  
  @JSImport("react-breadcrumbs-dynamic", "BreadcrumbsProvider")
  @js.native
  open class BreadcrumbsProvider protected ()
    extends Component[BreadcrumbsProviderProps, js.Object, Any] {
    def this(props: BreadcrumbsProviderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: BreadcrumbsProviderProps, context: Any) = this()
  }
  
  trait BreadcrumbsItemProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var to: String
  }
  object BreadcrumbsItemProps {
    
    inline def apply(to: String): BreadcrumbsItemProps = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[BreadcrumbsItemProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BreadcrumbsItemProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  trait BreadcrumbsProps extends StObject {
    
    var container: js.UndefOr[String | Element | js.Object] = js.undefined
    
    var containerProps: js.UndefOr[js.Object] = js.undefined
    
    var duplicateProps: js.UndefOr[js.Object] = js.undefined
    
    var finalItem: js.UndefOr[String | Element | js.Object] = js.undefined
    
    var finalProps: js.UndefOr[js.Object] = js.undefined
    
    var item: js.UndefOr[String | Element | js.Object] = js.undefined
    
    var renameProps: js.UndefOr[js.Object] = js.undefined
    
    var separator: js.UndefOr[String | Element | js.Object] = js.undefined
  }
  object BreadcrumbsProps {
    
    inline def apply(): BreadcrumbsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreadcrumbsProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BreadcrumbsProps] (val x: Self) extends AnyVal {
      
      inline def setContainer(value: String | Element | js.Object): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerProps(value: js.Object): Self = StObject.set(x, "containerProps", value.asInstanceOf[js.Any])
      
      inline def setContainerPropsUndefined: Self = StObject.set(x, "containerProps", js.undefined)
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setDuplicateProps(value: js.Object): Self = StObject.set(x, "duplicateProps", value.asInstanceOf[js.Any])
      
      inline def setDuplicatePropsUndefined: Self = StObject.set(x, "duplicateProps", js.undefined)
      
      inline def setFinalItem(value: String | Element | js.Object): Self = StObject.set(x, "finalItem", value.asInstanceOf[js.Any])
      
      inline def setFinalItemUndefined: Self = StObject.set(x, "finalItem", js.undefined)
      
      inline def setFinalProps(value: js.Object): Self = StObject.set(x, "finalProps", value.asInstanceOf[js.Any])
      
      inline def setFinalPropsUndefined: Self = StObject.set(x, "finalProps", js.undefined)
      
      inline def setItem(value: String | Element | js.Object): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
      
      inline def setRenameProps(value: js.Object): Self = StObject.set(x, "renameProps", value.asInstanceOf[js.Any])
      
      inline def setRenamePropsUndefined: Self = StObject.set(x, "renameProps", js.undefined)
      
      inline def setSeparator(value: String | Element | js.Object): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    }
  }
  
  trait BreadcrumbsProviderProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var shouldBreadcrumbsUpdate: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
  }
  object BreadcrumbsProviderProps {
    
    inline def apply(): BreadcrumbsProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreadcrumbsProviderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BreadcrumbsProviderProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setShouldBreadcrumbsUpdate(value: /* repeated */ Any => Any): Self = StObject.set(x, "shouldBreadcrumbsUpdate", js.Any.fromFunction1(value))
      
      inline def setShouldBreadcrumbsUpdateUndefined: Self = StObject.set(x, "shouldBreadcrumbsUpdate", js.undefined)
    }
  }
}
