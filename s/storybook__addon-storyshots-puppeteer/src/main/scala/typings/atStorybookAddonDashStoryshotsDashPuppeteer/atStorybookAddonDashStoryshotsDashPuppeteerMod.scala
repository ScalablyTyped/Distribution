package typings.atStorybookAddonDashStoryshotsDashPuppeteer

import typings.atStorybookAddonDashStoryshotsDashPuppeteer.distConfigMod.CommonConfig
import typings.atStorybookAddonDashStoryshotsDashPuppeteer.distConfigMod.ImageSnapshotConfig
import typings.atStorybookAddonDashStoryshotsDashPuppeteer.distConfigMod.PuppeteerTestConfig
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-storyshots-puppeteer", JSImport.Namespace)
@js.native
object atStorybookAddonDashStoryshotsDashPuppeteerMod extends js.Object {
  val defaultCommonConfig: CommonConfig = js.native
  val defaultImageSnapshotConfig: ImageSnapshotConfig = js.native
  val defaultPuppeteerTestConfig: PuppeteerTestConfig = js.native
  def axeTest(): Anon_AfterAll = js.native
  def axeTest(customConfig: Partial[CommonConfig]): Anon_AfterAll = js.native
  def imageSnapshot(): Anon_AfterAll = js.native
  def imageSnapshot(customConfig: Partial[ImageSnapshotConfig]): Anon_AfterAll = js.native
  def puppeteerTest(): Anon_AfterAll = js.native
  def puppeteerTest(customConfig: Partial[PuppeteerTestConfig]): Anon_AfterAll = js.native
}

