package typings.atStorybookAddonDashViewport.atStorybookAddonDashViewportMod

import typings.atStorybookAddonDashViewport.Anon_Viewport
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
  def onViewportChange(change: Anon_Viewport): Unit
}

object ViewportDecoratorOptions {
  @scala.inline
  def apply(onViewportChange: Anon_Viewport => Unit, name: ViewportName = null): ViewportDecoratorOptions = {
    val __obj = js.Dynamic.literal(onViewportChange = js.Any.fromFunction1(onViewportChange))
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ViewportDecoratorOptions]
  }
}

