package typings.reduxForm.anon

import typings.reduxForm.reduxFormMod.WrappedReduxFormContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReduxForm extends js.Object {
  var _reduxForm: js.UndefOr[WrappedReduxFormContext] = js.undefined
}

object ReduxForm {
  @scala.inline
  def apply(_reduxForm: WrappedReduxFormContext = null): ReduxForm = {
    val __obj = js.Dynamic.literal()
    if (_reduxForm != null) __obj.updateDynamic("_reduxForm")(_reduxForm.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReduxForm]
  }
}

