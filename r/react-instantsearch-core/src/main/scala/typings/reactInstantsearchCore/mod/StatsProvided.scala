package typings.reactInstantsearchCore.mod

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
    val __obj = js.Dynamic.literal(nbHits = nbHits.asInstanceOf[js.Any], processingTimeMS = processingTimeMS.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StatsProvided]
  }
}

