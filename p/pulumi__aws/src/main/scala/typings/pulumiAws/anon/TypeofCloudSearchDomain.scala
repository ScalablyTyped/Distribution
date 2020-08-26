package typings.pulumiAws.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofCloudSearchDomain extends js.Object {
  val Types: this.type = js.native
}

object TypeofCloudSearchDomain {
  @scala.inline
  def apply(Types: TypeofCloudSearchDomain): TypeofCloudSearchDomain = {
    val __obj = js.Dynamic.literal(Types = Types.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCloudSearchDomain]
  }
  @scala.inline
  implicit class TypeofCloudSearchDomainOps[Self <: TypeofCloudSearchDomain] (val x: Self) extends AnyVal {
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
    def setTypes(value: TypeofCloudSearchDomain): Self = this.set("Types", value.asInstanceOf[js.Any])
  }
  
}

