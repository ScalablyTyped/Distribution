package typings.reactDayPicker

import typings.react.mod.Dispatch
import typings.react.mod.SetStateAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useControlledValueUseControlledValueMod {
  
  @JSImport("react-day-picker/dist/hooks/useControlledValue/useControlledValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useControlledValue[T](defaultValue: T): js.Tuple2[T, DispatchStateAction[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useControlledValue")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[T, DispatchStateAction[T]]]
  inline def useControlledValue[T](defaultValue: T, controlledValue: T): js.Tuple2[T, DispatchStateAction[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControlledValue")(defaultValue.asInstanceOf[js.Any], controlledValue.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[T, DispatchStateAction[T]]]
  
  type DispatchStateAction[T] = Dispatch[SetStateAction[T]]
}
