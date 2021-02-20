package typings.stellarBase.anon

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeIdSignature extends StObject {
  
  var nodeId: typings.stellarBase.xdrMod.xdr.NodeId = js.native
  
  var signature: Buffer = js.native
}
object NodeIdSignature {
  
  @scala.inline
  def apply(nodeId: typings.stellarBase.xdrMod.xdr.NodeId, signature: Buffer): NodeIdSignature = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeIdSignature]
  }
  
  @scala.inline
  implicit class NodeIdSignatureMutableBuilder[Self <: NodeIdSignature] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeId(value: typings.stellarBase.xdrMod.xdr.NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignature(value: Buffer): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
  }
}
