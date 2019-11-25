package typings.atStorybookAddons

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Base extends js.Object {
  var base: String
  var brandTitle: js.UndefOr[String] = js.undefined
}

object Anon_Base {
  @scala.inline
  def apply(base: String, brandTitle: String = null): Anon_Base = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any])
    if (brandTitle != null) __obj.updateDynamic("brandTitle")(brandTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Base]
  }
}

