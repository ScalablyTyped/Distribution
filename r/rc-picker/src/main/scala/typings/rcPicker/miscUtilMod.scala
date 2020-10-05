package typings.rcPicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-picker/es/utils/miscUtil", JSImport.Namespace)
@js.native
object miscUtilMod extends js.Object {
  def default(props: js.Any): js.Any = js.native
  def getValue[T](values: js.UndefOr[scala.Nothing], index: Double): T | Null = js.native
  def getValue[T](values: js.Array[T | Null], index: Double): T | Null = js.native
  def getValue[T](values: Null, index: Double): T | Null = js.native
  def leftPad(str: String, length: Double): String = js.native
  def leftPad(str: String, length: Double, fill: String): String = js.native
  def leftPad(str: Double, length: Double): String = js.native
  def leftPad(str: Double, length: Double, fill: String): String = js.native
  def toArray[T](`val`: T): js.Array[T] = js.native
  def toArray[T](`val`: js.Array[T]): js.Array[T] = js.native
  def tuple[T /* <: js.Array[String] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): T = js.native
  def updateValues[T, R](values: js.Tuple2[T | Null, T | Null], value: T, index: Double): R = js.native
  def updateValues[T, R](values: js.Tuple2[T | Null, T | Null], value: UpdateValue[T], index: Double): R = js.native
  def updateValues[T, R](values: Null, value: T, index: Double): R = js.native
  def updateValues[T, R](values: Null, value: UpdateValue[T], index: Double): R = js.native
  type UpdateValue[T] = js.Function1[/* prev */ T, T]
}

