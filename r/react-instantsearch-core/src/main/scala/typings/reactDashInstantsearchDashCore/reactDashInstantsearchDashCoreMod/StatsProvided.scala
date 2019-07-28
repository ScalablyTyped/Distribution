package typings.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatsProvided extends js.Object {
  var nbHits: Double
  var processingTimeMS: Double
}

object StatsProvided {
  @scala.inline
  def apply(nbHits: Double, processingTimeMS: Double): StatsProvided = {
    val __obj = js.Dynamic.literal(nbHits = nbHits, processingTimeMS = processingTimeMS)
  
    __obj.asInstanceOf[StatsProvided]
  }
}

