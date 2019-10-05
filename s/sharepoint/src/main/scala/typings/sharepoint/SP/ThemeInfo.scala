package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ThemeInfo")
@js.native
class ThemeInfo () extends ClientObject {
  def getThemeFontByName(name: String, lcid: Double): StringResult = js.native
  def getThemeShadeByName(name: String): StringResult = js.native
  def get_accessibleDescription(): String = js.native
  def get_themeBackgroundImageUri(): String = js.native
}

