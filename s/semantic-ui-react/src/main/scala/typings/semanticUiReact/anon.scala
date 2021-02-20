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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0`[TProps /* <: Record[String, _] */] extends StObject {
    
    // Not all TProps can have `children`, without this condition it will match to "any"
    var children: js.UndefOr[
        (ShorthandRenderFunction[ElementType[TProps], TProps]) | (/* import warning: importer.ImportType#apply Failed type conversion: TProps['children'] */ js.Any)
      ] = js.native
  }
  object `0` {
    
    @scala.inline
    def apply[TProps /* <: Record[String, _] */](): `0`[TProps] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`[TProps]]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`[_], TProps /* <: Record[String, _] */] (val x: Self with `0`[TProps]) extends AnyVal {
      
      @scala.inline
      def setChildren(
        value: (ShorthandRenderFunction[ElementType[TProps], TProps]) | (/* import warning: importer.ImportType#apply Failed type conversion: TProps['children'] */ js.Any)
      ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction2(value: (ElementType[TProps], TProps) => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction2(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  @js.native
  trait Children extends StObject {
    
    var children: js.Any = js.native
  }
  object Children {
    
    @scala.inline
    def apply(children: js.Any): Children = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit class ChildrenMutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MenuItem extends StObject {
    
    var menuItem: js.UndefOr[js.Any] = js.native
    
    var pane: js.UndefOr[SemanticShorthandItem[TabPaneProps]] = js.native
    
    var render: js.UndefOr[js.Function0[ReactNode]] = js.native
  }
  object MenuItem {
    
    @scala.inline
    def apply(): MenuItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuItem]
    }
    
    @scala.inline
    implicit class MenuItemMutableBuilder[Self <: MenuItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMenuItem(value: js.Any): Self = StObject.set(x, "menuItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuItemUndefined: Self = StObject.set(x, "menuItem", js.undefined)
      
      @scala.inline
      def setPane(value: SemanticShorthandItem[TabPaneProps]): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaneFunction3(
        value: (/* component */ ElementType[TabPaneProps], TabPaneProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "pane", js.Any.fromFunction3(value))
      
      @scala.inline
      def setPaneUndefined: Self = StObject.set(x, "pane", js.undefined)
      
      @scala.inline
      def setRender(value: () => ReactNode): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    }
  }
}
