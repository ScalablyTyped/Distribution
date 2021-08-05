package typings.reactNativeNavigation

import typings.reactNativeNavigation.optionsMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutMod {
  
  trait ExternalComponent extends StObject {
    
    /**
      * Set the screen's id so Navigation.mergeOptions can be used to update options
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * Name of your component
      */
    var name: String | Double
    
    /**
      * Configure component options
      */
    var options: js.UndefOr[Options] = js.undefined
    
    /**
      * Properties to pass down to the component
      */
    var passProps: js.UndefOr[js.Object] = js.undefined
  }
  object ExternalComponent {
    
    inline def apply(name: String | Double): ExternalComponent = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExternalComponent]
    }
    
    extension [Self <: ExternalComponent](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setName(value: String | Double): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPassProps(value: js.Object): Self = StObject.set(x, "passProps", value.asInstanceOf[js.Any])
      
      inline def setPassPropsUndefined: Self = StObject.set(x, "passProps", js.undefined)
    }
  }
  
  trait Layout[P] extends StObject {
    
    /**
      * Set the bottom tabs
      */
    var bottomTabs: js.UndefOr[LayoutBottomTabs] = js.undefined
    
    /**
      * Set the component
      */
    var component: js.UndefOr[LayoutComponent[P]] = js.undefined
    
    /**
      * Set the external component
      */
    var externalComponent: js.UndefOr[ExternalComponent] = js.undefined
    
    /**
      * Set the side menu
      */
    var sideMenu: js.UndefOr[LayoutSideMenu] = js.undefined
    
    /**
      * Set the split view
      */
    var splitView: js.UndefOr[LayoutSplitView] = js.undefined
    
    /**
      * Set the stack
      */
    var stack: js.UndefOr[LayoutStack] = js.undefined
    
    /**
      * Set the top tabs
      */
    var topTabs: js.UndefOr[LayoutTopTabs] = js.undefined
  }
  object Layout {
    
    inline def apply[P](): Layout[P] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Layout[P]]
    }
    
    extension [Self <: Layout[?], P](x: Self & Layout[P]) {
      
      inline def setBottomTabs(value: LayoutBottomTabs): Self = StObject.set(x, "bottomTabs", value.asInstanceOf[js.Any])
      
      inline def setBottomTabsUndefined: Self = StObject.set(x, "bottomTabs", js.undefined)
      
      inline def setComponent(value: LayoutComponent[P]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setExternalComponent(value: ExternalComponent): Self = StObject.set(x, "externalComponent", value.asInstanceOf[js.Any])
      
      inline def setExternalComponentUndefined: Self = StObject.set(x, "externalComponent", js.undefined)
      
      inline def setSideMenu(value: LayoutSideMenu): Self = StObject.set(x, "sideMenu", value.asInstanceOf[js.Any])
      
      inline def setSideMenuUndefined: Self = StObject.set(x, "sideMenu", js.undefined)
      
      inline def setSplitView(value: LayoutSplitView): Self = StObject.set(x, "splitView", value.asInstanceOf[js.Any])
      
      inline def setSplitViewUndefined: Self = StObject.set(x, "splitView", js.undefined)
      
      inline def setStack(value: LayoutStack): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
      
      inline def setTopTabs(value: LayoutTopTabs): Self = StObject.set(x, "topTabs", value.asInstanceOf[js.Any])
      
      inline def setTopTabsUndefined: Self = StObject.set(x, "topTabs", js.undefined)
    }
  }
  
  trait LayoutBottomTabs extends StObject {
    
    /**
      * Set the children screens
      */
    var children: js.UndefOr[js.Array[LayoutTabsChildren]] = js.undefined
    
    /**
      * Set ID of the stack so you can use Navigation.mergeOptions to
      * update options
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * Set the bottom tabs options
      */
    var options: js.UndefOr[Options] = js.undefined
  }
  object LayoutBottomTabs {
    
    inline def apply(): LayoutBottomTabs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutBottomTabs]
    }
    
    extension [Self <: LayoutBottomTabs](x: Self) {
      
      inline def setChildren(value: js.Array[LayoutTabsChildren]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: LayoutTabsChildren*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  trait LayoutComponent[P] extends StObject {
    
    /**
      * Component reference id, Auto generated if empty
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * Name of your component
      */
    var name: String | Double
    
    /**
      * Styling options
      */
    var options: js.UndefOr[Options] = js.undefined
    
    /**
      * Properties to pass down to the component
      */
    var passProps: js.UndefOr[P] = js.undefined
  }
  object LayoutComponent {
    
    inline def apply[P](name: String | Double): LayoutComponent[P] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[LayoutComponent[P]]
    }
    
    extension [Self <: LayoutComponent[?], P](x: Self & LayoutComponent[P]) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setName(value: String | Double): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPassProps(value: P): Self = StObject.set(x, "passProps", value.asInstanceOf[js.Any])
      
      inline def setPassPropsUndefined: Self = StObject.set(x, "passProps", js.undefined)
    }
  }
  
  trait LayoutRoot extends StObject {
    
    var modals: js.UndefOr[js.Any] = js.undefined
    
    var overlays: js.UndefOr[js.Any] = js.undefined
    
    /**
      * Set the root
      */
    var root: Layout[js.Object]
  }
  object LayoutRoot {
    
    inline def apply(root: Layout[js.Object]): LayoutRoot = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[LayoutRoot]
    }
    
    extension [Self <: LayoutRoot](x: Self) {
      
      inline def setModals(value: js.Any): Self = StObject.set(x, "modals", value.asInstanceOf[js.Any])
      
      inline def setModalsUndefined: Self = StObject.set(x, "modals", js.undefined)
      
      inline def setOverlays(value: js.Any): Self = StObject.set(x, "overlays", value.asInstanceOf[js.Any])
      
      inline def setOverlaysUndefined: Self = StObject.set(x, "overlays", js.undefined)
      
      inline def setRoot(value: Layout[js.Object]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
  
  trait LayoutSideMenu extends StObject {
    
    /**
      * Set the center view
      */
    var center: Layout[js.Object]
    
    /**
      * Set ID of the stack so you can use Navigation.mergeOptions to
      * update options
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * Set the left side bar
      */
    var left: js.UndefOr[LayoutStackChildren] = js.undefined
    
    /**
      * Set the bottom tabs options
      */
    var options: js.UndefOr[Options] = js.undefined
    
    /**
      * Set the right side bar
      */
    var right: js.UndefOr[LayoutStackChildren] = js.undefined
  }
  object LayoutSideMenu {
    
    inline def apply(center: Layout[js.Object]): LayoutSideMenu = {
      val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any])
      __obj.asInstanceOf[LayoutSideMenu]
    }
    
    extension [Self <: LayoutSideMenu](x: Self) {
      
      inline def setCenter(value: Layout[js.Object]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLeft(value: LayoutStackChildren): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setRight(value: LayoutStackChildren): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    }
  }
  
  trait LayoutSplitView extends StObject {
    
    /**
      * Set detail layout (the larger screen, flexes)
      */
    var detail: js.UndefOr[Layout[js.Object]] = js.undefined
    
    /**
      * Set ID of the stack so you can use Navigation.mergeOptions to
      * update options
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * Set master layout (the smaller screen, sidebar)
      */
    var master: js.UndefOr[Layout[js.Object]] = js.undefined
    
    /**
      * Configure split view
      */
    var options: js.UndefOr[Options] = js.undefined
  }
  object LayoutSplitView {
    
    inline def apply(): LayoutSplitView = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutSplitView]
    }
    
    extension [Self <: LayoutSplitView](x: Self) {
      
      inline def setDetail(value: Layout[js.Object]): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setMaster(value: Layout[js.Object]): Self = StObject.set(x, "master", value.asInstanceOf[js.Any])
      
      inline def setMasterUndefined: Self = StObject.set(x, "master", js.undefined)
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  trait LayoutStack extends StObject {
    
    /**
      * Set children screens
      */
    var children: js.UndefOr[js.Array[LayoutStackChildren]] = js.undefined
    
    /**
      * Set ID of the stack so you can use Navigation.mergeOptions to
      * update options
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * Set options
      */
    var options: js.UndefOr[Options] = js.undefined
  }
  object LayoutStack {
    
    inline def apply(): LayoutStack = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutStack]
    }
    
    extension [Self <: LayoutStack](x: Self) {
      
      inline def setChildren(value: js.Array[LayoutStackChildren]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: LayoutStackChildren*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  trait LayoutStackChildren extends StObject {
    
    /**
      * Set component
      */
    var component: js.UndefOr[LayoutComponent[js.Object]] = js.undefined
    
    /**
      * Set the external component
      */
    var externalComponent: js.UndefOr[ExternalComponent] = js.undefined
  }
  object LayoutStackChildren {
    
    inline def apply(): LayoutStackChildren = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutStackChildren]
    }
    
    extension [Self <: LayoutStackChildren](x: Self) {
      
      inline def setComponent(value: LayoutComponent[js.Object]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setExternalComponent(value: ExternalComponent): Self = StObject.set(x, "externalComponent", value.asInstanceOf[js.Any])
      
      inline def setExternalComponentUndefined: Self = StObject.set(x, "externalComponent", js.undefined)
    }
  }
  
  trait LayoutTabsChildren extends StObject {
    
    /**
      * Set component
      */
    var component: js.UndefOr[LayoutComponent[js.Object]] = js.undefined
    
    /**
      * Set the external component
      */
    var externalComponent: js.UndefOr[ExternalComponent] = js.undefined
    
    /**
      * Set the side menu
      */
    var sideMenu: js.UndefOr[LayoutSideMenu] = js.undefined
    
    /**
      * Set stack
      */
    var stack: js.UndefOr[LayoutStack] = js.undefined
  }
  object LayoutTabsChildren {
    
    inline def apply(): LayoutTabsChildren = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutTabsChildren]
    }
    
    extension [Self <: LayoutTabsChildren](x: Self) {
      
      inline def setComponent(value: LayoutComponent[js.Object]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setExternalComponent(value: ExternalComponent): Self = StObject.set(x, "externalComponent", value.asInstanceOf[js.Any])
      
      inline def setExternalComponentUndefined: Self = StObject.set(x, "externalComponent", js.undefined)
      
      inline def setSideMenu(value: LayoutSideMenu): Self = StObject.set(x, "sideMenu", value.asInstanceOf[js.Any])
      
      inline def setSideMenuUndefined: Self = StObject.set(x, "sideMenu", js.undefined)
      
      inline def setStack(value: LayoutStack): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
  
  trait LayoutTopTabs extends StObject {
    
    /**
      * Set the children screens
      */
    var children: js.UndefOr[js.Array[LayoutTabsChildren]] = js.undefined
    
    /**
      * Set the layout's id so Navigation.mergeOptions can be used to update options
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * Configure top tabs
      */
    var options: js.UndefOr[Options] = js.undefined
  }
  object LayoutTopTabs {
    
    inline def apply(): LayoutTopTabs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutTopTabs]
    }
    
    extension [Self <: LayoutTopTabs](x: Self) {
      
      inline def setChildren(value: js.Array[LayoutTabsChildren]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: LayoutTabsChildren*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
}
