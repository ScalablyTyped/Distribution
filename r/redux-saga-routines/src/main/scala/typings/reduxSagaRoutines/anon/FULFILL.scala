package typings.reduxSagaRoutines.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FULFILL[TTriggerMetaCreator, TRequestMetaCreator, TSuccessMetaCreator, TFailureMetaCreator, TFulfillMetaCreator] extends js.Object {
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
  implicit class FULFILLOps[Self <: FULFILL[_, _, _, _, _], TTriggerMetaCreator, TRequestMetaCreator, TSuccessMetaCreator, TFailureMetaCreator, TFulfillMetaCreator] (val x: Self with (FULFILL[
        TTriggerMetaCreator, 
        TRequestMetaCreator, 
        TSuccessMetaCreator, 
        TFailureMetaCreator, 
        TFulfillMetaCreator
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
    def setFAILURE(value: TFailureMetaCreator): Self = this.set("FAILURE", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFAILURE: Self = this.set("FAILURE", js.undefined)
    @scala.inline
    def setFULFILL(value: TFulfillMetaCreator): Self = this.set("FULFILL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFULFILL: Self = this.set("FULFILL", js.undefined)
    @scala.inline
    def setREQUEST(value: TRequestMetaCreator): Self = this.set("REQUEST", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteREQUEST: Self = this.set("REQUEST", js.undefined)
    @scala.inline
    def setSUCCESS(value: TSuccessMetaCreator): Self = this.set("SUCCESS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSUCCESS: Self = this.set("SUCCESS", js.undefined)
    @scala.inline
    def setTRIGGER(value: TTriggerMetaCreator): Self = this.set("TRIGGER", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTRIGGER: Self = this.set("TRIGGER", js.undefined)
  }
  
}

