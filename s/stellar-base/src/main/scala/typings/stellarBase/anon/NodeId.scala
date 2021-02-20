package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.ScpStatementPledges
import typings.stellarBase.xdrMod.xdr.Uint64
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeId extends StObject {
  
  var nodeId: typings.stellarBase.xdrMod.xdr.NodeId = js.native
  
  var pledges: ScpStatementPledges = js.native
  
  var slotIndex: Uint64 = js.native
}
object NodeId {
  
  @scala.inline
  def apply(nodeId: typings.stellarBase.xdrMod.xdr.NodeId, pledges: ScpStatementPledges, slotIndex: Uint64): NodeId = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any], pledges = pledges.asInstanceOf[js.Any], slotIndex = slotIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeId]
  }
  
  @scala.inline
  implicit class NodeIdMutableBuilder[Self <: NodeId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeId(value: typings.stellarBase.xdrMod.xdr.NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPledges(value: ScpStatementPledges): Self = StObject.set(x, "pledges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotIndex(value: Uint64): Self = StObject.set(x, "slotIndex", value.asInstanceOf[js.Any])
  }
}
