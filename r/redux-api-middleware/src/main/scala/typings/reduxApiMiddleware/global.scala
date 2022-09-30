package typings.reduxApiMiddleware

import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import typings.redux.mod.MiddlewareAPI
import typings.reduxApiMiddleware.mod.CreateMiddlewareOptions
import typings.reduxApiMiddleware.mod.RSAAAction
import typings.reduxApiMiddleware.mod.RSAACall
import typings.std.Response
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ReduxApiMiddleware {
    
    @JSGlobal("ReduxApiMiddleware")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("ReduxApiMiddleware.ApiError")
    @js.native
    open class ApiError[T] protected ()
      extends typings.reduxApiMiddleware.mod.ApiError[T] {
      def this(status: Double, statusText: String, response: T) = this()
    }
    
    @JSGlobal("ReduxApiMiddleware.InternalError")
    @js.native
    open class InternalError protected ()
      extends typings.reduxApiMiddleware.mod.InternalError {
      def this(message: String) = this()
    }
    
    @JSGlobal("ReduxApiMiddleware.InvalidRSAA")
    @js.native
    open class InvalidRSAA protected ()
      extends typings.reduxApiMiddleware.mod.InvalidRSAA {
      def this(validationErrors: js.Array[String]) = this()
    }
    
    @JSGlobal("ReduxApiMiddleware.RSAA")
    @js.native
    val RSAA: /* "@@redux-api-middleware/RSAA" */ String = js.native
    
    @JSGlobal("ReduxApiMiddleware.RequestError")
    @js.native
    open class RequestError protected ()
      extends typings.reduxApiMiddleware.mod.RequestError {
      def this(message: String) = this()
    }
    
    inline def apiMiddleware(api: MiddlewareAPI[Dispatch[AnyAction], Any]): ReturnType[Middleware[js.Object, Any, Dispatch[AnyAction]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apiMiddleware")(api.asInstanceOf[js.Any]).asInstanceOf[ReturnType[Middleware[js.Object, Any, Dispatch[AnyAction]]]]
    
    inline def createAction[State, Payload, Meta](clientCall: RSAACall[State, Payload, Meta]): RSAAAction[State, Payload, Meta] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(clientCall.asInstanceOf[js.Any]).asInstanceOf[RSAAAction[State, Payload, Meta]]
    
    inline def createMiddleware(): Middleware[js.Object, Any, Dispatch[AnyAction]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMiddleware")().asInstanceOf[Middleware[js.Object, Any, Dispatch[AnyAction]]]
    inline def createMiddleware(options: CreateMiddlewareOptions): Middleware[js.Object, Any, Dispatch[AnyAction]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMiddleware")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware[js.Object, Any, Dispatch[AnyAction]]]
    
    inline def getJSON(res: Response): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJSON")(res.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    
    inline def isRSAA(action: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRSAA")(action.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isValidRSAA(action: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidRSAA")(action.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def validateRSAA(action: js.Object): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("validateRSAA")(action.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    /**
      * Redux behaviour changed by middleware, so overloads here
      */
    /* augmented module */
    object mod {
      
      /*
        * Overload to add api middleware support to Redux's dispatch() function.
        * Useful for react-redux or any other library which could use this type.
        */
      @js.native
      trait Dispatch extends StObject {
        
        // `Promise<undefined> is returned in case of RSAA validation errors or user bails out
        def apply(action: RSAAAction[Any, Any, Any]): js.Promise[Unit] = js.native
      }
    }
  }
}
