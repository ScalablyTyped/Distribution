package typings.reactDashMedia

import typings.react.reactMod.ReactNode
import typings.reactDashMedia.reactDashMediaMod.MediaQueryValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenDefaultMatches extends js.Object {
  var children: js.UndefOr[(js.Function1[/* matches */ Boolean, ReactNode]) | ReactNode] = js.undefined
  var defaultMatches: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* matches */ Boolean, Unit]] = js.undefined
  var query: MediaQueryValue
}

object Anon_ChildrenDefaultMatches {
  @scala.inline
  def apply(
    query: MediaQueryValue,
    children: (js.Function1[/* matches */ Boolean, ReactNode]) | ReactNode = null,
    defaultMatches: js.UndefOr[Boolean] = js.undefined,
    onChange: /* matches */ Boolean => Unit = null
  ): Anon_ChildrenDefaultMatches = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultMatches)) __obj.updateDynamic("defaultMatches")(defaultMatches.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[Anon_ChildrenDefaultMatches]
  }
}

