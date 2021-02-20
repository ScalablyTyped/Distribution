package typings.stellarBase.anon

import typings.node.Buffer
import typings.stellarBase.xdrMod.xdr.TransactionSignaturePayloadTaggedTransaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkId extends StObject {
  
  var networkId: Buffer = js.native
  
  var taggedTransaction: TransactionSignaturePayloadTaggedTransaction = js.native
}
object NetworkId {
  
  @scala.inline
  def apply(networkId: Buffer, taggedTransaction: TransactionSignaturePayloadTaggedTransaction): NetworkId = {
    val __obj = js.Dynamic.literal(networkId = networkId.asInstanceOf[js.Any], taggedTransaction = taggedTransaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkId]
  }
  
  @scala.inline
  implicit class NetworkIdMutableBuilder[Self <: NetworkId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetworkId(value: Buffer): Self = StObject.set(x, "networkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaggedTransaction(value: TransactionSignaturePayloadTaggedTransaction): Self = StObject.set(x, "taggedTransaction", value.asInstanceOf[js.Any])
  }
}
