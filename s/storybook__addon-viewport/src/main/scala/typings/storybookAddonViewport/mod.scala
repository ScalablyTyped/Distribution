package typings.storybookAddonViewport

import typings.storybookAddonViewport.storybookAddonViewportStrings.responsive
import typings.storybookAddonViewport.viewportMod.ViewportMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-viewport", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val DEFAULT_VIEWPORT: responsive = js.native
  val INITIAL_VIEWPORTS: ViewportMap = js.native
  val MINIMAL_VIEWPORTS: ViewportMap = js.native
  def configureViewport(): Unit = js.native
}

