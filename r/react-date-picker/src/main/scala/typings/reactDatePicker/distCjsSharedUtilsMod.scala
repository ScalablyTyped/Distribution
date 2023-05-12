package typings.reactDatePicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsSharedUtilsMod {
  
  @JSImport("react-date-picker/dist/cjs/shared/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def between[T /* <: js.Date */](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("between")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def between[T /* <: js.Date */](value: T, min: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def between[T /* <: js.Date */](value: T, min: T, max: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def between[T /* <: js.Date */](value: T, min: Null, max: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def between[T /* <: js.Date */](value: T, min: Unit, max: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def safeMax(args: Any*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("safeMax")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Double]
  
  inline def safeMin(args: Any*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("safeMin")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Double]
}
