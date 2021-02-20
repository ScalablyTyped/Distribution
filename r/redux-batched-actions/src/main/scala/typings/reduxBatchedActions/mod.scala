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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-batched-actions", "BATCH")
  @js.native
  val BATCH: BatchActionType = js.native
  
  @JSImport("redux-batched-actions", "batchActions")
  @js.native
  def batchActions(actions: js.Array[AnyAction]): BatchAction = js.native
  @JSImport("redux-batched-actions", "batchActions")
  @js.native
  def batchActions(actions: js.Array[AnyAction], `type`: String): BatchAction = js.native
  
  @JSImport("redux-batched-actions", "batchDispatchMiddleware")
  @js.native
  val batchDispatchMiddleware: Middleware[js.Object, js.Any, Dispatch[AnyAction]] = js.native
  
  @JSImport("redux-batched-actions", "enableBatching")
  @js.native
  def enableBatching[S](reduce: Reducer[S, AnyAction]): Reducer[S, AnyAction] = js.native
  
  @js.native
  trait BatchAction extends StObject {
    
    var meta: Batch = js.native
    
    var payload: js.Array[Action[_]] = js.native
    
    var `type`: BatchActionType = js.native
  }
  object BatchAction {
    
    @scala.inline
    def apply(meta: Batch, payload: js.Array[Action[_]], `type`: BatchActionType): BatchAction = {
      val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BatchAction]
    }
    
    @scala.inline
    implicit class BatchActionMutableBuilder[Self <: BatchAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMeta(value: Batch): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayload(value: js.Array[Action[_]]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadVarargs(value: Action[js.Any]*): Self = StObject.set(x, "payload", js.Array(value :_*))
      
      @scala.inline
      def setType(value: BatchActionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type BatchActionType = BATCHING_REDUCERDotBATCH
}
