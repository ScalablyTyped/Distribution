package typings.reduxForm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<redux-form.redux-form/lib/actions.InitializeOptions> */
trait PartialInitializeOptions extends js.Object {
  var keepDirty: js.UndefOr[Boolean] = js.undefined
  var keepSubmitSucceeded: js.UndefOr[Boolean] = js.undefined
  var keepValues: js.UndefOr[Boolean] = js.undefined
  var updateUnregisteredFields: js.UndefOr[Boolean] = js.undefined
}

object PartialInitializeOptions {
  @scala.inline
  def apply(
    keepDirty: js.UndefOr[Boolean] = js.undefined,
    keepSubmitSucceeded: js.UndefOr[Boolean] = js.undefined,
    keepValues: js.UndefOr[Boolean] = js.undefined,
    updateUnregisteredFields: js.UndefOr[Boolean] = js.undefined
  ): PartialInitializeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(keepDirty)) __obj.updateDynamic("keepDirty")(keepDirty.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepSubmitSucceeded)) __obj.updateDynamic("keepSubmitSucceeded")(keepSubmitSucceeded.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepValues)) __obj.updateDynamic("keepValues")(keepValues.get.asInstanceOf[js.Any])
    if (!js.isUndefined(updateUnregisteredFields)) __obj.updateDynamic("updateUnregisteredFields")(updateUnregisteredFields.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialInitializeOptions]
  }
}

