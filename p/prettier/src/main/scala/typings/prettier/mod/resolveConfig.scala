package typings.prettier.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prettier", "resolveConfig")
@js.native
object resolveConfig extends js.Object {
  
  def apply(filePath: String): js.Promise[Null | Options] = js.native
  def apply(filePath: String, options: ResolveConfigOptions): js.Promise[Null | Options] = js.native
  
  def sync(filePath: String): Null | Options = js.native
  def sync(filePath: String, options: ResolveConfigOptions): Null | Options = js.native
}
