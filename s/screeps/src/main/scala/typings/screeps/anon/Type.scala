package typings.screeps.anon

import typings.screeps.LookConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Type[K /* <: LookConstant */] extends js.Object {
  var `type`: K = js.native
}

object Type {
  @scala.inline
  def apply[/* <: typings.screeps.LookConstant */ K](`type`: K): Type[K] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type[K]]
  }
  @scala.inline
  implicit class TypeOps[Self <: Type[_], /* <: typings.screeps.LookConstant */ K] (val x: Self with Type[K]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(value: K): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

