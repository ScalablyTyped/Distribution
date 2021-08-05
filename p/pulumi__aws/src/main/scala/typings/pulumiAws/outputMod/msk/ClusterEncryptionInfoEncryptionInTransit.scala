package typings.pulumiAws.outputMod.msk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterEncryptionInfoEncryptionInTransit extends StObject {
  
  /**
    * Encryption setting for data in transit between clients and brokers. Valid values: `TLS`, `TLS_PLAINTEXT`, and `PLAINTEXT`. Default value is `TLS`.
    */
  var clientBroker: js.UndefOr[String] = js.undefined
  
  /**
    * Whether data communication among broker nodes is encrypted. Default value: `true`.
    */
  var inCluster: js.UndefOr[Boolean] = js.undefined
}
object ClusterEncryptionInfoEncryptionInTransit {
  
  inline def apply(): ClusterEncryptionInfoEncryptionInTransit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterEncryptionInfoEncryptionInTransit]
  }
  
  extension [Self <: ClusterEncryptionInfoEncryptionInTransit](x: Self) {
    
    inline def setClientBroker(value: String): Self = StObject.set(x, "clientBroker", value.asInstanceOf[js.Any])
    
    inline def setClientBrokerUndefined: Self = StObject.set(x, "clientBroker", js.undefined)
    
    inline def setInCluster(value: Boolean): Self = StObject.set(x, "inCluster", value.asInstanceOf[js.Any])
    
    inline def setInClusterUndefined: Self = StObject.set(x, "inCluster", js.undefined)
  }
}
