package typings.storybookReactNative.listMod

import typings.storybookAddons.distMod.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var addonSelected: String
  var panels: Collection
  def onPressAddon(id: String): Unit
}

object Props {
  @scala.inline
  def apply(addonSelected: String, onPressAddon: String => Unit, panels: Collection): Props = {
    val __obj = js.Dynamic.literal(addonSelected = addonSelected.asInstanceOf[js.Any], onPressAddon = js.Any.fromFunction1(onPressAddon), panels = panels.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Props]
  }
}

