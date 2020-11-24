package typings.senchaTouch.Ext.app

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHistory extends IObservable {
  
  /** [Config Option] (Array) */
  var actions: js.UndefOr[Array] = js.native
  
  /** [Method] Adds an Action to the stack optionally updating the browser s url and firing the change event
    * @param action Ext.app.Action The Action to add to the stack.
    * @param silent Boolean Cancels the firing of the change event if true.
    */
  var add: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[IAction], /* silent */ js.UndefOr[Boolean], Unit]
  ] = js.native
  
  /** [Method] Navigate to the previous active action  */
  var back: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Returns the value of actions
    * @returns Array
    */
  var getActions: js.UndefOr[js.Function0[Array]] = js.native
  
  /** [Method] Returns the value of token
    * @returns String
    */
  var getToken: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of updateUrl
    * @returns Boolean
    */
  var getUpdateUrl: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
    * @param object Object The Observable whose events this object is to relay.
    * @param events String/Array/Object Array of event names to relay.
    * @returns Ext.mixin.Observable this
    */
  @JSName("relayEvents")
  var relayEvents_IHistory: js.UndefOr[
    js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], IObservable]
  ] = js.native
  
  /** [Method] Sets the value of actions
    * @param actions Array The new value.
    */
  var setActions: js.UndefOr[js.Function1[/* actions */ js.UndefOr[Array], Unit]] = js.native
  
  /** [Method] Sets the value of token
    * @param token String The new value.
    */
  var setToken: js.UndefOr[js.Function1[/* token */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of updateUrl
    * @param updateUrl Boolean The new value.
    */
  var setUpdateUrl: js.UndefOr[js.Function1[/* updateUrl */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Config Option] (String) */
  var token: js.UndefOr[String] = js.native
  
  /** [Config Option] (Boolean) */
  var updateUrl: js.UndefOr[Boolean] = js.native
}
object IHistory {
  
  @scala.inline
  def apply(): IHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHistory]
  }
  
  @scala.inline
  implicit class IHistoryOps[Self <: IHistory] (val x: Self) extends AnyVal {
    
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
    def setActions(value: Array): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    
    @scala.inline
    def setAdd(value: (/* action */ js.UndefOr[IAction], /* silent */ js.UndefOr[Boolean]) => Unit): Self = this.set("add", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    
    @scala.inline
    def setBack(value: () => Unit): Self = this.set("back", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteBack: Self = this.set("back", js.undefined)
    
    @scala.inline
    def setGetActions(value: () => Array): Self = this.set("getActions", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetActions: Self = this.set("getActions", js.undefined)
    
    @scala.inline
    def setGetToken(value: () => String): Self = this.set("getToken", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetToken: Self = this.set("getToken", js.undefined)
    
    @scala.inline
    def setGetUpdateUrl(value: () => Boolean): Self = this.set("getUpdateUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetUpdateUrl: Self = this.set("getUpdateUrl", js.undefined)
    
    @scala.inline
    def setRelayEvents(value: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable): Self = this.set("relayEvents", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRelayEvents: Self = this.set("relayEvents", js.undefined)
    
    @scala.inline
    def setSetActions(value: /* actions */ js.UndefOr[Array] => Unit): Self = this.set("setActions", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetActions: Self = this.set("setActions", js.undefined)
    
    @scala.inline
    def setSetToken(value: /* token */ js.UndefOr[String] => Unit): Self = this.set("setToken", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetToken: Self = this.set("setToken", js.undefined)
    
    @scala.inline
    def setSetUpdateUrl(value: /* updateUrl */ js.UndefOr[Boolean] => Unit): Self = this.set("setUpdateUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetUpdateUrl: Self = this.set("setUpdateUrl", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
    
    @scala.inline
    def setUpdateUrl(value: Boolean): Self = this.set("updateUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateUrl: Self = this.set("updateUrl", js.undefined)
  }
}
