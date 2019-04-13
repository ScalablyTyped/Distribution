package typings
package atStorybookAddonsLib.atStorybookAddonsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addons", "AddonStore")
@js.native
class AddonStore () extends js.Object {
  def addPanel(name: js.Any, panel: js.Any): scala.Unit = js.native
  def getChannel(): atStorybookChannelsLib.atStorybookChannelsMod.^ = js.native
  def getDatabase(): js.Any = js.native
  def getPanels(): js.Any = js.native
  def getPreview(): js.Any = js.native
  def hasChannel(): scala.Boolean = js.native
  def loadAddons(api: js.Any): js.Any = js.native
  def register(name: js.Any, loader: js.Any): js.Any = js.native
  def setChannel(channel: js.Any): scala.Unit = js.native
  def setDatabase(database: js.Any): scala.Unit = js.native
}

