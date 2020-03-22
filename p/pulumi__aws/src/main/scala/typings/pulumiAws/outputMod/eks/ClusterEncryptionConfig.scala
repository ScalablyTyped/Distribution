package typings.pulumiAws.outputMod.eks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterEncryptionConfig extends js.Object {
  /**
    * Configuration block with provider for encryption. Detailed below.
    */
  var provider: ClusterEncryptionConfigProvider = js.native
  /**
    * List of strings with resources to be encrypted. Valid values: `secrets`
    */
  var resources: js.Array[String] = js.native
}

object ClusterEncryptionConfig {
  @scala.inline
  def apply(provider: ClusterEncryptionConfigProvider, resources: js.Array[String]): ClusterEncryptionConfig = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClusterEncryptionConfig]
  }
}

