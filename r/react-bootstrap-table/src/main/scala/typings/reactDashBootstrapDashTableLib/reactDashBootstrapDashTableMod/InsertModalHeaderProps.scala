package typings
package reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertModalHeaderProps extends js.Object {
  /**
  	 * Callback function to call prior to closing the Insert Modal window.
  	 */
  var beforeClose: js.UndefOr[
    js.Function1[/* e */ reactLib.reactMod.ReactNs.SyntheticEvent[_, reactLib.Event], scala.Unit]
  ] = js.undefined
  /**
  	 * Header class name.
  	 */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Set to true to hide the close button. Default is false.
  	 */
  var hideClose: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Callback function to call to close the Insert Modal window.
  	 */
  var onModalClose: js.UndefOr[js.Function1[/* closeModal */ js.Function0[scala.Unit], scala.Unit]] = js.undefined
  /**
  	 * Title to display in the header.
  	 */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Bootstrap version.
  	 */
  var version: js.UndefOr[BootstrapVersion] = js.undefined
}

object InsertModalHeaderProps {
  @scala.inline
  def apply(
    beforeClose: js.Function1[/* e */ reactLib.reactMod.ReactNs.SyntheticEvent[_, reactLib.Event], scala.Unit] = null,
    className: java.lang.String = null,
    hideClose: js.UndefOr[scala.Boolean] = js.undefined,
    onModalClose: js.Function1[/* closeModal */ js.Function0[scala.Unit], scala.Unit] = null,
    title: java.lang.String = null,
    version: BootstrapVersion = null
  ): InsertModalHeaderProps = {
    val __obj = js.Dynamic.literal()
    if (beforeClose != null) __obj.updateDynamic("beforeClose")(beforeClose)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(hideClose)) __obj.updateDynamic("hideClose")(hideClose)
    if (onModalClose != null) __obj.updateDynamic("onModalClose")(onModalClose)
    if (title != null) __obj.updateDynamic("title")(title)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[InsertModalHeaderProps]
  }
}

