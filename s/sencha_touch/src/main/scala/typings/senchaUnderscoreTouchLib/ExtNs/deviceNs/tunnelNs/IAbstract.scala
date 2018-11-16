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

