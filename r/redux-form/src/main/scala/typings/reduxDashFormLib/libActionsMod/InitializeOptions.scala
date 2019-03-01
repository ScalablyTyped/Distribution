package typings
package reduxDashFormLib.libActionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitializeOptions extends js.Object {
  var keepDirty: scala.Boolean
  var keepSubmitSucceeded: scala.Boolean
  var keepValues: scala.Boolean
  var updateUnregisteredFields: scala.Boolean
}

object InitializeOptions {
  @scala.inline
  def apply(
    keepDirty: scala.Boolean,
    keepSubmitSucceeded: scala.Boolean,
    keepValues: scala.Boolean,
    updateUnregisteredFields: scala.Boolean
  ): InitializeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("keepDirty")(keepDirty)
    __obj.updateDynamic("keepSubmitSucceeded")(keepSubmitSucceeded)
    __obj.updateDynamic("keepValues")(keepValues)
    __obj.updateDynamic("updateUnregisteredFields")(updateUnregisteredFields)
    __obj.asInstanceOf[InitializeOptions]
  }
}

