package typings
package senchaUnderscoreTouchLib.ExtNs.deviceNs.tunnelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAbstract
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Method] Broadcast a message intent to look for receivers who can respond to it
  		* @param message String
  		* @returns Ext.Promise A promise which provides an array of objects upon fulfilled. Each object contains information about a receiver, with 'id', 'name' and 'icon' keys.
  		*/
  var broadcast: js.UndefOr[
    js.Function1[
      /* message */ js.UndefOr[java.lang.String], 
      senchaUnderscoreTouchLib.ExtNs.IPromise
    ]
  ] = js.undefined
  /** [Method] Create a connection to another application with the given id
  		* @param receiverId String The id of the application to connect to. Get this id from broadcast
  		* @returns Ext.Promise
  		*/
  var connect: js.UndefOr[
    js.Function1[
      /* receiverId */ js.UndefOr[java.lang.String], 
      senchaUnderscoreTouchLib.ExtNs.IPromise
    ]
  ] = js.undefined
  /** [Method] Assign the callback to handle new connection
  		* @param callback Function
  		*/
  var onConnect: js.UndefOr[js.Function1[/* callback */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Assign the callback to handling incoming messages
  		* @param callback Function
  		*/
  var onMessage: js.UndefOr[js.Function1[/* callback */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
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
      /* foreground */ js.UndefOr[scala.Boolean], 
      senchaUnderscoreTouchLib.ExtNs.IPromise
    ]
  ] = js.undefined
}

object IAbstract {
  @scala.inline
  def apply(
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    broadcast: js.Function1[
      /* message */ js.UndefOr[java.lang.String], 
      senchaUnderscoreTouchLib.ExtNs.IPromise
    ] = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    config: js.Any = null,
    connect: js.Function1[
      /* receiverId */ js.UndefOr[java.lang.String], 
      senchaUnderscoreTouchLib.ExtNs.IPromise
    ] = null,
    destroy: js.Function0[scala.Unit] = null,
    extend: java.lang.String = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    mixins: js.Any = null,
    onConnect: js.Function1[/* callback */ js.UndefOr[js.Any], scala.Unit] = null,
    onMessage: js.Function1[/* callback */ js.UndefOr[js.Any], scala.Unit] = null,
    platformConfig: js.Any = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    send: js.Function3[
      /* receiverId */ js.UndefOr[java.lang.String], 
      /* message */ js.UndefOr[js.Any], 
      /* foreground */ js.UndefOr[scala.Boolean], 
      senchaUnderscoreTouchLib.ExtNs.IPromise
    ] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IAbstract = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (broadcast != null) __obj.updateDynamic("broadcast")(broadcast)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (connect != null) __obj.updateDynamic("connect")(connect)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (onConnect != null) __obj.updateDynamic("onConnect")(onConnect)
    if (onMessage != null) __obj.updateDynamic("onMessage")(onMessage)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (self != null) __obj.updateDynamic("self")(self)
    if (send != null) __obj.updateDynamic("send")(send)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IAbstract]
  }
}

