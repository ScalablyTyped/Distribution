package typings.reactMdUtils

import typings.react.mod.MutableRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useTempValueMod {
  
  @JSImport("@react-md/utils/types/useTempValue", "useTempValue")
  @js.native
  def useTempValue[T](defaultValue: T): ReturnValue[T] = js.native
  @JSImport("@react-md/utils/types/useTempValue", "useTempValue")
  @js.native
  def useTempValue[T](defaultValue: T, resetTime: Double): ReturnValue[T] = js.native
  
  type CurrentValueRef[T] = MutableRefObject[T]
  
  type ResetValue = js.Function0[Unit]
  
  type ReturnValue[T] = js.Tuple3[CurrentValueRef[T], SetValue[T], ResetValue]
  
  type SetValue[T] = js.Function1[/* nextValue */ T, Unit]
}
