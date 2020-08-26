package typings.reduxSagaRoutines.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FAILURE_[TTriggerPayloadCreator, TRequestPayloadCreator, TSuccessPayloadCreator, TFailurePayloadCreator, TFulfillPayloadCreator] extends js.Object {
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
  implicit class FAILURE_Ops[Self <: FAILURE_[_, _, _, _, _], TTriggerPayloadCreator, TRequestPayloadCreator, TSuccessPayloadCreator, TFailurePayloadCreator, TFulfillPayloadCreator] (val x: Self with (FAILURE_[
        TTriggerPayloadCreator, 
        TRequestPayloadCreator, 
        TSuccessPayloadCreator, 
        TFailurePayloadCreator, 
        TFulfillPayloadCreator
      ])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFAILURE(value: TFailurePayloadCreator): Self = this.set("FAILURE", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFAILURE: Self = this.set("FAILURE", js.undefined)
    @scala.inline
    def setFULFILL(value: TFulfillPayloadCreator): Self = this.set("FULFILL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFULFILL: Self = this.set("FULFILL", js.undefined)
    @scala.inline
    def setREQUEST(value: TRequestPayloadCreator): Self = this.set("REQUEST", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteREQUEST: Self = this.set("REQUEST", js.undefined)
    @scala.inline
    def setSUCCESS(value: TSuccessPayloadCreator): Self = this.set("SUCCESS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSUCCESS: Self = this.set("SUCCESS", js.undefined)
    @scala.inline
    def setTRIGGER(value: TTriggerPayloadCreator): Self = this.set("TRIGGER", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTRIGGER: Self = this.set("TRIGGER", js.undefined)
  }
  
}

