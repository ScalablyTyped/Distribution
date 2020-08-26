package typings.senchaTouch.Ext.app

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IController extends IObservable {
  /** [Config Option] (Ext.app.Application) */
  var application: js.UndefOr[IApplication] = js.native
  /** [Config Option] (Object) */
  var before: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var control: js.UndefOr[js.Any] = js.native
  /** [Method] Returns the value of application
    * @returns Ext.app.Application
    */
  var getApplication: js.UndefOr[js.Function0[IApplication]] = js.native
  /** [Method] Returns the value of before
    * @returns Object
    */
  var getBefore: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of control
    * @returns Object
    */
  var getControl: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns a reference to another Controller
    * @param controllerName String
    * @param profile String
    * @returns Object
    */
  var getController: js.UndefOr[
    js.Function2[/* controllerName */ js.UndefOr[String], /* profile */ js.UndefOr[String], _]
  ] = js.native
  /** [Method] Returns a reference to a Model
    * @param modelName String
    * @returns Object
    */
  var getModel: js.UndefOr[js.Function1[/* modelName */ js.UndefOr[String], _]] = js.native
  /** [Method] Returns the value of models
    * @returns String[]
    */
  var getModels: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of refs
    * @returns Object
    */
  var getRefs: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of routes
    * @returns Object
    */
  var getRoutes: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of stores
    * @returns String[]
    */
  var getStores: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of views
    * @returns Array
    */
  var getViews: js.UndefOr[js.Function0[Array]] = js.native
  /** [Config Option] (Function) */
  var init: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Function) */
  var launch: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String[]) */
  var models: js.UndefOr[Array] = js.native
  /** [Method] Convenient way to redirect to a new url
    * @param place Object
    * @returns Object
    */
  var redirectTo: js.UndefOr[js.Function1[/* place */ js.UndefOr[js.Any], _]] = js.native
  /** [Config Option] (Object) */
  var refs: js.UndefOr[js.Any] = js.native
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
    * @param object Object The Observable whose events this object is to relay.
    * @param events String/Array/Object Array of event names to relay.
    * @returns Ext.mixin.Observable this
    */
  @JSName("relayEvents")
  var relayEvents_IController: js.UndefOr[
    js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], IObservable]
  ] = js.native
  /** [Config Option] (Object) */
  var routes: js.UndefOr[js.Any] = js.native
  /** [Method] Sets the value of application
    * @param application Ext.app.Application The new value.
    */
  var setApplication: js.UndefOr[js.Function1[/* application */ js.UndefOr[IApplication], Unit]] = js.native
  /** [Method] Sets the value of before
    * @param before Object The new value.
    */
  var setBefore: js.UndefOr[js.Function1[/* before */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of control
    * @param control Object The new value.
    */
  var setControl: js.UndefOr[js.Function1[/* control */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of models
    * @param models String[] The new value.
    */
  var setModels: js.UndefOr[js.Function1[/* models */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of refs
    * @param refs Object The new value.
    */
  var setRefs: js.UndefOr[js.Function1[/* refs */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of routes
    * @param routes Object The new value.
    */
  var setRoutes: js.UndefOr[js.Function1[/* routes */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of stores
    * @param stores String[] The new value.
    */
  var setStores: js.UndefOr[js.Function1[/* stores */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of views
    * @param views Array The new value.
    */
  var setViews: js.UndefOr[js.Function1[/* views */ js.UndefOr[Array], Unit]] = js.native
  /** [Config Option] (String[]) */
  var stores: js.UndefOr[Array] = js.native
  /** [Config Option] (Array) */
  var views: js.UndefOr[Array] = js.native
}

object IController {
  @scala.inline
  def apply(): IController = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IController]
  }
  @scala.inline
  implicit class IControllerOps[Self <: IController] (val x: Self) extends AnyVal {
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
    def setApplication(value: IApplication): Self = this.set("application", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplication: Self = this.set("application", js.undefined)
    @scala.inline
    def setBefore(value: js.Any): Self = this.set("before", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
    @scala.inline
    def setControl(value: js.Any): Self = this.set("control", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControl: Self = this.set("control", js.undefined)
    @scala.inline
    def setGetApplication(value: () => IApplication): Self = this.set("getApplication", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetApplication: Self = this.set("getApplication", js.undefined)
    @scala.inline
    def setGetBefore(value: () => _): Self = this.set("getBefore", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetBefore: Self = this.set("getBefore", js.undefined)
    @scala.inline
    def setGetControl(value: () => _): Self = this.set("getControl", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetControl: Self = this.set("getControl", js.undefined)
    @scala.inline
    def setGetController(value: (/* controllerName */ js.UndefOr[String], /* profile */ js.UndefOr[String]) => _): Self = this.set("getController", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetController: Self = this.set("getController", js.undefined)
    @scala.inline
    def setGetModel(value: /* modelName */ js.UndefOr[String] => _): Self = this.set("getModel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetModel: Self = this.set("getModel", js.undefined)
    @scala.inline
    def setGetModels(value: () => Array): Self = this.set("getModels", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetModels: Self = this.set("getModels", js.undefined)
    @scala.inline
    def setGetRefs(value: () => _): Self = this.set("getRefs", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetRefs: Self = this.set("getRefs", js.undefined)
    @scala.inline
    def setGetRoutes(value: () => _): Self = this.set("getRoutes", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetRoutes: Self = this.set("getRoutes", js.undefined)
    @scala.inline
    def setGetStores(value: () => Array): Self = this.set("getStores", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetStores: Self = this.set("getStores", js.undefined)
    @scala.inline
    def setGetViews(value: () => Array): Self = this.set("getViews", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetViews: Self = this.set("getViews", js.undefined)
    @scala.inline
    def setInit(value: js.Any): Self = this.set("init", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    @scala.inline
    def setLaunch(value: js.Any): Self = this.set("launch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunch: Self = this.set("launch", js.undefined)
    @scala.inline
    def setModels(value: Array): Self = this.set("models", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModels: Self = this.set("models", js.undefined)
    @scala.inline
    def setRedirectTo(value: /* place */ js.UndefOr[js.Any] => _): Self = this.set("redirectTo", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRedirectTo: Self = this.set("redirectTo", js.undefined)
    @scala.inline
    def setRefs(value: js.Any): Self = this.set("refs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefs: Self = this.set("refs", js.undefined)
    @scala.inline
    def setRelayEvents(value: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable): Self = this.set("relayEvents", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRelayEvents: Self = this.set("relayEvents", js.undefined)
    @scala.inline
    def setRoutes(value: js.Any): Self = this.set("routes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoutes: Self = this.set("routes", js.undefined)
    @scala.inline
    def setSetApplication(value: /* application */ js.UndefOr[IApplication] => Unit): Self = this.set("setApplication", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetApplication: Self = this.set("setApplication", js.undefined)
    @scala.inline
    def setSetBefore(value: /* before */ js.UndefOr[js.Any] => Unit): Self = this.set("setBefore", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetBefore: Self = this.set("setBefore", js.undefined)
    @scala.inline
    def setSetControl(value: /* control */ js.UndefOr[js.Any] => Unit): Self = this.set("setControl", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetControl: Self = this.set("setControl", js.undefined)
    @scala.inline
    def setSetModels(value: /* models */ js.UndefOr[Array] => Unit): Self = this.set("setModels", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetModels: Self = this.set("setModels", js.undefined)
    @scala.inline
    def setSetRefs(value: /* refs */ js.UndefOr[js.Any] => Unit): Self = this.set("setRefs", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetRefs: Self = this.set("setRefs", js.undefined)
    @scala.inline
    def setSetRoutes(value: /* routes */ js.UndefOr[js.Any] => Unit): Self = this.set("setRoutes", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetRoutes: Self = this.set("setRoutes", js.undefined)
    @scala.inline
    def setSetStores(value: /* stores */ js.UndefOr[Array] => Unit): Self = this.set("setStores", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetStores: Self = this.set("setStores", js.undefined)
    @scala.inline
    def setSetViews(value: /* views */ js.UndefOr[Array] => Unit): Self = this.set("setViews", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetViews: Self = this.set("setViews", js.undefined)
    @scala.inline
    def setStores(value: Array): Self = this.set("stores", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStores: Self = this.set("stores", js.undefined)
    @scala.inline
    def setViews(value: Array): Self = this.set("views", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViews: Self = this.set("views", js.undefined)
  }
  
}

