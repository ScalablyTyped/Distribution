package typings.reduxApiMiddleware

import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import typings.redux.mod.MiddlewareAPI
import typings.reduxApiMiddleware.anon.FnCall
import typings.reduxApiMiddleware.anon.MetaMeta
import typings.reduxApiMiddleware.anon.PayloadPayload
import typings.reduxApiMiddleware.reduxApiMiddlewareBooleans.`true`
import typings.reduxApiMiddleware.reduxApiMiddlewareStrings.DELETE
import typings.reduxApiMiddleware.reduxApiMiddlewareStrings.GET
import typings.reduxApiMiddleware.reduxApiMiddlewareStrings.HEAD
import typings.reduxApiMiddleware.reduxApiMiddlewareStrings.OPTIONS
import typings.reduxApiMiddleware.reduxApiMiddlewareStrings.PATCH
import typings.reduxApiMiddleware.reduxApiMiddlewareStrings.POST
import typings.reduxApiMiddleware.reduxApiMiddlewareStrings.PUT
import typings.reduxApiMiddleware.reduxApiMiddlewareStrings.`Invalid RSAA`
import typings.std.BodyInit
import typings.std.Error
import typings.std.HeadersInit
import typings.std.RequestCredentials
import typings.std.RequestInit
import typings.std.Response
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-api-middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("redux-api-middleware", "ApiError")
  @js.native
  class ApiError[T] protected ()
    extends StObject
       with Error {
    def this(status: Double, statusText: String, response: T) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    @JSName("name")
    var name_ApiError: typings.reduxApiMiddleware.reduxApiMiddlewareStrings.ApiError = js.native
    
    var response: T = js.native
    
    var status: Double = js.native
    
    var statusText: String = js.native
  }
  
  @JSImport("redux-api-middleware", "InternalError")
  @js.native
  class InternalError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    @JSName("name")
    var name_InternalError: typings.reduxApiMiddleware.reduxApiMiddlewareStrings.InternalError = js.native
  }
  
  @JSImport("redux-api-middleware", "InvalidRSAA")
  @js.native
  class InvalidRSAA protected ()
    extends StObject
       with Error {
    def this(validationErrors: js.Array[String]) = this()
    
    /* CompleteClass */
    var message: String = js.native
    @JSName("message")
    var message_InvalidRSAA: `Invalid RSAA` = js.native
    
    /* CompleteClass */
    var name: String = js.native
    @JSName("name")
    var name_InvalidRSAA: typings.reduxApiMiddleware.reduxApiMiddlewareStrings.InvalidRSAA = js.native
    
    var validationErrors: js.Array[String] = js.native
  }
  
  @JSImport("redux-api-middleware", "RSAA")
  @js.native
  val RSAA: /* "@@redux-api-middleware/RSAA" */ String = js.native
  
  @JSImport("redux-api-middleware", "RequestError")
  @js.native
  class RequestError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    @JSName("name")
    var name_RequestError: typings.reduxApiMiddleware.reduxApiMiddlewareStrings.RequestError = js.native
  }
  
  inline def apiMiddleware(api: MiddlewareAPI[Dispatch[AnyAction], js.Any]): ReturnType[Middleware[js.Object, js.Any, Dispatch[AnyAction]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apiMiddleware")(api.asInstanceOf[js.Any]).asInstanceOf[ReturnType[Middleware[js.Object, js.Any, Dispatch[AnyAction]]]]
  
  inline def createAction[State, Payload, Meta](clientCall: RSAACall[State, Payload, Meta]): RSAAAction[State, Payload, Meta] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(clientCall.asInstanceOf[js.Any]).asInstanceOf[RSAAAction[State, Payload, Meta]]
  
  inline def createMiddleware(): Middleware[js.Object, js.Any, Dispatch[AnyAction]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMiddleware")().asInstanceOf[Middleware[js.Object, js.Any, Dispatch[AnyAction]]]
  inline def createMiddleware(options: CreateMiddlewareOptions): Middleware[js.Object, js.Any, Dispatch[AnyAction]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMiddleware")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware[js.Object, js.Any, Dispatch[AnyAction]]]
  
  inline def getJSON(res: Response): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJSON")(res.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  
  inline def isRSAA(action: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRSAA")(action.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidRSAA(action: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidRSAA")(action.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def validateRSAA(action: js.Object): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("validateRSAA")(action.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  trait CreateMiddlewareOptions extends StObject {
    
    var fetch: js.UndefOr[FnCall] = js.undefined
    
    var ok: js.UndefOr[js.Function1[/* res */ Response, Boolean]] = js.undefined
  }
  object CreateMiddlewareOptions {
    
    inline def apply(): CreateMiddlewareOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateMiddlewareOptions]
    }
    
    extension [Self <: CreateMiddlewareOptions](x: Self) {
      
      inline def setFetch(value: FnCall): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
      
      inline def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
      
      inline def setOk(value: /* res */ Response => Boolean): Self = StObject.set(x, "ok", js.Any.fromFunction1(value))
      
      inline def setOkUndefined: Self = StObject.set(x, "ok", js.undefined)
    }
  }
  
  trait InvalidAction[Payload] extends StObject {
    
    var error: `true`
    
    var payload: Payload
    
    var `type`: String | js.Symbol
  }
  object InvalidAction {
    
    inline def apply[Payload](payload: Payload, `type`: String | js.Symbol): InvalidAction[Payload] = {
      val __obj = js.Dynamic.literal(error = true, payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[InvalidAction[Payload]]
    }
    
    extension [Self <: InvalidAction[?], Payload](x: Self & InvalidAction[Payload]) {
      
      inline def setError(value: `true`): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setType(value: String | js.Symbol): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RSAAAction[State, Payload, Meta] extends StObject
  
  type RSAAActions = (RSAARequestAction[scala.Nothing, scala.Nothing]) | (RSAAResultAction[scala.Nothing, scala.Nothing])
  
  trait RSAACall[State, Payload, Meta] extends StObject {
    
    var bailout: js.UndefOr[TypeOrResolver[State, Boolean]] = js.undefined
    
    var body: js.UndefOr[TypeOrResolver[State, BodyInit | Null]] = js.undefined
    
    var credentials: js.UndefOr[RequestCredentials] = js.undefined
    
    var endpoint: TypeOrResolver[State, String]
    
    var fetch: js.UndefOr[FnCall] = js.undefined
    
    var headers: js.UndefOr[TypeOrResolver[State, HeadersInit]] = js.undefined
    
    // `redux-api-middleware` strictly allows only this methods
    var method: GET | HEAD | POST | PUT | PATCH | DELETE | OPTIONS
    
    var ok: js.UndefOr[js.Function1[/* res */ Response, Boolean]] = js.undefined
    
    var options: js.UndefOr[TypeOrResolver[State, RequestInit]] = js.undefined
    
    var types: js.Tuple3[
        RSAARequestType[State, Payload, Meta], 
        RSAASuccessType[State, Payload, Meta], 
        RSAAFailureType[State, Payload, Meta]
      ]
  }
  object RSAACall {
    
    inline def apply[State, Payload, Meta](
      endpoint: TypeOrResolver[State, String],
      method: GET | HEAD | POST | PUT | PATCH | DELETE | OPTIONS,
      types: js.Tuple3[
          RSAARequestType[State, Payload, Meta], 
          RSAASuccessType[State, Payload, Meta], 
          RSAAFailureType[State, Payload, Meta]
        ]
    ): RSAACall[State, Payload, Meta] = {
      val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[RSAACall[State, Payload, Meta]]
    }
    
    extension [Self <: RSAACall[?, ?, ?], State, Payload, Meta](x: Self & (RSAACall[State, Payload, Meta])) {
      
      inline def setBailout(value: TypeOrResolver[State, Boolean]): Self = StObject.set(x, "bailout", value.asInstanceOf[js.Any])
      
      inline def setBailoutFunction1(value: State => Boolean | js.Promise[Boolean]): Self = StObject.set(x, "bailout", js.Any.fromFunction1(value))
      
      inline def setBailoutUndefined: Self = StObject.set(x, "bailout", js.undefined)
      
      inline def setBody(value: TypeOrResolver[State, BodyInit | Null]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyFunction1(value: State => (BodyInit | Null) | (js.Promise[BodyInit | Null])): Self = StObject.set(x, "body", js.Any.fromFunction1(value))
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCredentials(value: RequestCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setEndpoint(value: TypeOrResolver[State, String]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setEndpointFunction1(value: State => String | js.Promise[String]): Self = StObject.set(x, "endpoint", js.Any.fromFunction1(value))
      
      inline def setFetch(value: FnCall): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
      
      inline def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
      
      inline def setHeaders(value: TypeOrResolver[State, HeadersInit]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersFunction1(value: State => HeadersInit | js.Promise[HeadersInit]): Self = StObject.set(x, "headers", js.Any.fromFunction1(value))
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: js.Array[String]*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      inline def setMethod(value: GET | HEAD | POST | PUT | PATCH | DELETE | OPTIONS): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setOk(value: /* res */ Response => Boolean): Self = StObject.set(x, "ok", js.Any.fromFunction1(value))
      
      inline def setOkUndefined: Self = StObject.set(x, "ok", js.undefined)
      
      inline def setOptions(value: TypeOrResolver[State, RequestInit]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsFunction1(value: State => RequestInit | js.Promise[RequestInit]): Self = StObject.set(x, "options", js.Any.fromFunction1(value))
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setTypes(
        value: js.Tuple3[
              RSAARequestType[State, Payload, Meta], 
              RSAASuccessType[State, Payload, Meta], 
              RSAAFailureType[State, Payload, Meta]
            ]
      ): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    }
  }
  
  type RSAAFailureAction[Payload, Meta] = RSAAResultAction[Payload, Meta]
  
  type RSAAFailureType[State, Payload, Meta] = String | js.Symbol | (RSAAFailureTypeDescriptor[State, Payload, Meta])
  
  trait RSAAFailureTypeDescriptor[State, Payload, Meta] extends StObject {
    
    var meta: js.UndefOr[
        (js.Function3[
          /* action */ RSAAAction[js.Any, js.Any, js.Any], 
          /* state */ State, 
          /* res */ Response, 
          Meta | js.Promise[Meta]
        ]) | Meta
      ] = js.undefined
    
    var payload: js.UndefOr[
        (js.Function3[
          /* action */ RSAAAction[js.Any, js.Any, js.Any], 
          /* state */ State, 
          /* res */ Response, 
          Payload | js.Promise[Payload]
        ]) | Payload
      ] = js.undefined
    
    var `type`: String | js.Symbol
  }
  object RSAAFailureTypeDescriptor {
    
    inline def apply[State, Payload, Meta](`type`: String | js.Symbol): RSAAFailureTypeDescriptor[State, Payload, Meta] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RSAAFailureTypeDescriptor[State, Payload, Meta]]
    }
    
    extension [Self <: RSAAFailureTypeDescriptor[?, ?, ?], State, Payload, Meta](x: Self & (RSAAFailureTypeDescriptor[State, Payload, Meta])) {
      
      inline def setMeta(
        value: (js.Function3[
              /* action */ RSAAAction[js.Any, js.Any, js.Any], 
              /* state */ State, 
              /* res */ Response, 
              Meta | js.Promise[Meta]
            ]) | Meta
      ): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaFunction3(
        value: (/* action */ RSAAAction[js.Any, js.Any, js.Any], /* state */ State, /* res */ Response) => Meta | js.Promise[Meta]
      ): Self = StObject.set(x, "meta", js.Any.fromFunction3(value))
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setPayload(
        value: (js.Function3[
              /* action */ RSAAAction[js.Any, js.Any, js.Any], 
              /* state */ State, 
              /* res */ Response, 
              Payload | js.Promise[Payload]
            ]) | Payload
      ): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadFunction3(
        value: (/* action */ RSAAAction[js.Any, js.Any, js.Any], /* state */ State, /* res */ Response) => Payload | js.Promise[Payload]
      ): Self = StObject.set(x, "payload", js.Any.fromFunction3(value))
      
      inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      inline def setType(value: String | js.Symbol): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type RSAARequestAction[Payload, Meta] = (ValidAction[Payload, Meta]) | InvalidAction[InvalidRSAA]
  
  type RSAARequestType[State, Payload, Meta] = String | js.Symbol | (RSAARequestTypeDescriptor[State, Payload, Meta])
  
  trait RSAARequestTypeDescriptor[State, Payload, Meta] extends StObject {
    
    var meta: js.UndefOr[
        (js.Function2[
          /* action */ RSAAAction[js.Any, js.Any, js.Any], 
          /* state */ State, 
          Meta | js.Promise[Meta]
        ]) | Meta
      ] = js.undefined
    
    var payload: js.UndefOr[
        (js.Function2[
          /* action */ RSAAAction[js.Any, js.Any, js.Any], 
          /* state */ State, 
          Payload | js.Promise[Payload]
        ]) | Payload
      ] = js.undefined
    
    var `type`: String | js.Symbol
  }
  object RSAARequestTypeDescriptor {
    
    inline def apply[State, Payload, Meta](`type`: String | js.Symbol): RSAARequestTypeDescriptor[State, Payload, Meta] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RSAARequestTypeDescriptor[State, Payload, Meta]]
    }
    
    extension [Self <: RSAARequestTypeDescriptor[?, ?, ?], State, Payload, Meta](x: Self & (RSAARequestTypeDescriptor[State, Payload, Meta])) {
      
      inline def setMeta(
        value: (js.Function2[
              /* action */ RSAAAction[js.Any, js.Any, js.Any], 
              /* state */ State, 
              Meta | js.Promise[Meta]
            ]) | Meta
      ): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaFunction2(
        value: (/* action */ RSAAAction[js.Any, js.Any, js.Any], /* state */ State) => Meta | js.Promise[Meta]
      ): Self = StObject.set(x, "meta", js.Any.fromFunction2(value))
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setPayload(
        value: (js.Function2[
              /* action */ RSAAAction[js.Any, js.Any, js.Any], 
              /* state */ State, 
              Payload | js.Promise[Payload]
            ]) | Payload
      ): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadFunction2(
        value: (/* action */ RSAAAction[js.Any, js.Any, js.Any], /* state */ State) => Payload | js.Promise[Payload]
      ): Self = StObject.set(x, "payload", js.Any.fromFunction2(value))
      
      inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      inline def setType(value: String | js.Symbol): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type RSAAResultAction[Payload, Meta] = (ValidAction[Payload, Meta]) | (InvalidAction[InternalError | RequestError | ApiError[Payload]])
  
  type RSAASuccessAction[Payload, Meta] = RSAAResultAction[Payload, Meta]
  
  type RSAASuccessType[State, Payload, Meta] = String | js.Symbol | (RSAASuccessTypeDescriptor[State, Payload, Meta])
  
  trait RSAASuccessTypeDescriptor[State, Payload, Meta] extends StObject {
    
    var meta: js.UndefOr[
        (js.Function3[
          /* action */ RSAAAction[js.Any, js.Any, js.Any], 
          /* state */ State, 
          /* res */ Response, 
          Meta | js.Promise[Meta]
        ]) | Meta
      ] = js.undefined
    
    var payload: js.UndefOr[
        (js.Function3[
          /* action */ RSAAAction[js.Any, js.Any, js.Any], 
          /* state */ State, 
          /* res */ Response, 
          Payload | js.Promise[Payload]
        ]) | Payload
      ] = js.undefined
    
    var `type`: String | js.Symbol
  }
  object RSAASuccessTypeDescriptor {
    
    inline def apply[State, Payload, Meta](`type`: String | js.Symbol): RSAASuccessTypeDescriptor[State, Payload, Meta] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RSAASuccessTypeDescriptor[State, Payload, Meta]]
    }
    
    extension [Self <: RSAASuccessTypeDescriptor[?, ?, ?], State, Payload, Meta](x: Self & (RSAASuccessTypeDescriptor[State, Payload, Meta])) {
      
      inline def setMeta(
        value: (js.Function3[
              /* action */ RSAAAction[js.Any, js.Any, js.Any], 
              /* state */ State, 
              /* res */ Response, 
              Meta | js.Promise[Meta]
            ]) | Meta
      ): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaFunction3(
        value: (/* action */ RSAAAction[js.Any, js.Any, js.Any], /* state */ State, /* res */ Response) => Meta | js.Promise[Meta]
      ): Self = StObject.set(x, "meta", js.Any.fromFunction3(value))
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setPayload(
        value: (js.Function3[
              /* action */ RSAAAction[js.Any, js.Any, js.Any], 
              /* state */ State, 
              /* res */ Response, 
              Payload | js.Promise[Payload]
            ]) | Payload
      ): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadFunction3(
        value: (/* action */ RSAAAction[js.Any, js.Any, js.Any], /* state */ State, /* res */ Response) => Payload | js.Promise[Payload]
      ): Self = StObject.set(x, "payload", js.Any.fromFunction3(value))
      
      inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      inline def setType(value: String | js.Symbol): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type TypeOrResolver[Arg, Type] = Type | (js.Function1[/* arg */ Arg, Type | js.Promise[Type]])
  
  type ValidAction[Payload, Meta] = typings.reduxApiMiddleware.anon.Error & (PayloadPayload[Payload] | js.Object) & (MetaMeta[Meta] | js.Object)
  
  /**
    * Redux behaviour changed by middleware, so overloads here
    */
  /* augmented module */
  object reduxAugmentingMod {
    
    /*
      * Overload to add api middleware support to Redux's dispatch() function.
      * Useful for react-redux or any other library which could use this type.
      */
    @js.native
    trait Dispatch extends StObject {
      
      // `Promise<undefined> is returned in case of RSAA validation errors or user bails out
      def apply(action: RSAAAction[js.Any, js.Any, js.Any]): js.Promise[Unit] = js.native
    }
  }
}
