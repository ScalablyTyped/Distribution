package typings.relayRuntime.readerNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReaderConnection extends StObject {
  
  val args: js.Array[ReaderArgument]
  
  val edges: ReaderLinkedField
  
  val kind: String
  
  val label: String
  
  val name: String
  
  val pageInfo: ReaderLinkedField
}
object ReaderConnection {
  
  @scala.inline
  def apply(
    args: js.Array[ReaderArgument],
    edges: ReaderLinkedField,
    kind: String,
    label: String,
    name: String,
    pageInfo: ReaderLinkedField
  ): ReaderConnection = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], edges = edges.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pageInfo = pageInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderConnection]
  }
  
  @scala.inline
  implicit class ReaderConnectionMutableBuilder[Self <: ReaderConnection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Array[ReaderArgument]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsVarargs(value: ReaderArgument*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setEdges(value: ReaderLinkedField): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageInfo(value: ReaderLinkedField): Self = StObject.set(x, "pageInfo", value.asInstanceOf[js.Any])
  }
}
