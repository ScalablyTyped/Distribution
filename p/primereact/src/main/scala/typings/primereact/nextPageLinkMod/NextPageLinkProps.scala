package typings.primereact.nextPageLinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NextPageLinkProps extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object NextPageLinkProps {
  @scala.inline
  def apply(disabled: js.UndefOr[Boolean] = js.undefined, onClick: () => Unit = null): NextPageLinkProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    __obj.asInstanceOf[NextPageLinkProps]
  }
}

