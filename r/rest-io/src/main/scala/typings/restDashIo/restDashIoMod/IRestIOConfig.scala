package typings.restDashIo.restDashIoMod

import typings.mongoose.mongooseMod.Mongoose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRestIOConfig extends js.Object {
  var db: js.UndefOr[Mongoose] = js.undefined
  var resources: String
}

object IRestIOConfig {
  @scala.inline
  def apply(resources: String, db: Mongoose = null): IRestIOConfig = {
    val __obj = js.Dynamic.literal(resources = resources)
    if (db != null) __obj.updateDynamic("db")(db)
    __obj.asInstanceOf[IRestIOConfig]
  }
}

