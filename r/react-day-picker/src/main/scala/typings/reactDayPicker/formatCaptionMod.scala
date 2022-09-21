package typings.reactDayPicker

import typings.reactDayPicker.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatCaptionMod {
  
  @JSImport("react-day-picker/dist/contexts/DayPicker/formatters/formatCaption", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatCaption(month: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatCaption")(month.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatCaption(month: js.Date, options: `0`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatCaption")(month.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
