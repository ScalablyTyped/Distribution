package typings.sqlJs.moduleMod.SqlJs

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SqlJsStatic extends js.Object {
  var Database: Instantiable0[typings.sqlJs.moduleMod.SqlJs.Database] = js.native
  var Statement: Instantiable0[typings.sqlJs.moduleMod.SqlJs.Statement] = js.native
}

object SqlJsStatic {
  @scala.inline
  def apply(Database: Instantiable0[Database], Statement: Instantiable0[Statement]): SqlJsStatic = {
    val __obj = js.Dynamic.literal(Database = Database.asInstanceOf[js.Any], Statement = Statement.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlJsStatic]
  }
  @scala.inline
  implicit class SqlJsStaticOps[Self <: SqlJsStatic] (val x: Self) extends AnyVal {
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
    def setDatabase(value: Instantiable0[Database]): Self = this.set("Database", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatement(value: Instantiable0[Statement]): Self = this.set("Statement", value.asInstanceOf[js.Any])
  }
  
}

