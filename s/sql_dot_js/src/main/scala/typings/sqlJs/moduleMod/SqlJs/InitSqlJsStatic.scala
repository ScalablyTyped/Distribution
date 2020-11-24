package typings.sqlJs.moduleMod.SqlJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitSqlJsStatic
  extends js.Function {
  
  def apply(): js.Promise[SqlJsStatic] = js.native
  def apply(config: Config): js.Promise[SqlJsStatic] = js.native
  
  val default: this.type = js.native
}
