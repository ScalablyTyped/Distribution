package typings.reduxSocketIo

import typings.redux.mod.Action
import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-socket.io", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    socket: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SocketIOClient.Socket */ Any,
    criteria: String
  ): Middleware[js.Object, Any, Dispatch[AnyAction]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(socket.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any])).asInstanceOf[Middleware[js.Object, Any, Dispatch[AnyAction]]]
  inline def default(
    socket: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SocketIOClient.Socket */ Any,
    criteria: String,
    options: MiddlewareOptions
  ): Middleware[js.Object, Any, Dispatch[AnyAction]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(socket.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Middleware[js.Object, Any, Dispatch[AnyAction]]]
  inline def default(
    socket: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SocketIOClient.Socket */ Any,
    criteria: js.Array[String]
  ): Middleware[js.Object, Any, Dispatch[AnyAction]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(socket.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any])).asInstanceOf[Middleware[js.Object, Any, Dispatch[AnyAction]]]
  inline def default(
    socket: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SocketIOClient.Socket */ Any,
    criteria: js.Array[String],
    options: MiddlewareOptions
  ): Middleware[js.Object, Any, Dispatch[AnyAction]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(socket.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Middleware[js.Object, Any, Dispatch[AnyAction]]]
  inline def default(
    socket: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SocketIOClient.Socket */ Any,
    criteria: js.Function2[/* type */ String, /* action */ Action[Any], Boolean]
  ): Middleware[js.Object, Any, Dispatch[AnyAction]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(socket.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any])).asInstanceOf[Middleware[js.Object, Any, Dispatch[AnyAction]]]
  inline def default(
    socket: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SocketIOClient.Socket */ Any,
    criteria: js.Function2[/* type */ String, /* action */ Action[Any], Boolean],
    options: MiddlewareOptions
  ): Middleware[js.Object, Any, Dispatch[AnyAction]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(socket.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Middleware[js.Object, Any, Dispatch[AnyAction]]]
  
  trait MiddlewareOptions extends StObject {
    
    var eventName: js.UndefOr[String] = js.undefined
    
    var execute: js.UndefOr[
        js.Function4[
          /* action */ Action[Any], 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SocketIOClient.Socket */ /* emitBound */ Any, 
          /* next */ Dispatch[Any], 
          /* dispatch */ Dispatch[Any], 
          Any
        ]
      ] = js.undefined
  }
  object MiddlewareOptions {
    
    inline def apply(): MiddlewareOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MiddlewareOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MiddlewareOptions] (val x: Self) extends AnyVal {
      
      inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
      
      inline def setEventNameUndefined: Self = StObject.set(x, "eventName", js.undefined)
      
      inline def setExecute(
        value: (/* action */ Action[Any], /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SocketIOClient.Socket */ /* emitBound */ Any, /* next */ Dispatch[Any], /* dispatch */ Dispatch[Any]) => Any
      ): Self = StObject.set(x, "execute", js.Any.fromFunction4(value))
      
      inline def setExecuteUndefined: Self = StObject.set(x, "execute", js.undefined)
    }
  }
}
