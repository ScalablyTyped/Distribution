package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * An object with survival game info
 */

trait SurvivalGameInfo extends js.Object {
  /**
       * Current score.
       */
  var score: scala.Double
  /**
       * Time to the next wave of invaders.
       */
  var timeToWave: scala.Double
  /**
       * The number of the next wave.
       */
  var wave: scala.Double
}

