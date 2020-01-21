package typings.recharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceDotAxisConfiguration extends js.Object {
  var scale: ScaleCalculator
}

object ReferenceDotAxisConfiguration {
  @scala.inline
  def apply(scale: /* x */ Double | String => Double): ReferenceDotAxisConfiguration = {
    val __obj = js.Dynamic.literal(scale = js.Any.fromFunction1(scale))
  
    __obj.asInstanceOf[ReferenceDotAxisConfiguration]
  }
}

