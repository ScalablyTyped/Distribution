package typings.pulumiAws.anon

import org.scalablytyped.runtime.Instantiable0
import typings.awsSdk.mod.Polly.Presigner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofPolly extends js.Object {
  val Presigner: Instantiable0[typings.awsSdk.mod.Polly.Presigner] = js.native
  val Types: this.type = js.native
}

object TypeofPolly {
  @scala.inline
  def apply(Presigner: Instantiable0[Presigner], Types: TypeofPolly): TypeofPolly = {
    val __obj = js.Dynamic.literal(Presigner = Presigner.asInstanceOf[js.Any], Types = Types.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPolly]
  }
  @scala.inline
  implicit class TypeofPollyOps[Self <: TypeofPolly] (val x: Self) extends AnyVal {
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
    def setPresigner(value: Instantiable0[Presigner]): Self = this.set("Presigner", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypes(value: TypeofPolly): Self = this.set("Types", value.asInstanceOf[js.Any])
  }
  
}

