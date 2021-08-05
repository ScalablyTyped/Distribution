package typings.prettier.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolveConfig {
  
  inline def apply(filePath: String): js.Promise[Null | Options] = ^.asInstanceOf[js.Dynamic].apply(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Null | Options]]
  inline def apply(filePath: String, options: ResolveConfigOptions): js.Promise[Null | Options] = (^.asInstanceOf[js.Dynamic].apply(filePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Null | Options]]
  
  @JSImport("prettier", "resolveConfig")
  @js.native
  val ^ : js.Any = js.native
  
  inline def sync(filePath: String): Null | Options = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(filePath.asInstanceOf[js.Any]).asInstanceOf[Null | Options]
  inline def sync(filePath: String, options: ResolveConfigOptions): Null | Options = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(filePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Null | Options]
}
