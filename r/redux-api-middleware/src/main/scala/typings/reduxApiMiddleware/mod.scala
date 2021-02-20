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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-api-middleware", "ApiError")
  @js.native
  class ApiError[T] protected () extends Error {
    def this(status: Double, statusText: String, response: T) = this()
    
    @JSName("name")
    var name_ApiError: typings.reduxApiMiddleware.reduxApiMiddlewareStrings.ApiError = js.native
    
    var response: T = js.native
    
    var status: Double = js.native
    
    var statusText: String = js.native
  }
  
  @JSImport("redux-api-middleware", "InternalError")
  @js.native
  class InternalError protected () extends Error {
    def this(message: String) = this()
    
    @JSName("name")
    var name_InternalError: typings.reduxApiMiddleware.reduxApiMiddlewareStrings.InternalError = js.native
  }
  
  @JSImport("redux-api-middleware", "InvalidRSAA")
  @js.native
  class InvalidRSAA protected () extends Error {
    def this(validationErrors: js.Array[String]) = this()
    
    @JSName("message")
    var message_InvalidRSAA: `Invalid RSAA` = js.native
    
    @JSName("name")
    var name_InvalidRSAA: typings.reduxApiMiddleware.reduxApiMiddlewareStrings.InvalidRSAA = js.native
    
    var validationErrors: js.Array[String] = js.native
  }
  
  @JSImport("redux-api-middleware", "RSAA")
  @js.native
  val RSAA: /* "@@redux-api-middleware/RSAA" */ String = js.native
  
  @JSImport("redux-api-middleware", "RequestError")
  @js.native
  class RequestError protected () extends Error {
    def this(message: String) = this()
    
    @JSName("name")
    var name_RequestError: typings.reduxApiMiddleware.reduxApiMiddlewareStrings.RequestError = js.native
  }
  
  @JSImport("redux-api-middleware", "apiMiddleware")
  @js.native
  def apiMiddleware(api: MiddlewareAPI[Dispatch[AnyAction], _]): ReturnType[Middleware[js.Object, _, Dispatch[AnyAction]]] = js.native
  
  @JSImport("redux-api-middleware", "createAction")
  @js.native
  def createAction[State, Payload, Meta](clientCall: RSAACall[State, Payload, Meta]): RSAAAction[State, Payload, Meta] = js.native
  
  @JSImport("redux-api-middleware", "createMiddleware")
  @js.native
  def createMiddleware(): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  @JSImport("redux-api-middleware", "createMiddleware")
  @js.native
  def createMiddleware(options: CreateMiddlewareOptions): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  
  @JSImport("redux-api-middleware", "getJSON")
  @js.native
  def getJSON(res: Response): js.Promise[_] = js.native
  
  @JSImport("redux-api-middleware", "isRSAA")
  @js.native
  def isRSAA(action: js.Object): Boolean = js.native
  
  @JSImport("redux-api-middleware", "isValidRSAA")
  @js.native
  def isValidRSAA(action: js.Object): Boolean = js.native
  
  @JSImport("redux-api-middleware", "validateRSAA")
  @js.native
  def validateRSAA(action: js.Object): js.Array[String] = js.native
  
  @js.native
  trait CreateMiddlewareOptions extends StObject {
    
    var fetch: js.UndefOr[FnCall] = js.native
    
    var ok: js.UndefOr[js.Function1[/* res */ Response, Boolean]] = js.native
  }
  object CreateMiddlewareOptions {
    
    @scala.inline
    def apply(): CreateMiddlewareOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateMiddlewareOptions]
    }
    
    @scala.inline
    implicit class CreateMiddlewareOptionsMutableBuilder[Self <: CreateMiddlewareOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFetch(value: FnCall): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
      
      @scala.inline
      def setOk(value: /* res */ Response => Boolean): Self = StObject.set(x, "ok", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOkUndefined: Self = StObject.set(x, "ok", js.undefined)
    }
  }
  
  @js.native
  trait InvalidAction[Payload] extends StObject {
    
    var error: `true` = js.native
    
    var payload: Payload = js.native
    
    var `type`: String | js.Symbol = js.native
  }
  object InvalidAction {
    
    @scala.inline
    def apply[Payload](error: `true`, payload: Payload, `type`: String | js.Symbol): InvalidAction[Payload] = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[InvalidAction[Payload]]
    }
    
    @scala.inline
    implicit class InvalidActionMutableBuilder[Self <: InvalidAction[_], Payload] (val x: Self with InvalidAction[Payload]) extends AnyVal {
      
      @scala.inline
      def setError(value: `true`): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String | js.Symbol): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RSAAAction[State, Payload, Meta] extends StObject
  
  type RSAAActions = (RSAARequestAction[scala.Nothing, scala.Nothing]) | (RSAAResultAction[scala.Nothing, scala.Nothing])
  
  @js.native
  trait RSAACall[State, Payload, Meta] extends StObject {
    
    var bailout: js.UndefOr[TypeOrResolver[State, Boolean]] = js.native
    
    var body: js.UndefOr[TypeOrResolver[State, BodyInit | Null]] = js.native
    
    var credentials: js.UndefOr[RequestCredentials] = js.native
    
    var endpoint: TypeOrResolver[State, String] = js.native
    
    var fetch: js.UndefOr[FnCall] = js.native
    
    var headers: js.UndefOr[TypeOrResolver[State, HeadersInit]] = js.native
    
    // `redux-api-middleware` strictly allows only this methods
    var method: GET | HEAD | POST | PUT | PATCH | DELETE | OPTIONS = js.native
    
    var ok: js.UndefOr[js.Function1[/* res */ Response, Boolean]] = js.native
    
    var options: js.UndefOr[TypeOrResolver[State, RequestInit]] = js.native
    
    var types: js.Tuple3[
        RSAARequestType[State, Payload, Meta], 
        RSAASuccessType[State, Payload, Meta], 
        RSAAFailureType[State, Payload, Meta]
      ] = js.native
  }
  object RSAACall {
    
    @scala.inline
    def apply[State, Payload, Meta](
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
    
    @scala.inline
    implicit class RSAACallMutableBuilder[Self <: RSAACall[_, _, _], State, Payload, Meta] (val x: Self with (RSAACall[State, Payload, Meta])) extends AnyVal {
      
      @scala.inline
      def setBailout(value: TypeOrResolver[State, Boolean]): Self = StObject.set(x, "bailout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBailoutFunction1(value: State => Boolean | js.Promise[Boolean]): Self = StObject.set(x, "bailout", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBailoutUndefined: Self = StObject.set(x, "bailout", js.undefined)
      
      @scala.inline
      def setBody(value: TypeOrResolver[State, BodyInit | Null]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyFunction1(value: State => (BodyInit | Null) | (js.Promise[BodyInit | Null])): Self = StObject.set(x, "body", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBodyNull: Self = StObject.set(x, "body", null)
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setCredentials(value: RequestCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      @scala.inline
      def setEndpoint(value: TypeOrResolver[State, String]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointFunction1(value: State => String | js.Promise[String]): Self = StObject.set(x, "endpoint", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFetch(value: FnCall): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
      
      @scala.inline
      def setHeaders(value: TypeOrResolver[State, HeadersInit]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersFunction1(value: State => HeadersInit | js.Promise[HeadersInit]): Self = StObject.set(x, "headers", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHeadersVarargs(value: js.Array[String]*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      @scala.inline
      def setMethod(value: GET | HEAD | POST | PUT | PATCH | DELETE | OPTIONS): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOk(value: /* res */ Response => Boolean): Self = StObject.set(x, "ok", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOkUndefined: Self = StObject.set(x, "ok", js.undefined)
      
      @scala.inline
      def setOptions(value: TypeOrResolver[State, RequestInit]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsFunction1(value: State => RequestInit | js.Promise[RequestInit]): Self = StObject.set(x, "options", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setTypes(
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
  
  @js.native
  trait RSAAFailureTypeDescriptor[State, Payload, Meta] extends StObject {
    
    var meta: js.UndefOr[
        (js.Function3[
          /* action */ RSAAAction[_, _, _], 
          /* state */ State, 
          /* res */ Response, 
          Meta | js.Promise[Meta]
        ]) | Meta
      ] = js.native
    
    var payload: js.UndefOr[
        (js.Function3[
          /* action */ RSAAAction[_, _, _], 
          /* state */ State, 
          /* res */ Response, 
          Payload | js.Promise[Payload]
        ]) | Payload
      ] = js.native
    
    var `type`: String | js.Symbol = js.native
  }
  object RSAAFailureTypeDescriptor {
    
    @scala.inline
    def apply[State, Payload, Meta](`type`: String | js.Symbol): RSAAFailureTypeDescriptor[State, Payload, Meta] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RSAAFailureTypeDescriptor[State, Payload, Meta]]
    }
    
    @scala.inline
    implicit class RSAAFailureTypeDescriptorMutableBuilder[Self <: RSAAFailureTypeDescriptor[_, _, _], State, Payload, Meta] (val x: Self with (RSAAFailureTypeDescriptor[State, Payload, Meta])) extends AnyVal {
      
      @scala.inline
      def setMeta(
        value: (js.Function3[
              /* action */ RSAAAction[_, _, _], 
              /* state */ State, 
              /* res */ Response, 
              Meta | js.Promise[Meta]
            ]) | Meta
      ): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaFunction3(
        value: (/* action */ RSAAAction[_, _, _], /* state */ State, /* res */ Response) => Meta | js.Promise[Meta]
      ): Self = StObject.set(x, "meta", js.Any.fromFunction3(value))
      
      @scala.inline
      def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      @scala.inline
      def setPayload(
        value: (js.Function3[
              /* action */ RSAAAction[_, _, _], 
              /* state */ State, 
              /* res */ Response, 
              Payload | js.Promise[Payload]
            ]) | Payload
      ): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadFunction3(
        value: (/* action */ RSAAAction[_, _, _], /* state */ State, /* res */ Response) => Payload | js.Promise[Payload]
      ): Self = StObject.set(x, "payload", js.Any.fromFunction3(value))
      
      @scala.inline
      def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      @scala.inline
      def setType(value: String | js.Symbol): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type RSAARequestAction[Payload, Meta] = (ValidAction[Payload, Meta]) | InvalidAction[InvalidRSAA]
  
  type RSAARequestType[State, Payload, Meta] = String | js.Symbol | (RSAARequestTypeDescriptor[State, Payload, Meta])
  
  @js.native
  trait RSAARequestTypeDescriptor[State, Payload, Meta] extends StObject {
    
    var meta: js.UndefOr[
        (js.Function2[/* action */ RSAAAction[_, _, _], /* state */ State, Meta | js.Promise[Meta]]) | Meta
      ] = js.native
    
    var payload: js.UndefOr[
        (js.Function2[/* action */ RSAAAction[_, _, _], /* state */ State, Payload | js.Promise[Payload]]) | Payload
      ] = js.native
    
    var `type`: String | js.Symbol = js.native
  }
  object RSAARequestTypeDescriptor {
    
    @scala.inline
    def apply[State, Payload, Meta](`type`: String | js.Symbol): RSAARequestTypeDescriptor[State, Payload, Meta] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RSAARequestTypeDescriptor[State, Payload, Meta]]
    }
    
    @scala.inline
    implicit class RSAARequestTypeDescriptorMutableBuilder[Self <: RSAARequestTypeDescriptor[_, _, _], State, Payload, Meta] (val x: Self with (RSAARequestTypeDescriptor[State, Payload, Meta])) extends AnyVal {
      
      @scala.inline
      def setMeta(
        value: (js.Function2[/* action */ RSAAAction[_, _, _], /* state */ State, Meta | js.Promise[Meta]]) | Meta
      ): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaFunction2(value: (/* action */ RSAAAction[_, _, _], /* state */ State) => Meta | js.Promise[Meta]): Self = StObject.set(x, "meta", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      @scala.inline
      def setPayload(
        value: (js.Function2[/* action */ RSAAAction[_, _, _], /* state */ State, Payload | js.Promise[Payload]]) | Payload
      ): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadFunction2(value: (/* action */ RSAAAction[_, _, _], /* state */ State) => Payload | js.Promise[Payload]): Self = StObject.set(x, "payload", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      @scala.inline
      def setType(value: String | js.Symbol): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type RSAAResultAction[Payload, Meta] = (ValidAction[Payload, Meta]) | (InvalidAction[InternalError | RequestError | ApiError[Payload]])
  
  type RSAASuccessAction[Payload, Meta] = RSAAResultAction[Payload, Meta]
  
  type RSAASuccessType[State, Payload, Meta] = String | js.Symbol | (RSAASuccessTypeDescriptor[State, Payload, Meta])
  
  @js.native
  trait RSAASuccessTypeDescriptor[State, Payload, Meta] extends StObject {
    
    var meta: js.UndefOr[
        (js.Function3[
          /* action */ RSAAAction[_, _, _], 
          /* state */ State, 
          /* res */ Response, 
          Meta | js.Promise[Meta]
        ]) | Meta
      ] = js.native
    
    var payload: js.UndefOr[
        (js.Function3[
          /* action */ RSAAAction[_, _, _], 
          /* state */ State, 
          /* res */ Response, 
          Payload | js.Promise[Payload]
        ]) | Payload
      ] = js.native
    
    var `type`: String | js.Symbol = js.native
  }
  object RSAASuccessTypeDescriptor {
    
    @scala.inline
    def apply[State, Payload, Meta](`type`: String | js.Symbol): RSAASuccessTypeDescriptor[State, Payload, Meta] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RSAASuccessTypeDescriptor[State, Payload, Meta]]
    }
    
    @scala.inline
    implicit class RSAASuccessTypeDescriptorMutableBuilder[Self <: RSAASuccessTypeDescriptor[_, _, _], State, Payload, Meta] (val x: Self with (RSAASuccessTypeDescriptor[State, Payload, Meta])) extends AnyVal {
      
      @scala.inline
      def setMeta(
        value: (js.Function3[
              /* action */ RSAAAction[_, _, _], 
              /* state */ State, 
              /* res */ Response, 
              Meta | js.Promise[Meta]
            ]) | Meta
      ): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaFunction3(
        value: (/* action */ RSAAAction[_, _, _], /* state */ State, /* res */ Response) => Meta | js.Promise[Meta]
      ): Self = StObject.set(x, "meta", js.Any.fromFunction3(value))
      
      @scala.inline
      def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      @scala.inline
      def setPayload(
        value: (js.Function3[
              /* action */ RSAAAction[_, _, _], 
              /* state */ State, 
              /* res */ Response, 
              Payload | js.Promise[Payload]
            ]) | Payload
      ): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadFunction3(
        value: (/* action */ RSAAAction[_, _, _], /* state */ State, /* res */ Response) => Payload | js.Promise[Payload]
      ): Self = StObject.set(x, "payload", js.Any.fromFunction3(value))
      
      @scala.inline
      def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      @scala.inline
      def setType(value: String | js.Symbol): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type TypeOrResolver[Arg, Type] = Type | (js.Function1[/* arg */ Arg, Type | js.Promise[Type]])
  
  type ValidAction[Payload, Meta] = typings.reduxApiMiddleware.anon.Error with (PayloadPayload[Payload] | js.Object) with (MetaMeta[Meta] | js.Object)
  
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
      def apply(action: RSAAAction[_, _, _]): js.Promise[js.UndefOr[scala.Nothing]] = js.native
    }
  }
}
