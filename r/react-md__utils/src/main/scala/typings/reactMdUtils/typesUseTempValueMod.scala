package typings.reactMdUtils

import typings.react.mod.MutableRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUseTempValueMod {
  
  @JSImport("@react-md/utils/types/useTempValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useTempValue[T](defaultValue: T): ReturnValue[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTempValue")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[ReturnValue[T]]
  inline def useTempValue[T](defaultValue: T, resetTime: Double): ReturnValue[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useTempValue")(defaultValue.asInstanceOf[js.Any], resetTime.asInstanceOf[js.Any])).asInstanceOf[ReturnValue[T]]
  
  type CurrentValueRef[T] = MutableRefObject[T]
  
  type ResetValue = js.Function0[Unit]
  
  type ReturnValue[T] = js.Tuple3[CurrentValueRef[T], SetValue[T], ResetValue]
  
  type SetValue[T] = js.Function1[/* nextValue */ T, Unit]
}
