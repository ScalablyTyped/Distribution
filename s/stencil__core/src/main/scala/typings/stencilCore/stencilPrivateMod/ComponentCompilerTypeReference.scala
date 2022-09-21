package typings.stencilCore.stencilPrivateMod

import typings.stencilCore.stencilCoreStrings.`import`
import typings.stencilCore.stencilCoreStrings.local
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentCompilerTypeReference extends StObject {
  
  /**
    * A type may be defined:
    * - locally (in the same file as the component that uses it)
    * - globally
    * - by importing it into a file (and is defined elsewhere)
    */
  var location: local | typings.stencilCore.stencilCoreStrings.global | `import`
  
  /**
    * The path to the type reference, if applicable (global types should not need a path associated with them)
    */
  var path: js.UndefOr[String] = js.undefined
}
object ComponentCompilerTypeReference {
  
  inline def apply(location: local | typings.stencilCore.stencilCoreStrings.global | `import`): ComponentCompilerTypeReference = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentCompilerTypeReference]
  }
  
  extension [Self <: ComponentCompilerTypeReference](x: Self) {
    
    inline def setLocation(value: local | typings.stencilCore.stencilCoreStrings.global | `import`): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
