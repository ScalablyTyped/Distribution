package typings.sqlJs.moduleMod.SqlJs

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SqlJsStatic extends js.Object {
  var Database: Instantiable0[typings.sqlJs.moduleMod.SqlJs.Database]
  var Statement: Instantiable0[typings.sqlJs.moduleMod.SqlJs.Statement]
}

object SqlJsStatic {
  @scala.inline
  def apply(Database: Instantiable0[Database], Statement: Instantiable0[Statement]): SqlJsStatic = {
    val __obj = js.Dynamic.literal(Database = Database.asInstanceOf[js.Any], Statement = Statement.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SqlJsStatic]
  }
}

