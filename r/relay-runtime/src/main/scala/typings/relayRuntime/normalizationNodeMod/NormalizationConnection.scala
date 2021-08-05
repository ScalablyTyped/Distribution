package typings.relayRuntime.normalizationNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NormalizationConnection extends StObject {
  
  var args: js.Array[NormalizationArgument]
  
  var edges: NormalizationLinkedField
  
  var kind: String
  
  var label: String
  
  var name: String
  
  var pageInfo: NormalizationLinkedField
}
object NormalizationConnection {
  
  inline def apply(
    args: js.Array[NormalizationArgument],
    edges: NormalizationLinkedField,
    kind: String,
    label: String,
    name: String,
    pageInfo: NormalizationLinkedField
  ): NormalizationConnection = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], edges = edges.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pageInfo = pageInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationConnection]
  }
  
  extension [Self <: NormalizationConnection](x: Self) {
    
    inline def setArgs(value: js.Array[NormalizationArgument]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: NormalizationArgument*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    inline def setEdges(value: NormalizationLinkedField): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPageInfo(value: NormalizationLinkedField): Self = StObject.set(x, "pageInfo", value.asInstanceOf[js.Any])
  }
}
