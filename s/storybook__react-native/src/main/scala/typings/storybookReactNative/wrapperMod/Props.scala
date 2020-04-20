package typings.storybookReactNative.wrapperMod

import typings.storybookAddons.distMod.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var addonSelected: String
  var panels: Collection
}

object Props {
  @scala.inline
  def apply(addonSelected: String, panels: Collection): Props = {
    val __obj = js.Dynamic.literal(addonSelected = addonSelected.asInstanceOf[js.Any], panels = panels.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

