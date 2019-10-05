package typings.sharepoint.SP.Application.UI

import typings.microsoftDashAjax.Sys.EventArgs
import typings.microsoftDashAjax.Sys.UI.Control
import typings.microsoftDashAjax.Sys.UI.DomEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Application.UI.ThemeWebPage")
@js.native
class ThemeWebPage protected () extends Control {
  def this(e: HTMLElement) = this()
  def add_themeDisplayUpdated(value: js.Function2[/* sender */ js.Any, /* e */ EventArgs, Unit]): Unit = js.native
  def get_thmxThemes(): js.Any = js.native
  def onThemeSelectionChanged(evt: DomEvent): Unit = js.native
  def remove_themeDisplayUpdated(value: js.Function2[/* sender */ js.Any, /* e */ EventArgs, Unit]): Unit = js.native
  def set_thmxThemes(value: js.Any): Unit = js.native
  def updateThemeDisplay(): Unit = js.native
}

