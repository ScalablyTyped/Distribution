package typings.raygun

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Model extends js.Object {
  var model: String
  var speed: Double
  var times: Anon_Idle
}

object Anon_Model {
  @scala.inline
  def apply(model: String, speed: Double, times: Anon_Idle): Anon_Model = {
    val __obj = js.Dynamic.literal(model = model, speed = speed, times = times)
  
    __obj.asInstanceOf[Anon_Model]
  }
}

