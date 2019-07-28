package typings.atStorybookAddonDashViewport.atStorybookAddonDashViewportMod

import typings.atStorybookReact.atStorybookReactMod.StoryDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-viewport", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val INITIAL_VIEWPORTS: ViewportDefinitions = js.native
  def configureViewport(configuration: ViewportConfiguration): Unit = js.native
  def withViewport(): StoryDecorator = js.native
  def withViewport(viewport: Viewport): StoryDecorator = js.native
}

