package typings.reduxPromiseMiddleware

import typings.redux.mod.Action
import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import typings.reduxPromiseMiddleware.anon.Data
import typings.reduxPromiseMiddleware.mod.ActionType.Fulfilled
import typings.reduxPromiseMiddleware.mod.ActionType.Pending
import typings.reduxPromiseMiddleware.mod.ActionType.Rejected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-promise-middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("redux-promise-middleware", JSImport.Default)
  @js.native
  val default: Middleware[js.Object, js.Any, Dispatch[AnyAction]] = js.native
  
  @js.native
  sealed trait ActionType extends StObject
  @JSImport("redux-promise-middleware", "ActionType")
  @js.native
  object ActionType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ActionType & String] = js.native
    
    @js.native
    sealed trait Fulfilled
      extends StObject
         with ActionType
    /* "FULFILLED" */ val Fulfilled: typings.reduxPromiseMiddleware.mod.ActionType.Fulfilled & String = js.native
    
    @js.native
    sealed trait Pending
      extends StObject
         with ActionType
    /* "PENDING" */ val Pending: typings.reduxPromiseMiddleware.mod.ActionType.Pending & String = js.native
    
    @js.native
    sealed trait Rejected
      extends StObject
         with ActionType
    /* "REJECTED" */ val Rejected: typings.reduxPromiseMiddleware.mod.ActionType.Rejected & String = js.native
  }
  
  @scala.inline
  def createPromise(): Middleware[js.Object, js.Any, Dispatch[AnyAction]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPromise")().asInstanceOf[Middleware[js.Object, js.Any, Dispatch[AnyAction]]]
  @scala.inline
  def createPromise(config: Config): Middleware[js.Object, js.Any, Dispatch[AnyAction]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPromise")(config.asInstanceOf[js.Any]).asInstanceOf[Middleware[js.Object, js.Any, Dispatch[AnyAction]]]
  
  trait AsyncAction
    extends StObject
       with FluxStandardAction {
    
    @JSName("payload")
    var payload_AsyncAction: js.UndefOr[AsyncPayload] = js.undefined
  }
  object AsyncAction {
    
    @scala.inline
    def apply(`type`: js.Any): AsyncAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsyncAction]
    }
    
    @scala.inline
    implicit class AsyncActionMutableBuilder[Self <: AsyncAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayload(value: AsyncPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadFunction0(value: () => js.Promise[js.Any]): Self = StObject.set(x, "payload", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    }
  }
  
  // Action payload types
  type AsyncFunction = js.Function0[js.Promise[js.Any]]
  
  type AsyncPayload = js.Promise[js.Any] | AsyncFunction | Data
  
  trait Config extends StObject {
    
    var promiseTypeDelimiter: js.UndefOr[String] = js.undefined
    
    var promiseTypeSuffixes: js.UndefOr[js.Tuple3[PendingActionType, FulfilledActionType, RejectedActionType]] = js.undefined
  }
  object Config {
    
    @scala.inline
    def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPromiseTypeDelimiter(value: String): Self = StObject.set(x, "promiseTypeDelimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromiseTypeDelimiterUndefined: Self = StObject.set(x, "promiseTypeDelimiter", js.undefined)
      
      @scala.inline
      def setPromiseTypeSuffixes(value: js.Tuple3[PendingActionType, FulfilledActionType, RejectedActionType]): Self = StObject.set(x, "promiseTypeSuffixes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromiseTypeSuffixesUndefined: Self = StObject.set(x, "promiseTypeSuffixes", js.undefined)
    }
  }
  
  trait FluxStandardAction
    extends StObject
       with Action[js.Any] {
    
    var error: js.UndefOr[Boolean] = js.undefined
    
    var meta: js.UndefOr[js.Any] = js.undefined
    
    var payload: js.UndefOr[js.Any] = js.undefined
  }
  object FluxStandardAction {
    
    @scala.inline
    def apply(`type`: js.Any): FluxStandardAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FluxStandardAction]
    }
    
    @scala.inline
    implicit class FluxStandardActionMutableBuilder[Self <: FluxStandardAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setMeta(value: js.Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      @scala.inline
      def setPayload(value: js.Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    }
  }
  
  type FulfilledActionType = Fulfilled | String
  
  // Action type types
  type PendingActionType = Pending | String
  
  type RejectedActionType = Rejected | String
}
