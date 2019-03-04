package typings
package pumpifyLib.pumpifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PumpifyFactoryOptions extends js.Object {
  var autoDestroy: scala.Boolean
  var destroy: scala.Boolean
  var highWaterMark: scala.Double
  var objectMode: scala.Boolean
}

object PumpifyFactoryOptions {
  @scala.inline
  def apply(
    autoDestroy: scala.Boolean,
    destroy: scala.Boolean,
    highWaterMark: scala.Double,
    objectMode: scala.Boolean
  ): PumpifyFactoryOptions = {
    val __obj = js.Dynamic.literal(autoDestroy = autoDestroy, destroy = destroy, highWaterMark = highWaterMark, objectMode = objectMode)
  
    __obj.asInstanceOf[PumpifyFactoryOptions]
  }
}

