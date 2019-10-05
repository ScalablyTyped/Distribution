package typings.atPulumiAws.typesOutputMod.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPolicyDocumentStatementPrincipal extends js.Object {
  /**
    * List of identifiers for principals. When `type`
    * is "AWS", these are IAM user or role ARNs.  When `type` is "Service", these are AWS Service roles e.g. `lambda.amazonaws.com`.
    */
  var identifiers: js.Array[String]
  /**
    * The type of principal. For AWS ARNs this is "AWS".  For AWS services (e.g. Lambda), this is "Service".
    */
  var `type`: String
}

object GetPolicyDocumentStatementPrincipal {
  @scala.inline
  def apply(identifiers: js.Array[String], `type`: String): GetPolicyDocumentStatementPrincipal = {
    val __obj = js.Dynamic.literal(identifiers = identifiers)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GetPolicyDocumentStatementPrincipal]
  }
}

