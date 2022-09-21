package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionDependencyManifest extends StObject {
  
  var name: String
  
  var tags: js.Array[String]
}
object CollectionDependencyManifest {
  
  inline def apply(name: String, tags: js.Array[String]): CollectionDependencyManifest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionDependencyManifest]
  }
  
  extension [Self <: CollectionDependencyManifest](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
