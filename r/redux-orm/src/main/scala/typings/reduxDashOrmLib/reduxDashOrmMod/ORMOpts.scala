package typings
package reduxDashOrmLib.reduxDashOrmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ORMOpts extends js.Object {
  def createDatabase(schemaSpec: SchemaSpec): js.Any
}

object ORMOpts {
  @scala.inline
  def apply(createDatabase: js.Function1[SchemaSpec, js.Any]): ORMOpts = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createDatabase")(createDatabase)
    __obj.asInstanceOf[ORMOpts]
  }
}

