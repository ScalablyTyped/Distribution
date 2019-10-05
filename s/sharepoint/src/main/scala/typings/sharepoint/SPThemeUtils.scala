package typings.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Available only in SharePoint Online*/
@JSGlobal("SPThemeUtils")
@js.native
object SPThemeUtils extends js.Object {
  def ApplyCurrentTheme(): Unit = js.native
  def Suspend(): Unit = js.native
  def UseClientSideTheming(): Boolean = js.native
  def WithCurrentTheme(resultCallback: js.Function1[/* themesCache */ js.Any, Unit]): Unit = js.native
}

