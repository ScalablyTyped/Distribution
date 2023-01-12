package typings.schematicsAngular.anon

import typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ModuleKind.CommonJS
import typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ModuleKind.ESNext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImpliedNodeFormat extends StObject {
  
  var impliedNodeFormat: js.UndefOr[ESNext | CommonJS] = js.undefined
}
object ImpliedNodeFormat {
  
  inline def apply(): ImpliedNodeFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImpliedNodeFormat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImpliedNodeFormat] (val x: Self) extends AnyVal {
    
    inline def setImpliedNodeFormat(value: ESNext | CommonJS): Self = StObject.set(x, "impliedNodeFormat", value.asInstanceOf[js.Any])
    
    inline def setImpliedNodeFormatUndefined: Self = StObject.set(x, "impliedNodeFormat", js.undefined)
  }
}
