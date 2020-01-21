package typings.storybookAddonStoryshotsPuppeteer

import typings.std.Partial
import typings.storybookAddonStoryshotsPuppeteer.configMod.ImageSnapshotConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-storyshots-puppeteer/dist/imageSnapshot", JSImport.Namespace)
@js.native
object imageSnapshotMod extends js.Object {
  def imageSnapshot(): AnonAfterAll = js.native
  def imageSnapshot(customConfig: Partial[ImageSnapshotConfig]): AnonAfterAll = js.native
}

