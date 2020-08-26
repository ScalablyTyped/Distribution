package typings.reactMdUtils

import typings.react.mod.MutableRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/utils/types/useTempValue", JSImport.Namespace)
@js.native
object useTempValueMod extends js.Object {
  def default[T](defaultValue: T): ReturnValue[T] = js.native
  def default[T](defaultValue: T, resetTime: Double): ReturnValue[T] = js.native
  type CurrentValueRef[T] = MutableRefObject[T]
  type ResetValue = js.Function0[Unit]
  type ReturnValue[T] = js.Tuple3[CurrentValueRef[T], SetValue[T], ResetValue]
  type SetValue[T] = js.Function1[/* nextValue */ T, Unit]
}

