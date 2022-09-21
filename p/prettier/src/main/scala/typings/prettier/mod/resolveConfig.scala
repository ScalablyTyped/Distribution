package typings.prettier.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolveConfig {
  
  inline def apply(filePath: String): js.Promise[Options | Null] = ^.asInstanceOf[js.Dynamic].apply(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Options | Null]]
  inline def apply(filePath: String, options: ResolveConfigOptions): js.Promise[Options | Null] = (^.asInstanceOf[js.Dynamic].apply(filePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Options | Null]]
  
  @JSImport("prettier", "resolveConfig")
  @js.native
  val ^ : js.Any = js.native
  
  inline def sync(filePath: String): Options | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(filePath.asInstanceOf[js.Any]).asInstanceOf[Options | Null]
  inline def sync(filePath: String, options: ResolveConfigOptions): Options | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(filePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Options | Null]
}
