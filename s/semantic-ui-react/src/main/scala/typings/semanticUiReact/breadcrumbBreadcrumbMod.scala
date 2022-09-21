package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ElementType
import typings.react.mod.FC
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.semanticUiReact.breadcrumbDividerMod.BreadcrumbDividerProps
import typings.semanticUiReact.breadcrumbSectionMod.BreadcrumbSectionProps
import typings.semanticUiReact.genericMod.SemanticShorthandCollection
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.iconIconMod.IconProps
import typings.semanticUiReact.semanticUiReactStrings.big
import typings.semanticUiReact.semanticUiReactStrings.huge
import typings.semanticUiReact.semanticUiReactStrings.large
import typings.semanticUiReact.semanticUiReactStrings.massive
import typings.semanticUiReact.semanticUiReactStrings.mini
import typings.semanticUiReact.semanticUiReactStrings.small
import typings.semanticUiReact.semanticUiReactStrings.tiny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object breadcrumbBreadcrumbMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/collections/Breadcrumb/Breadcrumb", JSImport.Default)
  @js.native
  open class default protected () extends Component[BreadcrumbProps, ComponentState, Any] {
    def this(props: BreadcrumbProps) = this()
    def this(props: BreadcrumbProps, context: Any) = this()
  }
  object default extends Shortcut {
    
    @JSImport("semantic-ui-react/dist/commonjs/collections/Breadcrumb/Breadcrumb", JSImport.Default)
    @js.native
    val ^ : BreadcrumbComponent = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/collections/Breadcrumb/Breadcrumb", "default.Section")
    @js.native
    open class Section protected () extends Component[BreadcrumbSectionProps, ComponentState, Any] {
      def this(props: BreadcrumbSectionProps) = this()
      def this(props: BreadcrumbSectionProps, context: Any) = this()
    }
    
    type _To = BreadcrumbComponent
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: BreadcrumbComponent = ^
  }
  
  @js.native
  trait BreadcrumbComponent
    extends StObject
       with ComponentClass[BreadcrumbProps, ComponentState] {
    
    var Divider: FC[BreadcrumbDividerProps] = js.native
    
    var Section: ComponentClass[BreadcrumbSectionProps, ComponentState] = js.native
  }
  
  trait BreadcrumbProps
    extends StObject
       with StrictBreadcrumbProps
       with /* key */ StringDictionary[Any]
  object BreadcrumbProps {
    
    inline def apply(): BreadcrumbProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreadcrumbProps]
    }
  }
  
  trait StrictBreadcrumbProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content of the Breadcrumb.Divider. */
    var divider: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** For use with the sections prop. Render as an `Icon` component with `divider` class instead of a `div` in
      *  Breadcrumb.Divider.
      */
    var icon: js.UndefOr[SemanticShorthandItem[IconProps]] = js.undefined
    
    /** Shorthand array of props for Breadcrumb.Section. */
    var sections: js.UndefOr[SemanticShorthandCollection[BreadcrumbSectionProps]] = js.undefined
    
    /** Size of Breadcrumb */
    var size: js.UndefOr[mini | tiny | small | large | big | huge | massive] = js.undefined
  }
  object StrictBreadcrumbProps {
    
    inline def apply(): StrictBreadcrumbProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictBreadcrumbProps]
    }
    
    extension [Self <: StrictBreadcrumbProps](x: Self) {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDivider(value: SemanticShorthandContent): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
      
      inline def setDividerUndefined: Self = StObject.set(x, "divider", js.undefined)
      
      inline def setIcon(value: SemanticShorthandItem[IconProps]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconFunction3(
        value: (/* component */ ElementType[IconProps], IconProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "icon", js.Any.fromFunction3(value))
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setSections(value: SemanticShorthandCollection[BreadcrumbSectionProps]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
      
      inline def setSectionsUndefined: Self = StObject.set(x, "sections", js.undefined)
      
      inline def setSectionsVarargs(value: SemanticShorthandItem[BreadcrumbSectionProps]*): Self = StObject.set(x, "sections", js.Array(value*))
      
      inline def setSize(value: mini | tiny | small | large | big | huge | massive): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
