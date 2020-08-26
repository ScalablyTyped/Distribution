package typings.pulumiAws.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofDirectConnect extends js.Object {
  val Types: this.type = js.native
}

object TypeofDirectConnect {
  @scala.inline
  def apply(Types: TypeofDirectConnect): TypeofDirectConnect = {
    val __obj = js.Dynamic.literal(Types = Types.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDirectConnect]
  }
  @scala.inline
  implicit class TypeofDirectConnectOps[Self <: TypeofDirectConnect] (val x: Self) extends AnyVal {
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
    def setTypes(value: TypeofDirectConnect): Self = this.set("Types", value.asInstanceOf[js.Any])
  }
  
}

