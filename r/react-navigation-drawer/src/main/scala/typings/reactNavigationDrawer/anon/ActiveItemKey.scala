package typings.reactNavigationDrawer.anon

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationRoute
import typings.reactNavigationDrawer.typesMod.DrawerItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveItemKey extends StObject {
  
  /**
    * background color of the active label
    */
  var activeBackgroundColor: js.UndefOr[String] = js.undefined
  
  /**
    * key identifying the active route
    */
  var activeItemKey: js.UndefOr[String] = js.undefined
  
  /**
    * style object to overwrite Text style of the active label, when your label is a string (merged with labelStyle)
    */
  var activeLabelStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * label and icon color of the active label
    */
  var activeTintColor: js.UndefOr[String] = js.undefined
  
  /**
    * style object to overwrite View icon container styles
    */
  var iconContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * background color of the inactive label
    */
  var inactiveBackgroundColor: js.UndefOr[String] = js.undefined
  
  /**
    * style object to overwrite Text style of the inactive label, when your label is a string (merged with labelStyle)
    */
  var inactiveLabelStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * label and icon color of the inactive label
    */
  var inactiveTintColor: js.UndefOr[String] = js.undefined
  
  /**
    * style object for the single item, which can contain an Icon and/or a Label
    */
  var itemStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * the array of routes, can be modified or overridden
    */
  var items: js.UndefOr[js.Array[NavigationRoute[NavigationParams]]] = js.undefined
  
  /**
    * style object for the content section
    */
  var itemsContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * style object to overwrite Text style inside content section, when your label is a string
    */
  var labelStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * function to be invoked when an item is pressed
    */
  var onItemPress: js.UndefOr[js.Function1[/* info */ DrawerItem, Unit]] = js.undefined
}
object ActiveItemKey {
  
  inline def apply(): ActiveItemKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveItemKey]
  }
  
  extension [Self <: ActiveItemKey](x: Self) {
    
    inline def setActiveBackgroundColor(value: String): Self = StObject.set(x, "activeBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setActiveBackgroundColorUndefined: Self = StObject.set(x, "activeBackgroundColor", js.undefined)
    
    inline def setActiveItemKey(value: String): Self = StObject.set(x, "activeItemKey", value.asInstanceOf[js.Any])
    
    inline def setActiveItemKeyUndefined: Self = StObject.set(x, "activeItemKey", js.undefined)
    
    inline def setActiveLabelStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "activeLabelStyle", value.asInstanceOf[js.Any])
    
    inline def setActiveLabelStyleNull: Self = StObject.set(x, "activeLabelStyle", null)
    
    inline def setActiveLabelStyleUndefined: Self = StObject.set(x, "activeLabelStyle", js.undefined)
    
    inline def setActiveTintColor(value: String): Self = StObject.set(x, "activeTintColor", value.asInstanceOf[js.Any])
    
    inline def setActiveTintColorUndefined: Self = StObject.set(x, "activeTintColor", js.undefined)
    
    inline def setIconContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "iconContainerStyle", value.asInstanceOf[js.Any])
    
    inline def setIconContainerStyleNull: Self = StObject.set(x, "iconContainerStyle", null)
    
    inline def setIconContainerStyleUndefined: Self = StObject.set(x, "iconContainerStyle", js.undefined)
    
    inline def setInactiveBackgroundColor(value: String): Self = StObject.set(x, "inactiveBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setInactiveBackgroundColorUndefined: Self = StObject.set(x, "inactiveBackgroundColor", js.undefined)
    
    inline def setInactiveLabelStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "inactiveLabelStyle", value.asInstanceOf[js.Any])
    
    inline def setInactiveLabelStyleNull: Self = StObject.set(x, "inactiveLabelStyle", null)
    
    inline def setInactiveLabelStyleUndefined: Self = StObject.set(x, "inactiveLabelStyle", js.undefined)
    
    inline def setInactiveTintColor(value: String): Self = StObject.set(x, "inactiveTintColor", value.asInstanceOf[js.Any])
    
    inline def setInactiveTintColorUndefined: Self = StObject.set(x, "inactiveTintColor", js.undefined)
    
    inline def setItemStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
    
    inline def setItemStyleNull: Self = StObject.set(x, "itemStyle", null)
    
    inline def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
    
    inline def setItems(value: js.Array[NavigationRoute[NavigationParams]]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "itemsContainerStyle", value.asInstanceOf[js.Any])
    
    inline def setItemsContainerStyleNull: Self = StObject.set(x, "itemsContainerStyle", null)
    
    inline def setItemsContainerStyleUndefined: Self = StObject.set(x, "itemsContainerStyle", js.undefined)
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: NavigationRoute[NavigationParams]*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setLabelStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    inline def setLabelStyleNull: Self = StObject.set(x, "labelStyle", null)
    
    inline def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
    
    inline def setOnItemPress(value: /* info */ DrawerItem => Unit): Self = StObject.set(x, "onItemPress", js.Any.fromFunction1(value))
    
    inline def setOnItemPressUndefined: Self = StObject.set(x, "onItemPress", js.undefined)
  }
}
