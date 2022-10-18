package typings.snyk

import typings.snyk.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibSubProcessMod {
  
  @JSImport("snyk/dist/lib/sub-process", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def execute(command: String, args: js.Array[String]): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("execute")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def execute(command: String, args: js.Array[String], options: `0`): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("execute")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
