package typings.reactMedia

import typings.react.mod.ReactNode
import typings.reactMedia.mod.MediaQueryValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildrenDefaultMatches extends js.Object {
  var children: js.UndefOr[(js.Function1[/* matches */ Boolean, ReactNode]) | ReactNode] = js.undefined
  var defaultMatches: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* matches */ Boolean, Unit]] = js.undefined
  var query: MediaQueryValue
}

object AnonChildrenDefaultMatches {
  @scala.inline
  def apply(
    query: MediaQueryValue,
    children: (js.Function1[/* matches */ Boolean, ReactNode]) | ReactNode = null,
    defaultMatches: js.UndefOr[Boolean] = js.undefined,
    onChange: /* matches */ Boolean => Unit = null
  ): AnonChildrenDefaultMatches = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultMatches)) __obj.updateDynamic("defaultMatches")(defaultMatches.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[AnonChildrenDefaultMatches]
  }
}

