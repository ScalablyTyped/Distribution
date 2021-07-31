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
  
  @scala.inline
  def apply(provider: ClusterEncryptionConfigProvider, resources: js.Array[String]): ClusterEncryptionConfig = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterEncryptionConfig]
  }
  
  @scala.inline
  implicit class ClusterEncryptionConfigMutableBuilder[Self <: ClusterEncryptionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProvider(value: ClusterEncryptionConfigProvider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value :_*))
  }
}
