package typings.reactScriptHook

import typings.reactScriptHook.libUseScriptMod.ErrorState
import typings.reactScriptHook.libUseScriptMod.ScriptProps
import typings.reactScriptHook.libUseScriptMod.ScriptStatusMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-script-hook", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: ScriptProps): js.Tuple2[Boolean, ErrorState] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Boolean, ErrorState]]
  
  @JSImport("react-script-hook", "scripts")
  @js.native
  val scripts: ScriptStatusMap = js.native
}
