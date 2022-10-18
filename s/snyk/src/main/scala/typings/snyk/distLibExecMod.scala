package typings.snyk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibExecMod {
  
  @JSImport("snyk/dist/lib/exec", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def executeCommand(cmd: Any, root: Any): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeCommand")(cmd.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
}
