package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ElementType
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.iconIconMod.IconProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object breadcrumbDividerMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/collections/Breadcrumb/BreadcrumbDivider", JSImport.Default)
  @js.native
  val default: StatelessComponent[BreadcrumbDividerProps] = js.native
  
  trait BreadcrumbDividerProps
    extends StObject
       with StrictBreadcrumbDividerProps
       with /* key */ StringDictionary[js.Any]
  object BreadcrumbDividerProps {
    
    @scala.inline
    def apply(): BreadcrumbDividerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreadcrumbDividerProps]
    }
  }
  
  trait StrictBreadcrumbDividerProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** Render as an `Icon` component with `divider` class instead of a `div`. */
    var icon: js.UndefOr[SemanticShorthandItem[IconProps]] = js.undefined
  }
  object StrictBreadcrumbDividerProps {
    
    @scala.inline
    def apply(): StrictBreadcrumbDividerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictBreadcrumbDividerProps]
    }
    
    @scala.inline
    implicit class StrictBreadcrumbDividerPropsMutableBuilder[Self <: StrictBreadcrumbDividerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setIcon(value: SemanticShorthandItem[IconProps]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconFunction3(
        value: (/* component */ ElementType[IconProps], IconProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "icon", js.Any.fromFunction3(value))
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    }
  }
  
  type _To = StatelessComponent[BreadcrumbDividerProps]
  
  /* This means you don't have to write `default`, but can instead just say `breadcrumbDividerMod.foo` */
  override def _to: StatelessComponent[BreadcrumbDividerProps] = default
}
