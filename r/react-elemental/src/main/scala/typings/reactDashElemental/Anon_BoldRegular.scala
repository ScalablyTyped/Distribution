package typings.reactDashElemental

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BoldRegular extends js.Object {
  var bold: js.UndefOr[String] = js.undefined
  var regular: js.UndefOr[String] = js.undefined
}

object Anon_BoldRegular {
  @scala.inline
  def apply(bold: String = null, regular: String = null): Anon_BoldRegular = {
    val __obj = js.Dynamic.literal()
    if (bold != null) __obj.updateDynamic("bold")(bold.asInstanceOf[js.Any])
    if (regular != null) __obj.updateDynamic("regular")(regular.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BoldRegular]
  }
}

