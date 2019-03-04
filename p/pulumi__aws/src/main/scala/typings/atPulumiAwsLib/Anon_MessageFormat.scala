package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MessageFormat extends js.Object {
  var messageFormat: js.UndefOr[java.lang.String] = js.undefined
  var roleArn: java.lang.String
  var targetArn: java.lang.String
}

object Anon_MessageFormat {
  @scala.inline
  def apply(roleArn: java.lang.String, targetArn: java.lang.String, messageFormat: java.lang.String = null): Anon_MessageFormat = {
    val __obj = js.Dynamic.literal(roleArn = roleArn, targetArn = targetArn)
    if (messageFormat != null) __obj.updateDynamic("messageFormat")(messageFormat)
    __obj.asInstanceOf[Anon_MessageFormat]
  }
}

