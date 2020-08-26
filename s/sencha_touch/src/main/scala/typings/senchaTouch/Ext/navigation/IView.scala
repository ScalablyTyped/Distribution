package typings.senchaTouch.Ext.navigation

import typings.senchaTouch.Ext.IComponent
import typings.senchaTouch.Ext.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IView extends IContainer {
  /** [Config Option] (String) */
  var defaultBackButtonText: js.UndefOr[String] = js.native
  /** [Method] Returns the value of defaultBackButtonText
    * @returns String
    */
  var getDefaultBackButtonText: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of layout
    * @returns Object
    */
  var getLayout: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of navigationBar
    * @returns Boolean/Object
    */
  var getNavigationBar: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the previous item if one exists
    * @returns Mixed The previous view
    */
  var getPreviousItem: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of useTitleForBackButtonText
    * @returns Boolean
    */
  var getUseTitleForBackButtonText: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Config Option] (Boolean/Object) */
  var navigationBar: js.UndefOr[js.Any] = js.native
  /** [Method] Removes the current active view from the stack and sets the previous view using the default animation of this view
    * @param count Number/String/Object If a Number, the number of views you want to pop. If a String, the pops to a matching component query. If an Object, the pops to a matching view instance.
    * @returns Ext.Component The new active item
    */
  var pop: js.UndefOr[js.Function1[/* count */ js.UndefOr[js.Any], IComponent]] = js.native
  /** [Method] Pushes a new view into this navigation view using the default animation that this view has
    * @param view Object The view to push.
    * @returns Ext.Component The new item you just pushed.
    */
  var push: js.UndefOr[js.Function1[/* view */ js.UndefOr[js.Any], IComponent]] = js.native
  /** [Method] Resets the view by removing all items between the first and last item
    * @returns Ext.Component The view that is now active
    */
  var reset: js.UndefOr[js.Function0[IComponent]] = js.native
  /** [Method] Sets the value of defaultBackButtonText
    * @param defaultBackButtonText String The new value.
    */
  var setDefaultBackButtonText: js.UndefOr[js.Function1[/* defaultBackButtonText */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of navigationBar
    * @param navigationBar Boolean/Object The new value.
    */
  var setNavigationBar: js.UndefOr[js.Function1[/* navigationBar */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of useTitleForBackButtonText
    * @param useTitleForBackButtonText Boolean The new value.
    */
  var setUseTitleForBackButtonText: js.UndefOr[js.Function1[/* useTitleForBackButtonText */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var useTitleForBackButtonText: js.UndefOr[Boolean] = js.native
}

object IView {
  @scala.inline
  def apply(): IView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IView]
  }
  @scala.inline
  implicit class IViewOps[Self <: IView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDefaultBackButtonText(value: String): Self = this.set("defaultBackButtonText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultBackButtonText: Self = this.set("defaultBackButtonText", js.undefined)
    @scala.inline
    def setGetDefaultBackButtonText(value: () => String): Self = this.set("getDefaultBackButtonText", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetDefaultBackButtonText: Self = this.set("getDefaultBackButtonText", js.undefined)
    @scala.inline
    def setGetLayout(value: () => _): Self = this.set("getLayout", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetLayout: Self = this.set("getLayout", js.undefined)
    @scala.inline
    def setGetNavigationBar(value: () => _): Self = this.set("getNavigationBar", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetNavigationBar: Self = this.set("getNavigationBar", js.undefined)
    @scala.inline
    def setGetPreviousItem(value: () => _): Self = this.set("getPreviousItem", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetPreviousItem: Self = this.set("getPreviousItem", js.undefined)
    @scala.inline
    def setGetUseTitleForBackButtonText(value: () => Boolean): Self = this.set("getUseTitleForBackButtonText", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetUseTitleForBackButtonText: Self = this.set("getUseTitleForBackButtonText", js.undefined)
    @scala.inline
    def setNavigationBar(value: js.Any): Self = this.set("navigationBar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigationBar: Self = this.set("navigationBar", js.undefined)
    @scala.inline
    def setPop(value: /* count */ js.UndefOr[js.Any] => IComponent): Self = this.set("pop", js.Any.fromFunction1(value))
    @scala.inline
    def deletePop: Self = this.set("pop", js.undefined)
    @scala.inline
    def setPush(value: /* view */ js.UndefOr[js.Any] => IComponent): Self = this.set("push", js.Any.fromFunction1(value))
    @scala.inline
    def deletePush: Self = this.set("push", js.undefined)
    @scala.inline
    def setReset(value: () => IComponent): Self = this.set("reset", js.Any.fromFunction0(value))
    @scala.inline
    def deleteReset: Self = this.set("reset", js.undefined)
    @scala.inline
    def setSetDefaultBackButtonText(value: /* defaultBackButtonText */ js.UndefOr[String] => Unit): Self = this.set("setDefaultBackButtonText", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetDefaultBackButtonText: Self = this.set("setDefaultBackButtonText", js.undefined)
    @scala.inline
    def setSetNavigationBar(value: /* navigationBar */ js.UndefOr[js.Any] => Unit): Self = this.set("setNavigationBar", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetNavigationBar: Self = this.set("setNavigationBar", js.undefined)
    @scala.inline
    def setSetUseTitleForBackButtonText(value: /* useTitleForBackButtonText */ js.UndefOr[Boolean] => Unit): Self = this.set("setUseTitleForBackButtonText", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetUseTitleForBackButtonText: Self = this.set("setUseTitleForBackButtonText", js.undefined)
    @scala.inline
    def setUseTitleForBackButtonText(value: Boolean): Self = this.set("useTitleForBackButtonText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseTitleForBackButtonText: Self = this.set("useTitleForBackButtonText", js.undefined)
  }
  
}

