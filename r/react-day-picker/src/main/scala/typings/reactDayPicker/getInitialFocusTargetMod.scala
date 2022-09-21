package typings.reactDayPicker

import typings.reactDayPicker.typesModifiersMod.Modifiers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getInitialFocusTargetMod {
  
  @JSImport("react-day-picker/dist/contexts/Focus/utils/getInitialFocusTarget", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInitialFocusTarget(displayMonths: js.Array[js.Date], modifiers: Modifiers): js.UndefOr[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("getInitialFocusTarget")(displayMonths.asInstanceOf[js.Any], modifiers.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Date]]
}
