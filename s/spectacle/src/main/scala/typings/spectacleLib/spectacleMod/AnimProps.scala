package typings
package spectacleLib.spectacleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimProps extends js.Object {
  var easing: easeType
  var fromStyle: CSSProperties | js.Array[CSSProperties]
  var onAnim: js.UndefOr[
    js.Function2[
      /* forwards */ js.UndefOr[scala.Boolean], 
      /* animIndex */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  var order: js.UndefOr[scala.Double] = js.undefined
  var route: js.UndefOr[js.Object] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var toStyle: CSSProperties | js.Array[CSSProperties]
  var transitionDuration: scala.Double
}

