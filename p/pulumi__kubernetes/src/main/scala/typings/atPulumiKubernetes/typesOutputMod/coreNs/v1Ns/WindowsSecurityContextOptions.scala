package typings.atPulumiKubernetes.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * WindowsSecurityContextOptions contain Windows-specific options and credentials.
  */
trait WindowsSecurityContextOptions extends js.Object {
  /**
    * GMSACredentialSpec is where the GMSA admission webhook
    * (https://github.com/kubernetes-sigs/windows-gmsa) inlines the contents of the GMSA
    * credential spec named by the GMSACredentialSpecName field. This field is alpha-level and is
    * only honored by servers that enable the WindowsGMSA feature flag.
    */
  val gmsaCredentialSpec: String
  /**
    * GMSACredentialSpecName is the name of the GMSA credential spec to use. This field is
    * alpha-level and is only honored by servers that enable the WindowsGMSA feature flag.
    */
  val gmsaCredentialSpecName: String
}

object WindowsSecurityContextOptions {
  @scala.inline
  def apply(gmsaCredentialSpec: String, gmsaCredentialSpecName: String): WindowsSecurityContextOptions = {
    val __obj = js.Dynamic.literal(gmsaCredentialSpec = gmsaCredentialSpec, gmsaCredentialSpecName = gmsaCredentialSpecName)
  
    __obj.asInstanceOf[WindowsSecurityContextOptions]
  }
}

