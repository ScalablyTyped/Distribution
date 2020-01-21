package typings.sqlJs.moduleMod.SqlJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitSqlJsStatic
  extends js.Function {
  val default: this.type = js.native
  def apply(): js.Promise[SqlJsStatic] = js.native
  def apply(config: Config): js.Promise[SqlJsStatic] = js.native
}

