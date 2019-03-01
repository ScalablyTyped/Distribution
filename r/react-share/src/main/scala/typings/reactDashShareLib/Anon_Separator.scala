package typings
package reactDashShareLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Separator extends js.Object {
  /**
    * Separates title from the url
    * @default ' '
    */
  var separator: js.UndefOr[java.lang.String] = js.undefined
  /** Title of the shared page */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Separator {
  @scala.inline
  def apply(separator: java.lang.String = null, title: java.lang.String = null): Anon_Separator = {
    val __obj = js.Dynamic.literal()
    if (separator != null) __obj.updateDynamic("separator")(separator)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_Separator]
  }
}

