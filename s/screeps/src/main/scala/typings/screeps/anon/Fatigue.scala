package typings.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fatigue extends js.Object {
  var fatigue: typings.screeps.screepsNumbers.`2`
}

object Fatigue {
  @scala.inline
  def apply(fatigue: typings.screeps.screepsNumbers.`2`): Fatigue = {
    val __obj = js.Dynamic.literal(fatigue = fatigue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fatigue]
  }
}

