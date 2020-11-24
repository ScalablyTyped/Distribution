package typings.sharepoint.global.Srch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Srch.RefinementUtil")
@js.native
class RefinementUtil ()
  extends typings.sharepoint.Srch.RefinementUtil
/* static members */
@JSGlobal("Srch.RefinementUtil")
@js.native
object RefinementUtil extends js.Object {
  
  def peoplePickerApplyIdPrefix(control: typings.sharepoint.Srch.ClientControl): String = js.native
  def peoplePickerApplyIdPrefix(control: typings.sharepoint.Srch.RefinementControl): String = js.native
  
  def peoplePickerPrep(
    id: String,
    refiner: typings.sharepoint.Srch.RefinementControl,
    clientControl: typings.sharepoint.Srch.Refinement
  ): String = js.native
  
  def stringValueToEqualsToken(x: String): String = js.native
}
