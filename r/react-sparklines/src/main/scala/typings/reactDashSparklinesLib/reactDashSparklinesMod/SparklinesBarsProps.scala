package typings
package reactDashSparklinesLib.reactDashSparklinesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SparklinesBarsProps extends js.Object {
  var barWidth: js.UndefOr[scala.Double] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var margin: js.UndefOr[scala.Double] = js.undefined
  var onMouseMove: js.UndefOr[
    js.Function2[
      /* p */ Point, 
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.reactMod.ReactNs.ReactSVGElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var points: js.UndefOr[js.Array[Point]] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

