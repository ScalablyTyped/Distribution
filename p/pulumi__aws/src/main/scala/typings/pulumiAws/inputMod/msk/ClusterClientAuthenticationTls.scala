package typings.pulumiAws.inputMod.msk

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterClientAuthenticationTls extends StObject {
  
  /**
    * List of ACM Certificate Authority Amazon Resource Names (ARNs).
    */
  var certificateAuthorityArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}
object ClusterClientAuthenticationTls {
  
  @scala.inline
  def apply(): ClusterClientAuthenticationTls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterClientAuthenticationTls]
  }
  
  @scala.inline
  implicit class ClusterClientAuthenticationTlsMutableBuilder[Self <: ClusterClientAuthenticationTls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateAuthorityArns(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "certificateAuthorityArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateAuthorityArnsUndefined: Self = StObject.set(x, "certificateAuthorityArns", js.undefined)
    
    @scala.inline
    def setCertificateAuthorityArnsVarargs(value: Input[String]*): Self = StObject.set(x, "certificateAuthorityArns", js.Array(value :_*))
  }
}
