package typings
package router5DashTransitionDashPathLib.typesTransitionPathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionPath extends js.Object {
  var intersection: java.lang.String
  var toActivate: js.Array[java.lang.String]
  var toDeactivate: js.Array[java.lang.String]
}

object TransitionPath {
  @scala.inline
  def apply(
    intersection: java.lang.String,
    toActivate: js.Array[java.lang.String],
    toDeactivate: js.Array[java.lang.String]
  ): TransitionPath = {
    val __obj = js.Dynamic.literal(intersection = intersection, toActivate = toActivate, toDeactivate = toDeactivate)
  
    __obj.asInstanceOf[TransitionPath]
  }
}

