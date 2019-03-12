package typings
package senchaUnderscoreTouchLib.ExtNs.navigationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IView
  extends senchaUnderscoreTouchLib.ExtNs.IContainer {
  /** [Config Option] (String) */
  var defaultBackButtonText: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the value of defaultBackButtonText
  		* @returns String
  		*/
  var getDefaultBackButtonText: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of layout
  		* @returns Object
  		*/
  var getLayout: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of navigationBar
  		* @returns Boolean/Object
  		*/
  var getNavigationBar: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the previous item if one exists
  		* @returns Mixed The previous view
  		*/
  var getPreviousItem: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of useTitleForBackButtonText
  		* @returns Boolean
  		*/
  var getUseTitleForBackButtonText: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Config Option] (Boolean/Object) */
  var navigationBar: js.UndefOr[js.Any] = js.undefined
  /** [Method] Removes the current active view from the stack and sets the previous view using the default animation of this view
  		* @param count Number/String/Object If a Number, the number of views you want to pop. If a String, the pops to a matching component query. If an Object, the pops to a matching view instance.
  		* @returns Ext.Component The new active item
  		*/
  var pop: js.UndefOr[
    js.Function1[/* count */ js.UndefOr[js.Any], senchaUnderscoreTouchLib.ExtNs.IComponent]
  ] = js.undefined
  /** [Method] Pushes a new view into this navigation view using the default animation that this view has
  		* @param view Object The view to push.
  		* @returns Ext.Component The new item you just pushed.
  		*/
  var push: js.UndefOr[
    js.Function1[/* view */ js.UndefOr[js.Any], senchaUnderscoreTouchLib.ExtNs.IComponent]
  ] = js.undefined
  /** [Method] Resets the view by removing all items between the first and last item
  		* @returns Ext.Component The view that is now active
  		*/
  var reset: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.IComponent]] = js.undefined
  /** [Method] Sets the value of defaultBackButtonText
  		* @param defaultBackButtonText String The new value.
  		*/
  var setDefaultBackButtonText: js.UndefOr[
    js.Function1[/* defaultBackButtonText */ js.UndefOr[java.lang.String], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of navigationBar
  		* @param navigationBar Boolean/Object The new value.
  		*/
  var setNavigationBar: js.UndefOr[js.Function1[/* navigationBar */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of useTitleForBackButtonText
  		* @param useTitleForBackButtonText Boolean The new value.
  		*/
  var setUseTitleForBackButtonText: js.UndefOr[
    js.Function1[/* useTitleForBackButtonText */ js.UndefOr[scala.Boolean], scala.Unit]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var useTitleForBackButtonText: js.UndefOr[scala.Boolean] = js.undefined
}

object IView {
  @scala.inline
  def apply(
    IContainer: senchaUnderscoreTouchLib.ExtNs.IContainer = null,
    baseCls: java.lang.String = null,
    defaultBackButtonText: java.lang.String = null,
    getBaseCls: () => java.lang.String = null,
    getDefaultBackButtonText: () => java.lang.String = null,
    getItems: () => _ = null,
    getLayout: () => _ = null,
    getNavigationBar: () => _ = null,
    getPreviousItem: () => _ = null,
    getUseTitleForBackButtonText: () => scala.Boolean = null,
    items: js.Any = null,
    layout: js.Any = null,
    navigationBar: js.Any = null,
    pop: /* count */ js.UndefOr[js.Any] => senchaUnderscoreTouchLib.ExtNs.IComponent = null,
    push: /* view */ js.UndefOr[js.Any] => senchaUnderscoreTouchLib.ExtNs.IComponent = null,
    reset: () => senchaUnderscoreTouchLib.ExtNs.IComponent = null,
    setBaseCls: /* baseCls */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setDefaultBackButtonText: /* defaultBackButtonText */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setItems: /* items */ js.UndefOr[js.Any] => scala.Unit = null,
    setLayout: /* layout */ js.UndefOr[js.Any] => scala.Unit = null,
    setNavigationBar: /* navigationBar */ js.UndefOr[js.Any] => scala.Unit = null,
    setUseTitleForBackButtonText: /* useTitleForBackButtonText */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    useTitleForBackButtonText: js.UndefOr[scala.Boolean] = js.undefined
  ): IView = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IContainer)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (defaultBackButtonText != null) __obj.updateDynamic("defaultBackButtonText")(defaultBackButtonText)
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(js.Any.fromFunction0(getBaseCls))
    if (getDefaultBackButtonText != null) __obj.updateDynamic("getDefaultBackButtonText")(js.Any.fromFunction0(getDefaultBackButtonText))
    if (getItems != null) __obj.updateDynamic("getItems")(js.Any.fromFunction0(getItems))
    if (getLayout != null) __obj.updateDynamic("getLayout")(js.Any.fromFunction0(getLayout))
    if (getNavigationBar != null) __obj.updateDynamic("getNavigationBar")(js.Any.fromFunction0(getNavigationBar))
    if (getPreviousItem != null) __obj.updateDynamic("getPreviousItem")(js.Any.fromFunction0(getPreviousItem))
    if (getUseTitleForBackButtonText != null) __obj.updateDynamic("getUseTitleForBackButtonText")(js.Any.fromFunction0(getUseTitleForBackButtonText))
    if (items != null) __obj.updateDynamic("items")(items)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (navigationBar != null) __obj.updateDynamic("navigationBar")(navigationBar)
    if (pop != null) __obj.updateDynamic("pop")(js.Any.fromFunction1(pop))
    if (push != null) __obj.updateDynamic("push")(js.Any.fromFunction1(push))
    if (reset != null) __obj.updateDynamic("reset")(js.Any.fromFunction0(reset))
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(js.Any.fromFunction1(setBaseCls))
    if (setDefaultBackButtonText != null) __obj.updateDynamic("setDefaultBackButtonText")(js.Any.fromFunction1(setDefaultBackButtonText))
    if (setItems != null) __obj.updateDynamic("setItems")(js.Any.fromFunction1(setItems))
    if (setLayout != null) __obj.updateDynamic("setLayout")(js.Any.fromFunction1(setLayout))
    if (setNavigationBar != null) __obj.updateDynamic("setNavigationBar")(js.Any.fromFunction1(setNavigationBar))
    if (setUseTitleForBackButtonText != null) __obj.updateDynamic("setUseTitleForBackButtonText")(js.Any.fromFunction1(setUseTitleForBackButtonText))
    if (!js.isUndefined(useTitleForBackButtonText)) __obj.updateDynamic("useTitleForBackButtonText")(useTitleForBackButtonText)
    __obj.asInstanceOf[IView]
  }
}

