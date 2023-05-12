package typings.reactDatePicker

import typings.reactDatePicker.distCjsSharedTypesMod.RangeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsSharedDatesMod {
  
  @JSImport("react-date-picker/dist/cjs/shared/dates", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBegin(rangeType: RangeType, date: js.Date): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getBegin")(rangeType.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def getEnd(rangeType: RangeType, date: js.Date): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getEnd")(rangeType.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[js.Date]
}
