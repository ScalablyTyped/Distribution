package typings.reactTimePicker

import typings.reactTimePicker.distCjsSharedTypesMod.AmPmType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsSharedDatesMod {
  
  @JSImport("react-time-picker/dist/cjs/shared/dates", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convert12to24(hour12: String, amPm: AmPmType): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("convert12to24")(hour12.asInstanceOf[js.Any], amPm.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def convert12to24(hour12: Double, amPm: AmPmType): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("convert12to24")(hour12.asInstanceOf[js.Any], amPm.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def convert24to12(hour24: String): js.Tuple2[Double, AmPmType] = ^.asInstanceOf[js.Dynamic].applyDynamic("convert24to12")(hour24.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Double, AmPmType]]
  inline def convert24to12(hour24: Double): js.Tuple2[Double, AmPmType] = ^.asInstanceOf[js.Dynamic].applyDynamic("convert24to12")(hour24.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Double, AmPmType]]
}
