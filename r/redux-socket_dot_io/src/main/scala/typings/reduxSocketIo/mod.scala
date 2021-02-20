package typings.reduxSocketIo

import typings.redux.mod.Action
import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import typings.socketIoClient.SocketIOClient.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-socket.io", JSImport.Default)
  @js.native
  def default(socket: Socket, criteria: String): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  @JSImport("redux-socket.io", JSImport.Default)
  @js.native
  def default(socket: Socket, criteria: String, options: MiddlewareOptions): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  @JSImport("redux-socket.io", JSImport.Default)
  @js.native
  def default(socket: Socket, criteria: js.Array[String]): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  @JSImport("redux-socket.io", JSImport.Default)
  @js.native
  def default(socket: Socket, criteria: js.Array[String], options: MiddlewareOptions): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  @JSImport("redux-socket.io", JSImport.Default)
  @js.native
  def default(socket: Socket, criteria: js.Function2[/* type */ String, /* action */ Action[_], Boolean]): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  @JSImport("redux-socket.io", JSImport.Default)
  @js.native
  def default(
    socket: Socket,
    criteria: js.Function2[/* type */ String, /* action */ Action[_], Boolean],
    options: MiddlewareOptions
  ): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  
  @js.native
  trait MiddlewareOptions extends StObject {
    
    var eventName: js.UndefOr[String] = js.native
    
    var execute: js.UndefOr[
        js.Function4[
          /* action */ Action[_], 
          /* emitBound */ Socket, 
          /* next */ Dispatch[_], 
          /* dispatch */ Dispatch[_], 
          _
        ]
      ] = js.native
  }
  object MiddlewareOptions {
    
    @scala.inline
    def apply(): MiddlewareOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MiddlewareOptions]
    }
    
    @scala.inline
    implicit class MiddlewareOptionsMutableBuilder[Self <: MiddlewareOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventNameUndefined: Self = StObject.set(x, "eventName", js.undefined)
      
      @scala.inline
      def setExecute(
        value: (/* action */ Action[_], /* emitBound */ Socket, /* next */ Dispatch[_], /* dispatch */ Dispatch[_]) => _
      ): Self = StObject.set(x, "execute", js.Any.fromFunction4(value))
      
      @scala.inline
      def setExecuteUndefined: Self = StObject.set(x, "execute", js.undefined)
    }
  }
}
