package typings.reduxSocketIo

import typings.redux.mod.Action
import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import typings.socketIoClient.SocketIOClient.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-socket.io", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(socket: Socket, criteria: String): Middleware[js.Object, js.Any, Dispatch[AnyAction]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(socket.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any])).asInstanceOf[Middleware[js.Object, js.Any, Dispatch[AnyAction]]]
  @scala.inline
  def default(socket: Socket, criteria: String, options: MiddlewareOptions): Middleware[js.Object, js.Any, Dispatch[AnyAction]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(socket.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Middleware[js.Object, js.Any, Dispatch[AnyAction]]]
  @scala.inline
  def default(socket: Socket, criteria: js.Array[String]): Middleware[js.Object, js.Any, Dispatch[AnyAction]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(socket.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any])).asInstanceOf[Middleware[js.Object, js.Any, Dispatch[AnyAction]]]
  @scala.inline
  def default(socket: Socket, criteria: js.Array[String], options: MiddlewareOptions): Middleware[js.Object, js.Any, Dispatch[AnyAction]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(socket.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Middleware[js.Object, js.Any, Dispatch[AnyAction]]]
  @scala.inline
  def default(socket: Socket, criteria: js.Function2[/* type */ String, /* action */ Action[js.Any], Boolean]): Middleware[js.Object, js.Any, Dispatch[AnyAction]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(socket.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any])).asInstanceOf[Middleware[js.Object, js.Any, Dispatch[AnyAction]]]
  @scala.inline
  def default(
    socket: Socket,
    criteria: js.Function2[/* type */ String, /* action */ Action[js.Any], Boolean],
    options: MiddlewareOptions
  ): Middleware[js.Object, js.Any, Dispatch[AnyAction]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(socket.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Middleware[js.Object, js.Any, Dispatch[AnyAction]]]
  
  trait MiddlewareOptions extends StObject {
    
    var eventName: js.UndefOr[String] = js.undefined
    
    var execute: js.UndefOr[
        js.Function4[
          /* action */ Action[js.Any], 
          /* emitBound */ Socket, 
          /* next */ Dispatch[js.Any], 
          /* dispatch */ Dispatch[js.Any], 
          js.Any
        ]
      ] = js.undefined
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
        value: (/* action */ Action[js.Any], /* emitBound */ Socket, /* next */ Dispatch[js.Any], /* dispatch */ Dispatch[js.Any]) => js.Any
      ): Self = StObject.set(x, "execute", js.Any.fromFunction4(value))
      
      @scala.inline
      def setExecuteUndefined: Self = StObject.set(x, "execute", js.undefined)
    }
  }
}
