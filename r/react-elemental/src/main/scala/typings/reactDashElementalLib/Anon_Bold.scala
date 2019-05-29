package typings
package reactDashElementalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bold extends js.Object {
  val bold: js.UndefOr[java.lang.String] = js.undefined
  val regular: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Bold {
  @scala.inline
  def apply(bold: java.lang.String = null, regular: java.lang.String = null): Anon_Bold = {
    val __obj = js.Dynamic.literal()
    if (bold != null) __obj.updateDynamic("bold")(bold)
    if (regular != null) __obj.updateDynamic("regular")(regular)
    __obj.asInstanceOf[Anon_Bold]
  }
}

