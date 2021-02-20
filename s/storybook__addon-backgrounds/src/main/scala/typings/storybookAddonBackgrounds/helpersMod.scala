package typings.storybookAddonBackgrounds

import typings.storybookAddonBackgrounds.typesMod.Background
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  @JSImport("@storybook/addon-backgrounds/dist/helpers", "addBackgroundStyle")
  @js.native
  def addBackgroundStyle(selector: String, css: String, storyId: String): Unit = js.native
  
  @JSImport("@storybook/addon-backgrounds/dist/helpers", "addGridStyle")
  @js.native
  def addGridStyle(selector: String, css: String): Unit = js.native
  
  @JSImport("@storybook/addon-backgrounds/dist/helpers", "clearStyles")
  @js.native
  def clearStyles(selector: String): Unit = js.native
  @JSImport("@storybook/addon-backgrounds/dist/helpers", "clearStyles")
  @js.native
  def clearStyles(selector: js.Array[String]): Unit = js.native
  
  @JSImport("@storybook/addon-backgrounds/dist/helpers", "getBackgroundColorByName")
  @js.native
  def getBackgroundColorByName(currentSelectedValue: String, backgrounds: js.Array[Background], defaultName: String): String = js.native
}
