package typings
package senchaUnderscoreTouchLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILoadMask extends IMask {
  /** [Method] Changes the data store bound to this LoadMask
  		* @param store Ext.data.Store The store to bind to this LoadMask
  		*/
  var bindStore: js.UndefOr[
    js.Function1[/* store */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.IStore], scala.Unit]
  ] = js.undefined
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
  var getIndicator: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of message
  		* @returns String
  		*/
  var getMessage: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of messageCls
  		* @returns String
  		*/
  var getMessageCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Config Option] (Boolean) */
  var indicator: js.UndefOr[scala.Boolean] = js.undefined
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
  var setCls_ILoadMask: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of indicator
  		* @param indicator Boolean The new value.
  		*/
  var setIndicator: js.UndefOr[js.Function1[/* indicator */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of message
  		* @param message String The new value.
  		*/
  var setMessage: js.UndefOr[js.Function1[/* message */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of messageCls
  		* @param messageCls String The new value.
  		*/
  var setMessageCls: js.UndefOr[js.Function1[/* messageCls */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Config Option] (Ext.data.Store) */
  var store: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.IStore] = js.undefined
}

object ILoadMask {
  @scala.inline
  def apply(
    IMask: IMask = null,
    bindStore: js.Function1[/* store */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.IStore], scala.Unit] = null,
    cls: java.lang.String = null,
    getCls: js.Function0[java.lang.String] = null,
    getIndicator: js.Function0[scala.Boolean] = null,
    getMessage: js.Function0[java.lang.String] = null,
    getMessageCls: js.Function0[java.lang.String] = null,
    indicator: js.UndefOr[scala.Boolean] = js.undefined,
    message: java.lang.String = null,
    messageCls: java.lang.String = null,
    msg: java.lang.String = null,
    msgCls: java.lang.String = null,
    setCls: js.Function1[/* cls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setIndicator: js.Function1[/* indicator */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setMessage: js.Function1[/* message */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setMessageCls: js.Function1[/* messageCls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    store: senchaUnderscoreTouchLib.ExtNs.dataNs.IStore = null
  ): ILoadMask = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IMask)
    if (bindStore != null) __obj.updateDynamic("bindStore")(bindStore)
    if (cls != null) __obj.updateDynamic("cls")(cls)
    if (getCls != null) __obj.updateDynamic("getCls")(getCls)
    if (getIndicator != null) __obj.updateDynamic("getIndicator")(getIndicator)
    if (getMessage != null) __obj.updateDynamic("getMessage")(getMessage)
    if (getMessageCls != null) __obj.updateDynamic("getMessageCls")(getMessageCls)
    if (!js.isUndefined(indicator)) __obj.updateDynamic("indicator")(indicator)
    if (message != null) __obj.updateDynamic("message")(message)
    if (messageCls != null) __obj.updateDynamic("messageCls")(messageCls)
    if (msg != null) __obj.updateDynamic("msg")(msg)
    if (msgCls != null) __obj.updateDynamic("msgCls")(msgCls)
    if (setCls != null) __obj.updateDynamic("setCls")(setCls)
    if (setIndicator != null) __obj.updateDynamic("setIndicator")(setIndicator)
    if (setMessage != null) __obj.updateDynamic("setMessage")(setMessage)
    if (setMessageCls != null) __obj.updateDynamic("setMessageCls")(setMessageCls)
    if (store != null) __obj.updateDynamic("store")(store)
    __obj.asInstanceOf[ILoadMask]
  }
}

