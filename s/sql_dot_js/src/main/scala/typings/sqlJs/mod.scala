package typings.sqlJs

import org.scalablytyped.runtime.Shortcut
import typings.sqlJs.moduleMod.SqlJs.InitSqlJsStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("sql.js", JSImport.Namespace)
  @js.native
  val ^ : InitSqlJsStatic = js.native
  
  type _To = InitSqlJsStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: InitSqlJsStatic = ^
}
