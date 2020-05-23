package typings.primereact.listBoxHeaderMod

import typings.primereact.anon.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBoxHeaderProps extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var filter: js.UndefOr[String] = js.undefined
  var onFilter: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.undefined
}

object ListBoxHeaderProps {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    filter: String = null,
    onFilter: /* e */ Value => Unit = null
  ): ListBoxHeaderProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (onFilter != null) __obj.updateDynamic("onFilter")(js.Any.fromFunction1(onFilter))
    __obj.asInstanceOf[ListBoxHeaderProps]
  }
}

