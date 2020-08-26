package typings.reduxSagaRoutines.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReduxFormPayload[TFormData, TProps] extends js.Object {
  var props: TProps = js.native
  var values: TFormData = js.native
}

object ReduxFormPayload {
  @scala.inline
  def apply[TFormData, TProps](props: TProps, values: TFormData): ReduxFormPayload[TFormData, TProps] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReduxFormPayload[TFormData, TProps]]
  }
  @scala.inline
  implicit class ReduxFormPayloadOps[Self <: ReduxFormPayload[_, _], TFormData, TProps] (val x: Self with (ReduxFormPayload[TFormData, TProps])) extends AnyVal {
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
    def setProps(value: TProps): Self = this.set("props", value.asInstanceOf[js.Any])
    @scala.inline
    def setValues(value: TFormData): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

