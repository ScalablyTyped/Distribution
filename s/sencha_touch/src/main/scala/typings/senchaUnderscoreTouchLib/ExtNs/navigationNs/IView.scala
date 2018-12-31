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

