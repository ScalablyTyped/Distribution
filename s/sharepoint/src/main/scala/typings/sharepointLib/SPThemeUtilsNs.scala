package typings
package sharepointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Available only in SharePoint Online*/
@JSGlobal("SPThemeUtils")
@js.native
object SPThemeUtilsNs extends js.Object {
  def ApplyCurrentTheme(): scala.Unit = js.native
  def Suspend(): scala.Unit = js.native
  def UseClientSideTheming(): scala.Boolean = js.native
  def WithCurrentTheme(resultCallback: js.Function1[/* themesCache */ js.Any, scala.Unit]): scala.Unit = js.native
}

