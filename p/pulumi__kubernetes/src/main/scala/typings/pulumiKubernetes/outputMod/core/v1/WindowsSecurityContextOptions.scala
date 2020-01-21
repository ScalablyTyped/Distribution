package typings.pulumiKubernetes.outputMod.core.v1

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
  /**
    * The UserName in Windows to run the entrypoint of the container process. Defaults to the
    * user specified in image metadata if unspecified. May also be set in PodSecurityContext. If
    * set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext
    * takes precedence. This field is beta-level and may be disabled with the
    * WindowsRunAsUserName feature flag.
    */
  val runAsUserName: String
}

object WindowsSecurityContextOptions {
  @scala.inline
  def apply(gmsaCredentialSpec: String, gmsaCredentialSpecName: String, runAsUserName: String): WindowsSecurityContextOptions = {
    val __obj = js.Dynamic.literal(gmsaCredentialSpec = gmsaCredentialSpec.asInstanceOf[js.Any], gmsaCredentialSpecName = gmsaCredentialSpecName.asInstanceOf[js.Any], runAsUserName = runAsUserName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WindowsSecurityContextOptions]
  }
}

