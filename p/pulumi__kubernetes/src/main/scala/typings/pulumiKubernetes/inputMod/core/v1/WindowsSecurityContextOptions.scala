package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
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
  var gmsaCredentialSpec: js.UndefOr[Input[String]] = js.native
  /**
    * GMSACredentialSpecName is the name of the GMSA credential spec to use.
    */
  var gmsaCredentialSpecName: js.UndefOr[Input[String]] = js.native
  /**
    * The UserName in Windows to run the entrypoint of the container process. Defaults to the user specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
    */
  var runAsUserName: js.UndefOr[Input[String]] = js.native
}

object WindowsSecurityContextOptions {
  @scala.inline
  def apply(): WindowsSecurityContextOptions = {
    val __obj = js.Dynamic.literal()
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
    def setGmsaCredentialSpec(value: Input[String]): Self = this.set("gmsaCredentialSpec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGmsaCredentialSpec: Self = this.set("gmsaCredentialSpec", js.undefined)
    @scala.inline
    def setGmsaCredentialSpecName(value: Input[String]): Self = this.set("gmsaCredentialSpecName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGmsaCredentialSpecName: Self = this.set("gmsaCredentialSpecName", js.undefined)
    @scala.inline
    def setRunAsUserName(value: Input[String]): Self = this.set("runAsUserName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRunAsUserName: Self = this.set("runAsUserName", js.undefined)
  }
  
}

