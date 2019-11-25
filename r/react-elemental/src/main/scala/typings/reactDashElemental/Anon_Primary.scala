package typings.reactDashElemental

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Primary extends js.Object {
  val primary: js.UndefOr[Anon_Bold] = js.undefined
  val secondary: js.UndefOr[Anon_Bold] = js.undefined
}

object Anon_Primary {
  @scala.inline
  def apply(primary: Anon_Bold = null, secondary: Anon_Bold = null): Anon_Primary = {
    val __obj = js.Dynamic.literal()
    if (primary != null) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (secondary != null) __obj.updateDynamic("secondary")(secondary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Primary]
  }
}

