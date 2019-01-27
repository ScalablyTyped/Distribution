package typings
package spectacleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object spectacleMod {
  /**
    * All available DOM style properties and their types
    * https://www.npmjs.com/package/csstype
    */
  type CSSProperties = csstypeLib.csstypeMod.Properties[java.lang.String | scala.Double]
  type FitProps = FillProps
  /**
    * Alignment Types for Spectacle
    */
  type alignType = (spectacleLib.spectacleLibStrings.`flex-start flex-start`) | (spectacleLib.spectacleLibStrings.`flex-start center`) | (spectacleLib.spectacleLibStrings.`flex-start flex-end`) | (spectacleLib.spectacleLibStrings.`center flex-start`) | (spectacleLib.spectacleLibStrings.`center center`) | (spectacleLib.spectacleLibStrings.`center flex-end`) | (spectacleLib.spectacleLibStrings.`flex-end flex-start`) | (spectacleLib.spectacleLibStrings.`flex-end center`) | (spectacleLib.spectacleLibStrings.`flex-end flex-end`)
  /**
    * Animation Types for Spectacle
    */
  type easeType = spectacleLib.spectacleLibStrings.back | spectacleLib.spectacleLibStrings.backIn | spectacleLib.spectacleLibStrings.backOut | spectacleLib.spectacleLibStrings.backInOut | spectacleLib.spectacleLibStrings.bounce | spectacleLib.spectacleLibStrings.bounceIn | spectacleLib.spectacleLibStrings.bounceOut | spectacleLib.spectacleLibStrings.bounceInOut | spectacleLib.spectacleLibStrings.circle | spectacleLib.spectacleLibStrings.circleIn | spectacleLib.spectacleLibStrings.circleOut | spectacleLib.spectacleLibStrings.circleInOut | spectacleLib.spectacleLibStrings.linear | spectacleLib.spectacleLibStrings.linearIn | spectacleLib.spectacleLibStrings.linearOut | spectacleLib.spectacleLibStrings.linearInOut | spectacleLib.spectacleLibStrings.cubic | spectacleLib.spectacleLibStrings.cubicIn | spectacleLib.spectacleLibStrings.cubicOut | spectacleLib.spectacleLibStrings.cubicInOut | spectacleLib.spectacleLibStrings.elastic | spectacleLib.spectacleLibStrings.elasticIn | spectacleLib.spectacleLibStrings.elasticOut | spectacleLib.spectacleLibStrings.elasticInOut | spectacleLib.spectacleLibStrings.exp | spectacleLib.spectacleLibStrings.expIn | spectacleLib.spectacleLibStrings.expOut | spectacleLib.spectacleLibStrings.expInOut | spectacleLib.spectacleLibStrings.poly | spectacleLib.spectacleLibStrings.polyIn | spectacleLib.spectacleLibStrings.polyOut | spectacleLib.spectacleLibStrings.polyInOut | spectacleLib.spectacleLibStrings.quad | spectacleLib.spectacleLibStrings.quadIn | spectacleLib.spectacleLibStrings.quadOut | spectacleLib.spectacleLibStrings.quadInOut | spectacleLib.spectacleLibStrings.sin | spectacleLib.spectacleLibStrings.sinIn | spectacleLib.spectacleLibStrings.sinOut | spectacleLib.spectacleLibStrings.sinInOut
  /**
    * Progress Types for Spectacle
    */
  type progressType = spectacleLib.spectacleLibStrings.pacman | spectacleLib.spectacleLibStrings.bar | spectacleLib.spectacleLibStrings.number | spectacleLib.spectacleLibStrings.none
  /**
    * S Types for StyledS in Spectacle
    */
  type sType = spectacleLib.spectacleLibStrings.italic | spectacleLib.spectacleLibStrings.bold | spectacleLib.spectacleLibStrings.`line-through` | spectacleLib.spectacleLibStrings.underline
  /**
    * Target Types for links
    */
  type targetType = spectacleLib.spectacleLibStrings._blank | spectacleLib.spectacleLibStrings._self | spectacleLib.spectacleLibStrings._parent | spectacleLib.spectacleLibStrings._top
  /**
    * Theme Types for CodePane in Spectacle
    */
  type themeType = spectacleLib.spectacleLibStrings.dark | spectacleLib.spectacleLibStrings.light | spectacleLib.spectacleLibStrings.external
  /**
    * Transition Types for Spectacle
    */
  type transitionType = spectacleLib.spectacleLibStrings.slide | spectacleLib.spectacleLibStrings.zoom | spectacleLib.spectacleLibStrings.fade | spectacleLib.spectacleLibStrings.spin
}
