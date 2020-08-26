package typings.senchaTouch.Ext.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDroppable
  extends typings.senchaTouch.Ext.mixin.IObservable {
  /** [Config Option] (String) */
  var activeCls: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var baseCls: js.UndefOr[String] = js.native
  /** [Method] Disable the Droppable target  */
  var disable: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Boolean) */
  var disabled: js.UndefOr[Boolean] = js.native
  /** [Method] Enable the Droppable target  */
  var enable: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns the value of baseCls
    * @returns String
    */
  var getBaseCls: js.UndefOr[js.Function0[String]] = js.native
  /** [Config Option] (String) */
  var group: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var hoverCls: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var invalidCls: js.UndefOr[String] = js.native
  /** [Method] Method to determine whether this Component is currently disabled
    * @returns Boolean the disabled state of this Component.
    */
  var isDisabled: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Method to determine whether this Droppable is currently monitoring drag operations of Draggables
    * @returns Boolean the monitoring state of this Droppable
    */
  var isMonitoring: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
    * @param object Object The Observable whose events this object is to relay.
    * @param events String/Array/Object Array of event names to relay.
    * @returns Ext.mixin.Observable this
    */
  @JSName("relayEvents")
  var relayEvents_IDroppable: js.UndefOr[
    js.Function2[
      /* object */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[js.Any], 
      typings.senchaTouch.Ext.mixin.IObservable
    ]
  ] = js.native
  /** [Method] Sets the value of baseCls
    * @param baseCls String The new value.
    */
  var setBaseCls: js.UndefOr[js.Function1[/* baseCls */ js.UndefOr[String], Unit]] = js.native
  /** [Config Option] (String) */
  var validDropMode: js.UndefOr[String] = js.native
}

object IDroppable {
  @scala.inline
  def apply(): IDroppable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDroppable]
  }
  @scala.inline
  implicit class IDroppableOps[Self <: IDroppable] (val x: Self) extends AnyVal {
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
    def setActiveCls(value: String): Self = this.set("activeCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveCls: Self = this.set("activeCls", js.undefined)
    @scala.inline
    def setBaseCls(value: String): Self = this.set("baseCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseCls: Self = this.set("baseCls", js.undefined)
    @scala.inline
    def setDisable(value: () => Unit): Self = this.set("disable", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDisable: Self = this.set("disable", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setEnable(value: () => Unit): Self = this.set("enable", js.Any.fromFunction0(value))
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    @scala.inline
    def setGetBaseCls(value: () => String): Self = this.set("getBaseCls", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetBaseCls: Self = this.set("getBaseCls", js.undefined)
    @scala.inline
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setHoverCls(value: String): Self = this.set("hoverCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverCls: Self = this.set("hoverCls", js.undefined)
    @scala.inline
    def setInvalidCls(value: String): Self = this.set("invalidCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvalidCls: Self = this.set("invalidCls", js.undefined)
    @scala.inline
    def setIsDisabled(value: () => Boolean): Self = this.set("isDisabled", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsDisabled: Self = this.set("isDisabled", js.undefined)
    @scala.inline
    def setIsMonitoring(value: () => Boolean): Self = this.set("isMonitoring", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsMonitoring: Self = this.set("isMonitoring", js.undefined)
    @scala.inline
    def setRelayEvents(
      value: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => typings.senchaTouch.Ext.mixin.IObservable
    ): Self = this.set("relayEvents", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRelayEvents: Self = this.set("relayEvents", js.undefined)
    @scala.inline
    def setSetBaseCls(value: /* baseCls */ js.UndefOr[String] => Unit): Self = this.set("setBaseCls", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetBaseCls: Self = this.set("setBaseCls", js.undefined)
    @scala.inline
    def setValidDropMode(value: String): Self = this.set("validDropMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidDropMode: Self = this.set("validDropMode", js.undefined)
  }
  
}

