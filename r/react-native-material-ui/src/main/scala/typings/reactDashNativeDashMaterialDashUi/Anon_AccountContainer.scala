package typings.reactDashNativeDashMaterialDashUi

import typings.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccountContainer extends js.Object {
  var accountContainer: js.UndefOr[ViewStyle] = js.undefined
  var activeAvatarContainer: js.UndefOr[ViewStyle] = js.undefined
  var avatarsContainer: js.UndefOr[ViewStyle] = js.undefined
  var container: js.UndefOr[ViewStyle] = js.undefined
  var inactiveAvatarContainer: js.UndefOr[ViewStyle] = js.undefined
  var topContainer: js.UndefOr[ViewStyle] = js.undefined
}

object Anon_AccountContainer {
  @scala.inline
  def apply(
    accountContainer: ViewStyle = null,
    activeAvatarContainer: ViewStyle = null,
    avatarsContainer: ViewStyle = null,
    container: ViewStyle = null,
    inactiveAvatarContainer: ViewStyle = null,
    topContainer: ViewStyle = null
  ): Anon_AccountContainer = {
    val __obj = js.Dynamic.literal()
    if (accountContainer != null) __obj.updateDynamic("accountContainer")(accountContainer.asInstanceOf[js.Any])
    if (activeAvatarContainer != null) __obj.updateDynamic("activeAvatarContainer")(activeAvatarContainer.asInstanceOf[js.Any])
    if (avatarsContainer != null) __obj.updateDynamic("avatarsContainer")(avatarsContainer.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (inactiveAvatarContainer != null) __obj.updateDynamic("inactiveAvatarContainer")(inactiveAvatarContainer.asInstanceOf[js.Any])
    if (topContainer != null) __obj.updateDynamic("topContainer")(topContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AccountContainer]
  }
}

