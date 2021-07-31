package typings.reduxSagaRoutines

import typings.reduxActions.mod.Action
import typings.reduxActions.mod.ActionMeta
import typings.reduxSagaRoutines.mod.ActionCreatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait FAILURE_[TTriggerPayloadCreator, TRequestPayloadCreator, TSuccessPayloadCreator, TFailurePayloadCreator, TFulfillPayloadCreator] extends StObject {
    
    var FAILURE: js.UndefOr[TFailurePayloadCreator] = js.undefined
    
    var FULFILL: js.UndefOr[TFulfillPayloadCreator] = js.undefined
    
    var REQUEST: js.UndefOr[TRequestPayloadCreator] = js.undefined
    
    var SUCCESS: js.UndefOr[TSuccessPayloadCreator] = js.undefined
    
    var TRIGGER: js.UndefOr[TTriggerPayloadCreator] = js.undefined
    
    var failure: js.UndefOr[TFailurePayloadCreator] = js.undefined
    
    var fulfill: js.UndefOr[TFulfillPayloadCreator] = js.undefined
    
    var request: js.UndefOr[TRequestPayloadCreator] = js.undefined
    
    var success: js.UndefOr[TSuccessPayloadCreator] = js.undefined
    
    var trigger: js.UndefOr[TTriggerPayloadCreator] = js.undefined
  }
  object FAILURE_ {
    
    @scala.inline
    def apply[TTriggerPayloadCreator, TRequestPayloadCreator, TSuccessPayloadCreator, TFailurePayloadCreator, TFulfillPayloadCreator](): FAILURE_[
        TTriggerPayloadCreator, 
        TRequestPayloadCreator, 
        TSuccessPayloadCreator, 
        TFailurePayloadCreator, 
        TFulfillPayloadCreator
      ] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FAILURE_[
        TTriggerPayloadCreator, 
        TRequestPayloadCreator, 
        TSuccessPayloadCreator, 
        TFailurePayloadCreator, 
        TFulfillPayloadCreator
      ]]
    }
    
    @scala.inline
    implicit class FAILURE_MutableBuilder[Self <: FAILURE_[?, ?, ?, ?, ?], TTriggerPayloadCreator, TRequestPayloadCreator, TSuccessPayloadCreator, TFailurePayloadCreator, TFulfillPayloadCreator] (val x: Self & (FAILURE_[
            TTriggerPayloadCreator, 
            TRequestPayloadCreator, 
            TSuccessPayloadCreator, 
            TFailurePayloadCreator, 
            TFulfillPayloadCreator
          ])) extends AnyVal {
      
      @scala.inline
      def setFAILURE(value: TFailurePayloadCreator): Self = StObject.set(x, "FAILURE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFAILUREUndefined: Self = StObject.set(x, "FAILURE", js.undefined)
      
      @scala.inline
      def setFULFILL(value: TFulfillPayloadCreator): Self = StObject.set(x, "FULFILL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFULFILLUndefined: Self = StObject.set(x, "FULFILL", js.undefined)
      
      @scala.inline
      def setREQUEST(value: TRequestPayloadCreator): Self = StObject.set(x, "REQUEST", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setREQUESTUndefined: Self = StObject.set(x, "REQUEST", js.undefined)
      
      @scala.inline
      def setSUCCESS(value: TSuccessPayloadCreator): Self = StObject.set(x, "SUCCESS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSUCCESSUndefined: Self = StObject.set(x, "SUCCESS", js.undefined)
      
      @scala.inline
      def setTRIGGER(value: TTriggerPayloadCreator): Self = StObject.set(x, "TRIGGER", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTRIGGERUndefined: Self = StObject.set(x, "TRIGGER", js.undefined)
    }
  }
  
  trait FULFILL[TTriggerMetaCreator, TRequestMetaCreator, TSuccessMetaCreator, TFailureMetaCreator, TFulfillMetaCreator] extends StObject {
    
    var FAILURE: js.UndefOr[TFailureMetaCreator] = js.undefined
    
    var FULFILL: js.UndefOr[TFulfillMetaCreator] = js.undefined
    
    var REQUEST: js.UndefOr[TRequestMetaCreator] = js.undefined
    
    var SUCCESS: js.UndefOr[TSuccessMetaCreator] = js.undefined
    
    var TRIGGER: js.UndefOr[TTriggerMetaCreator] = js.undefined
    
    var failure: js.UndefOr[TFailureMetaCreator] = js.undefined
    
    var fulfill: js.UndefOr[TFulfillMetaCreator] = js.undefined
    
    var request: js.UndefOr[TRequestMetaCreator] = js.undefined
    
    var success: js.UndefOr[TSuccessMetaCreator] = js.undefined
    
    var trigger: js.UndefOr[TTriggerMetaCreator] = js.undefined
  }
  object FULFILL {
    
    @scala.inline
    def apply[TTriggerMetaCreator, TRequestMetaCreator, TSuccessMetaCreator, TFailureMetaCreator, TFulfillMetaCreator](): FULFILL[
        TTriggerMetaCreator, 
        TRequestMetaCreator, 
        TSuccessMetaCreator, 
        TFailureMetaCreator, 
        TFulfillMetaCreator
      ] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FULFILL[
        TTriggerMetaCreator, 
        TRequestMetaCreator, 
        TSuccessMetaCreator, 
        TFailureMetaCreator, 
        TFulfillMetaCreator
      ]]
    }
    
    @scala.inline
    implicit class FULFILLMutableBuilder[Self <: FULFILL[?, ?, ?, ?, ?], TTriggerMetaCreator, TRequestMetaCreator, TSuccessMetaCreator, TFailureMetaCreator, TFulfillMetaCreator] (val x: Self & (FULFILL[
            TTriggerMetaCreator, 
            TRequestMetaCreator, 
            TSuccessMetaCreator, 
            TFailureMetaCreator, 
            TFulfillMetaCreator
          ])) extends AnyVal {
      
      @scala.inline
      def setFAILURE(value: TFailureMetaCreator): Self = StObject.set(x, "FAILURE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFAILUREUndefined: Self = StObject.set(x, "FAILURE", js.undefined)
      
      @scala.inline
      def setFULFILL(value: TFulfillMetaCreator): Self = StObject.set(x, "FULFILL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFULFILLUndefined: Self = StObject.set(x, "FULFILL", js.undefined)
      
      @scala.inline
      def setREQUEST(value: TRequestMetaCreator): Self = StObject.set(x, "REQUEST", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setREQUESTUndefined: Self = StObject.set(x, "REQUEST", js.undefined)
      
      @scala.inline
      def setSUCCESS(value: TSuccessMetaCreator): Self = StObject.set(x, "SUCCESS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSUCCESSUndefined: Self = StObject.set(x, "SUCCESS", js.undefined)
      
      @scala.inline
      def setTRIGGER(value: TTriggerMetaCreator): Self = StObject.set(x, "TRIGGER", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTRIGGERUndefined: Self = StObject.set(x, "TRIGGER", js.undefined)
    }
  }
  
  trait Failure[TTriggerActionCreator, TRequestActionCreator, TSuccessActionCreator, TFailureActionCreator, TFulfillActionCreator] extends StObject {
    
    var failure: TFailureActionCreator
    
    var fulfill: TFulfillActionCreator
    
    var request: TRequestActionCreator
    
    var success: TSuccessActionCreator
    
    var trigger: TTriggerActionCreator
  }
  object Failure {
    
    @scala.inline
    def apply[TTriggerActionCreator, TRequestActionCreator, TSuccessActionCreator, TFailureActionCreator, TFulfillActionCreator](
      failure: TFailureActionCreator,
      fulfill: TFulfillActionCreator,
      request: TRequestActionCreator,
      success: TSuccessActionCreator,
      trigger: TTriggerActionCreator
    ): Failure[
        TTriggerActionCreator, 
        TRequestActionCreator, 
        TSuccessActionCreator, 
        TFailureActionCreator, 
        TFulfillActionCreator
      ] = {
      val __obj = js.Dynamic.literal(failure = failure.asInstanceOf[js.Any], fulfill = fulfill.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
      __obj.asInstanceOf[Failure[
        TTriggerActionCreator, 
        TRequestActionCreator, 
        TSuccessActionCreator, 
        TFailureActionCreator, 
        TFulfillActionCreator
      ]]
    }
    
    @scala.inline
    implicit class FailureMutableBuilder[Self <: Failure[?, ?, ?, ?, ?], TTriggerActionCreator, TRequestActionCreator, TSuccessActionCreator, TFailureActionCreator, TFulfillActionCreator] (val x: Self & (Failure[
            TTriggerActionCreator, 
            TRequestActionCreator, 
            TSuccessActionCreator, 
            TFailureActionCreator, 
            TFulfillActionCreator
          ])) extends AnyVal {
      
      @scala.inline
      def setFailure(value: TFailureActionCreator): Self = StObject.set(x, "failure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFulfill(value: TFulfillActionCreator): Self = StObject.set(x, "fulfill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest(value: TRequestActionCreator): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccess(value: TSuccessActionCreator): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrigger(value: TTriggerActionCreator): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined redux-saga-routines.redux-saga-routines.Routine<redux-saga-routines.redux-saga-routines.ActionCreatorFunction<any, any>, redux-saga-routines.redux-saga-routines.ActionCreatorFunction<any, any>, redux-saga-routines.redux-saga-routines.ActionCreatorFunction<any, any>, redux-saga-routines.redux-saga-routines.ActionCreatorFunction<any, any>, redux-saga-routines.redux-saga-routines.ActionCreatorFunction<any, any>> */
  @js.native
  trait RoutineActionCreatorFunct extends StObject {
    
    def apply(args: js.Any*): Action[js.Any] | (ActionMeta[js.Any, js.Any]) = js.native
    
    var FAILURE: String = js.native
    
    var FULFILL: String = js.native
    
    var REQUEST: String = js.native
    
    var SUCCESS: String = js.native
    
    var TRIGGER: String = js.native
    
    var failure: ActionCreatorFunction[js.Any, js.Any] = js.native
    
    var fulfill: ActionCreatorFunction[js.Any, js.Any] = js.native
    
    var request: ActionCreatorFunction[js.Any, js.Any] = js.native
    
    var success: ActionCreatorFunction[js.Any, js.Any] = js.native
    
    var trigger: ActionCreatorFunction[js.Any, js.Any] = js.native
  }
  
  /* Inlined {[ key in redux-saga-routines.redux-saga-routines.RoutineStages ]: string} */
  trait keyinRoutineStagesstring extends StObject {
    
    var FAILURE: String
    
    var FULFILL: String
    
    var REQUEST: String
    
    var SUCCESS: String
    
    var TRIGGER: String
  }
  object keyinRoutineStagesstring {
    
    @scala.inline
    def apply(FAILURE: String, FULFILL: String, REQUEST: String, SUCCESS: String, TRIGGER: String): keyinRoutineStagesstring = {
      val __obj = js.Dynamic.literal(FAILURE = FAILURE.asInstanceOf[js.Any], FULFILL = FULFILL.asInstanceOf[js.Any], REQUEST = REQUEST.asInstanceOf[js.Any], SUCCESS = SUCCESS.asInstanceOf[js.Any], TRIGGER = TRIGGER.asInstanceOf[js.Any])
      __obj.asInstanceOf[keyinRoutineStagesstring]
    }
    
    @scala.inline
    implicit class keyinRoutineStagesstringMutableBuilder[Self <: keyinRoutineStagesstring] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFAILURE(value: String): Self = StObject.set(x, "FAILURE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFULFILL(value: String): Self = StObject.set(x, "FULFILL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setREQUEST(value: String): Self = StObject.set(x, "REQUEST", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSUCCESS(value: String): Self = StObject.set(x, "SUCCESS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTRIGGER(value: String): Self = StObject.set(x, "TRIGGER", value.asInstanceOf[js.Any])
    }
  }
}
