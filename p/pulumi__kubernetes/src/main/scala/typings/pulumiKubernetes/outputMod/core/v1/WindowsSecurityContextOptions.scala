package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * WindowsSecurityContextOptions contain Windows-specific options and credentials.
  */
trait WindowsSecurityContextOptions extends StObject {
  
  /**
    * GMSACredentialSpec is where the GMSA admission webhook (https://github.com/kubernetes-sigs/windows-gmsa) inlines the contents of the GMSA credential spec named by the GMSACredentialSpecName field.
    */
  var gmsaCredentialSpec: String
  
  /**
    * GMSACredentialSpecName is the name of the GMSA credential spec to use.
    */
  var gmsaCredentialSpecName: String
  
  /**
    * The UserName in Windows to run the entrypoint of the container process. Defaults to the user specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
    */
  var runAsUserName: String
}
object WindowsSecurityContextOptions {
  
  @scala.inline
  def apply(gmsaCredentialSpec: String, gmsaCredentialSpecName: String, runAsUserName: String): WindowsSecurityContextOptions = {
    val __obj = js.Dynamic.literal(gmsaCredentialSpec = gmsaCredentialSpec.asInstanceOf[js.Any], gmsaCredentialSpecName = gmsaCredentialSpecName.asInstanceOf[js.Any], runAsUserName = runAsUserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsSecurityContextOptions]
  }
  
  @scala.inline
  implicit class WindowsSecurityContextOptionsMutableBuilder[Self <: WindowsSecurityContextOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGmsaCredentialSpec(value: String): Self = StObject.set(x, "gmsaCredentialSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGmsaCredentialSpecName(value: String): Self = StObject.set(x, "gmsaCredentialSpecName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunAsUserName(value: String): Self = StObject.set(x, "runAsUserName", value.asInstanceOf[js.Any])
  }
}
