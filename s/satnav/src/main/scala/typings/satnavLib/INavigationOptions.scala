package typings
package satnavLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INavigationOptions extends js.Object {
  var directions: js.UndefOr[js.Function1[/* params */ js.Any, _]] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String | Callback] = js.undefined
}

object INavigationOptions {
  @scala.inline
  def apply(
    directions: /* params */ js.Any => _ = null,
    path: java.lang.String = null,
    title: java.lang.String | Callback = null
  ): INavigationOptions = {
    val __obj = js.Dynamic.literal()
    if (directions != null) __obj.updateDynamic("directions")(js.Any.fromFunction1(directions))
    if (path != null) __obj.updateDynamic("path")(path)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[INavigationOptions]
  }
}

