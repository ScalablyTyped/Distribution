package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntryComponent extends StObject {
  
  var dependencyOf: js.UndefOr[js.Array[String]] = js.undefined
  
  var tag: String
}
object EntryComponent {
  
  inline def apply(tag: String): EntryComponent = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryComponent]
  }
  
  extension [Self <: EntryComponent](x: Self) {
    
    inline def setDependencyOf(value: js.Array[String]): Self = StObject.set(x, "dependencyOf", value.asInstanceOf[js.Any])
    
    inline def setDependencyOfUndefined: Self = StObject.set(x, "dependencyOf", js.undefined)
    
    inline def setDependencyOfVarargs(value: String*): Self = StObject.set(x, "dependencyOf", js.Array(value*))
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
