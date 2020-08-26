package typings.senchaTouch.Ext.app

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAction extends IBase {
  /** [Config Option] (String) */
  var action: js.UndefOr[String] = js.native
  /** [Config Option] (Ext.app.Application) */
  var application: js.UndefOr[IApplication] = js.native
  /** [Config Option] (Array) */
  var args: js.UndefOr[Array] = js.native
  /** [Config Option] (Array) */
  var beforeFilters: js.UndefOr[Array] = js.native
  /** [Config Option] (Ext.app.Controller) */
  var controller: js.UndefOr[IController] = js.native
  /** [Method] Starts execution of this Action by calling each of the beforeFilters in turn if any are specified  before calling t  */
  var execute: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns the value of action
    * @returns String
    */
  var getAction: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of application
    * @returns Ext.app.Application
    */
  var getApplication: js.UndefOr[js.Function0[IApplication]] = js.native
  /** [Method] Returns the value of args
    * @returns Array
    */
  var getArgs: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of beforeFilters
    * @returns Array
    */
  var getBeforeFilters: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of controller
    * @returns Ext.app.Controller
    */
  var getController: js.UndefOr[js.Function0[IController]] = js.native
  /** [Method] Returns the value of data
    * @returns Object
    */
  var getData: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of scope
    * @returns Object
    */
  var getScope: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of title
    * @returns Object
    */
  var getTitle: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of url
    * @returns String
    */
  var getUrl: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Resumes the execution of this Action or starts it if it had not been started already */
  var resume: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.native
  /** [Method] Sets the value of action
    * @param action String The new value.
    */
  var setAction: js.UndefOr[js.Function1[/* action */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of application
    * @param application Ext.app.Application The new value.
    */
  var setApplication: js.UndefOr[js.Function1[/* application */ js.UndefOr[IApplication], Unit]] = js.native
  /** [Method] Sets the value of args
    * @param args Array The new value.
    */
  var setArgs: js.UndefOr[js.Function1[/* args */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of beforeFilters
    * @param beforeFilters Array The new value.
    */
  var setBeforeFilters: js.UndefOr[js.Function1[/* beforeFilters */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of controller
    * @param controller Ext.app.Controller The new value.
    */
  var setController: js.UndefOr[js.Function1[/* controller */ js.UndefOr[IController], Unit]] = js.native
  /** [Method] Sets the value of data
    * @param data Object The new value.
    */
  var setData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of scope
    * @param scope Object The new value.
    */
  var setScope: js.UndefOr[js.Function1[/* scope */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of title
    * @param title Object The new value.
    */
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of url
    * @param url String The new value.
    */
  var setUrl: js.UndefOr[js.Function1[/* url */ js.UndefOr[String], Unit]] = js.native
  /** [Config Option] (String) */
  var url: js.UndefOr[String] = js.native
}

object IAction {
  @scala.inline
  def apply(): IAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAction]
  }
  @scala.inline
  implicit class IActionOps[Self <: IAction] (val x: Self) extends AnyVal {
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setApplication(value: IApplication): Self = this.set("application", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplication: Self = this.set("application", js.undefined)
    @scala.inline
    def setArgs(value: Array): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    @scala.inline
    def setBeforeFilters(value: Array): Self = this.set("beforeFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeFilters: Self = this.set("beforeFilters", js.undefined)
    @scala.inline
    def setController(value: IController): Self = this.set("controller", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteController: Self = this.set("controller", js.undefined)
    @scala.inline
    def setExecute(value: () => Unit): Self = this.set("execute", js.Any.fromFunction0(value))
    @scala.inline
    def deleteExecute: Self = this.set("execute", js.undefined)
    @scala.inline
    def setGetAction(value: () => String): Self = this.set("getAction", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetAction: Self = this.set("getAction", js.undefined)
    @scala.inline
    def setGetApplication(value: () => IApplication): Self = this.set("getApplication", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetApplication: Self = this.set("getApplication", js.undefined)
    @scala.inline
    def setGetArgs(value: () => Array): Self = this.set("getArgs", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetArgs: Self = this.set("getArgs", js.undefined)
    @scala.inline
    def setGetBeforeFilters(value: () => Array): Self = this.set("getBeforeFilters", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetBeforeFilters: Self = this.set("getBeforeFilters", js.undefined)
    @scala.inline
    def setGetController(value: () => IController): Self = this.set("getController", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetController: Self = this.set("getController", js.undefined)
    @scala.inline
    def setGetData(value: () => _): Self = this.set("getData", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetData: Self = this.set("getData", js.undefined)
    @scala.inline
    def setGetScope(value: () => _): Self = this.set("getScope", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetScope: Self = this.set("getScope", js.undefined)
    @scala.inline
    def setGetTitle(value: () => _): Self = this.set("getTitle", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetTitle: Self = this.set("getTitle", js.undefined)
    @scala.inline
    def setGetUrl(value: () => String): Self = this.set("getUrl", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetUrl: Self = this.set("getUrl", js.undefined)
    @scala.inline
    def setResume(value: () => Unit): Self = this.set("resume", js.Any.fromFunction0(value))
    @scala.inline
    def deleteResume: Self = this.set("resume", js.undefined)
    @scala.inline
    def setScope(value: js.Any): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setSetAction(value: /* action */ js.UndefOr[String] => Unit): Self = this.set("setAction", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetAction: Self = this.set("setAction", js.undefined)
    @scala.inline
    def setSetApplication(value: /* application */ js.UndefOr[IApplication] => Unit): Self = this.set("setApplication", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetApplication: Self = this.set("setApplication", js.undefined)
    @scala.inline
    def setSetArgs(value: /* args */ js.UndefOr[Array] => Unit): Self = this.set("setArgs", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetArgs: Self = this.set("setArgs", js.undefined)
    @scala.inline
    def setSetBeforeFilters(value: /* beforeFilters */ js.UndefOr[Array] => Unit): Self = this.set("setBeforeFilters", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetBeforeFilters: Self = this.set("setBeforeFilters", js.undefined)
    @scala.inline
    def setSetController(value: /* controller */ js.UndefOr[IController] => Unit): Self = this.set("setController", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetController: Self = this.set("setController", js.undefined)
    @scala.inline
    def setSetData(value: /* data */ js.UndefOr[js.Any] => Unit): Self = this.set("setData", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetData: Self = this.set("setData", js.undefined)
    @scala.inline
    def setSetScope(value: /* scope */ js.UndefOr[js.Any] => Unit): Self = this.set("setScope", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetScope: Self = this.set("setScope", js.undefined)
    @scala.inline
    def setSetTitle(value: /* title */ js.UndefOr[js.Any] => Unit): Self = this.set("setTitle", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetTitle: Self = this.set("setTitle", js.undefined)
    @scala.inline
    def setSetUrl(value: /* url */ js.UndefOr[String] => Unit): Self = this.set("setUrl", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetUrl: Self = this.set("setUrl", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

