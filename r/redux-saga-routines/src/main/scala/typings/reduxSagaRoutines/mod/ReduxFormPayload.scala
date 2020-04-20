package typings.reduxSagaRoutines.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReduxFormPayload[TFormData, TProps] extends js.Object {
  var props: TProps
  var values: TFormData
}

object ReduxFormPayload {
  @scala.inline
  def apply[TFormData, TProps](props: TProps, values: TFormData): ReduxFormPayload[TFormData, TProps] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReduxFormPayload[TFormData, TProps]]
  }
}

