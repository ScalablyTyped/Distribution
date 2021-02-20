package typings.reduxPromiseMiddleware

import org.scalablytyped.runtime.Shortcut
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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("redux-promise-middleware", JSImport.Default)
  @js.native
  val default: Middleware[js.Object, js.Any, Dispatch[AnyAction]] = js.native
  
  @js.native
  sealed trait ActionType extends StObject
  @JSImport("redux-promise-middleware", "ActionType")
  @js.native
  object ActionType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ActionType with String] = js.native
    
    @js.native
    sealed trait Fulfilled extends ActionType
    /* "FULFILLED" */ val Fulfilled: typings.reduxPromiseMiddleware.mod.ActionType.Fulfilled with String = js.native
    
    @js.native
    sealed trait Pending extends ActionType
    /* "PENDING" */ val Pending: typings.reduxPromiseMiddleware.mod.ActionType.Pending with String = js.native
    
    @js.native
    sealed trait Rejected extends ActionType
    /* "REJECTED" */ val Rejected: typings.reduxPromiseMiddleware.mod.ActionType.Rejected with String = js.native
  }
  
  @JSImport("redux-promise-middleware", "createPromise")
  @js.native
  def createPromise(): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  @JSImport("redux-promise-middleware", "createPromise")
  @js.native
  def createPromise(config: Config): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  
  @js.native
  trait AsyncAction extends FluxStandardAction {
    
    @JSName("payload")
    var payload_AsyncAction: js.UndefOr[AsyncPayload] = js.native
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
  
  @js.native
  trait Config extends StObject {
    
    var promiseTypeDelimiter: js.UndefOr[String] = js.native
    
    var promiseTypeSuffixes: js.UndefOr[js.Tuple3[PendingActionType, FulfilledActionType, RejectedActionType]] = js.native
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
  
  @js.native
  trait FluxStandardAction
    extends Action[js.Any] {
    
    var error: js.UndefOr[Boolean] = js.native
    
    var meta: js.UndefOr[js.Any] = js.native
    
    var payload: js.UndefOr[js.Any] = js.native
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
  
  type _To = Middleware[js.Object, js.Any, Dispatch[AnyAction]]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: Middleware[js.Object, js.Any, Dispatch[AnyAction]] = default
}
