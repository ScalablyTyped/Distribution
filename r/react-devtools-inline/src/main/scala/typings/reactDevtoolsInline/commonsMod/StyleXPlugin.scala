package typings.reactDevtoolsInline.commonsMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleXPlugin extends StObject {
  
  var resolvedStyles: Record[String, Any]
  
  var sources: js.Array[String]
}
object StyleXPlugin {
  
  inline def apply(resolvedStyles: Record[String, Any], sources: js.Array[String]): StyleXPlugin = {
    val __obj = js.Dynamic.literal(resolvedStyles = resolvedStyles.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleXPlugin]
  }
  
  extension [Self <: StyleXPlugin](x: Self) {
    
    inline def setResolvedStyles(value: Record[String, Any]): Self = StObject.set(x, "resolvedStyles", value.asInstanceOf[js.Any])
    
    inline def setSources(value: js.Array[String]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesVarargs(value: String*): Self = StObject.set(x, "sources", js.Array(value*))
  }
}
