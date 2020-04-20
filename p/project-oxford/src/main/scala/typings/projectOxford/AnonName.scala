package typings.projectOxford

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var name: String
  var score: Double
}

object AnonName {
  @scala.inline
  def apply(name: String, score: Double): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonName]
  }
}

