package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ScopedEmitHelper
  - typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.UnscopedEmitHelper
*/
trait EmitHelper extends StObject
object EmitHelper {
  
  inline def ScopedEmitHelper(
    name: java.lang.String,
    text: java.lang.String | (js.Function1[/* node */ EmitHelperUniqueNameCallback, java.lang.String])
  ): typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ScopedEmitHelper = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], scoped = true, text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ScopedEmitHelper]
  }
  
  inline def UnscopedEmitHelper(name: java.lang.String, text: java.lang.String): typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.UnscopedEmitHelper = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], scoped = false, text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.UnscopedEmitHelper]
  }
}
