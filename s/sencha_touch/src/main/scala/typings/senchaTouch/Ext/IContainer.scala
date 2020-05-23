package typings.senchaTouch.Ext

import typings.senchaTouch.Ext.scroll.IView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContainer extends IComponent {
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
  var applyMasked: js.UndefOr[js.Function1[/* masked */ js.UndefOr[js.Any], _]] = js.undefined
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
  var getActiveItem: js.UndefOr[js.Function0[_]] = js.undefined
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
  var getControl: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of defaultType
    * @returns String
    */
  var getDefaultType: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of defaults
    * @returns Object
    */
  var getDefaults: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Finds a docked item of this container using a reference idor an index of its location in getDockedItems
    * @param component String/Number The id or index of the component to find.
    * @returns Ext.Component/Boolean The docked component, if found.
    */
  var getDockedComponent: js.UndefOr[js.Function1[/* component */ js.UndefOr[js.Any], _]] = js.undefined
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
  var getItems: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of masked
    * @returns Boolean/Object/Ext.Mask/Ext.LoadMask
    */
  var getMasked: js.UndefOr[js.Function0[_]] = js.undefined
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
  @scala.inline
  def apply(
    IComponent: IComponent = null,
    activeItem: js.Any = null,
    add: /* newItems */ js.UndefOr[js.Any] => IComponent = null,
    addAll: /* items */ js.UndefOr[Array] => Array = null,
    animateActiveItem: (/* activeItem */ js.UndefOr[js.Any], /* animation */ js.UndefOr[js.Any]) => Unit = null,
    applyMasked: /* masked */ js.UndefOr[js.Any] => _ = null,
    autoDestroy: js.UndefOr[Boolean] = js.undefined,
    cardSwitchAnimation: js.Any = null,
    child: /* selector */ js.UndefOr[java.lang.String] => IComponent = null,
    control: js.Any = null,
    defaultType: java.lang.String = null,
    defaults: js.Any = null,
    down: /* selector */ js.UndefOr[java.lang.String] => IComponent = null,
    getActiveItem: () => _ = null,
    getAt: /* index */ js.UndefOr[Double] => IComponent = null,
    getAutoDestroy: () => Boolean = null,
    getComponent: /* component */ js.UndefOr[js.Any] => IComponent = null,
    getControl: () => _ = null,
    getDefaultType: () => java.lang.String = null,
    getDefaults: () => _ = null,
    getDockedComponent: /* component */ js.UndefOr[js.Any] => _ = null,
    getDockedItems: () => Array = null,
    getHideOnMaskTap: () => Boolean = null,
    getInnerItems: () => Array = null,
    getItems: () => _ = null,
    getMasked: () => _ = null,
    getModal: () => Boolean = null,
    getScrollable: () => IView = null,
    hide: () => IComponent = null,
    insert: (/* index */ js.UndefOr[Double], /* item */ js.UndefOr[js.Any]) => Unit = null,
    items: js.Any = null,
    layout: js.Any = null,
    mask: /* mask */ js.UndefOr[js.Any] => Unit = null,
    masked: js.Any = null,
    query: /* selector */ js.UndefOr[java.lang.String] => Array = null,
    remove: (/* item */ js.UndefOr[js.Any], /* destroy */ js.UndefOr[Boolean]) => IComponent = null,
    removeAll: (/* destroy */ js.UndefOr[Boolean], /* everything */ js.UndefOr[Boolean]) => IComponent = null,
    removeAt: /* index */ js.UndefOr[Double] => IContainer = null,
    removeDocked: (/* item */ js.UndefOr[js.Any], /* destroy */ js.UndefOr[Boolean]) => IComponent = null,
    removeInnerAt: /* index */ js.UndefOr[Double] => IContainer = null,
    scrollable: js.Any = null,
    setActiveItem: /* activeItem */ js.UndefOr[js.Any] => Unit = null,
    setAutoDestroy: /* autoDestroy */ js.UndefOr[Boolean] => Unit = null,
    setControl: /* control */ js.UndefOr[js.Any] => Unit = null,
    setDefaultType: /* defaultType */ js.UndefOr[java.lang.String] => Unit = null,
    setDefaults: /* defaults */ js.UndefOr[js.Any] => Unit = null,
    setHideOnMaskTap: /* hideOnMaskTap */ js.UndefOr[Boolean] => Unit = null,
    setItems: /* items */ js.UndefOr[js.Any] => Unit = null,
    setLayout: /* layout */ js.UndefOr[js.Any] => Unit = null,
    setMasked: /* masked */ js.UndefOr[js.Any] => Unit = null,
    setModal: /* modal */ js.UndefOr[Boolean] => Unit = null,
    setScrollable: /* scrollable */ js.UndefOr[js.Any] => IView = null,
    show: () => IComponent = null,
    unmask: () => Unit = null
  ): IContainer = {
    val __obj = js.Dynamic.literal()
    if (IComponent != null) js.Dynamic.global.Object.assign(__obj, IComponent)
    if (activeItem != null) __obj.updateDynamic("activeItem")(activeItem.asInstanceOf[js.Any])
    if (add != null) __obj.updateDynamic("add")(js.Any.fromFunction1(add))
    if (addAll != null) __obj.updateDynamic("addAll")(js.Any.fromFunction1(addAll))
    if (animateActiveItem != null) __obj.updateDynamic("animateActiveItem")(js.Any.fromFunction2(animateActiveItem))
    if (applyMasked != null) __obj.updateDynamic("applyMasked")(js.Any.fromFunction1(applyMasked))
    if (!js.isUndefined(autoDestroy)) __obj.updateDynamic("autoDestroy")(autoDestroy.get.asInstanceOf[js.Any])
    if (cardSwitchAnimation != null) __obj.updateDynamic("cardSwitchAnimation")(cardSwitchAnimation.asInstanceOf[js.Any])
    if (child != null) __obj.updateDynamic("child")(js.Any.fromFunction1(child))
    if (control != null) __obj.updateDynamic("control")(control.asInstanceOf[js.Any])
    if (defaultType != null) __obj.updateDynamic("defaultType")(defaultType.asInstanceOf[js.Any])
    if (defaults != null) __obj.updateDynamic("defaults")(defaults.asInstanceOf[js.Any])
    if (down != null) __obj.updateDynamic("down")(js.Any.fromFunction1(down))
    if (getActiveItem != null) __obj.updateDynamic("getActiveItem")(js.Any.fromFunction0(getActiveItem))
    if (getAt != null) __obj.updateDynamic("getAt")(js.Any.fromFunction1(getAt))
    if (getAutoDestroy != null) __obj.updateDynamic("getAutoDestroy")(js.Any.fromFunction0(getAutoDestroy))
    if (getComponent != null) __obj.updateDynamic("getComponent")(js.Any.fromFunction1(getComponent))
    if (getControl != null) __obj.updateDynamic("getControl")(js.Any.fromFunction0(getControl))
    if (getDefaultType != null) __obj.updateDynamic("getDefaultType")(js.Any.fromFunction0(getDefaultType))
    if (getDefaults != null) __obj.updateDynamic("getDefaults")(js.Any.fromFunction0(getDefaults))
    if (getDockedComponent != null) __obj.updateDynamic("getDockedComponent")(js.Any.fromFunction1(getDockedComponent))
    if (getDockedItems != null) __obj.updateDynamic("getDockedItems")(js.Any.fromFunction0(getDockedItems))
    if (getHideOnMaskTap != null) __obj.updateDynamic("getHideOnMaskTap")(js.Any.fromFunction0(getHideOnMaskTap))
    if (getInnerItems != null) __obj.updateDynamic("getInnerItems")(js.Any.fromFunction0(getInnerItems))
    if (getItems != null) __obj.updateDynamic("getItems")(js.Any.fromFunction0(getItems))
    if (getMasked != null) __obj.updateDynamic("getMasked")(js.Any.fromFunction0(getMasked))
    if (getModal != null) __obj.updateDynamic("getModal")(js.Any.fromFunction0(getModal))
    if (getScrollable != null) __obj.updateDynamic("getScrollable")(js.Any.fromFunction0(getScrollable))
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction0(hide))
    if (insert != null) __obj.updateDynamic("insert")(js.Any.fromFunction2(insert))
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(js.Any.fromFunction1(mask))
    if (masked != null) __obj.updateDynamic("masked")(masked.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(js.Any.fromFunction1(query))
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction2(remove))
    if (removeAll != null) __obj.updateDynamic("removeAll")(js.Any.fromFunction2(removeAll))
    if (removeAt != null) __obj.updateDynamic("removeAt")(js.Any.fromFunction1(removeAt))
    if (removeDocked != null) __obj.updateDynamic("removeDocked")(js.Any.fromFunction2(removeDocked))
    if (removeInnerAt != null) __obj.updateDynamic("removeInnerAt")(js.Any.fromFunction1(removeInnerAt))
    if (scrollable != null) __obj.updateDynamic("scrollable")(scrollable.asInstanceOf[js.Any])
    if (setActiveItem != null) __obj.updateDynamic("setActiveItem")(js.Any.fromFunction1(setActiveItem))
    if (setAutoDestroy != null) __obj.updateDynamic("setAutoDestroy")(js.Any.fromFunction1(setAutoDestroy))
    if (setControl != null) __obj.updateDynamic("setControl")(js.Any.fromFunction1(setControl))
    if (setDefaultType != null) __obj.updateDynamic("setDefaultType")(js.Any.fromFunction1(setDefaultType))
    if (setDefaults != null) __obj.updateDynamic("setDefaults")(js.Any.fromFunction1(setDefaults))
    if (setHideOnMaskTap != null) __obj.updateDynamic("setHideOnMaskTap")(js.Any.fromFunction1(setHideOnMaskTap))
    if (setItems != null) __obj.updateDynamic("setItems")(js.Any.fromFunction1(setItems))
    if (setLayout != null) __obj.updateDynamic("setLayout")(js.Any.fromFunction1(setLayout))
    if (setMasked != null) __obj.updateDynamic("setMasked")(js.Any.fromFunction1(setMasked))
    if (setModal != null) __obj.updateDynamic("setModal")(js.Any.fromFunction1(setModal))
    if (setScrollable != null) __obj.updateDynamic("setScrollable")(js.Any.fromFunction1(setScrollable))
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction0(show))
    if (unmask != null) __obj.updateDynamic("unmask")(js.Any.fromFunction0(unmask))
    __obj.asInstanceOf[IContainer]
  }
}

