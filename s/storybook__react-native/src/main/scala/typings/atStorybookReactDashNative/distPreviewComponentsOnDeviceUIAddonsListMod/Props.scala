package typings.atStorybookReactDashNative.distPreviewComponentsOnDeviceUIAddonsListMod

import typings.atStorybookAddons.distMod.Collection
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
    val __obj = js.Dynamic.literal(addonSelected = addonSelected, onPressAddon = js.Any.fromFunction1(onPressAddon), panels = panels)
  
    __obj.asInstanceOf[Props]
  }
}

