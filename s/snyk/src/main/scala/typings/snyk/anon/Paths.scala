package typings.snyk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Paths extends StObject {
  
  var meta: Days
  
  var paths: js.Array[js.Array[String]]
}
object Paths {
  
  inline def apply(meta: Days, paths: js.Array[js.Array[String]]): Paths = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[Paths]
  }
  
  extension [Self <: Paths](x: Self) {
    
    inline def setMeta(value: Days): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setPaths(value: js.Array[js.Array[String]]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsVarargs(value: js.Array[String]*): Self = StObject.set(x, "paths", js.Array(value*))
  }
}
