package typings.router5DashTransitionDashPath.typesTransitionPathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionPath extends js.Object {
  var intersection: String
  var toActivate: js.Array[String]
  var toDeactivate: js.Array[String]
}

object TransitionPath {
  @scala.inline
  def apply(intersection: String, toActivate: js.Array[String], toDeactivate: js.Array[String]): TransitionPath = {
    val __obj = js.Dynamic.literal(intersection = intersection, toActivate = toActivate, toDeactivate = toDeactivate)
  
    __obj.asInstanceOf[TransitionPath]
  }
}

