package typings
package reactDashNativeDashIndicatorsLib.reactDashNativeDashIndicatorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaveIndicatorProps extends BaseIndicatorProps {
  /**
    * Component color
    * @default 'rgb(0, 0, 0)'
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Component count
    * @default 4
    */
  var count: js.UndefOr[scala.Double] = js.undefined
  /**
    * Base component size
    * @default 40
    */
  var size: js.UndefOr[scala.Double] = js.undefined
  /**
    * Minimum component scale
    * @default 0.54
    */
  var waveFactor: js.UndefOr[scala.Double] = js.undefined
  /**
    * Maximum component scale
    * @default 'fill'
    */
  var waveMode: js.UndefOr[
    reactDashNativeDashIndicatorsLib.reactDashNativeDashIndicatorsLibStrings.fill | reactDashNativeDashIndicatorsLib.reactDashNativeDashIndicatorsLibStrings.outline
  ] = js.undefined
}

