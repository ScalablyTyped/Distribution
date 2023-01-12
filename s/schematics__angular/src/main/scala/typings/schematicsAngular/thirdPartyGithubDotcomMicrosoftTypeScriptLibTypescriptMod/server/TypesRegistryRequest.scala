package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.server

import typings.schematicsAngular.schematicsAngularStrings.typesRegistry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypesRegistryRequest extends StObject {
  
  val kind: typesRegistry
}
object TypesRegistryRequest {
  
  inline def apply(): TypesRegistryRequest = {
    val __obj = js.Dynamic.literal(kind = "typesRegistry")
    __obj.asInstanceOf[TypesRegistryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypesRegistryRequest] (val x: Self) extends AnyVal {
    
    inline def setKind(value: typesRegistry): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
