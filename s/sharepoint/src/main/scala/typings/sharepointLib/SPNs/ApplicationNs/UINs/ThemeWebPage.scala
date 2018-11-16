package typings
package sharepointLib.SPNs.ApplicationNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Application.UI.ThemeWebPage")
@js.native
class ThemeWebPage protected ()
  extends microsoftDashAjaxLib.SysNs.UINs.Control {
  def this(e: stdLib.HTMLElement) = this()
  def add_themeDisplayUpdated(value: js.Function2[/* sender */ js.Any, /* e */ microsoftDashAjaxLib.SysNs.EventArgs, scala.Unit]): scala.Unit = js.native
  def get_thmxThemes(): js.Any = js.native
  def onThemeSelectionChanged(evt: microsoftDashAjaxLib.SysNs.UINs.DomEvent): scala.Unit = js.native
  def remove_themeDisplayUpdated(value: js.Function2[/* sender */ js.Any, /* e */ microsoftDashAjaxLib.SysNs.EventArgs, scala.Unit]): scala.Unit = js.native
  def set_thmxThemes(value: js.Any): scala.Unit = js.native
  def updateThemeDisplay(): scala.Unit = js.native
}

