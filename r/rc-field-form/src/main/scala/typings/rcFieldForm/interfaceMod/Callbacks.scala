package typings.rcFieldForm.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Callbacks extends js.Object {
  var onFieldsChange: js.UndefOr[
    js.Function2[/* changedFields */ js.Array[FieldData], /* allFields */ js.Array[FieldData], Unit]
  ] = js.native
  var onFinish: js.UndefOr[js.Function1[/* values */ Store, Unit]] = js.native
  var onFinishFailed: js.UndefOr[js.Function1[/* errorInfo */ ValidateErrorEntity, Unit]] = js.native
  var onValuesChange: js.UndefOr[js.Function2[/* changedValues */ Store, /* values */ Store, Unit]] = js.native
}

object Callbacks {
  @scala.inline
  def apply(): Callbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Callbacks]
  }
  @scala.inline
  implicit class CallbacksOps[Self <: Callbacks] (val x: Self) extends AnyVal {
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
    def setOnFieldsChange(value: (/* changedFields */ js.Array[FieldData], /* allFields */ js.Array[FieldData]) => Unit): Self = this.set("onFieldsChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnFieldsChange: Self = this.set("onFieldsChange", js.undefined)
    @scala.inline
    def setOnFinish(value: /* values */ Store => Unit): Self = this.set("onFinish", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFinish: Self = this.set("onFinish", js.undefined)
    @scala.inline
    def setOnFinishFailed(value: /* errorInfo */ ValidateErrorEntity => Unit): Self = this.set("onFinishFailed", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFinishFailed: Self = this.set("onFinishFailed", js.undefined)
    @scala.inline
    def setOnValuesChange(value: (/* changedValues */ Store, /* values */ Store) => Unit): Self = this.set("onValuesChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnValuesChange: Self = this.set("onValuesChange", js.undefined)
  }
  
}

