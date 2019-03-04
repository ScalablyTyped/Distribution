package typings
package atStorybookAddonDashViewportLib.atStorybookAddonDashViewportMod

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

object ViewportDecoratorOptions {
  @scala.inline
  def apply(
    onViewportChange: js.Function1[atStorybookAddonDashViewportLib.Anon_Viewport, scala.Unit],
    name: ViewportName = null
  ): ViewportDecoratorOptions = {
    val __obj = js.Dynamic.literal(onViewportChange = onViewportChange)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ViewportDecoratorOptions]
  }
}

