package typings.pulumiAws.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofSageMakerRuntime extends js.Object {
  val Types: this.type = js.native
}

object TypeofSageMakerRuntime {
  @scala.inline
  def apply(Types: TypeofSageMakerRuntime): TypeofSageMakerRuntime = {
    val __obj = js.Dynamic.literal(Types = Types.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSageMakerRuntime]
  }
  @scala.inline
  implicit class TypeofSageMakerRuntimeOps[Self <: TypeofSageMakerRuntime] (val x: Self) extends AnyVal {
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
    def setTypes(value: TypeofSageMakerRuntime): Self = this.set("Types", value.asInstanceOf[js.Any])
  }
  
}

