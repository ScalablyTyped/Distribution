package typings.reactDatetimePicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsSharedUtilsMod {
  
  @JSImport("react-datetime-picker/dist/cjs/shared/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def between[T /* <: js.Date */](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("between")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def between[T /* <: js.Date */](value: T, min: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def between[T /* <: js.Date */](value: T, min: T, max: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def between[T /* <: js.Date */](value: T, min: Null, max: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def between[T /* <: js.Date */](value: T, min: Unit, max: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def getAmPmLabels(): js.Tuple2[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAmPmLabels")().asInstanceOf[js.Tuple2[String, String]]
  inline def getAmPmLabels(locale: String): js.Tuple2[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAmPmLabels")(locale.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[String, String]]
}
