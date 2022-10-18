package typings.semanticUiReact

import typings.react.mod.ElementType
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.react.mod.Ref
import typings.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import typings.semanticUiReact.distCommonjsModulesTabTabPaneMod.TabPaneProps
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Children[TProps /* <: Record[String, Any] */] extends StObject {
    
    // Not all TProps can have `children`, without this condition it will match to "any"
    var children: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: TProps extends {  children :any} ? TProps['children'] | semantic-ui-react.semantic-ui-react/dist/commonjs/generic.ShorthandRenderFunction<react.react.ElementType<TProps>, TProps> : semantic-ui-react.semantic-ui-react/dist/commonjs/generic.ShorthandRenderFunction<react.react.ElementType<TProps>, TProps> */ js.Any
      ] = js.undefined
  }
  object Children {
    
    inline def apply[TProps /* <: Record[String, Any] */](): Children[TProps] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children[TProps]]
    }
    
    extension [Self <: Children[?], TProps /* <: Record[String, Any] */](x: Self & Children[TProps]) {
      
      inline def setChildren(
        value: /* import warning: importer.ImportType#apply Failed type conversion: TProps extends {  children :any} ? TProps['children'] | semantic-ui-react.semantic-ui-react/dist/commonjs/generic.ShorthandRenderFunction<react.react.ElementType<TProps>, TProps> : semantic-ui-react.semantic-ui-react/dist/commonjs/generic.ShorthandRenderFunction<react.react.ElementType<TProps>, TProps> */ js.Any
      ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait MenuItem extends StObject {
    
    var menuItem: js.UndefOr[Any] = js.undefined
    
    var pane: js.UndefOr[SemanticShorthandItem[TabPaneProps]] = js.undefined
    
    var render: js.UndefOr[js.Function0[ReactNode]] = js.undefined
  }
  object MenuItem {
    
    inline def apply(): MenuItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuItem]
    }
    
    extension [Self <: MenuItem](x: Self) {
      
      inline def setMenuItem(value: Any): Self = StObject.set(x, "menuItem", value.asInstanceOf[js.Any])
      
      inline def setMenuItemUndefined: Self = StObject.set(x, "menuItem", js.undefined)
      
      inline def setPane(value: SemanticShorthandItem[TabPaneProps]): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
      
      inline def setPaneFunction3(
        value: (/* component */ ElementType[TabPaneProps], TabPaneProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "pane", js.Any.fromFunction3(value))
      
      inline def setPaneUndefined: Self = StObject.set(x, "pane", js.undefined)
      
      inline def setRender(value: () => ReactNode): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    }
  }
  
  /* Inlined std.Pick<semantic-ui-react.semantic-ui-react/dist/commonjs/modules/Search/SearchCategoryLayout.SearchCategoryLayoutProps, 'categoryContent' | 'resultsContent'> */
  trait PickSearchCategoryLayoutP extends StObject {
    
    var categoryContent: ReactElement
    
    var resultsContent: ReactElement
  }
  object PickSearchCategoryLayoutP {
    
    inline def apply(categoryContent: ReactElement, resultsContent: ReactElement): PickSearchCategoryLayoutP = {
      val __obj = js.Dynamic.literal(categoryContent = categoryContent.asInstanceOf[js.Any], resultsContent = resultsContent.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickSearchCategoryLayoutP]
    }
    
    extension [Self <: PickSearchCategoryLayoutP](x: Self) {
      
      inline def setCategoryContent(value: ReactElement): Self = StObject.set(x, "categoryContent", value.asInstanceOf[js.Any])
      
      inline def setResultsContent(value: ReactElement): Self = StObject.set(x, "resultsContent", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<@fluentui/react-component-ref.@fluentui/react-component-ref/dist/es/Ref.RefProps> */
  trait ReadonlyRefProps extends StObject {
    
    val children: ReactElement
    
    val innerRef: Ref[HTMLElement]
  }
  object ReadonlyRefProps {
    
    inline def apply(children: ReactElement): ReadonlyRefProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], innerRef = null)
      __obj.asInstanceOf[ReadonlyRefProps]
    }
    
    extension [Self <: ReadonlyRefProps](x: Self) {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setInnerRef(value: Ref[HTMLElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
    }
  }
}
