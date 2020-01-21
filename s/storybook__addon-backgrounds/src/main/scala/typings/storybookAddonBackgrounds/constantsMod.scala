package typings.storybookAddonBackgrounds

import typings.storybookAddonBackgrounds.storybookAddonBackgroundsStrings.backgrounds
import typings.storybookAddonBackgrounds.storybookAddonBackgroundsStrings.grid
import typings.storybookAddonBackgrounds.storybookAddonBackgroundsStrings.storybookSlashbackground
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-backgrounds/dist/constants", JSImport.Namespace)
@js.native
object constantsMod extends js.Object {
  val ADDON_ID: storybookSlashbackground = js.native
  val GRID_PARAM_KEY: grid = js.native
  val PARAM_KEY: backgrounds = js.native
  @js.native
  object EVENTS extends js.Object {
    var UPDATE: String = js.native
  }
  
}

