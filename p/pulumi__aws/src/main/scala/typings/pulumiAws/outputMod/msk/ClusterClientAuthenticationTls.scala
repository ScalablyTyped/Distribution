package typings.pulumiAws.outputMod.msk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterClientAuthenticationTls extends StObject {
  
  /**
    * List of ACM Certificate Authority Amazon Resource Names (ARNs).
    */
  var certificateAuthorityArns: js.UndefOr[js.Array[String]] = js.native
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
    def setCertificateAuthorityArns(value: js.Array[String]): Self = StObject.set(x, "certificateAuthorityArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateAuthorityArnsUndefined: Self = StObject.set(x, "certificateAuthorityArns", js.undefined)
    
    @scala.inline
    def setCertificateAuthorityArnsVarargs(value: String*): Self = StObject.set(x, "certificateAuthorityArns", js.Array(value :_*))
  }
}
