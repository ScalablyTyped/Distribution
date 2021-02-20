package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * WindowsSecurityContextOptions contain Windows-specific options and credentials.
  */
@js.native
trait WindowsSecurityContextOptions extends StObject {
  
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
  implicit class WindowsSecurityContextOptionsMutableBuilder[Self <: WindowsSecurityContextOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGmsaCredentialSpec(value: Input[String]): Self = StObject.set(x, "gmsaCredentialSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGmsaCredentialSpecName(value: Input[String]): Self = StObject.set(x, "gmsaCredentialSpecName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGmsaCredentialSpecNameUndefined: Self = StObject.set(x, "gmsaCredentialSpecName", js.undefined)
    
    @scala.inline
    def setGmsaCredentialSpecUndefined: Self = StObject.set(x, "gmsaCredentialSpec", js.undefined)
    
    @scala.inline
    def setRunAsUserName(value: Input[String]): Self = StObject.set(x, "runAsUserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunAsUserNameUndefined: Self = StObject.set(x, "runAsUserName", js.undefined)
  }
}
