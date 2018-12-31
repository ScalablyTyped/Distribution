package typings
package senchaUnderscoreTouchLib.ExtNs

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
    js.Function2[/* activeItem */ js.UndefOr[js.Any], /* animation */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Changes the masked configuration when its setter is called which will convert the value into a proper object instanc
  		* @param masked Boolean/Object/Ext.Mask/Ext.LoadMask
  		* @returns Object
  		*/
  var applyMasked: js.UndefOr[js.Function1[/* masked */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Config Option] (Boolean) */
  var autoDestroy: js.UndefOr[scala.Boolean] = js.undefined
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
  var getAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[scala.Double], IComponent]] = js.undefined
  /** [Method] Returns the value of autoDestroy
  		* @returns Boolean
  		*/
  var getAutoDestroy: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
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
  var getHideOnMaskTap: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
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
  var getModal: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns an the scrollable instance for this container which is a Ext scroll View class
  		* @returns Ext.scroll.View The scroll view.
  		*/
  var getScrollable: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.scrollNs.IView]] = js.undefined
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
    js.Function2[/* index */ js.UndefOr[scala.Double], /* item */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Config Option] (Array/Object) */
  var items: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object/String) */
  var layout: js.UndefOr[js.Any] = js.undefined
  /** [Method] Convenience method which calls setMasked with a value of true to show the mask
  		* @param mask Object
  		*/
  var mask: js.UndefOr[js.Function1[/* mask */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
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
    js.Function2[/* item */ js.UndefOr[js.Any], /* destroy */ js.UndefOr[scala.Boolean], IComponent]
  ] = js.undefined
  /** [Method] Removes all items currently in the Container optionally destroying them all
  		* @param destroy Boolean If true, destroys each removed Component.
  		* @param everything Boolean If true, completely remove all items including docked / centered and floating items.
  		* @returns Ext.Component this
  		*/
  var removeAll: js.UndefOr[
    js.Function2[
      /* destroy */ js.UndefOr[scala.Boolean], 
      /* everything */ js.UndefOr[scala.Boolean], 
      IComponent
    ]
  ] = js.undefined
  /** [Method] Removes the Component at the specified index  myContainer removeAt 0 removes the first item
  		* @param index Number The index of the Component to remove.
  		* @returns Ext.Container this
  		*/
  var removeAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[scala.Double], this.type]] = js.undefined
  /** [Method] Removes a docked item from this Container
  		* @param item Object The item to remove.
  		* @param destroy Boolean Calls the Component's destroy method if true.
  		* @returns Ext.Component this
  		*/
  var removeDocked: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* destroy */ js.UndefOr[scala.Boolean], IComponent]
  ] = js.undefined
  /** [Method] Removes an inner Component at the specified index  myContainer removeInnerAt 0 removes the first item of the in
  		* @param index Number The index of the Component to remove.
  		* @returns Ext.Container this
  		*/
  var removeInnerAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[scala.Double], this.type]] = js.undefined
  /** [Config Option] (Boolean/String/Object) */
  var scrollable: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of activeItem
  		* @param activeItem Object/String/Number The new value.
  		*/
  var setActiveItem: js.UndefOr[js.Function1[/* activeItem */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of autoDestroy
  		* @param autoDestroy Boolean The new value.
  		*/
  var setAutoDestroy: js.UndefOr[js.Function1[/* autoDestroy */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of control
  		* @param control Object The new value.
  		*/
  var setControl: js.UndefOr[js.Function1[/* control */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of defaultType
  		* @param defaultType String The new value.
  		*/
  var setDefaultType: js.UndefOr[js.Function1[/* defaultType */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of defaults
  		* @param defaults Object The new value.
  		*/
  var setDefaults: js.UndefOr[js.Function1[/* defaults */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of hideOnMaskTap
  		* @param hideOnMaskTap Boolean The new value.
  		*/
  var setHideOnMaskTap: js.UndefOr[js.Function1[/* hideOnMaskTap */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of items
  		* @param items Array/Object The new value.
  		*/
  var setItems: js.UndefOr[js.Function1[/* items */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of layout
  		* @param layout Object/String The new value.
  		*/
  var setLayout: js.UndefOr[js.Function1[/* layout */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of masked
  		* @param masked Boolean/Object/Ext.Mask/Ext.LoadMask The new value.
  		*/
  var setMasked: js.UndefOr[js.Function1[/* masked */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of modal
  		* @param modal Boolean The new value.
  		*/
  var setModal: js.UndefOr[js.Function1[/* modal */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of scrollable
  		* @param scrollable Boolean/String/Object The new value.
  		* @returns Ext.scroll.View The scroll view.
  		*/
  @JSName("setScrollable")
  var setScrollable_IContainer: js.UndefOr[
    js.Function1[/* scrollable */ js.UndefOr[js.Any], senchaUnderscoreTouchLib.ExtNs.scrollNs.IView]
  ] = js.undefined
  /** [Method] Shows this component optionally using an animation
  		* @returns Ext.Component
  		*/
  @JSName("show")
  var show_IContainer: js.UndefOr[js.Function0[IComponent]] = js.undefined
  /** [Method] Convenience method which calls setMasked with a value of false to hide the mask */
  var unmask: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

