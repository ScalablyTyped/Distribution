package typings
package restDashIoLib.restDashIoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRestIOConfig extends js.Object {
  var db: js.UndefOr[mongooseLib.mongooseMod.Mongoose] = js.undefined
  var resources: java.lang.String
}

object IRestIOConfig {
  @scala.inline
  def apply(resources: java.lang.String, db: mongooseLib.mongooseMod.Mongoose = null): IRestIOConfig = {
    val __obj = js.Dynamic.literal(resources = resources)
    if (db != null) __obj.updateDynamic("db")(db)
    __obj.asInstanceOf[IRestIOConfig]
  }
}

