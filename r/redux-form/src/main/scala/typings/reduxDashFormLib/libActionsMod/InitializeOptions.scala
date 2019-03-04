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
    val __obj = js.Dynamic.literal(keepDirty = keepDirty, keepSubmitSucceeded = keepSubmitSucceeded, keepValues = keepValues, updateUnregisteredFields = updateUnregisteredFields)
  
    __obj.asInstanceOf[InitializeOptions]
  }
}

