package typings.senchaTouch.Ext

import typings.senchaTouch.Ext.scroll.IView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IContainer
  extends StObject
     with IComponent {
  
  /** [Config Option] (Object/String/Number) */
  var activeItem: js.UndefOr[js.Any] = js.undefined
  
  /** [Method] Adds one or more Components to this Container
    * @param newItems Object/Object[]/Ext.Component/Ext.Component[] The new items to add to the Container.
    * @returns Ext.Component The last item added to the Container from the newItems array.
    */
  var add: js.UndefOr[js.Function1[/* newItems */ js.UndefOr[js.Any], IComponent]] = js.undefined
  
  /** [Method] Adds an array of Components to this Container
    * @param items Array The array of items to add to this container.
    * @returns Array The array of items after they have been added.
    */
  var addAll: js.UndefOr[js.Function1[/* items */ js.UndefOr[Array], Array]] = js.undefined
  
  /** [Method] Animates to the supplied activeItem with a specified animation
    * @param activeItem Object/Number The item or item index to make active.
    * @param animation Object/Ext.fx.layout.Card Card animation configuration or instance.
    */
  var animateActiveItem: js.UndefOr[
    js.Function2[/* activeItem */ js.UndefOr[js.Any], /* animation */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  
  /** [Method] Changes the masked configuration when its setter is called which will convert the value into a proper object instanc
    * @param masked Boolean/Object/Ext.Mask/Ext.LoadMask
    * @returns Object
    */
  var applyMasked: js.UndefOr[js.Function1[/* masked */ js.UndefOr[js.Any], js.Any]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var autoDestroy: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String/Object/Boolean) */
  var cardSwitchAnimation: js.UndefOr[js.Any] = js.undefined
  
  /** [Method] Retrieves the first direct child of this container which matches the passed selector
    * @param selector String An Ext.ComponentQuery selector.
    * @returns Ext.Component
    */
  var child: js.UndefOr[js.Function1[/* selector */ js.UndefOr[java.lang.String], IComponent]] = js.undefined
  
  /** [Config Option] (Object) */
  var control: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (String) */
  var defaultType: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Config Option] (Object) */
  var defaults: js.UndefOr[js.Any] = js.undefined
  
  /** [Method] Retrieves the first descendant of this container which matches the passed selector
    * @param selector String An Ext.ComponentQuery selector.
    * @returns Ext.Component
    */
  var down: js.UndefOr[js.Function1[/* selector */ js.UndefOr[java.lang.String], IComponent]] = js.undefined
  
  /** [Method] Returns the value of activeItem
    * @returns Object/String/Number
    */
  var getActiveItem: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the Component for a given index in the Container s items
    * @param index Number The index of the Component to return.
    * @returns Ext.Component The item at the specified index, if found.
    */
  var getAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], IComponent]] = js.undefined
  
  /** [Method] Returns the value of autoDestroy
    * @returns Boolean
    */
  var getAutoDestroy: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Examines this container s items property and gets a direct child component of this container
    * @param component String/Number This parameter may be any of the following:  {String} : representing the itemId or id of the child component. {Number} : representing the position of the child component within the items property. For additional information see Ext.util.MixedCollection.get.
    * @returns Ext.Component The component (if found).
    */
  var getComponent: js.UndefOr[js.Function1[/* component */ js.UndefOr[js.Any], IComponent]] = js.undefined
  
  /** [Method] Returns the value of control
    * @returns Object
    */
  var getControl: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of defaultType
    * @returns String
    */
  var getDefaultType: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
  /** [Method] Returns the value of defaults
    * @returns Object
    */
  var getDefaults: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Finds a docked item of this container using a reference idor an index of its location in getDockedItems
    * @param component String/Number The id or index of the component to find.
    * @returns Ext.Component/Boolean The docked component, if found.
    */
  var getDockedComponent: js.UndefOr[js.Function1[/* component */ js.UndefOr[js.Any], js.Any]] = js.undefined
  
  /** [Method] Returns all the Ext Component docked items in this container
    * @returns Array The docked items of this container.
    */
  var getDockedItems: js.UndefOr[js.Function0[Array]] = js.undefined
  
  /** [Method] Returns the value of hideOnMaskTap
    * @returns Boolean
    */
  var getHideOnMaskTap: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns all inner items of this container
    * @returns Array The inner items of this container.
    */
  var getInnerItems: js.UndefOr[js.Function0[Array]] = js.undefined
  
  /** [Method] Returns the value of items
    * @returns Array/Object
    */
  var getItems: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of masked
    * @returns Boolean/Object/Ext.Mask/Ext.LoadMask
    */
  var getMasked: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of modal
    * @returns Boolean
    */
  var getModal: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns an the scrollable instance for this container which is a Ext scroll View class
    * @returns Ext.scroll.View The scroll view.
    */
  var getScrollable: js.UndefOr[js.Function0[IView]] = js.undefined
  
  /** [Method] Hides this Component optionally using an animation
    * @returns Ext.Component
    */
  @JSName("hide")
  var hide_IContainer: js.UndefOr[js.Function0[IComponent]] = js.undefined
  
  /** [Method] Adds a child Component at the given index
    * @param index Number The index to insert the Component at.
    * @param item Object The Component to insert.
    */
  var insert: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[Double], /* item */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  
  /** [Config Option] (Array/Object) */
  var items: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (Object/String) */
  var layout: js.UndefOr[js.Any] = js.undefined
  
  /** [Method] Convenience method which calls setMasked with a value of true to show the mask
    * @param mask Object
    */
  var mask: js.UndefOr[js.Function1[/* mask */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Config Option] (Boolean/Object/Ext.Mask/Ext.LoadMask) */
  var masked: js.UndefOr[js.Any] = js.undefined
  
  /** [Method] Retrieves all descendant components which match the passed selector
    * @param selector String Selector complying to an Ext.ComponentQuery selector.
    * @returns Array Ext.Component's which matched the selector.
    */
  var query: js.UndefOr[js.Function1[/* selector */ js.UndefOr[java.lang.String], Array]] = js.undefined
  
  /** [Method] Removes an item from this Container optionally destroying it
    * @param item Object The item to remove.
    * @param destroy Boolean Calls the Component's destroy method if true.
    * @returns Ext.Component this
    */
  var remove: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* destroy */ js.UndefOr[Boolean], IComponent]
  ] = js.undefined
  
  /** [Method] Removes all items currently in the Container optionally destroying them all
    * @param destroy Boolean If true, destroys each removed Component.
    * @param everything Boolean If true, completely remove all items including docked / centered and floating items.
    * @returns Ext.Component this
    */
  var removeAll: js.UndefOr[
    js.Function2[/* destroy */ js.UndefOr[Boolean], /* everything */ js.UndefOr[Boolean], IComponent]
  ] = js.undefined
  
  /** [Method] Removes the Component at the specified index  myContainer removeAt 0 removes the first item
    * @param index Number The index of the Component to remove.
    * @returns Ext.Container this
    */
  var removeAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], this.type]] = js.undefined
  
  /** [Method] Removes a docked item from this Container
    * @param item Object The item to remove.
    * @param destroy Boolean Calls the Component's destroy method if true.
    * @returns Ext.Component this
    */
  var removeDocked: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* destroy */ js.UndefOr[Boolean], IComponent]
  ] = js.undefined
  
  /** [Method] Removes an inner Component at the specified index  myContainer removeInnerAt 0 removes the first item of the in
    * @param index Number The index of the Component to remove.
    * @returns Ext.Container this
    */
  var removeInnerAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], this.type]] = js.undefined
  
  /** [Config Option] (Boolean/String/Object) */
  var scrollable: js.UndefOr[js.Any] = js.undefined
  
  /** [Method] Sets the value of activeItem
    * @param activeItem Object/String/Number The new value.
    */
  var setActiveItem: js.UndefOr[js.Function1[/* activeItem */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of autoDestroy
    * @param autoDestroy Boolean The new value.
    */
  var setAutoDestroy: js.UndefOr[js.Function1[/* autoDestroy */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of control
    * @param control Object The new value.
    */
  var setControl: js.UndefOr[js.Function1[/* control */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of defaultType
    * @param defaultType String The new value.
    */
  var setDefaultType: js.UndefOr[js.Function1[/* defaultType */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
  /** [Method] Sets the value of defaults
    * @param defaults Object The new value.
    */
  var setDefaults: js.UndefOr[js.Function1[/* defaults */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of hideOnMaskTap
    * @param hideOnMaskTap Boolean The new value.
    */
  var setHideOnMaskTap: js.UndefOr[js.Function1[/* hideOnMaskTap */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of items
    * @param items Array/Object The new value.
    */
  var setItems: js.UndefOr[js.Function1[/* items */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of layout
    * @param layout Object/String The new value.
    */
  var setLayout: js.UndefOr[js.Function1[/* layout */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of masked
    * @param masked Boolean/Object/Ext.Mask/Ext.LoadMask The new value.
    */
  var setMasked: js.UndefOr[js.Function1[/* masked */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of modal
    * @param modal Boolean The new value.
    */
  var setModal: js.UndefOr[js.Function1[/* modal */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of scrollable
    * @param scrollable Boolean/String/Object The new value.
    * @returns Ext.scroll.View The scroll view.
    */
  @JSName("setScrollable")
  var setScrollable_IContainer: js.UndefOr[js.Function1[/* scrollable */ js.UndefOr[js.Any], IView]] = js.undefined
  
  /** [Method] Shows this component optionally using an animation
    * @returns Ext.Component
    */
  @JSName("show")
  var show_IContainer: js.UndefOr[js.Function0[IComponent]] = js.undefined
  
  /** [Method] Convenience method which calls setMasked with a value of false to hide the mask */
  var unmask: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object IContainer {
  
  inline def apply(): IContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IContainer]
  }
  
  extension [Self <: IContainer](x: Self) {
    
    inline def setActiveItem(value: js.Any): Self = StObject.set(x, "activeItem", value.asInstanceOf[js.Any])
    
    inline def setActiveItemUndefined: Self = StObject.set(x, "activeItem", js.undefined)
    
    inline def setAdd(value: /* newItems */ js.UndefOr[js.Any] => IComponent): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setAddAll(value: /* items */ js.UndefOr[Array] => Array): Self = StObject.set(x, "addAll", js.Any.fromFunction1(value))
    
    inline def setAddAllUndefined: Self = StObject.set(x, "addAll", js.undefined)
    
    inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    inline def setAnimateActiveItem(value: (/* activeItem */ js.UndefOr[js.Any], /* animation */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "animateActiveItem", js.Any.fromFunction2(value))
    
    inline def setAnimateActiveItemUndefined: Self = StObject.set(x, "animateActiveItem", js.undefined)
    
    inline def setApplyMasked(value: /* masked */ js.UndefOr[js.Any] => js.Any): Self = StObject.set(x, "applyMasked", js.Any.fromFunction1(value))
    
    inline def setApplyMaskedUndefined: Self = StObject.set(x, "applyMasked", js.undefined)
    
    inline def setAutoDestroy(value: Boolean): Self = StObject.set(x, "autoDestroy", value.asInstanceOf[js.Any])
    
    inline def setAutoDestroyUndefined: Self = StObject.set(x, "autoDestroy", js.undefined)
    
    inline def setCardSwitchAnimation(value: js.Any): Self = StObject.set(x, "cardSwitchAnimation", value.asInstanceOf[js.Any])
    
    inline def setCardSwitchAnimationUndefined: Self = StObject.set(x, "cardSwitchAnimation", js.undefined)
    
    inline def setChild(value: /* selector */ js.UndefOr[java.lang.String] => IComponent): Self = StObject.set(x, "child", js.Any.fromFunction1(value))
    
    inline def setChildUndefined: Self = StObject.set(x, "child", js.undefined)
    
    inline def setControl(value: js.Any): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
    
    inline def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
    
    inline def setDefaultType(value: java.lang.String): Self = StObject.set(x, "defaultType", value.asInstanceOf[js.Any])
    
    inline def setDefaultTypeUndefined: Self = StObject.set(x, "defaultType", js.undefined)
    
    inline def setDefaults(value: js.Any): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
    
    inline def setDown(value: /* selector */ js.UndefOr[java.lang.String] => IComponent): Self = StObject.set(x, "down", js.Any.fromFunction1(value))
    
    inline def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
    
    inline def setGetActiveItem(value: () => js.Any): Self = StObject.set(x, "getActiveItem", js.Any.fromFunction0(value))
    
    inline def setGetActiveItemUndefined: Self = StObject.set(x, "getActiveItem", js.undefined)
    
    inline def setGetAt(value: /* index */ js.UndefOr[Double] => IComponent): Self = StObject.set(x, "getAt", js.Any.fromFunction1(value))
    
    inline def setGetAtUndefined: Self = StObject.set(x, "getAt", js.undefined)
    
    inline def setGetAutoDestroy(value: () => Boolean): Self = StObject.set(x, "getAutoDestroy", js.Any.fromFunction0(value))
    
    inline def setGetAutoDestroyUndefined: Self = StObject.set(x, "getAutoDestroy", js.undefined)
    
    inline def setGetComponent(value: /* component */ js.UndefOr[js.Any] => IComponent): Self = StObject.set(x, "getComponent", js.Any.fromFunction1(value))
    
    inline def setGetComponentUndefined: Self = StObject.set(x, "getComponent", js.undefined)
    
    inline def setGetControl(value: () => js.Any): Self = StObject.set(x, "getControl", js.Any.fromFunction0(value))
    
    inline def setGetControlUndefined: Self = StObject.set(x, "getControl", js.undefined)
    
    inline def setGetDefaultType(value: () => java.lang.String): Self = StObject.set(x, "getDefaultType", js.Any.fromFunction0(value))
    
    inline def setGetDefaultTypeUndefined: Self = StObject.set(x, "getDefaultType", js.undefined)
    
    inline def setGetDefaults(value: () => js.Any): Self = StObject.set(x, "getDefaults", js.Any.fromFunction0(value))
    
    inline def setGetDefaultsUndefined: Self = StObject.set(x, "getDefaults", js.undefined)
    
    inline def setGetDockedComponent(value: /* component */ js.UndefOr[js.Any] => js.Any): Self = StObject.set(x, "getDockedComponent", js.Any.fromFunction1(value))
    
    inline def setGetDockedComponentUndefined: Self = StObject.set(x, "getDockedComponent", js.undefined)
    
    inline def setGetDockedItems(value: () => Array): Self = StObject.set(x, "getDockedItems", js.Any.fromFunction0(value))
    
    inline def setGetDockedItemsUndefined: Self = StObject.set(x, "getDockedItems", js.undefined)
    
    inline def setGetHideOnMaskTap(value: () => Boolean): Self = StObject.set(x, "getHideOnMaskTap", js.Any.fromFunction0(value))
    
    inline def setGetHideOnMaskTapUndefined: Self = StObject.set(x, "getHideOnMaskTap", js.undefined)
    
    inline def setGetInnerItems(value: () => Array): Self = StObject.set(x, "getInnerItems", js.Any.fromFunction0(value))
    
    inline def setGetInnerItemsUndefined: Self = StObject.set(x, "getInnerItems", js.undefined)
    
    inline def setGetItems(value: () => js.Any): Self = StObject.set(x, "getItems", js.Any.fromFunction0(value))
    
    inline def setGetItemsUndefined: Self = StObject.set(x, "getItems", js.undefined)
    
    inline def setGetMasked(value: () => js.Any): Self = StObject.set(x, "getMasked", js.Any.fromFunction0(value))
    
    inline def setGetMaskedUndefined: Self = StObject.set(x, "getMasked", js.undefined)
    
    inline def setGetModal(value: () => Boolean): Self = StObject.set(x, "getModal", js.Any.fromFunction0(value))
    
    inline def setGetModalUndefined: Self = StObject.set(x, "getModal", js.undefined)
    
    inline def setGetScrollable(value: () => IView): Self = StObject.set(x, "getScrollable", js.Any.fromFunction0(value))
    
    inline def setGetScrollableUndefined: Self = StObject.set(x, "getScrollable", js.undefined)
    
    inline def setHide(value: () => IComponent): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    inline def setInsert(value: (/* index */ js.UndefOr[Double], /* item */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "insert", js.Any.fromFunction2(value))
    
    inline def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
    
    inline def setItems(value: js.Any): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setLayout(value: js.Any): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setMask(value: /* mask */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "mask", js.Any.fromFunction1(value))
    
    inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    inline def setMasked(value: js.Any): Self = StObject.set(x, "masked", value.asInstanceOf[js.Any])
    
    inline def setMaskedUndefined: Self = StObject.set(x, "masked", js.undefined)
    
    inline def setQuery(value: /* selector */ js.UndefOr[java.lang.String] => Array): Self = StObject.set(x, "query", js.Any.fromFunction1(value))
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setRemove(value: (/* item */ js.UndefOr[js.Any], /* destroy */ js.UndefOr[Boolean]) => IComponent): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
    
    inline def setRemoveAll(value: (/* destroy */ js.UndefOr[Boolean], /* everything */ js.UndefOr[Boolean]) => IComponent): Self = StObject.set(x, "removeAll", js.Any.fromFunction2(value))
    
    inline def setRemoveAllUndefined: Self = StObject.set(x, "removeAll", js.undefined)
    
    inline def setRemoveAt(value: /* index */ js.UndefOr[Double] => IContainer): Self = StObject.set(x, "removeAt", js.Any.fromFunction1(value))
    
    inline def setRemoveAtUndefined: Self = StObject.set(x, "removeAt", js.undefined)
    
    inline def setRemoveDocked(value: (/* item */ js.UndefOr[js.Any], /* destroy */ js.UndefOr[Boolean]) => IComponent): Self = StObject.set(x, "removeDocked", js.Any.fromFunction2(value))
    
    inline def setRemoveDockedUndefined: Self = StObject.set(x, "removeDocked", js.undefined)
    
    inline def setRemoveInnerAt(value: /* index */ js.UndefOr[Double] => IContainer): Self = StObject.set(x, "removeInnerAt", js.Any.fromFunction1(value))
    
    inline def setRemoveInnerAtUndefined: Self = StObject.set(x, "removeInnerAt", js.undefined)
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    inline def setScrollable(value: js.Any): Self = StObject.set(x, "scrollable", value.asInstanceOf[js.Any])
    
    inline def setScrollableUndefined: Self = StObject.set(x, "scrollable", js.undefined)
    
    inline def setSetActiveItem(value: /* activeItem */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setActiveItem", js.Any.fromFunction1(value))
    
    inline def setSetActiveItemUndefined: Self = StObject.set(x, "setActiveItem", js.undefined)
    
    inline def setSetAutoDestroy(value: /* autoDestroy */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAutoDestroy", js.Any.fromFunction1(value))
    
    inline def setSetAutoDestroyUndefined: Self = StObject.set(x, "setAutoDestroy", js.undefined)
    
    inline def setSetControl(value: /* control */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setControl", js.Any.fromFunction1(value))
    
    inline def setSetControlUndefined: Self = StObject.set(x, "setControl", js.undefined)
    
    inline def setSetDefaultType(value: /* defaultType */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setDefaultType", js.Any.fromFunction1(value))
    
    inline def setSetDefaultTypeUndefined: Self = StObject.set(x, "setDefaultType", js.undefined)
    
    inline def setSetDefaults(value: /* defaults */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setDefaults", js.Any.fromFunction1(value))
    
    inline def setSetDefaultsUndefined: Self = StObject.set(x, "setDefaults", js.undefined)
    
    inline def setSetHideOnMaskTap(value: /* hideOnMaskTap */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setHideOnMaskTap", js.Any.fromFunction1(value))
    
    inline def setSetHideOnMaskTapUndefined: Self = StObject.set(x, "setHideOnMaskTap", js.undefined)
    
    inline def setSetItems(value: /* items */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setItems", js.Any.fromFunction1(value))
    
    inline def setSetItemsUndefined: Self = StObject.set(x, "setItems", js.undefined)
    
    inline def setSetLayout(value: /* layout */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setLayout", js.Any.fromFunction1(value))
    
    inline def setSetLayoutUndefined: Self = StObject.set(x, "setLayout", js.undefined)
    
    inline def setSetMasked(value: /* masked */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setMasked", js.Any.fromFunction1(value))
    
    inline def setSetMaskedUndefined: Self = StObject.set(x, "setMasked", js.undefined)
    
    inline def setSetModal(value: /* modal */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setModal", js.Any.fromFunction1(value))
    
    inline def setSetModalUndefined: Self = StObject.set(x, "setModal", js.undefined)
    
    inline def setSetScrollable(value: /* scrollable */ js.UndefOr[js.Any] => IView): Self = StObject.set(x, "setScrollable", js.Any.fromFunction1(value))
    
    inline def setSetScrollableUndefined: Self = StObject.set(x, "setScrollable", js.undefined)
    
    inline def setShow(value: () => IComponent): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setUnmask(value: () => Unit): Self = StObject.set(x, "unmask", js.Any.fromFunction0(value))
    
    inline def setUnmaskUndefined: Self = StObject.set(x, "unmask", js.undefined)
  }
}
