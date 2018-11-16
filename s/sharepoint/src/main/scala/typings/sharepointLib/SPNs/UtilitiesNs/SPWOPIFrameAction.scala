package typings
package sharepointLib.SPNs.UtilitiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SPWOPIFrameAction extends js.Object

@JSGlobal("SP.Utilities.SPWOPIFrameAction")
@js.native
object SPWOPIFrameAction extends js.Object {
  @js.native
  sealed trait edit
    extends sharepointLib.SPNs.UtilitiesNs.SPWOPIFrameAction
  
  @js.native
  sealed trait interactivePreview
    extends sharepointLib.SPNs.UtilitiesNs.SPWOPIFrameAction
  
  @js.native
  sealed trait mobileView
    extends sharepointLib.SPNs.UtilitiesNs.SPWOPIFrameAction
  
  @js.native
  sealed trait view
    extends sharepointLib.SPNs.UtilitiesNs.SPWOPIFrameAction
  
  val edit: edit with java.lang.String = js.native
  val interactivePreview: interactivePreview with java.lang.String = js.native
  val mobileView: mobileView with java.lang.String = js.native
  val view: view with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.UtilitiesNs.SPWOPIFrameAction with java.lang.String] = js.native
}

