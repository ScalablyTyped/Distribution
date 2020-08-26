package typings.restIo.mod

import typings.mongoose.mod.Mongoose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRestIOConfig extends js.Object {
  var db: js.UndefOr[Mongoose] = js.native
  var resources: String = js.native
}

object IRestIOConfig {
  @scala.inline
  def apply(resources: String): IRestIOConfig = {
    val __obj = js.Dynamic.literal(resources = resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRestIOConfig]
  }
  @scala.inline
  implicit class IRestIOConfigOps[Self <: IRestIOConfig] (val x: Self) extends AnyVal {
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
    def setResources(value: String): Self = this.set("resources", value.asInstanceOf[js.Any])
    @scala.inline
    def setDb(value: Mongoose): Self = this.set("db", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDb: Self = this.set("db", js.undefined)
  }
  
}

