package typings.reactScriptHook

import typings.reactScriptHook.useScriptMod.ErrorState
import typings.reactScriptHook.useScriptMod.ScriptProps
import typings.reactScriptHook.useScriptMod.ScriptStatusMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-script-hook", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasSrcCheckForExistingAttributes: ScriptProps): js.Tuple2[Boolean, ErrorState] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasSrcCheckForExistingAttributes.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Boolean, ErrorState]]
  
  @JSImport("react-script-hook", "scripts")
  @js.native
  val scripts: ScriptStatusMap = js.native
}
