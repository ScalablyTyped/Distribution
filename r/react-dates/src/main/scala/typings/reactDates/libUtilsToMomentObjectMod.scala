package typings.reactDates

import typings.moment.mod.Moment
import typings.moment.mod.MomentFormatSpecification
import typings.moment.mod.MomentInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsToMomentObjectMod {
  
  @JSImport("react-dates/lib/utils/toMomentObject", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(dateString: MomentInput): Moment | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(dateString.asInstanceOf[js.Any]).asInstanceOf[Moment | Null]
  inline def default(dateString: MomentInput, customFormat: MomentFormatSpecification): Moment | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(dateString.asInstanceOf[js.Any], customFormat.asInstanceOf[js.Any])).asInstanceOf[Moment | Null]
}
