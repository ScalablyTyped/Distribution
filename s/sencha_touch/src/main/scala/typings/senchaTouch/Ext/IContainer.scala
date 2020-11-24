package typings.senchaTouch.Ext

import typings.senchaTouch.Ext.scroll.IView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IContainer extends IComponent {
  
  /** [Config Option] (Object/String/Number) */
  var activeItem: js.UndefOr[js.Any] = js.native
  
  /** [Method] Adds one or more Components to this Container
    * @param newItems Object/Object[]/Ext.Component/Ext.Component[] The new items to add to the Container.
    * @returns Ext.Component The last item added to the Container from the newItems array.
    */
  var add: js.UndefOr[js.Function1[/* newItems */ js.UndefOr[js.Any], IComponent]] = js.native
  
  /** [Method] Adds an array of Components to this Container
    * @param items Array The array of items to add to this container.
    * @returns Array The array of items after they have been added.
    */
  var addAll: js.UndefOr[js.Function1[/* items */ js.UndefOr[Array], Array]] = js.native
  
  /** [Method] Animates to the supplied activeItem with a specified animation
    * @param activeItem Object/Number The item or item index to make active.
    * @param animation Object/Ext.fx.layout.Card Card animation configuration or instance.
    */
  var animateActiveItem: js.UndefOr[
    js.Function2[/* activeItem */ js.UndefOr[js.Any], /* animation */ js.UndefOr[js.Any], Unit]
  ] = js.native
  
  /** [Method] Changes the masked configuration when its setter is called which will convert the value into a proper object instanc
    * @param masked Boolean/Object/Ext.Mask/Ext.LoadMask
    * @returns Object
    */
  var applyMasked: js.UndefOr[js.Function1[/* masked */ js.UndefOr[js.Any], _]] = js.native
  
  /** [Config Option] (Boolean) */
  var autoDestroy: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String/Object/Boolean) */
  var cardSwitchAnimation: js.UndefOr[js.Any] = js.native
  
  /** [Method] Retrieves the first direct child of this container which matches the passed selector
    * @param selector String An Ext.ComponentQuery selector.
    * @returns Ext.Component
    */
  var child: js.UndefOr[js.Function1[/* selector */ js.UndefOr[java.lang.String], IComponent]] = js.native
  
  /** [Config Option] (Object) */
  var control: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var defaultType: js.UndefOr[java.lang.String] = js.native
  
  /** [Config Option] (Object) */
  var defaults: js.UndefOr[js.Any] = js.native
  
  /** [Method] Retrieves the first descendant of this container which matches the passed selector
    * @param selector String An Ext.ComponentQuery selector.
    * @returns Ext.Component
    */
  var down: js.UndefOr[js.Function1[/* selector */ js.UndefOr[java.lang.String], IComponent]] = js.native
  
  /** [Method] Returns the value of activeItem
    * @returns Object/String/Number
    */
  var getActiveItem: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the Component for a given index in the Container s items
    * @param index Number The index of the Component to return.
    * @returns Ext.Component The item at the specified index, if found.
    */
  var getAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], IComponent]] = js.native
  
  /** [Method] Returns the value of autoDestroy
    * @returns Boolean
    */
  var getAutoDestroy: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Examines this container s items property and gets a direct child component of this container
    * @param component String/Number This parameter may be any of the following:  {String} : representing the itemId or id of the child component. {Number} : representing the position of the child component within the items property. For additional information see Ext.util.MixedCollection.get.
    * @returns Ext.Component The component (if found).
    */
  var getComponent: js.UndefOr[js.Function1[/* component */ js.UndefOr[js.Any], IComponent]] = js.native
  
  /** [Method] Returns the value of control
    * @returns Object
    */
  var getControl: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of defaultType
    * @returns String
    */
  var getDefaultType: js.UndefOr[js.Function0[java.lang.String]] = js.native
  
  /** [Method] Returns the value of defaults
    * @returns Object
    */
  var getDefaults: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Finds a docked item of this container using a reference idor an index of its location in getDockedItems
    * @param component String/Number The id or index of the component to find.
    * @returns Ext.Component/Boolean The docked component, if found.
    */
  var getDockedComponent: js.UndefOr[js.Function1[/* component */ js.UndefOr[js.Any], _]] = js.native
  
  /** [Method] Returns all the Ext Component docked items in this container
    * @returns Array The docked items of this container.
    */
  var getDockedItems: js.UndefOr[js.Function0[Array]] = js.native
  
  /** [Method] Returns the value of hideOnMaskTap
    * @returns Boolean
    */
  var getHideOnMaskTap: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns all inner items of this container
    * @returns Array The inner items of this container.
    */
  var getInnerItems: js.UndefOr[js.Function0[Array]] = js.native
  
  /** [Method] Returns the value of items
    * @returns Array/Object
    */
  var getItems: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of masked
    * @returns Boolean/Object/Ext.Mask/Ext.LoadMask
    */
  var getMasked: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of modal
    * @returns Boolean
    */
  var getModal: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns an the scrollable instance for this container which is a Ext scroll View class
    * @returns Ext.scroll.View The scroll view.
    */
  var getScrollable: js.UndefOr[js.Function0[IView]] = js.native
  
  /** [Method] Hides this Component optionally using an animation
    * @returns Ext.Component
    */
  @JSName("hide")
  var hide_IContainer: js.UndefOr[js.Function0[IComponent]] = js.native
  
  /** [Method] Adds a child Component at the given index
    * @param index Number The index to insert the Component at.
    * @param item Object The Component to insert.
    */
  var insert: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[Double], /* item */ js.UndefOr[js.Any], Unit]
  ] = js.native
  
  /** [Config Option] (Array/Object) */
  var items: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Object/String) */
  var layout: js.UndefOr[js.Any] = js.native
  
  /** [Method] Convenience method which calls setMasked with a value of true to show the mask
    * @param mask Object
    */
  var mask: js.UndefOr[js.Function1[/* mask */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (Boolean/Object/Ext.Mask/Ext.LoadMask) */
  var masked: js.UndefOr[js.Any] = js.native
  
  /** [Method] Retrieves all descendant components which match the passed selector
    * @param selector String Selector complying to an Ext.ComponentQuery selector.
    * @returns Array Ext.Component's which matched the selector.
    */
  var query: js.UndefOr[js.Function1[/* selector */ js.UndefOr[java.lang.String], Array]] = js.native
  
  /** [Method] Removes an item from this Container optionally destroying it
    * @param item Object The item to remove.
    * @param destroy Boolean Calls the Component's destroy method if true.
    * @returns Ext.Component this
    */
  var remove: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* destroy */ js.UndefOr[Boolean], IComponent]
  ] = js.native
  
  /** [Method] Removes all items currently in the Container optionally destroying them all
    * @param destroy Boolean If true, destroys each removed Component.
    * @param everything Boolean If true, completely remove all items including docked / centered and floating items.
    * @returns Ext.Component this
    */
  var removeAll: js.UndefOr[
    js.Function2[/* destroy */ js.UndefOr[Boolean], /* everything */ js.UndefOr[Boolean], IComponent]
  ] = js.native
  
  /** [Method] Removes the Component at the specified index  myContainer removeAt 0 removes the first item
    * @param index Number The index of the Component to remove.
    * @returns Ext.Container this
    */
  var removeAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], this.type]] = js.native
  
  /** [Method] Removes a docked item from this Container
    * @param item Object The item to remove.
    * @param destroy Boolean Calls the Component's destroy method if true.
    * @returns Ext.Component this
    */
  var removeDocked: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* destroy */ js.UndefOr[Boolean], IComponent]
  ] = js.native
  
  /** [Method] Removes an inner Component at the specified index  myContainer removeInnerAt 0 removes the first item of the in
    * @param index Number The index of the Component to remove.
    * @returns Ext.Container this
    */
  var removeInnerAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], this.type]] = js.native
  
  /** [Config Option] (Boolean/String/Object) */
  var scrollable: js.UndefOr[js.Any] = js.native
  
  /** [Method] Sets the value of activeItem
    * @param activeItem Object/String/Number The new value.
    */
  var setActiveItem: js.UndefOr[js.Function1[/* activeItem */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of autoDestroy
    * @param autoDestroy Boolean The new value.
    */
  var setAutoDestroy: js.UndefOr[js.Function1[/* autoDestroy */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of control
    * @param control Object The new value.
    */
  var setControl: js.UndefOr[js.Function1[/* control */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of defaultType
    * @param defaultType String The new value.
    */
  var setDefaultType: js.UndefOr[js.Function1[/* defaultType */ js.UndefOr[java.lang.String], Unit]] = js.native
  
  /** [Method] Sets the value of defaults
    * @param defaults Object The new value.
    */
  var setDefaults: js.UndefOr[js.Function1[/* defaults */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of hideOnMaskTap
    * @param hideOnMaskTap Boolean The new value.
    */
  var setHideOnMaskTap: js.UndefOr[js.Function1[/* hideOnMaskTap */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of items
    * @param items Array/Object The new value.
    */
  var setItems: js.UndefOr[js.Function1[/* items */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of layout
    * @param layout Object/String The new value.
    */
  var setLayout: js.UndefOr[js.Function1[/* layout */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of masked
    * @param masked Boolean/Object/Ext.Mask/Ext.LoadMask The new value.
    */
  var setMasked: js.UndefOr[js.Function1[/* masked */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of modal
    * @param modal Boolean The new value.
    */
  var setModal: js.UndefOr[js.Function1[/* modal */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of scrollable
    * @param scrollable Boolean/String/Object The new value.
    * @returns Ext.scroll.View The scroll view.
    */
  @JSName("setScrollable")
  var setScrollable_IContainer: js.UndefOr[js.Function1[/* scrollable */ js.UndefOr[js.Any], IView]] = js.native
  
  /** [Method] Shows this component optionally using an animation
    * @returns Ext.Component
    */
  @JSName("show")
  var show_IContainer: js.UndefOr[js.Function0[IComponent]] = js.native
  
  /** [Method] Convenience method which calls setMasked with a value of false to hide the mask */
  var unmask: js.UndefOr[js.Function0[Unit]] = js.native
}
object IContainer {
  
  @scala.inline
  def apply(): IContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IContainer]
  }
  
  @scala.inline
  implicit class IContainerOps[Self <: IContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActiveItem(value: js.Any): Self = this.set("activeItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveItem: Self = this.set("activeItem", js.undefined)
    
    @scala.inline
    def setAdd(value: /* newItems */ js.UndefOr[js.Any] => IComponent): Self = this.set("add", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    
    @scala.inline
    def setAddAll(value: /* items */ js.UndefOr[Array] => Array): Self = this.set("addAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAddAll: Self = this.set("addAll", js.undefined)
    
    @scala.inline
    def setAnimateActiveItem(value: (/* activeItem */ js.UndefOr[js.Any], /* animation */ js.UndefOr[js.Any]) => Unit): Self = this.set("animateActiveItem", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAnimateActiveItem: Self = this.set("animateActiveItem", js.undefined)
    
    @scala.inline
    def setApplyMasked(value: /* masked */ js.UndefOr[js.Any] => _): Self = this.set("applyMasked", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteApplyMasked: Self = this.set("applyMasked", js.undefined)
    
    @scala.inline
    def setAutoDestroy(value: Boolean): Self = this.set("autoDestroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoDestroy: Self = this.set("autoDestroy", js.undefined)
    
    @scala.inline
    def setCardSwitchAnimation(value: js.Any): Self = this.set("cardSwitchAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCardSwitchAnimation: Self = this.set("cardSwitchAnimation", js.undefined)
    
    @scala.inline
    def setChild(value: /* selector */ js.UndefOr[java.lang.String] => IComponent): Self = this.set("child", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChild: Self = this.set("child", js.undefined)
    
    @scala.inline
    def setControl(value: js.Any): Self = this.set("control", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControl: Self = this.set("control", js.undefined)
    
    @scala.inline
    def setDefaultType(value: java.lang.String): Self = this.set("defaultType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultType: Self = this.set("defaultType", js.undefined)
    
    @scala.inline
    def setDefaults(value: js.Any): Self = this.set("defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaults: Self = this.set("defaults", js.undefined)
    
    @scala.inline
    def setDown(value: /* selector */ js.UndefOr[java.lang.String] => IComponent): Self = this.set("down", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDown: Self = this.set("down", js.undefined)
    
    @scala.inline
    def setGetActiveItem(value: () => _): Self = this.set("getActiveItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetActiveItem: Self = this.set("getActiveItem", js.undefined)
    
    @scala.inline
    def setGetAt(value: /* index */ js.UndefOr[Double] => IComponent): Self = this.set("getAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetAt: Self = this.set("getAt", js.undefined)
    
    @scala.inline
    def setGetAutoDestroy(value: () => Boolean): Self = this.set("getAutoDestroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetAutoDestroy: Self = this.set("getAutoDestroy", js.undefined)
    
    @scala.inline
    def setGetComponent(value: /* component */ js.UndefOr[js.Any] => IComponent): Self = this.set("getComponent", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetComponent: Self = this.set("getComponent", js.undefined)
    
    @scala.inline
    def setGetControl(value: () => _): Self = this.set("getControl", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetControl: Self = this.set("getControl", js.undefined)
    
    @scala.inline
    def setGetDefaultType(value: () => java.lang.String): Self = this.set("getDefaultType", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDefaultType: Self = this.set("getDefaultType", js.undefined)
    
    @scala.inline
    def setGetDefaults(value: () => _): Self = this.set("getDefaults", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDefaults: Self = this.set("getDefaults", js.undefined)
    
    @scala.inline
    def setGetDockedComponent(value: /* component */ js.UndefOr[js.Any] => _): Self = this.set("getDockedComponent", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetDockedComponent: Self = this.set("getDockedComponent", js.undefined)
    
    @scala.inline
    def setGetDockedItems(value: () => Array): Self = this.set("getDockedItems", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDockedItems: Self = this.set("getDockedItems", js.undefined)
    
    @scala.inline
    def setGetHideOnMaskTap(value: () => Boolean): Self = this.set("getHideOnMaskTap", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetHideOnMaskTap: Self = this.set("getHideOnMaskTap", js.undefined)
    
    @scala.inline
    def setGetInnerItems(value: () => Array): Self = this.set("getInnerItems", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetInnerItems: Self = this.set("getInnerItems", js.undefined)
    
    @scala.inline
    def setGetItems(value: () => _): Self = this.set("getItems", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetItems: Self = this.set("getItems", js.undefined)
    
    @scala.inline
    def setGetMasked(value: () => _): Self = this.set("getMasked", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetMasked: Self = this.set("getMasked", js.undefined)
    
    @scala.inline
    def setGetModal(value: () => Boolean): Self = this.set("getModal", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetModal: Self = this.set("getModal", js.undefined)
    
    @scala.inline
    def setGetScrollable(value: () => IView): Self = this.set("getScrollable", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetScrollable: Self = this.set("getScrollable", js.undefined)
    
    @scala.inline
    def setHide(value: () => IComponent): Self = this.set("hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    
    @scala.inline
    def setInsert(value: (/* index */ js.UndefOr[Double], /* item */ js.UndefOr[js.Any]) => Unit): Self = this.set("insert", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteInsert: Self = this.set("insert", js.undefined)
    
    @scala.inline
    def setItems(value: js.Any): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setLayout(value: js.Any): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
    @scala.inline
    def setMask(value: /* mask */ js.UndefOr[js.Any] => Unit): Self = this.set("mask", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    
    @scala.inline
    def setMasked(value: js.Any): Self = this.set("masked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasked: Self = this.set("masked", js.undefined)
    
    @scala.inline
    def setQuery(value: /* selector */ js.UndefOr[java.lang.String] => Array): Self = this.set("query", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setRemove(value: (/* item */ js.UndefOr[js.Any], /* destroy */ js.UndefOr[Boolean]) => IComponent): Self = this.set("remove", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    
    @scala.inline
    def setRemoveAll(value: (/* destroy */ js.UndefOr[Boolean], /* everything */ js.UndefOr[Boolean]) => IComponent): Self = this.set("removeAll", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRemoveAll: Self = this.set("removeAll", js.undefined)
    
    @scala.inline
    def setRemoveAt(value: /* index */ js.UndefOr[Double] => IContainer): Self = this.set("removeAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoveAt: Self = this.set("removeAt", js.undefined)
    
    @scala.inline
    def setRemoveDocked(value: (/* item */ js.UndefOr[js.Any], /* destroy */ js.UndefOr[Boolean]) => IComponent): Self = this.set("removeDocked", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRemoveDocked: Self = this.set("removeDocked", js.undefined)
    
    @scala.inline
    def setRemoveInnerAt(value: /* index */ js.UndefOr[Double] => IContainer): Self = this.set("removeInnerAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoveInnerAt: Self = this.set("removeInnerAt", js.undefined)
    
    @scala.inline
    def setScrollable(value: js.Any): Self = this.set("scrollable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollable: Self = this.set("scrollable", js.undefined)
    
    @scala.inline
    def setSetActiveItem(value: /* activeItem */ js.UndefOr[js.Any] => Unit): Self = this.set("setActiveItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetActiveItem: Self = this.set("setActiveItem", js.undefined)
    
    @scala.inline
    def setSetAutoDestroy(value: /* autoDestroy */ js.UndefOr[Boolean] => Unit): Self = this.set("setAutoDestroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetAutoDestroy: Self = this.set("setAutoDestroy", js.undefined)
    
    @scala.inline
    def setSetControl(value: /* control */ js.UndefOr[js.Any] => Unit): Self = this.set("setControl", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetControl: Self = this.set("setControl", js.undefined)
    
    @scala.inline
    def setSetDefaultType(value: /* defaultType */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setDefaultType", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDefaultType: Self = this.set("setDefaultType", js.undefined)
    
    @scala.inline
    def setSetDefaults(value: /* defaults */ js.UndefOr[js.Any] => Unit): Self = this.set("setDefaults", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDefaults: Self = this.set("setDefaults", js.undefined)
    
    @scala.inline
    def setSetHideOnMaskTap(value: /* hideOnMaskTap */ js.UndefOr[Boolean] => Unit): Self = this.set("setHideOnMaskTap", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetHideOnMaskTap: Self = this.set("setHideOnMaskTap", js.undefined)
    
    @scala.inline
    def setSetItems(value: /* items */ js.UndefOr[js.Any] => Unit): Self = this.set("setItems", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetItems: Self = this.set("setItems", js.undefined)
    
    @scala.inline
    def setSetLayout(value: /* layout */ js.UndefOr[js.Any] => Unit): Self = this.set("setLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetLayout: Self = this.set("setLayout", js.undefined)
    
    @scala.inline
    def setSetMasked(value: /* masked */ js.UndefOr[js.Any] => Unit): Self = this.set("setMasked", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMasked: Self = this.set("setMasked", js.undefined)
    
    @scala.inline
    def setSetModal(value: /* modal */ js.UndefOr[Boolean] => Unit): Self = this.set("setModal", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetModal: Self = this.set("setModal", js.undefined)
    
    @scala.inline
    def setSetScrollable(value: /* scrollable */ js.UndefOr[js.Any] => IView): Self = this.set("setScrollable", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetScrollable: Self = this.set("setScrollable", js.undefined)
    
    @scala.inline
    def setShow(value: () => IComponent): Self = this.set("show", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setUnmask(value: () => Unit): Self = this.set("unmask", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteUnmask: Self = this.set("unmask", js.undefined)
  }
}
