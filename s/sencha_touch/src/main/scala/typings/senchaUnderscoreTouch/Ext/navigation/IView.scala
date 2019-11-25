package typings.senchaUnderscoreTouch.Ext.navigation

import typings.senchaUnderscoreTouch.Ext.IComponent
import typings.senchaUnderscoreTouch.Ext.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IView extends IContainer {
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
  var getUseTitleForBackButtonText: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Config Option] (Boolean/Object) */
  var navigationBar: js.UndefOr[js.Any] = js.undefined
  /** [Method] Removes the current active view from the stack and sets the previous view using the default animation of this view
  		* @param count Number/String/Object If a Number, the number of views you want to pop. If a String, the pops to a matching component query. If an Object, the pops to a matching view instance.
  		* @returns Ext.Component The new active item
  		*/
  var pop: js.UndefOr[js.Function1[/* count */ js.UndefOr[js.Any], IComponent]] = js.undefined
  /** [Method] Pushes a new view into this navigation view using the default animation that this view has
  		* @param view Object The view to push.
  		* @returns Ext.Component The new item you just pushed.
  		*/
  var push: js.UndefOr[js.Function1[/* view */ js.UndefOr[js.Any], IComponent]] = js.undefined
  /** [Method] Resets the view by removing all items between the first and last item
  		* @returns Ext.Component The view that is now active
  		*/
  var reset: js.UndefOr[js.Function0[IComponent]] = js.undefined
  /** [Method] Sets the value of defaultBackButtonText
  		* @param defaultBackButtonText String The new value.
  		*/
  var setDefaultBackButtonText: js.UndefOr[js.Function1[/* defaultBackButtonText */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of navigationBar
  		* @param navigationBar Boolean/Object The new value.
  		*/
  var setNavigationBar: js.UndefOr[js.Function1[/* navigationBar */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of useTitleForBackButtonText
  		* @param useTitleForBackButtonText Boolean The new value.
  		*/
  var setUseTitleForBackButtonText: js.UndefOr[js.Function1[/* useTitleForBackButtonText */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var useTitleForBackButtonText: js.UndefOr[Boolean] = js.undefined
}

object IView {
  @scala.inline
  def apply(
    IContainer: IContainer = null,
    defaultBackButtonText: java.lang.String = null,
    getDefaultBackButtonText: () => java.lang.String = null,
    getLayout: () => _ = null,
    getNavigationBar: () => _ = null,
    getPreviousItem: () => _ = null,
    getUseTitleForBackButtonText: () => Boolean = null,
    navigationBar: js.Any = null,
    pop: /* count */ js.UndefOr[js.Any] => IComponent = null,
    push: /* view */ js.UndefOr[js.Any] => IComponent = null,
    reset: () => IComponent = null,
    setDefaultBackButtonText: /* defaultBackButtonText */ js.UndefOr[java.lang.String] => Unit = null,
    setNavigationBar: /* navigationBar */ js.UndefOr[js.Any] => Unit = null,
    setUseTitleForBackButtonText: /* useTitleForBackButtonText */ js.UndefOr[Boolean] => Unit = null,
    useTitleForBackButtonText: js.UndefOr[Boolean] = js.undefined
  ): IView = {
    val __obj = js.Dynamic.literal()
    if (IContainer != null) js.Dynamic.global.Object.assign(__obj, IContainer)
    if (defaultBackButtonText != null) __obj.updateDynamic("defaultBackButtonText")(defaultBackButtonText.asInstanceOf[js.Any])
    if (getDefaultBackButtonText != null) __obj.updateDynamic("getDefaultBackButtonText")(js.Any.fromFunction0(getDefaultBackButtonText))
    if (getLayout != null) __obj.updateDynamic("getLayout")(js.Any.fromFunction0(getLayout))
    if (getNavigationBar != null) __obj.updateDynamic("getNavigationBar")(js.Any.fromFunction0(getNavigationBar))
    if (getPreviousItem != null) __obj.updateDynamic("getPreviousItem")(js.Any.fromFunction0(getPreviousItem))
    if (getUseTitleForBackButtonText != null) __obj.updateDynamic("getUseTitleForBackButtonText")(js.Any.fromFunction0(getUseTitleForBackButtonText))
    if (navigationBar != null) __obj.updateDynamic("navigationBar")(navigationBar.asInstanceOf[js.Any])
    if (pop != null) __obj.updateDynamic("pop")(js.Any.fromFunction1(pop))
    if (push != null) __obj.updateDynamic("push")(js.Any.fromFunction1(push))
    if (reset != null) __obj.updateDynamic("reset")(js.Any.fromFunction0(reset))
    if (setDefaultBackButtonText != null) __obj.updateDynamic("setDefaultBackButtonText")(js.Any.fromFunction1(setDefaultBackButtonText))
    if (setNavigationBar != null) __obj.updateDynamic("setNavigationBar")(js.Any.fromFunction1(setNavigationBar))
    if (setUseTitleForBackButtonText != null) __obj.updateDynamic("setUseTitleForBackButtonText")(js.Any.fromFunction1(setUseTitleForBackButtonText))
    if (!js.isUndefined(useTitleForBackButtonText)) __obj.updateDynamic("useTitleForBackButtonText")(useTitleForBackButtonText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IView]
  }
}

