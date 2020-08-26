package typings.senchaTouch.Ext.direct

import typings.senchaTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProvider extends IObservable {
  /** [Method] Abstract methods for subclasses to implement  */
  var connect: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Abstract methods for subclasses to implement  */
  var disconnect: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns the value of id
    * @returns String
    */
  @JSName("getId")
  var getId_IProvider: js.UndefOr[js.Function0[String]] = js.native
  /** [Config Option] (String) */
  var id: js.UndefOr[String] = js.native
  /** [Method] Returns whether or not the server side is currently connected
    * @returns Boolean
    */
  var isConnected: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Property] (Boolean) */
  var isProvider: js.UndefOr[Boolean] = js.native
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
    * @param object Object The Observable whose events this object is to relay.
    * @param events String/Array/Object Array of event names to relay.
    * @returns Ext.mixin.Observable this
    */
  @JSName("relayEvents")
  var relayEvents_IProvider: js.UndefOr[
    js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], IObservable]
  ] = js.native
  /** [Method] Sets the value of id
    * @param id String The new value.
    */
  var setId: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], Unit]] = js.native
}

object IProvider {
  @scala.inline
  def apply(): IProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProvider]
  }
  @scala.inline
  implicit class IProviderOps[Self <: IProvider] (val x: Self) extends AnyVal {
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
    def setConnect(value: () => Unit): Self = this.set("connect", js.Any.fromFunction0(value))
    @scala.inline
    def deleteConnect: Self = this.set("connect", js.undefined)
    @scala.inline
    def setDisconnect(value: () => Unit): Self = this.set("disconnect", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDisconnect: Self = this.set("disconnect", js.undefined)
    @scala.inline
    def setGetId(value: () => String): Self = this.set("getId", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetId: Self = this.set("getId", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIsConnected(value: () => Boolean): Self = this.set("isConnected", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsConnected: Self = this.set("isConnected", js.undefined)
    @scala.inline
    def setIsProvider(value: Boolean): Self = this.set("isProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsProvider: Self = this.set("isProvider", js.undefined)
    @scala.inline
    def setRelayEvents(value: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable): Self = this.set("relayEvents", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRelayEvents: Self = this.set("relayEvents", js.undefined)
    @scala.inline
    def setSetId(value: /* id */ js.UndefOr[String] => Unit): Self = this.set("setId", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetId: Self = this.set("setId", js.undefined)
  }
  
}

