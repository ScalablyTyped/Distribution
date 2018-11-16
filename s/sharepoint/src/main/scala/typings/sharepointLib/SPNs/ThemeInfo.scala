package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ThemeInfo")
@js.native
class ThemeInfo () extends ClientObject {
  def getThemeFontByName(name: java.lang.String, lcid: scala.Double): StringResult = js.native
  def getThemeShadeByName(name: java.lang.String): StringResult = js.native
  def get_accessibleDescription(): java.lang.String = js.native
  def get_themeBackgroundImageUri(): java.lang.String = js.native
}

