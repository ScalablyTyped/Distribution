package typings.reactDashDevDashUtils

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.webpack.webpackMod.optimize.AggressiveMergingPlugin
import typings.webpack.webpackMod.optimize.AggressiveSplittingPlugin
import typings.webpack.webpackMod.optimize.DedupePlugin
import typings.webpack.webpackMod.optimize.LimitChunkCountPlugin
import typings.webpack.webpackMod.optimize.MinChunkSizePlugin
import typings.webpack.webpackMod.optimize.ModuleConcatenationPlugin
import typings.webpack.webpackMod.optimize.OccurrenceOrderPlugin
import typings.webpack.webpackMod.optimize.UglifyJsPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofoptimize extends js.Object {
  var AggressiveMergingPlugin: js.Any | Instantiable0[typings.webpack.webpackMod.optimize.AggressiveMergingPlugin]
  var AggressiveSplittingPlugin: js.Any | Instantiable0[typings.webpack.webpackMod.optimize.AggressiveSplittingPlugin]
  /** @deprecated */
  var DedupePlugin: Instantiable0[typings.webpack.webpackMod.optimize.DedupePlugin]
  var LimitChunkCountPlugin: Instantiable1[/* options */ js.Any, typings.webpack.webpackMod.optimize.LimitChunkCountPlugin]
  var MinChunkSizePlugin: Instantiable1[/* options */ js.Any, typings.webpack.webpackMod.optimize.MinChunkSizePlugin]
  /** @deprecated use config.optimization.concatenateModules */
  var ModuleConcatenationPlugin: Instantiable0[typings.webpack.webpackMod.optimize.ModuleConcatenationPlugin]
  var OccurrenceOrderPlugin: Instantiable1[
    /* preferEntry */ Boolean, 
    typings.webpack.webpackMod.optimize.OccurrenceOrderPlugin
  ]
  var UglifyJsPlugin: js.Any | Instantiable0[typings.webpack.webpackMod.optimize.UglifyJsPlugin]
}

object Typeofoptimize {
  @scala.inline
  def apply(
    AggressiveMergingPlugin: Instantiable0[AggressiveMergingPlugin],
    AggressiveSplittingPlugin: Instantiable0[AggressiveSplittingPlugin],
    DedupePlugin: Instantiable0[DedupePlugin],
    LimitChunkCountPlugin: Instantiable1[/* options */ js.Any, LimitChunkCountPlugin],
    MinChunkSizePlugin: Instantiable1[/* options */ js.Any, MinChunkSizePlugin],
    ModuleConcatenationPlugin: Instantiable0[ModuleConcatenationPlugin],
    OccurrenceOrderPlugin: Instantiable1[/* preferEntry */ Boolean, OccurrenceOrderPlugin],
    UglifyJsPlugin: Instantiable0[UglifyJsPlugin]
  ): Typeofoptimize = {
    val __obj = js.Dynamic.literal(AggressiveMergingPlugin = AggressiveMergingPlugin, AggressiveSplittingPlugin = AggressiveSplittingPlugin, DedupePlugin = DedupePlugin, LimitChunkCountPlugin = LimitChunkCountPlugin, MinChunkSizePlugin = MinChunkSizePlugin, ModuleConcatenationPlugin = ModuleConcatenationPlugin, OccurrenceOrderPlugin = OccurrenceOrderPlugin, UglifyJsPlugin = UglifyJsPlugin)
  
    __obj.asInstanceOf[Typeofoptimize]
  }
}

