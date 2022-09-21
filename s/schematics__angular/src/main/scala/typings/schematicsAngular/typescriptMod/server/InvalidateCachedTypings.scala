package typings.schematicsAngular.typescriptMod.server

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvalidateCachedTypings
  extends StObject
     with ProjectResponse {
  
  @JSName("kind")
  val kind_InvalidateCachedTypings: ActionInvalidate
}
object InvalidateCachedTypings {
  
  inline def apply(kind: ActionInvalidate, projectName: String): InvalidateCachedTypings = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidateCachedTypings]
  }
  
  extension [Self <: InvalidateCachedTypings](x: Self) {
    
    inline def setKind(value: ActionInvalidate): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
