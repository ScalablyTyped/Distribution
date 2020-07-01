package typings.screeps.anon

import typings.screeps.LookConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type[K /* <: LookConstant */] extends js.Object {
  var `type`: K
}

object Type {
  @scala.inline
  def apply[/* <: typings.screeps.LookConstant */ K](`type`: K): Type[K] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type[K]]
  }
}

