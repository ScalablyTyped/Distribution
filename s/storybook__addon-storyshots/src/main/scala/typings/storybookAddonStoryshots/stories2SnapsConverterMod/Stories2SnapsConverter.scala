package typings.storybookAddonStoryshots.stories2SnapsConverterMod

import typings.std.Partial
import typings.storybookAddonStoryshots.AnonFileName
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
  def getSnapshotFileName(context: AnonFileName): String = js.native
  def getStoryshotFile(fileName: String): String = js.native
}

