package typings.snyk

import typings.snyk.distCliCommandsTypesMod.MethodResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsIgnoreMod {
  
  @JSImport("snyk/dist/cli/commands/ignore", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: Any): js.Promise[MethodResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MethodResult]]
  
  inline def excludeFilePathPattern(options: Any): js.Promise[MethodResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("excludeFilePathPattern")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MethodResult]]
  
  inline def ignoreIssue(options: Any): js.Promise[MethodResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("ignoreIssue")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MethodResult]]
}
