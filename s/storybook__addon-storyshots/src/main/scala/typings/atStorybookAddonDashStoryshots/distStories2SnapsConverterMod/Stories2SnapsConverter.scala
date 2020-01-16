package typings.atStorybookAddonDashStoryshots.distStories2SnapsConverterMod

import typings.atStorybookAddonDashStoryshots.Anon_FileName
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-storyshots/dist/Stories2SnapsConverter", "Stories2SnapsConverter")
@js.native
class Stories2SnapsConverter () extends js.Object {
  def this(options: Partial[Stories2SnapsConverterOptions]) = this()
  var options: Stories2SnapsConverterOptions = js.native
  def getPossibleStoriesFiles(storyshotFile: String): js.Array[String] = js.native
  def getSnapshotExtension(): String = js.native
  def getSnapshotFileName(context: Anon_FileName): String = js.native
  def getStoryshotFile(fileName: String): String = js.native
}

