package typings.reduxSagaRoutines

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FAILURE_[TTriggerPayloadCreator, TRequestPayloadCreator, TSuccessPayloadCreator, TFailurePayloadCreator, TFulfillPayloadCreator] extends StObject {
    
    var FAILURE: js.UndefOr[TFailurePayloadCreator] = js.native
    
    var FULFILL: js.UndefOr[TFulfillPayloadCreator] = js.native
    
    var REQUEST: js.UndefOr[TRequestPayloadCreator] = js.native
    
    var SUCCESS: js.UndefOr[TSuccessPayloadCreator] = js.native
    
    var TRIGGER: js.UndefOr[TTriggerPayloadCreator] = js.native
    
    var failure: js.UndefOr[TFailurePayloadCreator] = js.native
    
    var fulfill: js.UndefOr[TFulfillPayloadCreator] = js.native
    
    var request: js.UndefOr[TRequestPayloadCreator] = js.native
    
    var success: js.UndefOr[TSuccessPayloadCreator] = js.native
    
    var trigger: js.UndefOr[TTriggerPayloadCreator] = js.native
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
    implicit class FAILURE_MutableBuilder[Self <: FAILURE_[_, _, _, _, _], TTriggerPayloadCreator, TRequestPayloadCreator, TSuccessPayloadCreator, TFailurePayloadCreator, TFulfillPayloadCreator] (val x: Self with (FAILURE_[
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
  
  @js.native
  trait FULFILL[TTriggerMetaCreator, TRequestMetaCreator, TSuccessMetaCreator, TFailureMetaCreator, TFulfillMetaCreator] extends StObject {
    
    var FAILURE: js.UndefOr[TFailureMetaCreator] = js.native
    
    var FULFILL: js.UndefOr[TFulfillMetaCreator] = js.native
    
    var REQUEST: js.UndefOr[TRequestMetaCreator] = js.native
    
    var SUCCESS: js.UndefOr[TSuccessMetaCreator] = js.native
    
    var TRIGGER: js.UndefOr[TTriggerMetaCreator] = js.native
    
    var failure: js.UndefOr[TFailureMetaCreator] = js.native
    
    var fulfill: js.UndefOr[TFulfillMetaCreator] = js.native
    
    var request: js.UndefOr[TRequestMetaCreator] = js.native
    
    var success: js.UndefOr[TSuccessMetaCreator] = js.native
    
    var trigger: js.UndefOr[TTriggerMetaCreator] = js.native
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
    implicit class FULFILLMutableBuilder[Self <: FULFILL[_, _, _, _, _], TTriggerMetaCreator, TRequestMetaCreator, TSuccessMetaCreator, TFailureMetaCreator, TFulfillMetaCreator] (val x: Self with (FULFILL[
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
  
  @js.native
  trait Failure[TTriggerActionCreator, TRequestActionCreator, TSuccessActionCreator, TFailureActionCreator, TFulfillActionCreator] extends StObject {
    
    var failure: TFailureActionCreator = js.native
    
    var fulfill: TFulfillActionCreator = js.native
    
    var request: TRequestActionCreator = js.native
    
    var success: TSuccessActionCreator = js.native
    
    var trigger: TTriggerActionCreator = js.native
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
    implicit class FailureMutableBuilder[Self <: Failure[_, _, _, _, _], TTriggerActionCreator, TRequestActionCreator, TSuccessActionCreator, TFailureActionCreator, TFulfillActionCreator] (val x: Self with (Failure[
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
  
  /* Inlined {[ key in redux-saga-routines.redux-saga-routines.RoutineStages ]: string} */
  @js.native
  trait keyinRoutineStagesstring extends StObject {
    
    var FAILURE: String = js.native
    
    var FULFILL: String = js.native
    
    var REQUEST: String = js.native
    
    var SUCCESS: String = js.native
    
    var TRIGGER: String = js.native
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
