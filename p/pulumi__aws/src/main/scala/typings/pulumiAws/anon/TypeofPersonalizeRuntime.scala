package typings.pulumiAws.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofPersonalizeRuntime extends js.Object {
  val Types: this.type = js.native
}

object TypeofPersonalizeRuntime {
  @scala.inline
  def apply(Types: TypeofPersonalizeRuntime): TypeofPersonalizeRuntime = {
    val __obj = js.Dynamic.literal(Types = Types.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPersonalizeRuntime]
  }
  @scala.inline
  implicit class TypeofPersonalizeRuntimeOps[Self <: TypeofPersonalizeRuntime] (val x: Self) extends AnyVal {
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
    def setTypes(value: TypeofPersonalizeRuntime): Self = this.set("Types", value.asInstanceOf[js.Any])
  }
  
}

