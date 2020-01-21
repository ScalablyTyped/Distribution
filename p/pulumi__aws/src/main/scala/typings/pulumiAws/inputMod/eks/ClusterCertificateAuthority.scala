package typings.pulumiAws.inputMod.eks

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterCertificateAuthority extends js.Object {
  /**
    * The base64 encoded certificate data required to communicate with your cluster. Add this to the `certificate-authority-data` section of the `kubeconfig` file for your cluster.
    */
  var data: js.UndefOr[Input[String]] = js.native
}

object ClusterCertificateAuthority {
  @scala.inline
  def apply(data: Input[String] = null): ClusterCertificateAuthority = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterCertificateAuthority]
  }
}

