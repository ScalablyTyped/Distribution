package typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod

import typings.react.Event
import typings.react.reactMod.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertModalHeaderProps extends js.Object {
  /**
  	 * Callback function to call prior to closing the Insert Modal window.
  	 */
  var beforeClose: js.UndefOr[js.Function1[/* e */ SyntheticEvent[_, Event], Unit]] = js.undefined
  /**
  	 * Header class name.
  	 */
  var className: js.UndefOr[String] = js.undefined
  /**
  	 * Set to true to hide the close button. Default is false.
  	 */
  var hideClose: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Callback function to call to close the Insert Modal window.
  	 */
  var onModalClose: js.UndefOr[js.Function1[/* closeModal */ js.Function0[Unit], Unit]] = js.undefined
  /**
  	 * Title to display in the header.
  	 */
  var title: js.UndefOr[String] = js.undefined
  /**
  	 * Bootstrap version.
  	 */
  var version: js.UndefOr[BootstrapVersion] = js.undefined
}

object InsertModalHeaderProps {
  @scala.inline
  def apply(
    beforeClose: /* e */ SyntheticEvent[_, Event] => Unit = null,
    className: String = null,
    hideClose: js.UndefOr[Boolean] = js.undefined,
    onModalClose: /* closeModal */ js.Function0[Unit] => Unit = null,
    title: String = null,
    version: BootstrapVersion = null
  ): InsertModalHeaderProps = {
    val __obj = js.Dynamic.literal()
    if (beforeClose != null) __obj.updateDynamic("beforeClose")(js.Any.fromFunction1(beforeClose))
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(hideClose)) __obj.updateDynamic("hideClose")(hideClose)
    if (onModalClose != null) __obj.updateDynamic("onModalClose")(js.Any.fromFunction1(onModalClose))
    if (title != null) __obj.updateDynamic("title")(title)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[InsertModalHeaderProps]
  }
}

