package typings
package atPulumiAwsLib.iamDocumentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyDocument extends js.Object {
  var Id: js.UndefOr[java.lang.String] = js.undefined
  var Statement: js.Array[PolicyStatement]
  var Version: atPulumiAwsLib.atPulumiAwsLibStrings.`2008-10-17` | atPulumiAwsLib.atPulumiAwsLibStrings.`2012-10-17`
}

object PolicyDocument {
  @scala.inline
  def apply(
    Statement: js.Array[PolicyStatement],
    Version: atPulumiAwsLib.atPulumiAwsLibStrings.`2008-10-17` | atPulumiAwsLib.atPulumiAwsLibStrings.`2012-10-17`,
    Id: java.lang.String = null
  ): PolicyDocument = {
    val __obj = js.Dynamic.literal(Statement = Statement, Version = Version.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id)
    __obj.asInstanceOf[PolicyDocument]
  }
}

