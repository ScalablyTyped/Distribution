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
  
  /* 1 */ val edit: edit with scala.Double = js.native
  /* 3 */ val interactivePreview: interactivePreview with scala.Double = js.native
  /* 2 */ val mobileView: mobileView with scala.Double = js.native
  /* 0 */ val view: view with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.UtilitiesNs.SPWOPIFrameAction with scala.Double] = js.native
}

