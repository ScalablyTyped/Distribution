package typings.rotJs.lightingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** Cells with emissivity > threshold will be treated as light source in the next pass. Default = 100 */
  var emissionThreshold: Double
  /** Number of passes. 1 equals to simple FOV of all light sources, >1 means a *highly simplified* radiosity-like algorithm. Default = 1 */
  var passes: Double
  /** Max light range, default = 10 */
  var range: Double
}

object Options {
  @scala.inline
  def apply(emissionThreshold: Double, passes: Double, range: Double): Options = {
    val __obj = js.Dynamic.literal(emissionThreshold = emissionThreshold.asInstanceOf[js.Any], passes = passes.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

