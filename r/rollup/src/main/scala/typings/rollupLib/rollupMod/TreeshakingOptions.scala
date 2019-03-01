package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeshakingOptions extends js.Object {
  var annotations: scala.Boolean
  var propertyReadSideEffects: scala.Boolean
  var pureExternalModules: scala.Boolean
}

object TreeshakingOptions {
  @scala.inline
  def apply(
    annotations: scala.Boolean,
    propertyReadSideEffects: scala.Boolean,
    pureExternalModules: scala.Boolean
  ): TreeshakingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("annotations")(annotations)
    __obj.updateDynamic("propertyReadSideEffects")(propertyReadSideEffects)
    __obj.updateDynamic("pureExternalModules")(pureExternalModules)
    __obj.asInstanceOf[TreeshakingOptions]
  }
}

