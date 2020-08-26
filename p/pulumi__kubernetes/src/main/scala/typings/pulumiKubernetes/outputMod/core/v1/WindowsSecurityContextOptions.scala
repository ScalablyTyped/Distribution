package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * WindowsSecurityContextOptions contain Windows-specific options and credentials.
  */
@js.native
trait WindowsSecurityContextOptions extends js.Object {
  /**
    * GMSACredentialSpec is where the GMSA admission webhook (https://github.com/kubernetes-sigs/windows-gmsa) inlines the contents of the GMSA credential spec named by the GMSACredentialSpecName field.
    */
  var gmsaCredentialSpec: String = js.native
  /**
    * GMSACredentialSpecName is the name of the GMSA credential spec to use.
    */
  var gmsaCredentialSpecName: String = js.native
  /**
    * The UserName in Windows to run the entrypoint of the container process. Defaults to the user specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
    */
  var runAsUserName: String = js.native
}

object WindowsSecurityContextOptions {
  @scala.inline
  def apply(gmsaCredentialSpec: String, gmsaCredentialSpecName: String, runAsUserName: String): WindowsSecurityContextOptions = {
    val __obj = js.Dynamic.literal(gmsaCredentialSpec = gmsaCredentialSpec.asInstanceOf[js.Any], gmsaCredentialSpecName = gmsaCredentialSpecName.asInstanceOf[js.Any], runAsUserName = runAsUserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsSecurityContextOptions]
  }
  @scala.inline
  implicit class WindowsSecurityContextOptionsOps[Self <: WindowsSecurityContextOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGmsaCredentialSpec(value: String): Self = this.set("gmsaCredentialSpec", value.asInstanceOf[js.Any])
    @scala.inline
    def setGmsaCredentialSpecName(value: String): Self = this.set("gmsaCredentialSpecName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRunAsUserName(value: String): Self = this.set("runAsUserName", value.asInstanceOf[js.Any])
  }
  
}

