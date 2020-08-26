package typings.pulumiAws.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofCloudHSMV2 extends js.Object {
  val Types: this.type = js.native
}

object TypeofCloudHSMV2 {
  @scala.inline
  def apply(Types: TypeofCloudHSMV2): TypeofCloudHSMV2 = {
    val __obj = js.Dynamic.literal(Types = Types.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCloudHSMV2]
  }
  @scala.inline
  implicit class TypeofCloudHSMV2Ops[Self <: TypeofCloudHSMV2] (val x: Self) extends AnyVal {
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
    def setTypes(value: TypeofCloudHSMV2): Self = this.set("Types", value.asInstanceOf[js.Any])
  }
  
}

