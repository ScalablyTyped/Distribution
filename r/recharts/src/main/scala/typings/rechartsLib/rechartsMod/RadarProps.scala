package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Lifted 1 members from Set(std.Partial) */ 
trait RadarProps
  extends EventAttributes
     with Animatable {
  var activeDot: js.UndefOr[
    js.Object | reactLib.reactMod.ReactNs.ReactElement[_] | ContentRenderer[_] | scala.Boolean
  ] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var dataKey: DataKey
  var dot: js.UndefOr[
    js.Object | reactLib.reactMod.ReactNs.ReactElement[_] | ContentRenderer[DotProps] | scala.Boolean
  ] = js.undefined
  var hide: js.UndefOr[scala.Boolean] = js.undefined
  var label: js.UndefOr[
    js.Object | reactLib.reactMod.ReactNs.ReactElement[_] | ContentRenderer[_] | scala.Boolean
  ] = js.undefined
  var legendType: js.UndefOr[LegendType] = js.undefined
   // As the source code states, dataKey will replace valueKey in 1.1.0 and it'll be required (it's already required in current implementation).
  var points: js.UndefOr[js.Array[RadarPoint]] = js.undefined
  var shape: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_] | ContentRenderer[RadarProps]] = js.undefined
}

