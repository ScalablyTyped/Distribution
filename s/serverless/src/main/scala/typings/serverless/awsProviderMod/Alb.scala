package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alb extends js.Object {
  var authorizers: js.UndefOr[Authorizers] = js.undefined
  var targetGroupPrefix: js.UndefOr[String] = js.undefined
}

object Alb {
  @scala.inline
  def apply(authorizers: Authorizers = null, targetGroupPrefix: String = null): Alb = {
    val __obj = js.Dynamic.literal()
    if (authorizers != null) __obj.updateDynamic("authorizers")(authorizers.asInstanceOf[js.Any])
    if (targetGroupPrefix != null) __obj.updateDynamic("targetGroupPrefix")(targetGroupPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alb]
  }
}

