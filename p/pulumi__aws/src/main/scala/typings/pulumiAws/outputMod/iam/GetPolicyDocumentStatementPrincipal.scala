package typings.pulumiAws.outputMod.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPolicyDocumentStatementPrincipal extends js.Object {
  
  /**
    * List of identifiers for principals. When `type`
    * is "AWS", these are IAM user or role ARNs.  When `type` is "Service", these are AWS Service roles e.g. `lambda.amazonaws.com`. When `type` is "Federated", these are web identity users or SAML provider ARNs.
    */
  var identifiers: js.Array[String] = js.native
  
  /**
    * The type of principal. For AWS ARNs this is "AWS".  For AWS services (e.g. Lambda), this is "Service". For Federated access the type is "Federated".
    */
  var `type`: String = js.native
}
object GetPolicyDocumentStatementPrincipal {
  
  @scala.inline
  def apply(identifiers: js.Array[String], `type`: String): GetPolicyDocumentStatementPrincipal = {
    val __obj = js.Dynamic.literal(identifiers = identifiers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPolicyDocumentStatementPrincipal]
  }
  
  @scala.inline
  implicit class GetPolicyDocumentStatementPrincipalOps[Self <: GetPolicyDocumentStatementPrincipal] (val x: Self) extends AnyVal {
    
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
    def setIdentifiersVarargs(value: String*): Self = this.set("identifiers", js.Array(value :_*))
    
    @scala.inline
    def setIdentifiers(value: js.Array[String]): Self = this.set("identifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
