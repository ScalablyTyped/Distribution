package typings.reactElemental.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bold extends js.Object {
  val bold: js.UndefOr[String] = js.undefined
  val regular: js.UndefOr[String] = js.undefined
}

object Bold {
  @scala.inline
  def apply(bold: String = null, regular: String = null): Bold = {
    val __obj = js.Dynamic.literal()
    if (bold != null) __obj.updateDynamic("bold")(bold.asInstanceOf[js.Any])
    if (regular != null) __obj.updateDynamic("regular")(regular.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bold]
  }
}

