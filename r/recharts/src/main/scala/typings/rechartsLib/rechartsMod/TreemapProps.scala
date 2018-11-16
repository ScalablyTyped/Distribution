package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TreemapProps
  extends EventAttributes
     with Animatable {
  var aspectRatio: js.UndefOr[scala.Double] = js.undefined
   // As the source code states, dataKey will replace valueKey in 1.1.0 and it'll be required (it's already required in current implementation).
  var children: js.UndefOr[
    js.Array[reactLib.reactMod.ReactNs.ReactNode] | reactLib.reactMod.ReactNs.ReactNode
  ] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var content: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_] | ContentRenderer[_]] = js.undefined
  var data: js.UndefOr[js.Array[_]] = js.undefined
  var dataKey: js.UndefOr[DataKey] = js.undefined
  var fill: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var nameKey: js.UndefOr[java.lang.String | scala.Double | RechartsFunction] = js.undefined
  var stroke: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

