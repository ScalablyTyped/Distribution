package typings.speedMeasureWebpackPlugin.mod

import typings.webpack.mod.Configuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See how fast (or not) your plugins and loaders are, so you can optimise your builds
  */
trait SpeedMeasurePlugin extends js.Object {
  def wrap(config: Configuration): Configuration
}

object SpeedMeasurePlugin {
  @scala.inline
  def apply(wrap: Configuration => Configuration): SpeedMeasurePlugin = {
    val __obj = js.Dynamic.literal(wrap = js.Any.fromFunction1(wrap))
    __obj.asInstanceOf[SpeedMeasurePlugin]
  }
}

