package typings.reactNativeMaterialUi.anon

import typings.reactNativeMaterialUi.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountContainer extends js.Object {
  var accountContainer: js.UndefOr[ViewStyle] = js.undefined
  var activeAvatarContainer: js.UndefOr[ViewStyle] = js.undefined
  var avatarsContainer: js.UndefOr[ViewStyle] = js.undefined
  var container: js.UndefOr[ViewStyle] = js.undefined
  var inactiveAvatarContainer: js.UndefOr[ViewStyle] = js.undefined
  var topContainer: js.UndefOr[ViewStyle] = js.undefined
}

object AccountContainer {
  @scala.inline
  def apply(
    accountContainer: js.UndefOr[Null | ViewStyle] = js.undefined,
    activeAvatarContainer: js.UndefOr[Null | ViewStyle] = js.undefined,
    avatarsContainer: js.UndefOr[Null | ViewStyle] = js.undefined,
    container: js.UndefOr[Null | ViewStyle] = js.undefined,
    inactiveAvatarContainer: js.UndefOr[Null | ViewStyle] = js.undefined,
    topContainer: js.UndefOr[Null | ViewStyle] = js.undefined
  ): AccountContainer = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accountContainer)) __obj.updateDynamic("accountContainer")(accountContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(activeAvatarContainer)) __obj.updateDynamic("activeAvatarContainer")(activeAvatarContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(avatarsContainer)) __obj.updateDynamic("avatarsContainer")(avatarsContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(container)) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(inactiveAvatarContainer)) __obj.updateDynamic("inactiveAvatarContainer")(inactiveAvatarContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(topContainer)) __obj.updateDynamic("topContainer")(topContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountContainer]
  }
}

