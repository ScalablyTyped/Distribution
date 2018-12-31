package typings
package reactDashSparklinesLib.reactDashSparklinesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklinesLineProps extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var onMouseMove: js.UndefOr[
    js.Function3[
      /* event */ reactDashSparklinesLib.reactDashSparklinesLibStrings.enter | reactDashSparklinesLib.reactDashSparklinesLibStrings.click, 
      /* value */ scala.Double, 
      /* point */ Point, 
      scala.Unit
    ]
  ] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

