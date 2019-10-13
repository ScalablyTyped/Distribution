package typings.atStorybookReactDashNative.distPreviewComponentsOnDeviceUIAddonsWrapperMod

import typings.atStorybookAddons.distMod.Collection
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
    val __obj = js.Dynamic.literal(addonSelected = addonSelected, panels = panels)
  
    __obj.asInstanceOf[Props]
  }
}

