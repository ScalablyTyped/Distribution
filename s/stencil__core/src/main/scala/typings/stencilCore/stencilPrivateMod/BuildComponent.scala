package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildComponent extends StObject {
  
  var dependencies: js.UndefOr[js.Array[String]] = js.undefined
  
  var dependencyOf: js.UndefOr[js.Array[String]] = js.undefined
  
  var tag: String
}
object BuildComponent {
  
  inline def apply(tag: String): BuildComponent = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildComponent]
  }
  
  extension [Self <: BuildComponent](x: Self) {
    
    inline def setDependencies(value: js.Array[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setDependenciesVarargs(value: String*): Self = StObject.set(x, "dependencies", js.Array(value*))
    
    inline def setDependencyOf(value: js.Array[String]): Self = StObject.set(x, "dependencyOf", value.asInstanceOf[js.Any])
    
    inline def setDependencyOfUndefined: Self = StObject.set(x, "dependencyOf", js.undefined)
    
    inline def setDependencyOfVarargs(value: String*): Self = StObject.set(x, "dependencyOf", js.Array(value*))
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
