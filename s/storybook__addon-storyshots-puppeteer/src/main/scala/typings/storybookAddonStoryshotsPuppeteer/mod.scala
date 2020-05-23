package typings.storybookAddonStoryshotsPuppeteer

import typings.storybookAddonStoryshotsPuppeteer.anon.AfterAll
import typings.storybookAddonStoryshotsPuppeteer.anon.PartialCommonConfig
import typings.storybookAddonStoryshotsPuppeteer.anon.PartialImageSnapshotConfi
import typings.storybookAddonStoryshotsPuppeteer.anon.PartialPuppeteerTestConfi
import typings.storybookAddonStoryshotsPuppeteer.configMod.CommonConfig
import typings.storybookAddonStoryshotsPuppeteer.configMod.ImageSnapshotConfig
import typings.storybookAddonStoryshotsPuppeteer.configMod.PuppeteerTestConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-storyshots-puppeteer", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val defaultCommonConfig: CommonConfig = js.native
  val defaultImageSnapshotConfig: ImageSnapshotConfig = js.native
  val defaultPuppeteerTestConfig: PuppeteerTestConfig = js.native
  def axeTest(): AfterAll = js.native
  def axeTest(customConfig: PartialCommonConfig): AfterAll = js.native
  def imageSnapshot(): AfterAll = js.native
  def imageSnapshot(customConfig: PartialImageSnapshotConfi): AfterAll = js.native
  def puppeteerTest(): AfterAll = js.native
  def puppeteerTest(customConfig: PartialPuppeteerTestConfi): AfterAll = js.native
}

