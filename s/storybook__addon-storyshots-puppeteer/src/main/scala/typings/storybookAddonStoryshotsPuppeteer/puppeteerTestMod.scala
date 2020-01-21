package typings.storybookAddonStoryshotsPuppeteer

import typings.std.Partial
import typings.storybookAddonStoryshotsPuppeteer.configMod.PuppeteerTestConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-storyshots-puppeteer/dist/puppeteerTest", JSImport.Namespace)
@js.native
object puppeteerTestMod extends js.Object {
  def puppeteerTest(): AnonAfterAll = js.native
  def puppeteerTest(customConfig: Partial[PuppeteerTestConfig]): AnonAfterAll = js.native
}

