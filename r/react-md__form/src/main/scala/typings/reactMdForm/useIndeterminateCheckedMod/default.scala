package typings.reactMdForm.useIndeterminateCheckedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/form/types/useIndeterminateChecked", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[T /* <: String */](values: js.Array[T]): IndeterminateCheckedReturnValue[T] = js.native
  def apply[T /* <: String */](
    values: js.Array[T],
    defaultCheckedValues: js.UndefOr[scala.Nothing],
    onChange: js.Function1[/* checkedValues */ js.Array[T], Unit]
  ): IndeterminateCheckedReturnValue[T] = js.native
  def apply[T /* <: String */](values: js.Array[T], defaultCheckedValues: js.Array[T]): IndeterminateCheckedReturnValue[T] = js.native
  def apply[T /* <: String */](
    values: js.Array[T],
    defaultCheckedValues: js.Array[T],
    onChange: js.Function1[/* checkedValues */ js.Array[T], Unit]
  ): IndeterminateCheckedReturnValue[T] = js.native
  def apply[T /* <: String */](values: js.Array[T], defaultCheckedValues: js.Function0[js.Array[T]]): IndeterminateCheckedReturnValue[T] = js.native
  def apply[T /* <: String */](
    values: js.Array[T],
    defaultCheckedValues: js.Function0[js.Array[T]],
    onChange: js.Function1[/* checkedValues */ js.Array[T], Unit]
  ): IndeterminateCheckedReturnValue[T] = js.native
}

