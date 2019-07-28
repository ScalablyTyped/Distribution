package typings.atPulumiAws.iamDocumentsMod

import typings.atPulumiAws.atPulumiAwsStrings.`2008-10-17`
import typings.atPulumiAws.atPulumiAwsStrings.`2012-10-17`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyDocument extends js.Object {
  var Id: js.UndefOr[String] = js.undefined
  var Statement: js.Array[PolicyStatement]
  var Version: `2008-10-17` | `2012-10-17`
}

object PolicyDocument {
  @scala.inline
  def apply(Statement: js.Array[PolicyStatement], Version: `2008-10-17` | `2012-10-17`, Id: String = null): PolicyDocument = {
    val __obj = js.Dynamic.literal(Statement = Statement, Version = Version.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id)
    __obj.asInstanceOf[PolicyDocument]
  }
}

