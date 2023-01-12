package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import typings.schematicsAngular.schematicsAngularBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScopedEmitHelper
  extends StObject
     with EmitHelperBase
     with EmitHelper {
  
  @JSName("scoped")
  val scoped_ScopedEmitHelper: `true`
}
object ScopedEmitHelper {
  
  inline def apply(
    name: java.lang.String,
    text: java.lang.String | (js.Function1[/* node */ EmitHelperUniqueNameCallback, java.lang.String])
  ): ScopedEmitHelper = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], scoped = true, text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopedEmitHelper]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScopedEmitHelper] (val x: Self) extends AnyVal {
    
    inline def setScoped(value: `true`): Self = StObject.set(x, "scoped", value.asInstanceOf[js.Any])
  }
}
