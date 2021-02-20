package typings.prettier.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolveConfig {
  
  @JSImport("prettier", "resolveConfig")
  @js.native
  def apply(filePath: String): js.Promise[Null | Options] = js.native
  @JSImport("prettier", "resolveConfig")
  @js.native
  def apply(filePath: String, options: ResolveConfigOptions): js.Promise[Null | Options] = js.native
  
  @JSImport("prettier", "resolveConfig.sync")
  @js.native
  def sync(filePath: String): Null | Options = js.native
  @JSImport("prettier", "resolveConfig.sync")
  @js.native
  def sync(filePath: String, options: ResolveConfigOptions): Null | Options = js.native
}
