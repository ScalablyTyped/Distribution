package typings.reactDayPicker

import typings.reactDayPicker.typesModifiersMod.CustomModifiers
import typings.reactDayPicker.typesModifiersMod.DayModifiers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getCustomModifiersMod {
  
  @JSImport("react-day-picker/dist/contexts/Modifiers/utils/getCustomModifiers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCustomModifiers(dayModifiers: DayModifiers): CustomModifiers = ^.asInstanceOf[js.Dynamic].applyDynamic("getCustomModifiers")(dayModifiers.asInstanceOf[js.Any]).asInstanceOf[CustomModifiers]
}
