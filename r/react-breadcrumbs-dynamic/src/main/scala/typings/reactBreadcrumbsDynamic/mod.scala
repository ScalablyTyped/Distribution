package typings.reactBreadcrumbsDynamic

import typings.react.mod.Component
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-breadcrumbs-dynamic", "Breadcrumbs")
  @js.native
  class Breadcrumbs protected ()
    extends Component[BreadcrumbsProps, js.Object, js.Any] {
    def this(props: BreadcrumbsProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: BreadcrumbsProps, context: js.Any) = this()
  }
  
  @JSImport("react-breadcrumbs-dynamic", "BreadcrumbsItem")
  @js.native
  class BreadcrumbsItem protected ()
    extends Component[BreadcrumbsItemProps, js.Object, js.Any] {
    def this(props: BreadcrumbsItemProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: BreadcrumbsItemProps, context: js.Any) = this()
  }
  
  @JSImport("react-breadcrumbs-dynamic", "BreadcrumbsProvider")
  @js.native
  class BreadcrumbsProvider protected ()
    extends Component[BreadcrumbsProviderProps, js.Object, js.Any] {
    def this(props: BreadcrumbsProviderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: BreadcrumbsProviderProps, context: js.Any) = this()
  }
  
  trait BreadcrumbsItemProps extends StObject {
    
    var to: String
  }
  object BreadcrumbsItemProps {
    
    inline def apply(to: String): BreadcrumbsItemProps = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[BreadcrumbsItemProps]
    }
    
    extension [Self <: BreadcrumbsItemProps](x: Self) {
      
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
    
    extension [Self <: BreadcrumbsProps](x: Self) {
      
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
    
    var shouldBreadcrumbsUpdate: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
  }
  object BreadcrumbsProviderProps {
    
    inline def apply(): BreadcrumbsProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreadcrumbsProviderProps]
    }
    
    extension [Self <: BreadcrumbsProviderProps](x: Self) {
      
      inline def setShouldBreadcrumbsUpdate(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "shouldBreadcrumbsUpdate", js.Any.fromFunction1(value))
      
      inline def setShouldBreadcrumbsUpdateUndefined: Self = StObject.set(x, "shouldBreadcrumbsUpdate", js.undefined)
    }
  }
}
