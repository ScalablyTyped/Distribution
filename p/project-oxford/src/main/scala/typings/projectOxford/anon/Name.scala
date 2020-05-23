package typings.projectOxford.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var name: String
  var score: Double
}

object Name {
  @scala.inline
  def apply(name: String, score: Double): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

