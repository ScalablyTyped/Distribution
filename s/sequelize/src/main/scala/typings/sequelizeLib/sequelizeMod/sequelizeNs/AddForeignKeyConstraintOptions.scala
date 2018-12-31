package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddForeignKeyConstraintOptions extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onDelete: java.lang.String
  var onUpdate: java.lang.String
  var references: js.UndefOr[sequelizeLib.Anon_Field] = js.undefined
  var `type`: sequelizeLib.sequelizeLibStrings.`foreign key`
}

