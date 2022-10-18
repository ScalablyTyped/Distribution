package typings.reactDates

import typings.moment.mod.MomentFormatSpecification
import typings.moment.mod.MomentInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsToISODateStringMod {
  
  @JSImport("react-dates/lib/utils/toISODateString", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(date: MomentInput): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(date.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  inline def default(date: MomentInput, currentFormat: MomentFormatSpecification): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(date.asInstanceOf[js.Any], currentFormat.asInstanceOf[js.Any])).asInstanceOf[String | Null]
}
