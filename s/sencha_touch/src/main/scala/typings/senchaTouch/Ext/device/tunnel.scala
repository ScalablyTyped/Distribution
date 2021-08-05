package typings.senchaTouch.Ext.device

import typings.senchaTouch.Ext.IBase
import typings.senchaTouch.Ext.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tunnel {
  
  trait IAbstract
    extends StObject
       with IBase {
    
    /** [Method] Broadcast a message intent to look for receivers who can respond to it
      * @param message String
      * @returns Ext.Promise A promise which provides an array of objects upon fulfilled. Each object contains information about a receiver, with 'id', 'name' and 'icon' keys.
      */
    var broadcast: js.UndefOr[js.Function1[/* message */ js.UndefOr[String], IPromise]] = js.undefined
    
    /** [Method] Create a connection to another application with the given id
      * @param receiverId String The id of the application to connect to. Get this id from broadcast
      * @returns Ext.Promise
      */
    var connect: js.UndefOr[js.Function1[/* receiverId */ js.UndefOr[String], IPromise]] = js.undefined
    
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
          /* receiverId */ js.UndefOr[String], 
          /* message */ js.UndefOr[js.Any], 
          /* foreground */ js.UndefOr[Boolean], 
          IPromise
        ]
      ] = js.undefined
  }
  object IAbstract {
    
    inline def apply(): IAbstract = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAbstract]
    }
    
    extension [Self <: IAbstract](x: Self) {
      
      inline def setBroadcast(value: /* message */ js.UndefOr[String] => IPromise): Self = StObject.set(x, "broadcast", js.Any.fromFunction1(value))
      
      inline def setBroadcastUndefined: Self = StObject.set(x, "broadcast", js.undefined)
      
      inline def setConnect(value: /* receiverId */ js.UndefOr[String] => IPromise): Self = StObject.set(x, "connect", js.Any.fromFunction1(value))
      
      inline def setConnectUndefined: Self = StObject.set(x, "connect", js.undefined)
      
      inline def setOnConnect(value: /* callback */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onConnect", js.Any.fromFunction1(value))
      
      inline def setOnConnectUndefined: Self = StObject.set(x, "onConnect", js.undefined)
      
      inline def setOnMessage(value: /* callback */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onMessage", js.Any.fromFunction1(value))
      
      inline def setOnMessageUndefined: Self = StObject.set(x, "onMessage", js.undefined)
      
      inline def setSend(
        value: (/* receiverId */ js.UndefOr[String], /* message */ js.UndefOr[js.Any], /* foreground */ js.UndefOr[Boolean]) => IPromise
      ): Self = StObject.set(x, "send", js.Any.fromFunction3(value))
      
      inline def setSendUndefined: Self = StObject.set(x, "send", js.undefined)
    }
  }
}
