package typings.pulumiAws.outputMod.eks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetClusterCertificateAuthority extends StObject {
  
  /**
    * The base64 encoded certificate data required to communicate with your cluster. Add this to the `certificate-authority-data` section of the `kubeconfig` file for your cluster.
    */
  var data: String = js.native
}
object GetClusterCertificateAuthority {
  
  @scala.inline
  def apply(data: String): GetClusterCertificateAuthority = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClusterCertificateAuthority]
  }
  
  @scala.inline
  implicit class GetClusterCertificateAuthorityMutableBuilder[Self <: GetClusterCertificateAuthority] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
