package typings.pulumiAws.outputMod.eks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterCertificateAuthority extends js.Object {
  /**
    * The base64 encoded certificate data required to communicate with your cluster. Add this to the `certificate-authority-data` section of the `kubeconfig` file for your cluster.
    */
  var data: String = js.native
}

object ClusterCertificateAuthority {
  @scala.inline
  def apply(data: String): ClusterCertificateAuthority = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClusterCertificateAuthority]
  }
}

