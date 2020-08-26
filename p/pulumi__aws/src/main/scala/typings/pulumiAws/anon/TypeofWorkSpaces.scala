package typings.pulumiAws.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofWorkSpaces extends js.Object {
  val Types: this.type = js.native
}

object TypeofWorkSpaces {
  @scala.inline
  def apply(Types: TypeofWorkSpaces): TypeofWorkSpaces = {
    val __obj = js.Dynamic.literal(Types = Types.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofWorkSpaces]
  }
  @scala.inline
  implicit class TypeofWorkSpacesOps[Self <: TypeofWorkSpaces] (val x: Self) extends AnyVal {
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
    def setTypes(value: TypeofWorkSpaces): Self = this.set("Types", value.asInstanceOf[js.Any])
  }
  
}

