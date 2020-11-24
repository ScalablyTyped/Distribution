package typings.senchaTouch.Ext

import typings.senchaTouch.Ext.data.IStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILoadMask extends IMask {
  
  /** [Method] Changes the data store bound to this LoadMask
    * @param store Ext.data.Store The store to bind to this LoadMask
    */
  var bindStore: js.UndefOr[js.Function1[/* store */ js.UndefOr[IStore], Unit]] = js.native
  
  /** [Config Option] (String) */
  @JSName("cls")
  var cls_ILoadMask: js.UndefOr[java.lang.String] = js.native
  
  /** [Method] Returns the value of cls
    * @returns String
    */
  @JSName("getCls")
  var getCls_ILoadMask: js.UndefOr[js.Function0[java.lang.String]] = js.native
  
  /** [Method] Returns the value of indicator
    * @returns Boolean
    */
  var getIndicator: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of message
    * @returns String
    */
  var getMessage: js.UndefOr[js.Function0[java.lang.String]] = js.native
  
  /** [Method] Returns the value of messageCls
    * @returns String
    */
  var getMessageCls: js.UndefOr[js.Function0[java.lang.String]] = js.native
  
  /** [Config Option] (Boolean) */
  var indicator: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var message: js.UndefOr[java.lang.String] = js.native
  
  /** [Config Option] (String) */
  var messageCls: js.UndefOr[java.lang.String] = js.native
  
  /** [Config Option] (String) */
  var msg: js.UndefOr[java.lang.String] = js.native
  
  /** [Config Option] (String) */
  var msgCls: js.UndefOr[java.lang.String] = js.native
  
  /** [Method] Sets the value of cls
    * @param cls String The new value.
    */
  @JSName("setCls")
  var setCls_ILoadMask: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], Unit]] = js.native
  
  /** [Method] Sets the value of indicator
    * @param indicator Boolean The new value.
    */
  var setIndicator: js.UndefOr[js.Function1[/* indicator */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of message
    * @param message String The new value.
    */
  var setMessage: js.UndefOr[js.Function1[/* message */ js.UndefOr[java.lang.String], Unit]] = js.native
  
  /** [Method] Sets the value of messageCls
    * @param messageCls String The new value.
    */
  var setMessageCls: js.UndefOr[js.Function1[/* messageCls */ js.UndefOr[java.lang.String], Unit]] = js.native
  
  /** [Config Option] (Ext.data.Store) */
  var store: js.UndefOr[IStore] = js.native
}
object ILoadMask {
  
  @scala.inline
  def apply(): ILoadMask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILoadMask]
  }
  
  @scala.inline
  implicit class ILoadMaskOps[Self <: ILoadMask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBindStore(value: /* store */ js.UndefOr[IStore] => Unit): Self = this.set("bindStore", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBindStore: Self = this.set("bindStore", js.undefined)
    
    @scala.inline
    def setCls(value: java.lang.String): Self = this.set("cls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCls: Self = this.set("cls", js.undefined)
    
    @scala.inline
    def setGetCls(value: () => java.lang.String): Self = this.set("getCls", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetCls: Self = this.set("getCls", js.undefined)
    
    @scala.inline
    def setGetIndicator(value: () => Boolean): Self = this.set("getIndicator", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetIndicator: Self = this.set("getIndicator", js.undefined)
    
    @scala.inline
    def setGetMessage(value: () => java.lang.String): Self = this.set("getMessage", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetMessage: Self = this.set("getMessage", js.undefined)
    
    @scala.inline
    def setGetMessageCls(value: () => java.lang.String): Self = this.set("getMessageCls", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetMessageCls: Self = this.set("getMessageCls", js.undefined)
    
    @scala.inline
    def setIndicator(value: Boolean): Self = this.set("indicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicator: Self = this.set("indicator", js.undefined)
    
    @scala.inline
    def setMessage(value: java.lang.String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setMessageCls(value: java.lang.String): Self = this.set("messageCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageCls: Self = this.set("messageCls", js.undefined)
    
    @scala.inline
    def setMsg(value: java.lang.String): Self = this.set("msg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsg: Self = this.set("msg", js.undefined)
    
    @scala.inline
    def setMsgCls(value: java.lang.String): Self = this.set("msgCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsgCls: Self = this.set("msgCls", js.undefined)
    
    @scala.inline
    def setSetCls(value: /* cls */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setCls", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetCls: Self = this.set("setCls", js.undefined)
    
    @scala.inline
    def setSetIndicator(value: /* indicator */ js.UndefOr[Boolean] => Unit): Self = this.set("setIndicator", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetIndicator: Self = this.set("setIndicator", js.undefined)
    
    @scala.inline
    def setSetMessage(value: /* message */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMessage: Self = this.set("setMessage", js.undefined)
    
    @scala.inline
    def setSetMessageCls(value: /* messageCls */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setMessageCls", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMessageCls: Self = this.set("setMessageCls", js.undefined)
    
    @scala.inline
    def setStore(value: IStore): Self = this.set("store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStore: Self = this.set("store", js.undefined)
  }
}
