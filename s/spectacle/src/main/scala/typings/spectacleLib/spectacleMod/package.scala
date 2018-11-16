package typings
package spectacleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object spectacleMod {
  /**
  	 * Alignment Types for Spectacle
  	 */
  type alignType = (spectacleLib.spectacleLibStrings.`flex-start flex-start`) | (spectacleLib.spectacleLibStrings.`flex-start center`) | (spectacleLib.spectacleLibStrings.`flex-start flex-end`) | (spectacleLib.spectacleLibStrings.`center flex-start`) | (spectacleLib.spectacleLibStrings.`center center`) | (spectacleLib.spectacleLibStrings.`center flex-end`) | (spectacleLib.spectacleLibStrings.`flex-end flex-start`) | (spectacleLib.spectacleLibStrings.`flex-end center`) | (spectacleLib.spectacleLibStrings.`flex-end flex-end`)
  /**
  	 * Progress Types for Spectacle
  	 */
  type progressType = spectacleLib.spectacleLibStrings.pacman | spectacleLib.spectacleLibStrings.bar | spectacleLib.spectacleLibStrings.number | spectacleLib.spectacleLibStrings.none
  /**
  	 * Transition Types for Spectacle
  	 */
  type transitionType = spectacleLib.spectacleLibStrings.slide | spectacleLib.spectacleLibStrings.zoom | spectacleLib.spectacleLibStrings.fade | spectacleLib.spectacleLibStrings.spin
}
