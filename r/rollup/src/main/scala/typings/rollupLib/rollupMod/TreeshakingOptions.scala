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
    val __obj = js.Dynamic.literal(annotations = annotations, propertyReadSideEffects = propertyReadSideEffects, pureExternalModules = pureExternalModules)
  
    __obj.asInstanceOf[TreeshakingOptions]
  }
}

