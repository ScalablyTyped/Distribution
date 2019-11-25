package typings.pumpify.pumpifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PumpifyFactoryOptions extends js.Object {
  var autoDestroy: Boolean
  var destroy: Boolean
  var highWaterMark: Double
  var objectMode: Boolean
}

object PumpifyFactoryOptions {
  @scala.inline
  def apply(autoDestroy: Boolean, destroy: Boolean, highWaterMark: Double, objectMode: Boolean): PumpifyFactoryOptions = {
    val __obj = js.Dynamic.literal(autoDestroy = autoDestroy.asInstanceOf[js.Any], destroy = destroy.asInstanceOf[js.Any], highWaterMark = highWaterMark.asInstanceOf[js.Any], objectMode = objectMode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PumpifyFactoryOptions]
  }
}

