package typings.reduxForm.actionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitializeOptions extends js.Object {
  var keepDirty: Boolean
  var keepSubmitSucceeded: Boolean
  var keepValues: Boolean
  var updateUnregisteredFields: Boolean
}

object InitializeOptions {
  @scala.inline
  def apply(
    keepDirty: Boolean,
    keepSubmitSucceeded: Boolean,
    keepValues: Boolean,
    updateUnregisteredFields: Boolean
  ): InitializeOptions = {
    val __obj = js.Dynamic.literal(keepDirty = keepDirty.asInstanceOf[js.Any], keepSubmitSucceeded = keepSubmitSucceeded.asInstanceOf[js.Any], keepValues = keepValues.asInstanceOf[js.Any], updateUnregisteredFields = updateUnregisteredFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitializeOptions]
  }
}

