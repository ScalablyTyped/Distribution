package typings.speedMeasureWebpackPlugin.mod

import typings.webpack.mod.Configuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See how fast (or not) your plugins and loaders are, so you can optimise your builds
  */
@JSImport("speed-measure-webpack-plugin", JSImport.Namespace)
@js.native
class ^ () extends SpeedMeasurePlugin {
  def this(options: Options) = this()
  /* CompleteClass */
  override def wrap(config: Configuration): Configuration = js.native
}

