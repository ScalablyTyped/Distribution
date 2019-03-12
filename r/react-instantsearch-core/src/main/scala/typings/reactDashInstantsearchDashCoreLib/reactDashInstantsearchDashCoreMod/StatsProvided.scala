package typings
package reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatsProvided extends js.Object {
  var nbHits: scala.Double
  var processingTimeMS: scala.Double
}

object StatsProvided {
  @scala.inline
  def apply(nbHits: scala.Double, processingTimeMS: scala.Double): StatsProvided = {
    val __obj = js.Dynamic.literal(nbHits = nbHits, processingTimeMS = processingTimeMS)
  
    __obj.asInstanceOf[StatsProvided]
  }
}

