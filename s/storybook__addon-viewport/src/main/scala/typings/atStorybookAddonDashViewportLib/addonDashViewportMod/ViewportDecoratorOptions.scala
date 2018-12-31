package typings
package atStorybookAddonDashViewportLib.addonDashViewportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewportDecoratorOptions extends js.Object {
  /**
    * Default viewport
    */
  var name: js.UndefOr[ViewportName] = js.undefined
  /**
    * Called whenever different viewport is selected from the dropdown
    */
  def onViewportChange(change: atStorybookAddonDashViewportLib.Anon_Viewport): scala.Unit
}

