package typings.reactQuery

import typings.reactQuery.reactQueryStrings.continue
import typings.reactQuery.reactQueryStrings.error
import typings.reactQuery.reactQueryStrings.failed
import typings.reactQuery.reactQueryStrings.loading
import typings.reactQuery.reactQueryStrings.pause
import typings.reactQuery.reactQueryStrings.setState
import typings.reactQuery.reactQueryStrings.success
import typings.reactQuery.typesCoreMutationCacheMod.MutationCache
import typings.reactQuery.typesCoreMutationObserverMod.MutationObserver
import typings.reactQuery.typesCoreTypesMod.MutationMeta
import typings.reactQuery.typesCoreTypesMod.MutationOptions
import typings.reactQuery.typesCoreTypesMod.MutationStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCoreMutationMod {
  
  @JSImport("react-query/types/core/mutation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-query/types/core/mutation", "Mutation")
  @js.native
  open class Mutation[TData, TError, TVariables, TContext] protected () extends StObject {
    def this(config: MutationConfig[TData, TError, TVariables, TContext]) = this()
    
    def addObserver(observer: MutationObserver[Any, Any, Any, Any]): Unit = js.native
    
    def cancel(): js.Promise[Unit] = js.native
    
    def continue(): js.Promise[TData] = js.native
    
    /* private */ var dispatch: Any = js.native
    
    def execute(): js.Promise[TData] = js.native
    
    /* private */ var executeMutation: Any = js.native
    
    var meta: js.UndefOr[MutationMeta] = js.native
    
    /* private */ var mutationCache: Any = js.native
    
    var mutationId: Double = js.native
    
    /* private */ var observers: Any = js.native
    
    var options: MutationOptions[TData, TError, TVariables, TContext] = js.native
    
    def removeObserver(observer: MutationObserver[Any, Any, Any, Any]): Unit = js.native
    
    /* private */ var retryer: Any = js.native
    
    def setState(state: MutationState[TData, TError, TVariables, TContext]): Unit = js.native
    
    var state: MutationState[TData, TError, TVariables, TContext] = js.native
  }
  
  inline def getDefaultState[TData, TError, TVariables, TContext](): MutationState[TData, TError, TVariables, TContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultState")().asInstanceOf[MutationState[TData, TError, TVariables, TContext]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactQuery.typesCoreMutationMod.ContinueAction
    - typings.reactQuery.typesCoreMutationMod.ErrorAction[TError]
    - typings.reactQuery.typesCoreMutationMod.FailedAction
    - typings.reactQuery.typesCoreMutationMod.LoadingAction[TVariables, TContext]
    - typings.reactQuery.typesCoreMutationMod.PauseAction
    - typings.reactQuery.typesCoreMutationMod.SetStateAction[TData, TError, TVariables, TContext]
    - typings.reactQuery.typesCoreMutationMod.SuccessAction[TData]
  */
  trait Action[TData, TError, TVariables, TContext] extends StObject
  object Action {
    
    inline def ContinueAction(): typings.reactQuery.typesCoreMutationMod.ContinueAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("continue")
      __obj.asInstanceOf[typings.reactQuery.typesCoreMutationMod.ContinueAction]
    }
    
    inline def ErrorAction[TError](error: TError): typings.reactQuery.typesCoreMutationMod.ErrorAction[TError] = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("error")
      __obj.asInstanceOf[typings.reactQuery.typesCoreMutationMod.ErrorAction[TError]]
    }
    
    inline def FailedAction(): typings.reactQuery.typesCoreMutationMod.FailedAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("failed")
      __obj.asInstanceOf[typings.reactQuery.typesCoreMutationMod.FailedAction]
    }
    
    inline def LoadingAction[TVariables, TContext](): typings.reactQuery.typesCoreMutationMod.LoadingAction[TVariables, TContext] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("loading")
      __obj.asInstanceOf[typings.reactQuery.typesCoreMutationMod.LoadingAction[TVariables, TContext]]
    }
    
    inline def PauseAction(): typings.reactQuery.typesCoreMutationMod.PauseAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("pause")
      __obj.asInstanceOf[typings.reactQuery.typesCoreMutationMod.PauseAction]
    }
    
    inline def SetStateAction[TData, TError, TVariables, TContext](state: MutationState[TData, TError, TVariables, TContext]): typings.reactQuery.typesCoreMutationMod.SetStateAction[TData, TError, TVariables, TContext] = {
      val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("setState")
      __obj.asInstanceOf[typings.reactQuery.typesCoreMutationMod.SetStateAction[TData, TError, TVariables, TContext]]
    }
    
    inline def SuccessAction[TData](data: TData): typings.reactQuery.typesCoreMutationMod.SuccessAction[TData] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("success")
      __obj.asInstanceOf[typings.reactQuery.typesCoreMutationMod.SuccessAction[TData]]
    }
  }
  
  trait ContinueAction
    extends StObject
       with Action[Any, Any, Any, Any] {
    
    var `type`: continue
  }
  object ContinueAction {
    
    inline def apply(): ContinueAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("continue")
      __obj.asInstanceOf[ContinueAction]
    }
    
    extension [Self <: ContinueAction](x: Self) {
      
      inline def setType(value: continue): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ErrorAction[TError]
    extends StObject
       with Action[Any, TError, Any, Any] {
    
    var error: TError
    
    var `type`: error
  }
  object ErrorAction {
    
    inline def apply[TError](error: TError): ErrorAction[TError] = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("error")
      __obj.asInstanceOf[ErrorAction[TError]]
    }
    
    extension [Self <: ErrorAction[?], TError](x: Self & ErrorAction[TError]) {
      
      inline def setError(value: TError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setType(value: error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait FailedAction
    extends StObject
       with Action[Any, Any, Any, Any] {
    
    var `type`: failed
  }
  object FailedAction {
    
    inline def apply(): FailedAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("failed")
      __obj.asInstanceOf[FailedAction]
    }
    
    extension [Self <: FailedAction](x: Self) {
      
      inline def setType(value: failed): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait LoadingAction[TVariables, TContext]
    extends StObject
       with Action[Any, Any, TVariables, TContext] {
    
    var context: js.UndefOr[TContext] = js.undefined
    
    var `type`: loading
    
    var variables: js.UndefOr[TVariables] = js.undefined
  }
  object LoadingAction {
    
    inline def apply[TVariables, TContext](): LoadingAction[TVariables, TContext] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("loading")
      __obj.asInstanceOf[LoadingAction[TVariables, TContext]]
    }
    
    extension [Self <: LoadingAction[?, ?], TVariables, TContext](x: Self & (LoadingAction[TVariables, TContext])) {
      
      inline def setContext(value: TContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setType(value: loading): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setVariables(value: TVariables): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      inline def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
    }
  }
  
  trait MutationConfig[TData, TError, TVariables, TContext] extends StObject {
    
    var defaultOptions: js.UndefOr[MutationOptions[TData, TError, TVariables, TContext]] = js.undefined
    
    var meta: js.UndefOr[MutationMeta] = js.undefined
    
    var mutationCache: MutationCache
    
    var mutationId: Double
    
    var options: MutationOptions[TData, TError, TVariables, TContext]
    
    var state: js.UndefOr[MutationState[TData, TError, TVariables, TContext]] = js.undefined
  }
  object MutationConfig {
    
    inline def apply[TData, TError, TVariables, TContext](
      mutationCache: MutationCache,
      mutationId: Double,
      options: MutationOptions[TData, TError, TVariables, TContext]
    ): MutationConfig[TData, TError, TVariables, TContext] = {
      val __obj = js.Dynamic.literal(mutationCache = mutationCache.asInstanceOf[js.Any], mutationId = mutationId.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[MutationConfig[TData, TError, TVariables, TContext]]
    }
    
    extension [Self <: MutationConfig[?, ?, ?, ?], TData, TError, TVariables, TContext](x: Self & (MutationConfig[TData, TError, TVariables, TContext])) {
      
      inline def setDefaultOptions(value: MutationOptions[TData, TError, TVariables, TContext]): Self = StObject.set(x, "defaultOptions", value.asInstanceOf[js.Any])
      
      inline def setDefaultOptionsUndefined: Self = StObject.set(x, "defaultOptions", js.undefined)
      
      inline def setMeta(value: MutationMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setMutationCache(value: MutationCache): Self = StObject.set(x, "mutationCache", value.asInstanceOf[js.Any])
      
      inline def setMutationId(value: Double): Self = StObject.set(x, "mutationId", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: MutationOptions[TData, TError, TVariables, TContext]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setState(value: MutationState[TData, TError, TVariables, TContext]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  trait MutationState[TData, TError, TVariables, TContext] extends StObject {
    
    var context: js.UndefOr[TContext] = js.undefined
    
    var data: js.UndefOr[TData] = js.undefined
    
    var error: TError | Null
    
    var failureCount: Double
    
    var isPaused: Boolean
    
    var status: MutationStatus
    
    var variables: js.UndefOr[TVariables] = js.undefined
  }
  object MutationState {
    
    inline def apply[TData, TError, TVariables, TContext](failureCount: Double, isPaused: Boolean, status: MutationStatus): MutationState[TData, TError, TVariables, TContext] = {
      val __obj = js.Dynamic.literal(failureCount = failureCount.asInstanceOf[js.Any], isPaused = isPaused.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], error = null)
      __obj.asInstanceOf[MutationState[TData, TError, TVariables, TContext]]
    }
    
    extension [Self <: MutationState[?, ?, ?, ?], TData, TError, TVariables, TContext](x: Self & (MutationState[TData, TError, TVariables, TContext])) {
      
      inline def setContext(value: TContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setData(value: TData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setError(value: TError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorNull: Self = StObject.set(x, "error", null)
      
      inline def setFailureCount(value: Double): Self = StObject.set(x, "failureCount", value.asInstanceOf[js.Any])
      
      inline def setIsPaused(value: Boolean): Self = StObject.set(x, "isPaused", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: MutationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setVariables(value: TVariables): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      inline def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
    }
  }
  
  trait PauseAction
    extends StObject
       with Action[Any, Any, Any, Any] {
    
    var `type`: pause
  }
  object PauseAction {
    
    inline def apply(): PauseAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("pause")
      __obj.asInstanceOf[PauseAction]
    }
    
    extension [Self <: PauseAction](x: Self) {
      
      inline def setType(value: pause): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait SetStateAction[TData, TError, TVariables, TContext]
    extends StObject
       with Action[TData, TError, TVariables, TContext] {
    
    var state: MutationState[TData, TError, TVariables, TContext]
    
    var `type`: setState
  }
  object SetStateAction {
    
    inline def apply[TData, TError, TVariables, TContext](state: MutationState[TData, TError, TVariables, TContext]): SetStateAction[TData, TError, TVariables, TContext] = {
      val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("setState")
      __obj.asInstanceOf[SetStateAction[TData, TError, TVariables, TContext]]
    }
    
    extension [Self <: SetStateAction[?, ?, ?, ?], TData, TError, TVariables, TContext](x: Self & (SetStateAction[TData, TError, TVariables, TContext])) {
      
      inline def setState(value: MutationState[TData, TError, TVariables, TContext]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setType(value: setState): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait SuccessAction[TData]
    extends StObject
       with Action[TData, Any, Any, Any] {
    
    var data: TData
    
    var `type`: success
  }
  object SuccessAction {
    
    inline def apply[TData](data: TData): SuccessAction[TData] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("success")
      __obj.asInstanceOf[SuccessAction[TData]]
    }
    
    extension [Self <: SuccessAction[?], TData](x: Self & SuccessAction[TData]) {
      
      inline def setData(value: TData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setType(value: success): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
