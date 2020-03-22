package typings.storybookAddonStoryshots.stories2SnapsConverterMod

import typings.storybookAddonStoryshots.AnonFileName
import typings.storybookAddonStoryshots.PartialStories2SnapsConve
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-storyshots/dist/Stories2SnapsConverter", "Stories2SnapsConverter")
@js.native
class Stories2SnapsConverter () extends js.Object {
  def this(options: PartialStories2SnapsConve) = this()
  var options: Stories2SnapsConverterOptions = js.native
  def getPossibleStoriesFiles(storyshotFile: String): js.Array[String] = js.native
  def getSnapshotExtension(): String = js.native
  def getSnapshotFileName(context: AnonFileName): String = js.native
  def getStoryshotFile(fileName: String): String = js.native
}

