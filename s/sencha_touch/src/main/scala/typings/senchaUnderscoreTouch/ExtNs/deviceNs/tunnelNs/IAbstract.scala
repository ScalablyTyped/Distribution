package typings.senchaUnderscoreTouch.ExtNs.deviceNs.tunnelNs

import typings.senchaUnderscoreTouch.ExtNs.Array
import typings.senchaUnderscoreTouch.ExtNs.IBase
import typings.senchaUnderscoreTouch.ExtNs.IClass
import typings.senchaUnderscoreTouch.ExtNs.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAbstract extends IBase {
  /** [Method] Broadcast a message intent to look for receivers who can respond to it
  		* @param message String
  		* @returns Ext.Promise A promise which provides an array of objects upon fulfilled. Each object contains information about a receiver, with 'id', 'name' and 'icon' keys.
  		*/
  var broadcast: js.UndefOr[js.Function1[/* message */ js.UndefOr[java.lang.String], IPromise]] = js.undefined
  /** [Method] Create a connection to another application with the given id
  		* @param receiverId String The id of the application to connect to. Get this id from broadcast
  		* @returns Ext.Promise
  		*/
  var connect: js.UndefOr[js.Function1[/* receiverId */ js.UndefOr[java.lang.String], IPromise]] = js.undefined
  /** [Method] Assign the callback to handle new connection
  		* @param callback Function
  		*/
  var onConnect: js.UndefOr[js.Function1[/* callback */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Assign the callback to handling incoming messages
  		* @param callback Function
  		*/
  var onMessage: js.UndefOr[js.Function1[/* callback */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Send a message
  		* @param receiverId String The id of the application to connect to. Get this id from broadcast
  		* @param message * The message to send, can be an object, as long as it is JSON-able.
  		* @param foreground Boolean Whether or not to bring the receiver app to the foreground
  		* @returns Ext.Promise
  		*/
  var send: js.UndefOr[
    js.Function3[
      /* receiverId */ js.UndefOr[java.lang.String], 
      /* message */ js.UndefOr[js.Any], 
      /* foreground */ js.UndefOr[Boolean], 
      IPromise
    ]
  ] = js.undefined
}

object IAbstract {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    broadcast: /* message */ js.UndefOr[java.lang.String] => IPromise = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    connect: /* receiverId */ js.UndefOr[java.lang.String] => IPromise = null,
    destroy: () => Unit = null,
    extend: java.lang.String = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    mixins: js.Any = null,
    onConnect: /* callback */ js.UndefOr[js.Any] => Unit = null,
    onMessage: /* callback */ js.UndefOr[js.Any] => Unit = null,
    platformConfig: js.Any = null,
    self: IClass = null,
    send: (/* receiverId */ js.UndefOr[java.lang.String], /* message */ js.UndefOr[js.Any], /* foreground */ js.UndefOr[Boolean]) => IPromise = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IAbstract = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (broadcast != null) __obj.updateDynamic("broadcast")(js.Any.fromFunction1(broadcast))
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config)
    if (connect != null) __obj.updateDynamic("connect")(js.Any.fromFunction1(connect))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (onConnect != null) __obj.updateDynamic("onConnect")(js.Any.fromFunction1(onConnect))
    if (onMessage != null) __obj.updateDynamic("onMessage")(js.Any.fromFunction1(onMessage))
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (self != null) __obj.updateDynamic("self")(self)
    if (send != null) __obj.updateDynamic("send")(js.Any.fromFunction3(send))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IAbstract]
  }
}

