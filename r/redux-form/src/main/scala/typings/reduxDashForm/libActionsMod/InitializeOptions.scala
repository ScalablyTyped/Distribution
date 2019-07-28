package typings.reduxDashForm.libActionsMod

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
    val __obj = js.Dynamic.literal(keepDirty = keepDirty, keepSubmitSucceeded = keepSubmitSucceeded, keepValues = keepValues, updateUnregisteredFields = updateUnregisteredFields)
  
    __obj.asInstanceOf[InitializeOptions]
  }
}

