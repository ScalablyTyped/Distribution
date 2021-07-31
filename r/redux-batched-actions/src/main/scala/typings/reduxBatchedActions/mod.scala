package typings.reduxBatchedActions

import typings.redux.mod.Action
import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import typings.redux.mod.Reducer
import typings.reduxBatchedActions.anon.Batch
import typings.reduxBatchedActions.reduxBatchedActionsStrings.BATCHING_REDUCERDotBATCH
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-batched-actions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("redux-batched-actions", "BATCH")
  @js.native
  val BATCH: BatchActionType = js.native
  
  @scala.inline
  def batchActions(actions: js.Array[AnyAction]): BatchAction = ^.asInstanceOf[js.Dynamic].applyDynamic("batchActions")(actions.asInstanceOf[js.Any]).asInstanceOf[BatchAction]
  @scala.inline
  def batchActions(actions: js.Array[AnyAction], `type`: String): BatchAction = (^.asInstanceOf[js.Dynamic].applyDynamic("batchActions")(actions.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[BatchAction]
  
  @JSImport("redux-batched-actions", "batchDispatchMiddleware")
  @js.native
  val batchDispatchMiddleware: Middleware[js.Object, js.Any, Dispatch[AnyAction]] = js.native
  
  @scala.inline
  def enableBatching[S](reduce: Reducer[S, AnyAction]): Reducer[S, AnyAction] = ^.asInstanceOf[js.Dynamic].applyDynamic("enableBatching")(reduce.asInstanceOf[js.Any]).asInstanceOf[Reducer[S, AnyAction]]
  
  trait BatchAction extends StObject {
    
    var meta: Batch
    
    var payload: js.Array[Action[js.Any]]
    
    var `type`: BatchActionType
  }
  object BatchAction {
    
    @scala.inline
    def apply(meta: Batch, payload: js.Array[Action[js.Any]], `type`: BatchActionType): BatchAction = {
      val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BatchAction]
    }
    
    @scala.inline
    implicit class BatchActionMutableBuilder[Self <: BatchAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMeta(value: Batch): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayload(value: js.Array[Action[js.Any]]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadVarargs(value: Action[js.Any]*): Self = StObject.set(x, "payload", js.Array(value :_*))
      
      @scala.inline
      def setType(value: BatchActionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type BatchActionType = BATCHING_REDUCERDotBATCH
}
