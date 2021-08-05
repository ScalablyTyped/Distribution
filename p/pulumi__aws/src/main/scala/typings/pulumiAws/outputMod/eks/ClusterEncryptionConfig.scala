package typings.pulumiAws.outputMod.eks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterEncryptionConfig extends StObject {
  
  /**
    * Configuration block with provider for encryption. Detailed below.
    */
  var provider: ClusterEncryptionConfigProvider
  
  /**
    * List of strings with resources to be encrypted. Valid values: `secrets`
    */
  var resources: js.Array[String]
}
object ClusterEncryptionConfig {
  
  inline def apply(provider: ClusterEncryptionConfigProvider, resources: js.Array[String]): ClusterEncryptionConfig = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterEncryptionConfig]
  }
  
  extension [Self <: ClusterEncryptionConfig](x: Self) {
    
    inline def setProvider(value: ClusterEncryptionConfigProvider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value :_*))
  }
}
