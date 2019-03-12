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
  def apply(createDatabase: SchemaSpec => js.Any): ORMOpts = {
    val __obj = js.Dynamic.literal(createDatabase = js.Any.fromFunction1(createDatabase))
  
    __obj.asInstanceOf[ORMOpts]
  }
}

