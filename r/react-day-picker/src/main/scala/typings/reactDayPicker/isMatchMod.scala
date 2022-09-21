package typings.reactDayPicker

import typings.reactDayPicker.matchersMod.Matcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isMatchMod {
  
  @JSImport("react-day-picker/dist/contexts/Modifiers/utils/isMatch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isMatch(day: js.Date, matchers: js.Array[Matcher]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMatch")(day.asInstanceOf[js.Any], matchers.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
