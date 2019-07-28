package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MessageFormat extends js.Object {
  var messageFormat: js.UndefOr[String] = js.undefined
  var roleArn: String
  var targetArn: String
}

object Anon_MessageFormat {
  @scala.inline
  def apply(roleArn: String, targetArn: String, messageFormat: String = null): Anon_MessageFormat = {
    val __obj = js.Dynamic.literal(roleArn = roleArn, targetArn = targetArn)
    if (messageFormat != null) __obj.updateDynamic("messageFormat")(messageFormat)
    __obj.asInstanceOf[Anon_MessageFormat]
  }
}

