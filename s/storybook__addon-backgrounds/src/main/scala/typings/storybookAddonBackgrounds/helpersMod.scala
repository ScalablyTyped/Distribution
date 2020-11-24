package typings.storybookAddonBackgrounds

import typings.storybookAddonBackgrounds.typesMod.Background
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/addon-backgrounds/dist/helpers", JSImport.Namespace)
@js.native
object helpersMod extends js.Object {
  
  def addBackgroundStyle(selector: String, css: String, storyId: String): Unit = js.native
  
  def addGridStyle(selector: String, css: String): Unit = js.native
  
  def clearStyles(selector: String): Unit = js.native
  def clearStyles(selector: js.Array[String]): Unit = js.native
  
  def getBackgroundColorByName(currentSelectedValue: String, backgrounds: js.Array[Background], defaultName: String): String = js.native
}
