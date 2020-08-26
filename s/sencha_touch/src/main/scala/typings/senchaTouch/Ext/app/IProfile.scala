package typings.senchaTouch.Ext.app

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProfile extends IObservable {
  /** [Config Option] (Ext.app.Application) */
  var application: js.UndefOr[IApplication] = js.native
  /** [Config Option] (Array) */
  var controllers: js.UndefOr[Array] = js.native
  /** [Method] Returns the value of application
    * @returns Ext.app.Application
    */
  var getApplication: js.UndefOr[js.Function0[IApplication]] = js.native
  /** [Method] Returns the value of controllers
    * @returns Array
    */
  var getControllers: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of models
    * @returns Array
    */
  var getModels: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of name
    * @returns String
    */
  var getName: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of namespace
    * @returns String
    */
  var getNamespace: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of stores
    * @returns Array
    */
  var getStores: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of views
    * @returns Array
    */
  var getViews: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Determines whether or not this Profile is active on the device isActive is executed on
    * @returns Boolean True if this Profile should be activated on the device it is running on, false otherwise
    */
  var isActive: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] The launch function is called by the Application if this Profile s isActive function returned true  */
  var launch: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Array) */
  var models: js.UndefOr[Array] = js.native
  /** [Config Option] (String) */
  var name: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var namespace: js.UndefOr[String] = js.native
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
    * @param object Object The Observable whose events this object is to relay.
    * @param events String/Array/Object Array of event names to relay.
    * @returns Ext.mixin.Observable this
    */
  @JSName("relayEvents")
  var relayEvents_IProfile: js.UndefOr[
    js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], IObservable]
  ] = js.native
  /** [Method] Sets the value of application
    * @param application Ext.app.Application The new value.
    */
  var setApplication: js.UndefOr[js.Function1[/* application */ js.UndefOr[IApplication], Unit]] = js.native
  /** [Method] Sets the value of controllers
    * @param controllers Array The new value.
    */
  var setControllers: js.UndefOr[js.Function1[/* controllers */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of models
    * @param models Array The new value.
    */
  var setModels: js.UndefOr[js.Function1[/* models */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of name
    * @param name String The new value.
    */
  var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of namespace
    * @param namespace String The new value.
    */
  var setNamespace: js.UndefOr[js.Function1[/* namespace */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of stores
    * @param stores Array The new value.
    */
  var setStores: js.UndefOr[js.Function1[/* stores */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of views
    * @param views Array The new value.
    */
  var setViews: js.UndefOr[js.Function1[/* views */ js.UndefOr[Array], Unit]] = js.native
  /** [Config Option] (Array) */
  var stores: js.UndefOr[Array] = js.native
  /** [Config Option] (Array) */
  var views: js.UndefOr[Array] = js.native
}

object IProfile {
  @scala.inline
  def apply(): IProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProfile]
  }
  @scala.inline
  implicit class IProfileOps[Self <: IProfile] (val x: Self) extends AnyVal {
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
    def setControllers(value: Array): Self = this.set("controllers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControllers: Self = this.set("controllers", js.undefined)
    @scala.inline
    def setGetApplication(value: () => IApplication): Self = this.set("getApplication", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetApplication: Self = this.set("getApplication", js.undefined)
    @scala.inline
    def setGetControllers(value: () => Array): Self = this.set("getControllers", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetControllers: Self = this.set("getControllers", js.undefined)
    @scala.inline
    def setGetModels(value: () => Array): Self = this.set("getModels", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetModels: Self = this.set("getModels", js.undefined)
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetName: Self = this.set("getName", js.undefined)
    @scala.inline
    def setGetNamespace(value: () => String): Self = this.set("getNamespace", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetNamespace: Self = this.set("getNamespace", js.undefined)
    @scala.inline
    def setGetStores(value: () => Array): Self = this.set("getStores", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetStores: Self = this.set("getStores", js.undefined)
    @scala.inline
    def setGetViews(value: () => Array): Self = this.set("getViews", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetViews: Self = this.set("getViews", js.undefined)
    @scala.inline
    def setIsActive(value: () => Boolean): Self = this.set("isActive", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsActive: Self = this.set("isActive", js.undefined)
    @scala.inline
    def setLaunch(value: () => Unit): Self = this.set("launch", js.Any.fromFunction0(value))
    @scala.inline
    def deleteLaunch: Self = this.set("launch", js.undefined)
    @scala.inline
    def setModels(value: Array): Self = this.set("models", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModels: Self = this.set("models", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    @scala.inline
    def setRelayEvents(value: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable): Self = this.set("relayEvents", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRelayEvents: Self = this.set("relayEvents", js.undefined)
    @scala.inline
    def setSetApplication(value: /* application */ js.UndefOr[IApplication] => Unit): Self = this.set("setApplication", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetApplication: Self = this.set("setApplication", js.undefined)
    @scala.inline
    def setSetControllers(value: /* controllers */ js.UndefOr[Array] => Unit): Self = this.set("setControllers", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetControllers: Self = this.set("setControllers", js.undefined)
    @scala.inline
    def setSetModels(value: /* models */ js.UndefOr[Array] => Unit): Self = this.set("setModels", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetModels: Self = this.set("setModels", js.undefined)
    @scala.inline
    def setSetName(value: /* name */ js.UndefOr[String] => Unit): Self = this.set("setName", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetName: Self = this.set("setName", js.undefined)
    @scala.inline
    def setSetNamespace(value: /* namespace */ js.UndefOr[String] => Unit): Self = this.set("setNamespace", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetNamespace: Self = this.set("setNamespace", js.undefined)
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

