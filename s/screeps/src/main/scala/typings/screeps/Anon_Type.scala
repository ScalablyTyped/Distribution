package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Type[K /* <: LookConstant */] extends js.Object {
  var `type`: K
}

object Anon_Type {
  @scala.inline
  def apply[K /* <: LookConstant */](`type`: K): Anon_Type[K] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Type[K]]
  }
}

