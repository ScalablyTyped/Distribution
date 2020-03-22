package typings.rcFieldForm.formContextMod

import typings.rcFieldForm.interfaceMod.ValidateMessages
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormProviderProps extends js.Object {
  var onFormChange: js.UndefOr[js.Function2[/* name */ String, /* info */ FormChangeInfo, Unit]] = js.undefined
  var onFormFinish: js.UndefOr[js.Function2[/* name */ String, /* info */ FormFinishInfo, Unit]] = js.undefined
  var validateMessages: js.UndefOr[ValidateMessages] = js.undefined
}

object FormProviderProps {
  @scala.inline
  def apply(
    onFormChange: (/* name */ String, /* info */ FormChangeInfo) => Unit = null,
    onFormFinish: (/* name */ String, /* info */ FormFinishInfo) => Unit = null,
    validateMessages: ValidateMessages = null
  ): FormProviderProps = {
    val __obj = js.Dynamic.literal()
    if (onFormChange != null) __obj.updateDynamic("onFormChange")(js.Any.fromFunction2(onFormChange))
    if (onFormFinish != null) __obj.updateDynamic("onFormFinish")(js.Any.fromFunction2(onFormFinish))
    if (validateMessages != null) __obj.updateDynamic("validateMessages")(validateMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormProviderProps]
  }
}

