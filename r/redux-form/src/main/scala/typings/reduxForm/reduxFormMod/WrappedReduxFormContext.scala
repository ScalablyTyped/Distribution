package typings.reduxForm.reduxFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrappedReduxFormContext extends js.Object {
  var _reduxForm: ReduxFormContext
}

object WrappedReduxFormContext {
  @scala.inline
  def apply(_reduxForm: ReduxFormContext): WrappedReduxFormContext = {
    val __obj = js.Dynamic.literal(_reduxForm = _reduxForm.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedReduxFormContext]
  }
}

