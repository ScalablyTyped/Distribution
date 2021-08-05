package typings.semanticUiReact

import typings.react.mod.ElementType
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.genericMod.ShorthandRenderFunction
import typings.semanticUiReact.tabPaneMod.TabPaneProps
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0`[TProps /* <: Record[String, js.Any] */] extends StObject {
    
    // Not all TProps can have `children`, without this condition it will match to "any"
    var children: js.UndefOr[
        (ShorthandRenderFunction[ElementType[TProps], TProps]) | (/* import warning: importer.ImportType#apply Failed type conversion: TProps['children'] */ js.Any)
      ] = js.undefined
  }
  object `0` {
    
    inline def apply[TProps /* <: Record[String, js.Any] */](): `0`[TProps] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`[TProps]]
    }
    
    extension [Self <: `0`[?], TProps /* <: Record[String, js.Any] */](x: Self & `0`[TProps]) {
      
      inline def setChildren(
        value: (ShorthandRenderFunction[ElementType[TProps], TProps]) | (/* import warning: importer.ImportType#apply Failed type conversion: TProps['children'] */ js.Any)
      ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction2(value: (ElementType[TProps], TProps) => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction2(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait Children extends StObject {
    
    var children: js.Any
  }
  object Children {
    
    inline def apply(children: js.Any): Children = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[Children]
    }
    
    extension [Self <: Children](x: Self) {
      
      inline def setChildren(value: js.Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    }
  }
  
  trait MenuItem extends StObject {
    
    var menuItem: js.UndefOr[js.Any] = js.undefined
    
    var pane: js.UndefOr[SemanticShorthandItem[TabPaneProps]] = js.undefined
    
    var render: js.UndefOr[js.Function0[ReactNode]] = js.undefined
  }
  object MenuItem {
    
    inline def apply(): MenuItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuItem]
    }
    
    extension [Self <: MenuItem](x: Self) {
      
      inline def setMenuItem(value: js.Any): Self = StObject.set(x, "menuItem", value.asInstanceOf[js.Any])
      
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
}
