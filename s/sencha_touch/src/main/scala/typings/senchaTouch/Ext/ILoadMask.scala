package typings.senchaTouch.Ext

import typings.senchaTouch.Ext.data.IStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILoadMask
  extends StObject
     with IMask {
  
  /** [Method] Changes the data store bound to this LoadMask
    * @param store Ext.data.Store The store to bind to this LoadMask
    */
  var bindStore: js.UndefOr[js.Function1[/* store */ js.UndefOr[IStore], Unit]] = js.undefined
  
  /** [Config Option] (String) */
  @JSName("cls")
  var cls_ILoadMask: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Method] Returns the value of cls
    * @returns String
    */
  @JSName("getCls")
  var getCls_ILoadMask: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
  /** [Method] Returns the value of indicator
    * @returns Boolean
    */
  var getIndicator: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of message
    * @returns String
    */
  var getMessage: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
  /** [Method] Returns the value of messageCls
    * @returns String
    */
  var getMessageCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var indicator: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  var message: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Config Option] (String) */
  var messageCls: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Config Option] (String) */
  var msg: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Config Option] (String) */
  var msgCls: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Method] Sets the value of cls
    * @param cls String The new value.
    */
  @JSName("setCls")
  var setCls_ILoadMask: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
  /** [Method] Sets the value of indicator
    * @param indicator Boolean The new value.
    */
  var setIndicator: js.UndefOr[js.Function1[/* indicator */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of message
    * @param message String The new value.
    */
  var setMessage: js.UndefOr[js.Function1[/* message */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
  /** [Method] Sets the value of messageCls
    * @param messageCls String The new value.
    */
  var setMessageCls: js.UndefOr[js.Function1[/* messageCls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
  /** [Config Option] (Ext.data.Store) */
  var store: js.UndefOr[IStore] = js.undefined
}
object ILoadMask {
  
  inline def apply(): ILoadMask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILoadMask]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ILoadMask] (val x: Self) extends AnyVal {
    
    inline def setBindStore(value: /* store */ js.UndefOr[IStore] => Unit): Self = StObject.set(x, "bindStore", js.Any.fromFunction1(value))
    
    inline def setBindStoreUndefined: Self = StObject.set(x, "bindStore", js.undefined)
    
    inline def setCls(value: java.lang.String): Self = StObject.set(x, "cls", value.asInstanceOf[js.Any])
    
    inline def setClsUndefined: Self = StObject.set(x, "cls", js.undefined)
    
    inline def setGetCls(value: () => java.lang.String): Self = StObject.set(x, "getCls", js.Any.fromFunction0(value))
    
    inline def setGetClsUndefined: Self = StObject.set(x, "getCls", js.undefined)
    
    inline def setGetIndicator(value: () => Boolean): Self = StObject.set(x, "getIndicator", js.Any.fromFunction0(value))
    
    inline def setGetIndicatorUndefined: Self = StObject.set(x, "getIndicator", js.undefined)
    
    inline def setGetMessage(value: () => java.lang.String): Self = StObject.set(x, "getMessage", js.Any.fromFunction0(value))
    
    inline def setGetMessageCls(value: () => java.lang.String): Self = StObject.set(x, "getMessageCls", js.Any.fromFunction0(value))
    
    inline def setGetMessageClsUndefined: Self = StObject.set(x, "getMessageCls", js.undefined)
    
    inline def setGetMessageUndefined: Self = StObject.set(x, "getMessage", js.undefined)
    
    inline def setIndicator(value: Boolean): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
    
    inline def setIndicatorUndefined: Self = StObject.set(x, "indicator", js.undefined)
    
    inline def setMessage(value: java.lang.String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageCls(value: java.lang.String): Self = StObject.set(x, "messageCls", value.asInstanceOf[js.Any])
    
    inline def setMessageClsUndefined: Self = StObject.set(x, "messageCls", js.undefined)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setMsg(value: java.lang.String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    
    inline def setMsgCls(value: java.lang.String): Self = StObject.set(x, "msgCls", value.asInstanceOf[js.Any])
    
    inline def setMsgClsUndefined: Self = StObject.set(x, "msgCls", js.undefined)
    
    inline def setMsgUndefined: Self = StObject.set(x, "msg", js.undefined)
    
    inline def setSetCls(value: /* cls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setCls", js.Any.fromFunction1(value))
    
    inline def setSetClsUndefined: Self = StObject.set(x, "setCls", js.undefined)
    
    inline def setSetIndicator(value: /* indicator */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setIndicator", js.Any.fromFunction1(value))
    
    inline def setSetIndicatorUndefined: Self = StObject.set(x, "setIndicator", js.undefined)
    
    inline def setSetMessage(value: /* message */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setMessage", js.Any.fromFunction1(value))
    
    inline def setSetMessageCls(value: /* messageCls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setMessageCls", js.Any.fromFunction1(value))
    
    inline def setSetMessageClsUndefined: Self = StObject.set(x, "setMessageCls", js.undefined)
    
    inline def setSetMessageUndefined: Self = StObject.set(x, "setMessage", js.undefined)
    
    inline def setStore(value: IStore): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
  }
}
