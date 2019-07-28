package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Continuous extends js.Object {
  var continuous: js.UndefOr[String] = js.undefined
  var oneTime: js.UndefOr[String] = js.undefined
}

object Anon_Continuous {
  @scala.inline
  def apply(continuous: String = null, oneTime: String = null): Anon_Continuous = {
    val __obj = js.Dynamic.literal()
    if (continuous != null) __obj.updateDynamic("continuous")(continuous)
    if (oneTime != null) __obj.updateDynamic("oneTime")(oneTime)
    __obj.asInstanceOf[Anon_Continuous]
  }
}

