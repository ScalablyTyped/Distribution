package typings
package reactDashShareLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Title extends js.Object {
  /** Title of the shared page */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Title {
  @scala.inline
  def apply(title: java.lang.String = null): Anon_Title = {
    val __obj = js.Dynamic.literal()
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_Title]
  }
}

