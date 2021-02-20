package typings.relayRuntime.normalizationNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NormalizationConnection extends StObject {
  
  var args: js.Array[NormalizationArgument] = js.native
  
  var edges: NormalizationLinkedField = js.native
  
  var kind: String = js.native
  
  var label: String = js.native
  
  var name: String = js.native
  
  var pageInfo: NormalizationLinkedField = js.native
}
object NormalizationConnection {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class NormalizationConnectionMutableBuilder[Self <: NormalizationConnection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Array[NormalizationArgument]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsVarargs(value: NormalizationArgument*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setEdges(value: NormalizationLinkedField): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageInfo(value: NormalizationLinkedField): Self = StObject.set(x, "pageInfo", value.asInstanceOf[js.Any])
  }
}
