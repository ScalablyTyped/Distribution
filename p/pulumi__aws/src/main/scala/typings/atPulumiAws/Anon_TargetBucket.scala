package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TargetBucket extends js.Object {
  var targetBucket: String
  var targetPrefix: js.UndefOr[String] = js.undefined
}

object Anon_TargetBucket {
  @scala.inline
  def apply(targetBucket: String, targetPrefix: String = null): Anon_TargetBucket = {
    val __obj = js.Dynamic.literal(targetBucket = targetBucket)
    if (targetPrefix != null) __obj.updateDynamic("targetPrefix")(targetPrefix)
    __obj.asInstanceOf[Anon_TargetBucket]
  }
}

