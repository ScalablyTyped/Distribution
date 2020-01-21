package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType[K /* <: LookConstant */] extends js.Object {
  var `type`: K
}

object AnonType {
  @scala.inline
  def apply[K /* <: LookConstant */](`type`: K): AnonType[K] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType[K]]
  }
}

