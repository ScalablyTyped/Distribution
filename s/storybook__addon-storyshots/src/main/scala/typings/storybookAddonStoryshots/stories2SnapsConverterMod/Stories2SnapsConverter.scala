package typings.storybookAddonStoryshots.stories2SnapsConverterMod

import typings.storybookAddonStoryshots.anon.FileName
import typings.storybookAddonStoryshots.anon.PartialStories2SnapsConve
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/addon-storyshots/dist/Stories2SnapsConverter", "Stories2SnapsConverter")
@js.native
class Stories2SnapsConverter () extends js.Object {
  def this(options: PartialStories2SnapsConve) = this()
  
  def getPossibleStoriesFiles(storyshotFile: String): js.Array[String] = js.native
  
  def getSnapshotExtension(): String = js.native
  
  def getSnapshotFileName(context: FileName): String = js.native
  
  def getStoryshotFile(fileName: String): String = js.native
  
  var options: Stories2SnapsConverterOptions = js.native
}
