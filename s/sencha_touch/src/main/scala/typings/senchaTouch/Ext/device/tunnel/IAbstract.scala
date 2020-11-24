package typings.senchaTouch.Ext.device.tunnel

import typings.senchaTouch.Ext.IBase
import typings.senchaTouch.Ext.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAbstract extends IBase {
  
  /** [Method] Broadcast a message intent to look for receivers who can respond to it
    * @param message String
    * @returns Ext.Promise A promise which provides an array of objects upon fulfilled. Each object contains information about a receiver, with 'id', 'name' and 'icon' keys.
    */
  var broadcast: js.UndefOr[js.Function1[/* message */ js.UndefOr[String], IPromise]] = js.native
  
  /** [Method] Create a connection to another application with the given id
    * @param receiverId String The id of the application to connect to. Get this id from broadcast
    * @returns Ext.Promise
    */
  var connect: js.UndefOr[js.Function1[/* receiverId */ js.UndefOr[String], IPromise]] = js.native
  
  /** [Method] Assign the callback to handle new connection
    * @param callback Function
    */
  var onConnect: js.UndefOr[js.Function1[/* callback */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Assign the callback to handling incoming messages
    * @param callback Function
    */
  var onMessage: js.UndefOr[js.Function1[/* callback */ js.UndefOr[js.Any], Unit]] = js.native
  
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
  ] = js.native
}
object IAbstract {
  
  @scala.inline
  def apply(): IAbstract = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstract]
  }
  
  @scala.inline
  implicit class IAbstractOps[Self <: IAbstract] (val x: Self) extends AnyVal {
    
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
    def setBroadcast(value: /* message */ js.UndefOr[String] => IPromise): Self = this.set("broadcast", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBroadcast: Self = this.set("broadcast", js.undefined)
    
    @scala.inline
    def setConnect(value: /* receiverId */ js.UndefOr[String] => IPromise): Self = this.set("connect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteConnect: Self = this.set("connect", js.undefined)
    
    @scala.inline
    def setOnConnect(value: /* callback */ js.UndefOr[js.Any] => Unit): Self = this.set("onConnect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnConnect: Self = this.set("onConnect", js.undefined)
    
    @scala.inline
    def setOnMessage(value: /* callback */ js.UndefOr[js.Any] => Unit): Self = this.set("onMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMessage: Self = this.set("onMessage", js.undefined)
    
    @scala.inline
    def setSend(
      value: (/* receiverId */ js.UndefOr[String], /* message */ js.UndefOr[js.Any], /* foreground */ js.UndefOr[Boolean]) => IPromise
    ): Self = this.set("send", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteSend: Self = this.set("send", js.undefined)
  }
}
